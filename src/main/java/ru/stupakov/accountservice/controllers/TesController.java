package ru.stupakov.accountservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stupakov D. L.
 **/
@RestController
@RequestMapping("/")
public class TesController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
