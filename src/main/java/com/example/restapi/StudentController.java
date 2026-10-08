package com.example.restapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// HANDLES API REQUEST
@RestController
public class StudentController {

    private final StudentRepository studentRepository;
    private final StudentService studentService;

    StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentsbyId(@PathVariable int id) {
        return studentService.getStudentById(id);
        // throw new ResponseStatusException(
        // HttpStatus.NOT_FOUND,
        // "Student not found");
    }

    @GetMapping("/students/name/{name}")
    public Student getStudentsbyName(@PathVariable String name) {
        return studentService.getStudentByName(name);
        // throw new ResponseStatusException(
        // HttpStatus.NOT_FOUND,
        // "Student not found");
    }

    @PostMapping("/students")

    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updateStudent) {
        return studentService.updateStudent(id, updateStudent);

    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);

    }

}
