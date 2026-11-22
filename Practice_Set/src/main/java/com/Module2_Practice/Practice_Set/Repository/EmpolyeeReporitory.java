package com.Module2_Practice.Practice_Set.Repository;


import com.Module2_Practice.Practice_Set.Entity.EmployeeEntity;
import com.Module2_Practice.Practice_Set.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EmpolyeeReporitory extends JpaRepository<EmployeeEntity , Long> {
}
