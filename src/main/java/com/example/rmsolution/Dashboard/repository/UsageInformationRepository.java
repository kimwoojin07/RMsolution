package com.example.rmsolution.Dashboard.repository;

import com.example.rmsolution.Dashboard.entity.UsageInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageInformationRepository extends JpaRepository<UsageInformation, Long> {
}
