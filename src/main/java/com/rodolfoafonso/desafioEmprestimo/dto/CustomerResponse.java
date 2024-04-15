package com.rodolfoafonso.desafioEmprestimo.dto;

import com.rodolfoafonso.desafioEmprestimo.domain.Loan;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class CustomerResponse {

    private String custumer;
    private List<Loan> loans;
}
