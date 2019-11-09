package com.example.demo.service.impl;

import com.example.demo.dao.JingpingMapper;
import com.example.demo.entity.Jingping;
import com.example.demo.service.JingpingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JingpingServiceImpl implements JingpingService {
    @Autowired
    private JingpingMapper jingpingMapper;
    public List<Jingping> getJingping() {
        return jingpingMapper.showjingping();
    }
}
