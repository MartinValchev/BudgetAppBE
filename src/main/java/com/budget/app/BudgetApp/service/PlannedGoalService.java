package com.budget.app.BudgetApp.service;

import com.budget.app.BudgetApp.entity.PlannedGoal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlannedGoalService {
    List<PlannedGoal> getPlannedGoals();
    PlannedGoal getPlannedGoalById(Long id);
}
