package com.Department.Service;


import com.Department.Entity.department;
import com.Department.Error.DepartmentNotFoundException;
import com.Department.Repository.departmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

//It contains the implementation of departService
@Service
public class departmentService implements departService {

    @Autowired
    private departmentRepository depR;

    @Override
    public department Save(department dep) {
        return depR.save(dep);
    }

    @Override
    public List<department> getSab() {
        return depR.findAll();
    }

    @Override
    public department getById(Long depart_id) throws DepartmentNotFoundException {
        Optional<department> dep = depR.findById(depart_id);

        if (!dep.isPresent()) {
            throw new DepartmentNotFoundException("Department does not exits");
        }
        return dep.get();
    }

    @Override
    public String DelById(Long depart_id) {
        depR.deleteById(depart_id);
        return "The id " + depart_id + " has been deleted";
    }

    @Override
    public department UpdateAll(Long depart_id, department dept) {
        department dep = depR.findById(depart_id).get();

        if (Objects.nonNull(dept.getDepart_name()) && !"".equalsIgnoreCase(dept.getDepart_name())) {
            dep.setDepart_name(dept.getDepart_name());
        }

        if (Objects.nonNull(dept.getDepartAddress()) && !"".equalsIgnoreCase(dept.getDepartAddress())) {
            dep.setDepartAddress(dept.getDepartAddress());
        }

        if (Objects.nonNull(dept.getDepartCode()) && !"".equalsIgnoreCase(dept.getDepartCode())) {
            dep.setDepartAddress(dept.getDepartAddress());
        }
        return depR.save(dep);
    }

}
