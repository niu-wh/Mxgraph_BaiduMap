package com.pm.service.impl;

import com.pm.dao.MapDao;
import com.pm.dao.impl.MapDaoImpl;
import com.pm.domain.Map;
import com.pm.service.MapService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

public class MapServiceImpl implements MapService {
    MapDao mapDao = new MapDaoImpl();

    public List<Map> getAll(){
        System.out.println("Service前");
        String sql = "select * from mapdata;";
        try {
            List<Map> data = mapDao.selectAll(sql);
            System.out.println("Service后");
            System.out.println(data);
            return data;
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public JSONArray toJsonArray(List<Map> list) {
        JSONArray array = new JSONArray();
        for (Map data: list
             ) {
            JSONObject json = JSONObject.fromObject(data);
            //JSONArray array=JSONArray.fromObject(data);
            array.add(json);
        }
        return array;
    }

}
