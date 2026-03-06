package com.Department.Service;


import com.Department.DTO.DepartmentRequestDto;
import com.Department.DTO.DepartmentResponseDto;
import com.Department.Entity.Department;
import com.Department.Error.DepartmentNotFoundException;
import com.Department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

//It contains the implementation of departService
@Service
public class DepartmentServiceImpl implements DepartmentService {

    // Constructor Based spring IO
    private final DepartmentRepository departmentrepository;

    public DepartmentServiceImpl(DepartmentRepository departmentrepository) {
        this.departmentrepository = departmentrepository;
    }

    @Override
    public DepartmentResponseDto Save(DepartmentRequestDto departmentrequestdto) {
        Department department = new Department();

        department.setDepart_name(departmentrequestdto.getDepart_name());
        department.setDepartAddress(departmentrequestdto.getDepart_Address());
        department.setDepartCode(departmentrequestdto.getDepart_Code());

        Department saved_data = departmentrepository.save(department);
        return MapToResponse(saved_data);
    }

    @Override
    public List<DepartmentResponseDto> getSab() {

        return departmentrepository.findAll().stream().map(this::MapToResponse).collect(Collectors.toList());
    }

    @Override
    public DepartmentResponseDto getById(Long depart_id) throws DepartmentNotFoundException {

        Department department = departmentrepository.findById(depart_id).get();

        return MapToResponse(department);
    }

    @Override
    public String DelById(Long depart_id) {
        departmentrepository.deleteById(depart_id);
        return "The id " + depart_id + " has been deleted";
    }

    @Override
    public DepartmentResponseDto UpdateAll(Long depart_id, DepartmentRequestDto deptartmentrequestdto) {
        Department department = new Department();

        department.setDepart_name(deptartmentrequestdto.getDepart_name());
        department.setDepartCode(deptartmentrequestdto.getDepart_Code());

        Department flock = departmentrepository.save(department);

        return MapToResponse(flock);


    }

    private final DepartmentResponseDto MapToResponse(Department department) {
        DepartmentResponseDto departmentresponsedto = new DepartmentResponseDto();

        departmentresponsedto.setDepart_name(department.getDepart_name());
        departmentresponsedto.setDepart_Code(department.getDepartCode());

        return departmentresponsedto;
    }

}
