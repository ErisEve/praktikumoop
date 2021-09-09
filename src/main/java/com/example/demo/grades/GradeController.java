package com.example.demo.grades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GradeController {
    private final GradeService gradeService;

    @Autowired
    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/grades")
    public List<Grade> getGrades(){

        return gradeService.getGrades();
    }

    @PostMapping("/grades")
    public void registerNewGrade(@RequestBody Grade grade){
        gradeService.addNewGrade(grade);
    }

    @DeleteMapping(path="/grade/{gradeId}")
    public void deleteGrade(@PathVariable("gradeId") Long id){

        gradeService.deleteGrade(id);
    }
}