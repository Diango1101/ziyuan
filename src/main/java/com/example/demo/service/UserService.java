package com.example.demo.service;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserService {

     List<User> getAllUser();
}