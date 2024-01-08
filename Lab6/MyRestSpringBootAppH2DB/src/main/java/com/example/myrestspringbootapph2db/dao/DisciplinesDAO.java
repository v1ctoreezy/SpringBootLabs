package com.example.myrestspringbootapph2db.dao;

import com.example.myrestspringbootapph2db.entity.Discipline;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinesDAO {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline disciplines);
    Discipline getDiscipline(int id);
    void deleteDiscipline(int id);
}
