package com.budget.app.BudgetApp.controller;

import com.budget.app.BudgetApp.entity.PlannedGoal;
import com.budget.app.BudgetApp.service.PlannedGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("v1/planned-goals")
public class PlannedGoalController {

    @Autowired
    private PlannedGoalService goalService;

    @GetMapping("/{id}")
    public PlannedGoal getPlannedGoal(@PathVariable("id") long id) {
        return goalService.getPlannedGoalById(id);
    }

    @GetMapping("/budget/{id}")
    public List<PlannedGoal> getBudgetPlannedGoals(@PathVariable("id") long id) {
        return null;
    }

    // add a method to add planned goal
    // add a method to edit panned goal
    // add method to delete planned goal
}
