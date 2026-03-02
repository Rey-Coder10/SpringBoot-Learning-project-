package com.Department.Service;

import com.Department.Entity.department;
import com.Department.Error.DepartmentNotFoundException;

import java.util.List;

public interface departService {

    public department Save(department dept);


    public List<department> getSab();


    public department getById(Long depart_id) throws DepartmentNotFoundException;

    public String DelById(Long depart_id);

    public department UpdateAll(Long depart_id, department dept);

}
