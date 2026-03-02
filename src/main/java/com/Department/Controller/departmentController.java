package com.Department.Controller;


import com.Department.Entity.department;
import com.Department.Error.DepartmentNotFoundException;
import com.Department.Service.departmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class departmentController {

    @Autowired
    private departmentService ds;

    //This is the way we write an application config file and use it in an application.
    @Value("${Message.ToPapa}")
    private String message;

    private final Logger logger = LoggerFactory.getLogger(departmentController.class);


    @PostMapping("/departments")
    public department SaveDepart(@Valid @RequestBody department depart) {
        logger.info("Inside the saveDepartment of DepartmentController");
        return ds.Save(depart);
    }


    @GetMapping("/departments")
    public List<department> getAll() {
        logger.info("Inside the List<department> of departmentController");
        return ds.getSab();
    }

    @GetMapping("/departments/{id}")
    public department getById(@PathVariable("id") Long depart_id) throws DepartmentNotFoundException {
        logger.info("Inside the getById of departmentController");
        return ds.getById(depart_id);
    }

    @DeleteMapping("/departments/{id}")
    public String DelById(@PathVariable("id") Long depart_id) {
        logger.info("Inside the DelById of departmentController");
        return ds.DelById(depart_id);
    }


    @PutMapping("/departments/{id} ")
    public department UpdateAll(@PathVariable("id") Long depart_id, @RequestBody department dept) {
        logger.info("Inside the UpdateAll of departmentController");
        return ds.UpdateAll(depart_id, dept);
    }

    @GetMapping("/")
    public String display() {
        return message;
    }
}

