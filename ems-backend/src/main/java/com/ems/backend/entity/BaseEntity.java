package com.ems.backend.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    @CreatedDate
    @Column(name = "CREATED_ON",nullable = false)
    private LocalDateTime createdOn;

    @CreatedBy
    @Column(name = "CREATED_BY",nullable = false)
    private String createdBy;

   @LastModifiedDate
    @Column(name = "MODIFIED_ON",nullable = false)
    private LocalDateTime updatedOn;

    @LastModifiedBy
    @Column(name = "MODIFIED_BY",nullable = false)
    private String updatedBy;

    @Column(name = "IS_DELETED",nullable = false)
    private Boolean isDeleted;
}
