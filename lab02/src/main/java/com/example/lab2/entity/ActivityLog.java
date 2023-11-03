package com.example.lab2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class ActivityLog {
    @Id
    private Integer id;

    private Date date;
    private String operation;
    private int duration;
}
