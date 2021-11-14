package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.PlannedGoal;
import com.budget.app.BudgetApp.repository.PlannedGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PlannedGoalServiceImpl implements PlannedGoalService {
    @Autowired
    private PlannedGoalRepository repository;
    @Override
    public List<PlannedGoal> getPlannedGoals() {
        return (List<PlannedGoal>)repository.findAll();
    }

    @Override
    public PlannedGoal getPlannedGoalById(Long id) {
        return (PlannedGoal)repository.findById(id).get();
    }
}
