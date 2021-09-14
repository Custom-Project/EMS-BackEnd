package com.ems.backend.entity;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class BaseEntity {
    @Column(name = "CREATED_ON")
    private LocalDateTime createdOn;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "UPDATED_ON")
    private LocalDateTime updatedOn;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;
}
