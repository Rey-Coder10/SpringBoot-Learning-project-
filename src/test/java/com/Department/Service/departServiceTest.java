package com.Department.Service;

import com.Department.Entity.department;
import com.Department.Repository.departmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// To make springBoot know that this is my test class
@ExtendWith(MockitoExtension.class)
class departServiceTest {

    // ispe JUnit perform bogi
    @InjectMocks
    private departmentService ds;

    //Nakli data iske bina aaega
    @Mock
    private departmentRepository dpr;


    @BeforeEach
    void setUp() {
    }

    @Test
    public void Testsave() {
        department d = new department(1L, "Computer", "Jaunpur", "12Cs");
        Mockito.when(dpr.save(d)).thenReturn(d);
        department d2 = ds.Save(d);
        assertEquals("Computer", d2.getDepart_name());
    }


    @Test
    public void DelId() {
        department depar = new department(12L, "geology", "Varanasi", "11GEO");
        String res = ds.DelById(depar.getDepart_id());
        assertEquals("The id " + depar.getDepart_id() + " has been deleted", res);
    }

      @Test
    public void Getall() {
        List<department> despair = new ArrayList<>();
        despair.add(new department(3L, "Maths", "Kanpur", "12MT"));


    }


}

