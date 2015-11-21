package com.example.myproject.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.myproject.entity.Usr;
import com.example.myproject.service.UsrService;

@RestController
@RequestMapping("/usr")
public class UsrController {
    
    @Autowired
    private UsrService usrService;
    
    @RequestMapping("/list")
    public List<Usr> listUsr() {
        return usrService.findAll();
    }
    
}
