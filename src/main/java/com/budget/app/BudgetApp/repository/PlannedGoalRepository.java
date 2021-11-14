package com.budget.app.BudgetApp.repository;

import com.budget.app.BudgetApp.entity.PlannedGoal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannedGoalRepository extends CrudRepository<PlannedGoal, Long> {
}
