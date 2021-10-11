package com.db.learn.SpringLearnUdemy.entities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

    private String name;
    private String stage;
    private String description;

    public Project(){

    }
    public Project(long projectId, String name, String stage, String description) throws Exception {
        this.projectId=projectId;
        setName(name);
        setStage(stage);
        setDescription(description);
    }

    public long getProjectId(){

        return projectId;
    }
    public String getName(){

        return name;
    }
    public void setName(String name) throws Exception {
        if(name != ""){
            this.name=name;
        }
        else throw new Exception("Error: the name can't be empty");
    }
    public String getStage(){
        return  stage;
    }
    public void setStage(String stage) throws Exception {
        if(stage!=null){
            this.stage=stage;
        }
        else throw new Exception("Error message: the stage can't be empty");
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) throws Exception {
        if(description!=null){
            this.description=description;
        }
        else throw new Exception("error message: description can't be null");
    }

}
