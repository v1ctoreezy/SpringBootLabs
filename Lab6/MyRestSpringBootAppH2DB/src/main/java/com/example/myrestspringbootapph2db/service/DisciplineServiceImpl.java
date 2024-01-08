package com.example.myrestspringbootapph2db.service;

import com.example.myrestspringbootapph2db.dao.DisciplinesDAO;
import com.example.myrestspringbootapph2db.entity.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {


    @Autowired
    public DisciplinesDAO disciplinesDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines() {
        return disciplinesDAO.getAllDisciplines();
    }

    @Override
    @Transactional
    public Discipline getDiscipline(int id) {
        return disciplinesDAO.getDiscipline(id);
    }

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline disciplines) {
        return disciplinesDAO.saveDiscipline(disciplines);
    }

    @Override
    @Transactional
    public void deleteDisciplines(int id) {
        disciplinesDAO.deleteDiscipline(id);
    }


}
