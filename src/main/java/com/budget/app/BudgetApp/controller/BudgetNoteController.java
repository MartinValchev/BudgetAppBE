package com.budget.app.BudgetApp.controller;

import com.budget.app.BudgetApp.entity.BudgetNote;
import com.budget.app.BudgetApp.service.BudgetNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/budges_note")
public class BudgetNoteController {

    @Autowired
    private BudgetNoteService noteService;

    @GetMapping("/all")
    public List<BudgetNote> getAllBudgetNotes() {
        return noteService.getBudgetNotes();
    }

    @GetMapping("/{id}")
    public BudgetNote getBudgetNote(@PathVariable("id") Long id) {
        return noteService.getBudgetNoteById(id);
    }
}
