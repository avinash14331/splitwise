package com.avi.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Map;

@Getter
@Setter
@Entity
public class Expense extends BaseModel{
    private Currency currency;

    @ManyToOne
    private User createdBy;

    private String description;

    private Long amount;

    @ElementCollection
    private Map<User,Long> paidBy;

    @ElementCollection
    private Map<User,Long> owedBy;
}
