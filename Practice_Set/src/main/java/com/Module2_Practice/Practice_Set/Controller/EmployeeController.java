package com.Module2_Practice.Practice_Set.Controller;


import com.Module2_Practice.Practice_Set.Entity.EmployeeEntity;
import com.Module2_Practice.Practice_Set.Service.EmployeeService;
import com.Module2_Practice.Practice_Set.dto.EmployeeDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(path = "/massage")
public class EmployeeController {


    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployeeId(Long id) {
        return employeeService.getEmployeeId(id);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployee(@RequestParam(required = false , name = "inputAge") Integer id,
                                               @RequestParam(required = false ) String sortById) {
        return employeeService.getALlEmployee();
    }

    @PostMapping
    public EmployeeDTO cretaeNewEmployee(@RequestBody EmployeeEntity inputEmployee){
        return employeeService.cretaeNewEmployee(inputEmployee);
    }

    @PutMapping(path = "/{employeeId}")
    public EmployeeDTO updateEmployeeDetails(@RequestBody EmployeeDTO employeeDTO,@PathVariable Long employeeId) {
        return employeeService.updateEmployeeDetails(employeeDTO,employeeId);
    }

    @DeleteMapping(path = "/{employeeId}")
    public void  DeleteEmployeeDetails(@PathVariable Long employeeId) {
        employeeService.DeleteEmployeeDetails(employeeId);
    }

    @PatchMapping(path = "/{employeeId}")
    public EmployeeDTO updatePartualyEmployeeDetails(@RequestBody Map<String, Object> updates, @PathVariable Long employeeId) {
        return employeeService.updatePartualyEmployeeDetails(updates,employeeId);
    }


}
/*getEmployeeById Done
* getAllEmployee Done
* CreateNEwEmployee*/
