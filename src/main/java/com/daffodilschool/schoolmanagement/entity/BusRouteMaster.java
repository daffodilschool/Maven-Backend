package com.daffodilschool.schoolmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
public class BusRouteMaster
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "busid")
    private BusMaster busid;


    @CreationTimestamp
    private LocalDate createdDate;
    private String createdBy;
    @UpdateTimestamp
    private LocalDate updatedDate;
    private String updatedBy;

    private String startpoint;
    private String    endpoint;
    private String distanceinkm;
    private String       fare;

}
