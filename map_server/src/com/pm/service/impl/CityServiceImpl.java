package com.pm.service.impl;

import com.pm.dao.impl.CityDaoImpl;
import com.pm.domain.CityData;
import com.pm.service.CityService;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.List;

public class CityServiceImpl implements CityService {
    public List<CityData> getAll(){
        String sql = "select * from ph_demo";
        List<CityData> data = (new CityDaoImpl()).selectAll(sql);
        return data;
    }



    @Override
    public JSONArray toJsonArray(List<CityData> list) {
        JSONArray array = new JSONArray();
        for (CityData data: list
             ) {
            JSONObject json = JSONObject.fromObject(data);
            //JSONArray array=JSONArray.fromObject(data);
            array.add(json);
        }
        return array;
    }

}
