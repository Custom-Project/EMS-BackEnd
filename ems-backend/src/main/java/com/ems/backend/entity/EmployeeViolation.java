package com.ems.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE_VIOLATION")
public class EmployeeViolation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_VIOLATION_NO")
    private Long employeeProjectNo;

    @ManyToOne
    @JoinColumn(name="EMPLOYEE_NO",nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name="VIOLATION_NO",nullable = false)
    private Violation violation;
}
