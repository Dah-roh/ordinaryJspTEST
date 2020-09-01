package com.daro.test;

import java.util.ArrayList;
import java.util.List;

public class WeeklyTasks {
    public List taskAvaliableToBePerformed(DecadevTasks type){

        List taskExample = new ArrayList();

        if(type.equals(DecadevTasks.GROUP)){
           taskExample.add("Uber Application with Servlets");

        }else if(type.equals(DecadevTasks.INDIVIDUAL)){
           taskExample.add("Facebook mini clone");
        }else {
            taskExample.add("This is Friday, don't bother about any task. Please.");
        }
        return taskExample;
    }
}

