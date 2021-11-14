package com.budget.app.BudgetApp.repository;

import com.budget.app.BudgetApp.entity.BudgetPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetRepository extends CrudRepository<BudgetPlan,Long> {
}
