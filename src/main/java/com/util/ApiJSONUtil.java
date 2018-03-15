package com.util;

import org.json.JSONObject;

/**
 * Created by yeguo on 2018/3/15.
 */
public class ApiJSONUtil {

    public static void test(){
        String msg = "{'rs':0,'fs':'登录成功!'}";
        JSONObject jsonObject = new JSONObject(msg);
        System.out.println(jsonObject.getString("fs"));
    }

}
