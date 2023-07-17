package com.crzindustries.estacionmetereologica.services.interfaces;

import com.crzindustries.estacionmetereologica.dtos.BaseResponse;
import com.crzindustries.estacionmetereologica.dtos.NewDataRequest;

import java.util.List;

public interface IDataService {
    BaseResponse saveAll(List<NewDataRequest> list);
    BaseResponse getStatistics(String sensorType);
}
