package com.example.rmsolution.Renewal.repository;

import com.example.rmsolution.Renewal.entity.Renewal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenewalRepository extends JpaRepository<Renewal, Long> {
}
