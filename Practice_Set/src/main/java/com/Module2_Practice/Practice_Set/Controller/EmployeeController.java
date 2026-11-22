package com.Module2_Practice.Practice_Set.Controller;


import com.Module2_Practice.Practice_Set.Entity.EmployeeEntity;
import com.Module2_Practice.Practice_Set.Service.EmployeeService;
import com.Module2_Practice.Practice_Set.dto.EmployeeDTO;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
                                               @RequestParam(required = false ) String sortById)
    {
        return employeeService.getALlEmployee();
    }

    @PostMapping
    public EmployeeDTO cretaeNewEmployee(@RequestBody EmployeeEntity inputEmployee){
        return employeeService.cretaeNewEmployee(inputEmployee);
    }






    /*@GetMapping("/massage/{pass}")
  public EmployeeDTO getValue(@PathVariable Long pass){
      return new EmployeeDTO(pass,"Prasad",24);
  }*/


    public String print1() {
        return "Exicute the first url";
    }


}
/*getEmployeeById Done
* getAllEmployee Done
* CreateNEwEmployee*/
