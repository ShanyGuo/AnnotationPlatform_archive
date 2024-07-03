package com.example.annotation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.example.annotation.entity.Employee;
import com.example.annotation.mapper.EmployeeMapper;
import com.example.annotation.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
