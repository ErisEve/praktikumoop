package com.example.demo.grades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;

    @Autowired
    public GradeService(GradeRepository gradeRepository) {
        this.gradeRepository = gradeRepository;
    }

    public List<Grade> getGrades() {
        return gradeRepository.findAll();
    }

    public void addNewGrade(Grade grade) {
        Optional<Grade> gradeOptional = gradeRepository.findGradeById(grade.getId());
        if (gradeOptional.isPresent()) {
            throw new IllegalStateException("Id already exists");
        }
        gradeRepository.save(grade);
    }

    public void deleteGrade(Long id) {
        boolean b = gradeRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Grade with this id doesn't exsists");
        }
        gradeRepository.deleteById(id);
    }
}