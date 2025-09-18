package org.example.introspringboot.controller;

import org.example.introspringboot.entity.Student;
import org.example.introspringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Utilizar el servicio para cargar la lista
    // Muestra una lista de todos los estudiantes
    @GetMapping("/")
    public String getStudents(Model model) {
        List<Student> studentsList = studentService.getStudents();
        model.addAttribute("studentsList", studentsList);
        return "student/students-list";
    }

}
