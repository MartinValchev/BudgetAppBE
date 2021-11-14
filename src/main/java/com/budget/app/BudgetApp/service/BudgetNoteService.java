package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.BudgetNote;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BudgetNoteService {
    public List<BudgetNote> getBudgetNotes();
    public BudgetNote getBudgetNoteById(Long id);
}
