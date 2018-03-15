package com.test;

import com.util.ApiJSONUtil;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by yeguo on 2018/3/15.
 */
public class Main {
    public static void  main(String[] args) throws IOException {
        String path = "properties/jdbc.properties";
        Properties rs = new Properties();
        rs.load(Main.class.getClassLoader().getResourceAsStream(path));
        System.out.println(rs.getProperty("username"));
        System.out.println(rs.getProperty("password"));

        ApiJSONUtil.test();
    }
}
