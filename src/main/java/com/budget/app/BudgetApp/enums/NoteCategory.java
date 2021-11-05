package com.budget.app.BudgetApp.enums;

public enum NoteCategory {
    FOOD("food"),
    CLEANING("cleaning"),
    BILLS("bills"),
    HOLIDAY("holiday"),
    PRESENTS("presents"),
    CLOTHES("clothes"),
    BABY("baby"),
    CAR_REPAIRS("car repairs"),
    CAR_FUEL("car fuel"),
    MORTGAGE("mortgage"),
    TAX("tax"),
    FREE_TIME("free time"),
    ELECTRONICS("electronics"),
    HOME("home"),
    TRANSPORT("transport"),
    OTHER("transport"),
    BONUS("bonus"),
    SALARY("salary");

    private String name;

    NoteCategory(String name) {
        this.name =  name;
    }

}
