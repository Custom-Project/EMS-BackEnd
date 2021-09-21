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
@Table(name = "VIOLATION")
public class Violation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VIOLATION_NO")
    private Long violationNo;

    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "violation", fetch = FetchType.LAZY)
    private List<EmployeeViolation> employeeViolationList;

    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        return violationNo != null && violationNo.equals(((Violation) o).getViolationNo());
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    
}
