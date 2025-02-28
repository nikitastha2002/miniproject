package com.texas.miniprojecta.controllers;

import com.texas.miniprojecta.entity.Student;
import com.texas.miniprojecta.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }
    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student createdSTudent = studentService.createStudent(student);
        return new ResponseEntity<>(createdSTudent, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Student>> list(){
        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getBYId(@PathVariable long id){
        return new ResponseEntity<>(studentService.getById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long id)
    {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity<Student> update(@RequestBody Student student){
        return  new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
    }
}