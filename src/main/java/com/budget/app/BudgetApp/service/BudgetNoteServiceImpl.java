package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.BudgetNote;
import com.budget.app.BudgetApp.repository.BudgetNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetNoteServiceImpl implements  BudgetNoteService {
    @Autowired
    BudgetNoteRepository noteRepository;

    @Override
    public List<BudgetNote> getBudgetNotes() {
        return (List<BudgetNote>)noteRepository.findAll();
    }

    @Override
    public BudgetNote getBudgetNoteById(Long id) {
        return noteRepository.findById(id).get();
    }
}
