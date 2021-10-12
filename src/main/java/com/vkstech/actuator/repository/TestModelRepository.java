package com.vkstech.actuator.repository;

import com.vkstech.actuator.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestModelRepository extends JpaRepository<TestModel, Integer> {
}
