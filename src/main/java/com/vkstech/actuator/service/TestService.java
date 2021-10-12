package com.vkstech.actuator.service;

import com.vkstech.actuator.models.TestModel;
import com.vkstech.actuator.repository.TestModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestModelRepository testModelRepository;

    @Autowired
    public TestService(TestModelRepository testModelRepository) {
        this.testModelRepository = testModelRepository;
    }

    public TestModel getAnyTestModel(Integer id) {
        return testModelRepository.findById(id).orElse(new TestModel());
    }

    public TestModel saveTestModel(TestModel testModel) {
        return testModelRepository.save(testModel);
    }
}
