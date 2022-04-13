package com.avi.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class GroupExpense extends BaseModel{
    @ManyToOne
    private Group group;

    @OneToOne
    private Expense expense;
}
