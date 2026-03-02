package com.Department.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


//It is a plain old java object that represents that the data can be persistent in database,simply department can interact with the database
@Entity


public class department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long depart_id;
    @NotBlank(message = "Make sure the Name should not be blank")
    private String depart_name;
    private String departAddress;
    private String departCode;

    public Long getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(Long depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public String getDepartAddress() {
        return departAddress;
    }

    public void setDepartAddress(String departAddress) {
        this.departAddress = departAddress;
    }

    public String getDepartCode() {
        return departCode;
    }

    public void setDepartCode(String departCode) {
        this.departCode = departCode;
    }

    public department(Long depart_id, String depart_name, String departAddress, String departCode) {
        this.depart_id = depart_id;
        this.depart_name = depart_name;
        this.departAddress = departAddress;
        this.departCode = departCode;
    }

    public department() {
    }

    @Override
    public String toString() {
        return "department{" +
                "depart_id=" + depart_id +
                ", depart_name='" + depart_name + '\'' +
                ", departAddress='" + departAddress + '\'' +
                ", departCode='" + departCode + '\'' +
                '}';
    }
}
