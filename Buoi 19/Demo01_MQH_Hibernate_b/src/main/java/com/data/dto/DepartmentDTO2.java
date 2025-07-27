package com.data.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentDTO2 {
    int id;

    String departmentName;

    String address;

    List<EmployeeDTO2> employeeDTO2s;

}
