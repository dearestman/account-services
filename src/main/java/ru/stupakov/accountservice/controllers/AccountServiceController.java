package ru.stupakov.accountservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stupakov D. L.
 **/
@RestController
@RequestMapping
public class AccountServiceController {
    @GetMapping("/amount")
    public Long getAmount(){
        return 12121L;
    }

    @PostMapping("/amount/add")
    public HttpStatus addAmount(){
        return HttpStatus.OK;
    }
}
