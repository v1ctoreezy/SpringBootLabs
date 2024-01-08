package com.example.myrestspringbootapph2db.controller;

import com.example.myrestspringbootapph2db.entity.Discipline;
import com.example.myrestspringbootapph2db.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplines")
public class DisciplinesController {

    @Autowired
    public DisciplineService disciplineService;

    @GetMapping("/disciplines")
    public List<Discipline> showAllDisciplines() {
        List<Discipline> allDisciplines = disciplineService.getAllDisciplines();
        return allDisciplines;
    }

    @GetMapping("/disciplines/{id}")
    public Discipline getDiscipline(@PathVariable("id") int id) {
        return disciplineService.getDiscipline(id);
    }

    @PostMapping("/disciplines")
    public Discipline saveDiscipline(@RequestBody Discipline discipline) {
        return disciplineService.saveDiscipline(discipline);
    }

    @PutMapping("/disciplines")
    public Discipline updateDiscipline(@RequestBody Discipline discipline) {
        disciplineService.saveDiscipline(discipline);
        return discipline;
    }

    @DeleteMapping("/disciplines/{id}")
    public void updateDisciplines(@PathVariable("id") int id) {
        disciplineService.getDiscipline(id);
    }
}
