package com.ponson.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/")
public class EmployeeController 
{
    Logger logger = Logger.getLogger(EmployeeController.class.getName());

    @GetMapping(path="/employees", produces = "application/json")
    public String getEmployees() throws Exception
    {
        logger.info("Inside EmployeeController.getEmployees");
        return "{ test: \"hello world\" }";
    }
}
