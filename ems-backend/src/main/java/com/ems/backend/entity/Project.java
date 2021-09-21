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
@Table(name = "PROJECT")
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROJECT_NO")
    private Long projectNo;

    @Column(name = "PROJECT_NAME")
    private String projectName;


    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<EmployeeProject> employeeProjectList;


    @Override
    public boolean equals(Object o) {
        if (Objects.isNull(o)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        return projectNo != null && projectNo.equals(((Project) o).getProjectNo());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}