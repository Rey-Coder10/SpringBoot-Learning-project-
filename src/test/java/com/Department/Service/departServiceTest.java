package com.Department.Service;


// To make springBoot know that this is my test class


import com.Department.DTO.DepartmentResponseDto;
import com.Department.Entity.Department;
import com.Department.Error.DepartmentNotFoundException;
import com.Department.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {

    @Mock
    private DepartmentRepository departmentrepository;

    @InjectMocks
    private DepartmentService departmentService;  // Your actual service class name

    private Department department;
    private DepartmentResponseDto expectedResponse;

    @BeforeEach
    void setUp() {
        // Setup test data
        department = new Department();
        department.setDepart_id(1L);
        department.setDepart_name("Engineering");
        department.setDepartCode("ENG");
        department.setDepartAddress("Building A");

        expectedResponse = new DepartmentResponseDto();
        expectedResponse.setDepart_name("Engineering");
        expectedResponse.setDepart_Code("ENG");
    }

    // TEST CASE 1: FAILURE CASE (Department Not Found)
    // ═══════════════════════════════════════════════════════════
    @Test
    void testGetById_WhenDepartmentNotFound_ShouldThrowDepartmentNotFoundException() {
        // Arrange (Given)
        Long departmentId = 999L;
        when(departmentrepository.findById(departmentId))
                .thenReturn(Optional.empty());

        // Act & Assert (When & Then)
        DepartmentNotFoundException exception = assertThrows(
                DepartmentNotFoundException.class,
                () -> departmentService.getById(departmentId)
        );

        // Verify exception message
        assertEquals("Department does not exits", exception.getMessage());

        // Verify repository was called
        verify(departmentrepository, times(1)).findById(departmentId);
    }

    // ═══════════════════════════════════════════════════════════
    // TEST CASE 2: NULL ID (Edge Case)
    // ═══════════════════════════════════════════════════════════
    @Test
    void testGetById_WhenIdIsNull_ShouldThrowException() {
        // Arrange
        Long departmentId = null;
        when(departmentrepository.findById(departmentId))
                .thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(
                DepartmentNotFoundException.class,
                () -> departmentService.getById(departmentId)
        );

        verify(departmentrepository, times(1)).findById(departmentId);
    }

}

