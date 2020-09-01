package com.daro.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="chooseyourtaskservlet", urlPatterns = "/ChooseTask")

public class ChooseYourTaskServlet extends HttpServlet {


    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String taskType = request.getParameter("Type");

    WeeklyTasks taskingDuties = new WeeklyTasks();

    DecadevTasks typeOfTask = DecadevTasks.valueOf(taskType);

        List taskCategories = taskingDuties.taskAvaliableToBePerformed(typeOfTask);

        request.setAttribute("tasks", taskCategories);

        RequestDispatcher view = request.getRequestDispatcher("availableTasks.jsp");

        view.forward(request, response);
    }


}
