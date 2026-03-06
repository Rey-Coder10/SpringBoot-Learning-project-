package com.Department.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//It is a plain old java object that represents that the data can be persistent in database,simply department can interact with the database
@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long depart_id;
    @NotBlank(message = "Make sure the Name should not be blank")
    private String depart_name;
    private String departAddress;
    private String departCode;

}
