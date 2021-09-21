package com.ems.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_NO")
    private Long employeeNo;

    @Column(name = "STAFF_ID")
    private String staffId;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_NO", nullable = false)
    private Department department;

    @Column(name = "MANAGER_NO")
    private Long managerNo;

    @OneToMany(mappedBy = "dependentNo", fetch = FetchType.LAZY)
    private List<Dependent> dependentList;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Contract> contractList;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeProject> employeeProjectList;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeViolation> employeeViolationList;

    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) || this == o;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
