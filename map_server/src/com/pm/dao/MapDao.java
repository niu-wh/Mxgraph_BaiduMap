package com.pm.dao;

import com.pm.domain.Map;

import java.util.List;

public interface MapDao {
    // 查询数据
    List<Map> selectAll(String sql) throws Exception;
}
