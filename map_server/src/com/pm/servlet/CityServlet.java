package com.pm.servlet;

import com.pm.domain.CityData;
import com.pm.service.impl.CityServiceImpl;
import net.sf.json.JSONArray;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CityServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");

        System.out.println("CityServlet111111111");
        CityServiceImpl city = new CityServiceImpl();
        System.out.println("CityServlet111111112");
        JSONArray array = new JSONArray();
        System.out.println("CityServlet111111113");
        PrintWriter out = response.getWriter();
        System.out.println("CityServlet111111114");

        try {
            List<CityData> list = city.getAll();
            array = city.toJsonArray(list);
            System.out.println(array.toString());

            out.write(array.toString());		//向前台输出数据
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(array.toString());
        out.flush();
        out.close();
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
