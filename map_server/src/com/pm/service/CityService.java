package com.pm.service;

import com.pm.domain.CityData;
import net.sf.json.JSONArray;

import java.util.List;

public interface CityService {
    List<CityData> getAll();

    JSONArray toJsonArray(List<CityData> list);
}
