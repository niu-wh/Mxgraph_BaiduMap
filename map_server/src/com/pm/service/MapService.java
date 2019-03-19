package com.pm.service;

import com.pm.domain.Map;
import net.sf.json.JSONArray;

import java.util.List;

public interface MapService {
    List<Map> getAll();

    JSONArray toJsonArray(List<Map> list);
}
