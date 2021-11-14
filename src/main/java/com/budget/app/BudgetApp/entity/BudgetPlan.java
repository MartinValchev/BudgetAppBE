package com.budget.app.BudgetApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "budget_plan")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BudgetPlan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @OneToMany(mappedBy = "budget")
    private List<BudgetNote> notes;

    @OneToMany(mappedBy = "budget")
    private List<PlannedGoal> goals;

    private String description;

    @Column(name = "current_balance")
    private Long currentBalance;

    @Column(name = "base_currency")
    private String baseCurrency;
}
