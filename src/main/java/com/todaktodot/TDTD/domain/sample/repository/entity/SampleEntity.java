package com.todaktodot.TDTD.domain.sample.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SampleEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
