package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.BudgetPlan;
import com.budget.app.BudgetApp.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BudgetServiceImpl implements BudgetService {
    @Autowired
    private BudgetRepository repository;

    @Override
    public List<BudgetPlan> getBudgets() {
        return (List<BudgetPlan>)repository.findAll();
    }

    @Override
    public BudgetPlan getBudgetById(Long id) {
        return (BudgetPlan)repository.findById(id).get();
    }
}
