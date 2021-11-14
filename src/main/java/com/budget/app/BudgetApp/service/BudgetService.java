package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.BudgetPlan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BudgetService {
    List<BudgetPlan> getBudgets();
    BudgetPlan getBudgetById(Long id);
}
