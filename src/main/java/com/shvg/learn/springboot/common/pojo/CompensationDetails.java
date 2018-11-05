package com.shvg.learn.springboot.common.pojo;

import java.util.List;

public class CompensationDetails {
    private CurrentCompensation currentCompensation;
    private List<CompensationHistory> compensationHistory;

    public void setCurrentCompensation(CurrentCompensation currentCompensation) {
        this.currentCompensation = currentCompensation;
    }

    public CurrentCompensation getCurrentCompensation() {
        return currentCompensation;
    }

    public void setCompensationHistory(List<CompensationHistory> compensationHistory) {
        this.compensationHistory = compensationHistory;
    }

    public List<CompensationHistory> getCompensationHistory() {
        return compensationHistory;
    }

    @Override
    public String toString() {
        return
                "CompensationDetails{" +
                        "currentCompensation = '" + currentCompensation + '\'' +
                        ",compensationHistory = '" + compensationHistory + '\'' +
                        "}";
    }
}