package com.crzindustries.estacionmetereologica.controllers;

import com.crzindustries.estacionmetereologica.dtos.BaseResponse;
import com.crzindustries.estacionmetereologica.services.interfaces.IDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("data")
public class DataController {

    @Autowired
    private IDataService service;

    @GetMapping("statistics/sensor-type/{sensorType}")
    public ResponseEntity<BaseResponse> getStatistics(@PathVariable String sensorType) {
        BaseResponse baseResponse = service.getStatistics(sensorType);

        return new ResponseEntity<>(baseResponse, baseResponse.getStatus());
    }
}
