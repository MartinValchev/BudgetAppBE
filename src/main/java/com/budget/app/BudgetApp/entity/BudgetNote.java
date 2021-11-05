package com.budget.app.BudgetApp.entity;

import com.budget.app.BudgetApp.enums.NoteCategory;
import com.budget.app.BudgetApp.enums.NoteType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "budget_note")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BudgetNote {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private NoteType type;
    private Double amount;
    private String description;
    @Column(name="insert_date")
    private LocalDateTime insertDate;
    @Column(name="note_category")
    @Enumerated(EnumType.STRING)
    private NoteCategory noteCategory;
    @Column(name="is_recurring")
    private Boolean isRecurring;
    @Column(name="recurring_days_interval")
    private Integer recurringDaysInterval;
}
