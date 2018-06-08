package com.example.codingPractice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Date;

public class payScale1 {

    public static void main(String[] args) throws ParseException {
        String raw = "{\"company_name\":\"theDude\",\"started_at\":\"2010\",\"employees\":[{\"employee_name\":\"adam\"}]}";
        String input1 = "[{\"company_name\":\"theDude\"}]";
        String test = RawStringToNormalizedJson(raw);
    }

    public static String RawStringToNormalizedJson(String rawString) throws ParseException {
        StringBuilder res = new StringBuilder();
        Object obj = new JSONParser().parse(rawString);
        JSONObject jobj = (JSONObject) obj;
        JSONArray jsonArray = (JSONArray) jobj.get("catanns");
        Date date = new Date();

            JSONArray employee_name = (JSONArray) jobj.get("employees");
            //JSObject employee_name = (JSObject) jobj.get("employees");

        String companyName = (String) jobj.get("company_name");
        StringBuilder employeeArray = new StringBuilder();
        for (Object ob : employee_name){
            employeeArray.append(ob.toString().replaceAll("}","").replaceAll("{",""));

        }



        res.append("{[\"company_name\":\"").append(companyName).append("\",");
        res.append(employeeArray);
        int i=0;
        return " ";

    }

    class employee{
        String company_name;
        String employee_name;
        Date started_at;
    }

}
