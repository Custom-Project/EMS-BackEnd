package com.ems.backend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CONTRACT")

public class Contract extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRACT_NO")
    private Long contractNo;

    @ManyToOne
    @JoinColumn(name="CONTRACT_TYPE_NO",nullable = false)
    private ContractType contractType;

    @ManyToOne
    @JoinColumn(name="EMPLOYEE_NO",nullable = false)
    private Employee employee;

}
