package com.budget.app.BudgetApp.repository;

import com.budget.app.BudgetApp.entity.BudgetNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetNoteRepository extends CrudRepository<BudgetNote, Long> {
}
