package com.Department.Controller;


import com.Department.DTO.DepartmentRequestDto;
import com.Department.DTO.DepartmentResponseDto;
import com.Department.Entity.Department;
import com.Department.Error.DepartmentNotFoundException;
import com.Department.Service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    // Constructor Based spring IO
    private final DepartmentServiceImpl departmentserviceimpl;

    public DepartmentController(DepartmentServiceImpl departmentserviceimpl) {
        this.departmentserviceimpl = departmentserviceimpl;
    }


    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);


    @PostMapping("/departments")
    public DepartmentResponseDto SaveDepart(@Valid @RequestBody DepartmentRequestDto departmentrequestdto) {
        logger.info("Inside the saveDepartment of DepartmentController");
        return departmentserviceimpl.Save(departmentrequestdto);
    }


    @GetMapping("/departments")
    public List<DepartmentResponseDto> getAll() {
        logger.info("Inside the List<department> of departmentController");
        return departmentserviceimpl.getSab();
    }

    @GetMapping("/departments/{id}")
    public DepartmentResponseDto getById(@PathVariable("id") Long depart_id) throws DepartmentNotFoundException {
        logger.info("Inside the getById of departmentController");
        return departmentserviceimpl.getById(depart_id);
    }

    @DeleteMapping("/departments/{id}")
    public String DelById(@PathVariable("id") Long depart_id) {
        logger.info("Inside the DelById of departmentController");
        return departmentserviceimpl.DelById(depart_id);
    }


    @PutMapping("/departments/{id} ")
    public DepartmentResponseDto UpdateAll(@PathVariable("id") Long depart_id, @RequestBody DepartmentRequestDto departmentrequestdto) {
        logger.info("Inside the UpdateAll of departmentController");
        return departmentserviceimpl.UpdateAll(depart_id, departmentrequestdto);
    }


}

