package com.data.controller;

import com.data.dto.*;
import com.data.entity.Department;
import com.data.entity.Employee;
import com.data.repository.DepartmentRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("departments")
@RequiredArgsConstructor // đi tìm các property có final để
// tạo constructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentController {

    // c1
//    @Autowired
//    DepartmentRepository departmentRepo;

    // c2
//    DepartmentRepository departmentRepo;
//    public DepartmentController(DepartmentRepository departmentRepo) {
//        this.departmentRepo = departmentRepo;
//    }

    // c3
//    DepartmentRepository departmentRepo;
//    @Autowired
//    public void setDepartmentRepo(DepartmentRepository departmentRepo) {
//        this.departmentRepo = departmentRepo;
//    }

    // c4
    final DepartmentRepository departmentRepo;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<Department> departments = departmentRepo.findAll();
        List<DepartmentDTO> departmentDTOS = new ArrayList<>();
        departments.forEach(department -> {
            System.out.println("=======");
            DepartmentDTO departmentDTO = new DepartmentDTO();

            departmentDTO.setId(department.getId());
            departmentDTO.setDepartmentName(department.getDepartmentName());
            departmentDTO.setAddress(department.getAddress());

            List<Employee> employees = department.getEmployees();
            // set list username

            List<String> usernames = new ArrayList<>();
            employees.forEach(employee -> {
                usernames.add(employee.getUsername());
            });

            departmentDTO.setUsernames(usernames);

            // add departmentDTO vào departmentDTOS
            departmentDTOS.add(departmentDTO);
        });

        // trả về size, trả về departments lỗi
        // TH1: trả về entity có MQH (1n, 11, nn)
        // TH2: Print entity có MQH (1n, 11, nn)

        // => Khắc phục: Trả về DTO thì OK
        return ResponseEntity.ok(departmentDTOS);
    }

    @GetMapping("get2")
    public ResponseEntity<?> get2() {
        List<Department> departments = departmentRepo.findAll();
        List<DepartmentDTO2> departmentDTO2s = new ArrayList<>();
        departments.forEach(department -> {
            System.out.println("=======");
            DepartmentDTO2 departmentDTO2 = new DepartmentDTO2();

            departmentDTO2.setId(department.getId());
            departmentDTO2.setDepartmentName(department.getDepartmentName());
            departmentDTO2.setAddress(department.getAddress());

            List<Employee> employees = department.getEmployees();
            // set list employeeDTO2
            List<EmployeeDTO2> employeeDTO2s = new ArrayList<>();
            employees.forEach(employee -> {
                EmployeeDTO2 employeeDTO2 = new EmployeeDTO2();
                employeeDTO2.setId(employee.getId());
                employeeDTO2.setUsername(employee.getUsername());
                employeeDTO2.setPassword(employee.getPassword());

                employeeDTO2s.add(employeeDTO2);
            });

            departmentDTO2.setEmployeeDTO2s(employeeDTO2s);

            // add departmentDTO vào departmentDTOS
            departmentDTO2s.add(departmentDTO2);
        });

        // trả về size, trả về departments lỗi
        // TH1: trả về entity có MQH (1n, 11, nn)

        // => Khắc phục: Trả về DTO thì OK
        // TH2: Print entity có MQH (1n, 11, nn)
        return ResponseEntity.ok(departmentDTO2s);
    }

    // sv thực hành thêm, sửa xoá phòng ban
    // làm trong 15p
    // sau đó giáo vien hd thêm sửa xoá nhân viên (có khoá ngoại)

    @PostMapping
    public ResponseEntity<?> createdDepartment(@RequestBody DepartmentCreateDTO departmentCreateDTO) {
        if (departmentCreateDTO.getDepartmentName() == null) {
            return ResponseEntity.badRequest().body("Không để trống phòng ban");
        }

        Department department = new Department();
        department.setDepartmentName(departmentCreateDTO.getDepartmentName());
        department.setAddress(departmentCreateDTO.getAddress());

        departmentRepo.save(department);

        return new ResponseEntity<>("Create department success, department name = " + departmentCreateDTO.getDepartmentName(), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable int id,
                                    @RequestBody DepartmentUpdateDTO departmentUpdateDTO) {
        Optional<Department> opDepartment = departmentRepo.findById(id);
        if (opDepartment.isEmpty()) {
            return ResponseEntity.badRequest().body("Not found department with id = " + id);
        }

        Department department = opDepartment.get();
        department.setDepartmentName(departmentUpdateDTO.getDepartmentName());
        department.setAddress(departmentUpdateDTO.getAddress());

        departmentRepo.save(department);

        return ResponseEntity.ok("Update department success");
    }
}
