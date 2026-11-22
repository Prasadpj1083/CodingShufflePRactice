package com.Module2_Practice.Practice_Set.Service;

import com.Module2_Practice.Practice_Set.Config.mapperConfig;
import com.Module2_Practice.Practice_Set.Entity.EmployeeEntity;
import com.Module2_Practice.Practice_Set.Repository.EmpolyeeReporitory;
import com.Module2_Practice.Practice_Set.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    
    private final EmpolyeeReporitory empolyeeReporitory;
    private final mapperConfig mapperConfig;
    private final ModelMapper modelMapper;

    public EmployeeService(EmpolyeeReporitory empolyeeReporitory, mapperConfig mapperConfig, ModelMapper modelMapper) {
        this.empolyeeReporitory = empolyeeReporitory;
        this.mapperConfig = mapperConfig;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeId(Long id) {
        EmployeeEntity employeeEntity= empolyeeReporitory.findById(id).orElse(null);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);

    }

    public List<EmployeeDTO> getALlEmployee() {
        List<EmployeeEntity> employeeEntities= empolyeeReporitory.findAll();
       return  employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO cretaeNewEmployee(EmployeeEntity inputEmployee) {
        EmployeeEntity toSaveEmployee = empolyeeReporitory.save(inputEmployee);
        EmployeeEntity saveEmployeeEntity =  empolyeeReporitory.save(toSaveEmployee);
        return modelMapper.map(saveEmployeeEntity,EmployeeDTO.class);
    }
}
