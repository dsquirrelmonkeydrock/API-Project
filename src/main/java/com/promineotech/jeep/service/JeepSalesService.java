package com.promineotech.jeep.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;


public interface JeepSalesService {

  List<Jeep> fetchJeeps(String model, String trim);

}
