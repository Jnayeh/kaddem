package com.esprit.alternance.kaddem.services;

import com.esprit.alternance.kaddem.models.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> retrieveAllDepartments();

    Department addDepartment(Department e);

    Department updateDepartment(Department e);

    Department retrieveDepartment(Integer idDepartment);
}
