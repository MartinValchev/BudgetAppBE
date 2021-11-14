package com.budget.app.BudgetApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "planned_goal")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlannedGoal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(name="planned_amount")
    private Double plannedAmount;

    private String currency;

    @ManyToOne
    @JoinColumn(name="budget_plan_id", referencedColumnName = "id")
    private BudgetPlan budget;

    @Column(name="due_date")
    private LocalDateTime dueDate;

    private String description;


}
