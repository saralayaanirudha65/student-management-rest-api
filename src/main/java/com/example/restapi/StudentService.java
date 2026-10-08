package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service // create and manage class as service
public class StudentService {
     
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    






    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Anirudh", 24),
            new Student(2, "Anirudha", 25),
            new Student(3, "Bunny", 32)));

    public List<Student> getStudents() {
        return  studentRepository.findAll();
    }
    
    public Student getStudentById(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }

        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found");
    }

    public Student getStudentByName(String name) {

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }

        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found");
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(int id, Student updateStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(updateStudent.getName());
                student.setAge(updateStudent.getAge());
                return student;
            }
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found");

    }

    public String deleteStudent(int id)
    {
        for(int i=0;i<students.size();i++)
        {
            if(students.get(i).getId()==id)
            {
                students.remove(i);
                return "Deleted Successfully";
            }
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found");
    }

}
