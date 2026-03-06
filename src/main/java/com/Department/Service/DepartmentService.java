package com.Department.Service;

import com.Department.DTO.DepartmentRequestDto;
import com.Department.DTO.DepartmentResponseDto;
import com.Department.Entity.Department;
import com.Department.Error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public DepartmentResponseDto Save(DepartmentRequestDto deptartmentrequestdto);


    public List<DepartmentResponseDto> getSab();


    public DepartmentResponseDto getById(Long depart_id) throws DepartmentNotFoundException;

    public String DelById(Long depart_id);

    public DepartmentResponseDto UpdateAll(Long depart_id, DepartmentRequestDto deptartmentrequestdto);

}
