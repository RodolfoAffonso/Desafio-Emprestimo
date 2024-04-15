package com.rodolfoafonso.desafioEmprestimo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Loan {
    private LoansType type ;
    private double interest_Rate;

    public Loan(LoansType type){
        this.type = type;
        switch (type){
            case PERSONAL -> this.interest_Rate = 4.0;
            case GUARANTEED -> this.interest_Rate = 3.0;
            case CONSIGNMENT -> this.interest_Rate = 2.0;
        }
    }
}
