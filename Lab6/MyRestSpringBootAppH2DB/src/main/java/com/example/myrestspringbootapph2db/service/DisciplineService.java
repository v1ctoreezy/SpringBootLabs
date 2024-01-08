package com.example.myrestspringbootapph2db.service;

import com.example.myrestspringbootapph2db.entity.Discipline;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAllDisciplines();
    Discipline getDiscipline(int id);
    Discipline saveDiscipline(Discipline disciplines);
    void deleteDisciplines(int id);

}
