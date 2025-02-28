package com.texas.miniprojecta.services;

import com.texas.miniprojecta.entity.Department;
import com.texas.miniprojecta.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> listAllDepartment() {
        return List.of();
    }

    @Override
    public Optional<Department> getDepartmentById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteDepartment(Long id) {

    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }
}