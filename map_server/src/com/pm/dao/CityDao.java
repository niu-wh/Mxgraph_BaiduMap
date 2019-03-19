package com.pm.dao;

import com.pm.domain.CityData;

import java.util.List;

public interface CityDao {
    // 查询数据
    List<CityData> selectAll(String sql);
}
