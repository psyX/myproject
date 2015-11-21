package com.example.myproject.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.myproject.entity.Usr;
import com.example.myproject.repository.UsrRepository;
import com.example.myproject.service.UsrService;

@Service
public class UsrServiceImpl implements UsrService {
    
    @Autowired
    private UsrRepository usrRepository;

    @Override
    public List<Usr> findAll() {
        return usrRepository.findAll();
    }
    
}
