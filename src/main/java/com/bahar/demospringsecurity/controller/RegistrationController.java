package com.bahar.demospringsecurity.controller;

import com.bahar.demospringsecurity.security.ISecurityUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationController {
    private final Logger log= LoggerFactory.getLogger(getClass().getName());

    @Autowired
    private IUserService userService;

    @Autowired
    private ISecurityUserService securityUserService;


    public RegistrationController() {
        super();
    }


}
