package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.BudgetNote;

import java.util.List;

public interface BudgetNoteService {
    public List<BudgetNote> getBudgetNotes();
    public BudgetNote getBudgetNoteById(Long id);
}
