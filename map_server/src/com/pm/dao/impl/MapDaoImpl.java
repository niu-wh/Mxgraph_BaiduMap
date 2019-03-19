package com.pm.dao.impl;

import com.pm.dao.MapDao;
import com.pm.domain.Map;
import com.pm.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.util.ArrayList;
import java.util.List;


public class MapDaoImpl implements MapDao {
    QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
    List<Map> list = new ArrayList<Map>();


    public List<Map> selectAll(String sql) throws Exception{
        System.out.println("查询前");
        list = qr.query(sql, new BeanListHandler<>(Map.class));
        System.out.println("查询后");
        System.out.println(list);
        return list;

    }
}
