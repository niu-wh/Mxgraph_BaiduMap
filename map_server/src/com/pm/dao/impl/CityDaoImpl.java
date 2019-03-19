package com.pm.dao.impl;

import com.pm.dao.CityDao;
import com.pm.domain.CityData;
import com.pm.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDaoImpl implements CityDao {
    QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
    List<CityData> list = new ArrayList<CityData>();

    @Override
    public List<CityData> selectAll(String sql) {
        try{
            list = qr.query(sql, new BeanListHandler<CityData>(CityData.class));
            System.out.println(list);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
