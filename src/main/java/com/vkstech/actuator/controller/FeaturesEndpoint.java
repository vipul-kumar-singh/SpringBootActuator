package com.vkstech.actuator.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeaturesEndpoint {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Feature {
        private String name;
        private Boolean enabled;
    }

    private Map<String, Feature> features = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Feature> features() {
        return features;
    }

    @ReadOperation
    public Feature feature(@Selector String name) {
        return features.get(name);
    }

    @WriteOperation
    public Feature configureFeature(String name, Boolean enabled) {
        Feature feature = new Feature(name, enabled);
        features.put(name, feature);
        return feature;
    }

    @DeleteOperation
    public String deleteFeature(@Selector String name) {
        features.remove(name);
        return "Deletion Successful";
    }
}
