package com.shvg.learn.springboot.common.pojo;

public class EmployeeInfo {
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return
                "EmployeeInfo{" +
                        "employee = '" + employee + '\'' +
                        "}";
    }
}
