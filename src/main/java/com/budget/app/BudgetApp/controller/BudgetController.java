package com.budget.app.BudgetApp.controller;

import com.budget.app.BudgetApp.entity.BudgetPlan;
import com.budget.app.BudgetApp.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/v1/budgets")
public class BudgetController {

    @Autowired
    BudgetService service;

    @GetMapping("/{id}")
    public BudgetPlan getBudgetById(@PathVariable("id") long id) {
        return service.getBudgetById(id);
    }

    @GetMapping("/all")
    public List<BudgetPlan> getBudgets() {
        return service.getBudgets();
    }

    // add method for add budget
    // add method for update Budget

}
