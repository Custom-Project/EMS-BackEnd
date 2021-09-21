package com.ems.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DEPENDENT")
public class Dependent extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPENDENT_NO")
    private Long dependentNo;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(nullable = false,name = "EMPLOYEE_NO")
    private Employee employee;

}
