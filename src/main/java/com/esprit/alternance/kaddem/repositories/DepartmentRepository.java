package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
