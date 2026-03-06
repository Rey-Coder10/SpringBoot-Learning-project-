package com.Department.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentRequestDto {


    private String depart_name;
    private String depart_Address;
    private String depart_Code;
}
