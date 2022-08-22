package com.shamimIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shamimIt.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
