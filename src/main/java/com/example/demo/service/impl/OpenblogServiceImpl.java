package com.example.demo.service.impl;

import com.example.demo.dao.OpenblogMapper;
import com.example.demo.entity.Openblog;
import com.example.demo.service.OpenblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenblogServiceImpl implements OpenblogService {
    @Autowired
    private OpenblogMapper openblogMapper;
    @Override
    public void insertopenblog(Openblog openblog) {
        this.openblogMapper.insertopenblog(openblog.getId(),openblog.getBlog(),openblog.getCid(),openblog.getCname(),openblog.getSgrade());
    }
}
