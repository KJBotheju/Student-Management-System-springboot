package com.sms.studentmanagementsystem.Controller;

import com.sms.studentmanagementsystem.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
}
