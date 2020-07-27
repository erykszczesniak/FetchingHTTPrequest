package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Integer id;
    @Column
    String message;
}
