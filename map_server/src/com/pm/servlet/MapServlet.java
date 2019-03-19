package com.pm.servlet;

import com.pm.domain.Map;
import com.pm.service.impl.MapServiceImpl;
import net.sf.json.JSONArray;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class MapServlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");

        JSONArray jsonArray = new JSONArray();
        MapServiceImpl mapService = new MapServiceImpl();
        PrintWriter out = response.getWriter();

        try {
            List<Map> list = mapService.getAll();
            System.out.println(list);
            jsonArray = mapService.toJsonArray(list);
            System.out.println(jsonArray.toString());

            out.write(jsonArray.toString());		//向前台输出数据
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(jsonArray.toString());
        out.flush();
        out.close();
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
