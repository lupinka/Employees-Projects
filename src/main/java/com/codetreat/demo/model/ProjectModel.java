package com.codetreat.demo.model;

public class ProjectModel {
    private String ProjectName;
    private String startDate;
    private String endDate;
    private Integer ProjectID;
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }
    public void setStartDate(String startDate){this.startDate=startDate;}
    public void setEndDate(String endDate){this.endDate=endDate;}
    public void setProjectID(Integer ProjectID) {this.ProjectID = ProjectID; }
    public String getProjectName() {
        return ProjectName;
    }
    public Integer getProjectID() {
        return ProjectID;
    }
    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
