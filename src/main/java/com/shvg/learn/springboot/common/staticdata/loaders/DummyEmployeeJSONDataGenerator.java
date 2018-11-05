package com.shvg.learn.springboot.common.staticdata.loaders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shvg.learn.springboot.common.pojo.EmployeeInfo;
import com.shvg.learn.springboot.common.pojo.EmployeesInfo;

import java.io.File;

public class DummyEmployeeJSONDataGenerator {

      public static EmployeesInfo generateDummyEmployeeJSON() {

        EmployeesInfo employeesInfo = returnEmployeeInfo();

        for(EmployeeInfo employeeInfo:employeesInfo.getEmployeeInfo()){
            employeeInfo.getEmployee().setDisplayName("Welcome".concat(employeeInfo.getEmployee().getDisplayName()));
        }

        return employeesInfo;
    }

    public static EmployeesInfo returnEmployeeInfo(){
        ObjectMapper mapper = new ObjectMapper();
        EmployeesInfo employeesInfo = null;
        try {
            employeesInfo =
                    mapper.readValue(new File("C:\\SRV_HVG\\IntelliJ_Workspace\\learn-shvg" +
                            "\\src\\main\\resources\\sampleRequest\\EmployeeInfo_Request.json"), EmployeesInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeesInfo;
    }

}
