package com.timecard.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//you can specify a cutom username for your entity table by using:
//@Table(username = "your table username")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Employee {
    @Id
    private int empid;
    private String username;
    private String projectname;
    private int projectid;

    public Employee() {
    }

    public Employee(int empid, String username, String projectname, int projectid) {
        this.empid = empid;
        this.username = username;
        this.projectname = projectname;
        this.projectid = projectid;
    }

    public int getId() {
        return empid;
    }

    public void setId(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getprojectname() {
        return projectname;
    }

    public void setprojectname(String projectname) {
        this.projectname = projectname;
    }

    public int getprojectid() {
        return projectid;
    }

    public void setprojectid(int projectid) {
        this.projectid = projectid;
    }
}

