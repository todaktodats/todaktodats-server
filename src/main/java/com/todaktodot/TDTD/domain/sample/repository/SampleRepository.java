package com.todaktodot.TDTD.domain.sample.repository;

import com.todaktodot.TDTD.domain.sample.repository.entity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleEntity, Long> {
}
