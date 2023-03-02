package com.esprit.alternance.kaddem.services.impl;

import com.esprit.alternance.kaddem.models.Department;
import com.esprit.alternance.kaddem.repositories.DepartmentRepository;
import com.esprit.alternance.kaddem.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {
    DepartmentRepository departmentRepository;

    @Override
    public List<Department> retrieveAllDepartments() {
        // TODO Auto-generated method stub
        return departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(Department e) {
        // TODO Auto-generated method stub
        return departmentRepository.save(e);
    }

    @Override
    public Department updateDepartment(Department e) {
        // TODO Auto-generated method stub
        Department Department = this.retrieveDepartment(e.getIdDepartment());
        if (Department == null)
            throw new ServerErrorException("Could not find Department");
        return departmentRepository.save(e);
    }

    @Override
    public Department retrieveDepartment(Integer idDepartment) {
        // TODO Auto-generated method stub
        return departmentRepository.findById(idDepartment).get();
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }

}
