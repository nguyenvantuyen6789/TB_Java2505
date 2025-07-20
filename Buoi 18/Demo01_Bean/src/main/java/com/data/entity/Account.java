package com.data.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@Entity
@Table
@EntityListeners(AuditingEntityListener.class)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username", unique = true, nullable = false,
    columnDefinition = "VARCHAR(50)")
    String username;

    @Column(name = "password", unique = false, nullable = false,
            columnDefinition = "VARCHAR(50)")
    String password;

    @Column(name = "full_name", unique = false, nullable = false,
            columnDefinition = "VARCHAR(100)")
    String fullName;

    @Column(name = "created_date")
    @Temporal(TemporalType.DATE) // 2025-07-20
    @CreatedDate // tự tạo ngày hiện tại
    Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP) // 2025-07-20 21:02:40
    @LastModifiedDate
    Date updatedDate;
}
