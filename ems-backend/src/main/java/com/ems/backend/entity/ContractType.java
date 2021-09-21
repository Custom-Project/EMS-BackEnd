package com.ems.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CONTRACT_TYPE")
public class ContractType extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRACT_TYPE_NO")
    private Long contractTypeNo;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "contractType", fetch = FetchType.LAZY)
    private List<Contract> contractList;

    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        return contractTypeNo != null && contractTypeNo.equals(((ContractType) o).getContractTypeNo());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
