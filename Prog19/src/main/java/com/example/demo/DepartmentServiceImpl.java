package com.example.demo;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
@Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
@Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}