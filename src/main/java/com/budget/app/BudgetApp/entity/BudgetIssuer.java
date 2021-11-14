package com.budget.app.BudgetApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "budget_issuer")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BudgetIssuer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "budget_plan_id", referencedColumnName = "id")
    private BudgetPlan budget;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String telephone;
    private String address;

}
