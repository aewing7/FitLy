package com.ewing.capstoneproj.controllers;


import com.ewing.capstoneproj.exceptions.ExistingFoodException;
import com.ewing.capstoneproj.exceptions.ExistingWorkoutException;
import com.ewing.capstoneproj.exceptions.RegisterFailedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = RegisterFailedException.class) //Controller to handle RegisterFailedException
    public String exception(RegisterFailedException exception) {
        return "redirect:/registerfail";
    }

    @ExceptionHandler(value = ExistingWorkoutException.class)//Controller to handle ExistingWorkoutException
    public String exception(ExistingWorkoutException exception) {
        return "redirect:/exefail";
    }

    @ExceptionHandler(value = ExistingFoodException.class)//Controller to handle ExistingFoodException
    public String exception(ExistingFoodException exception) {
        return "redirect:/foodfail";
    }
}
