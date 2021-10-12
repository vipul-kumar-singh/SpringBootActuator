package com.vkstech.actuator.controller;

import com.vkstech.actuator.models.TestModel;
import com.vkstech.actuator.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("get")
    public ResponseEntity<TestModel> getTestModel(@RequestParam Integer id){
        return ResponseEntity.ok(testService.getAnyTestModel(id));
    }

    @PostMapping("add")
    public ResponseEntity<TestModel> addTestModel(@RequestBody TestModel testModel){
        return ResponseEntity.ok(testService.saveTestModel(testModel));
    }
}
