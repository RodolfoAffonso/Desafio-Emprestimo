package com.rodolfoafonso.desafioEmprestimo.service;

import com.rodolfoafonso.desafioEmprestimo.domain.Customer;
import com.rodolfoafonso.desafioEmprestimo.domain.Loan;
import com.rodolfoafonso.desafioEmprestimo.domain.LoansType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class LoansService {

    public List<Loan> getLoans(Customer customer) {
        List<Loan> loans = new ArrayList<>();

        BigDecimal income = customer.getIncome();
        int age = customer.getAge();
        String location = customer.getLocation();

        // Verifica se a renda é menor ou igual a 3000
        if (income.compareTo(BigDecimal.valueOf(3000)) >= 0) {
            loans.add(new Loan(LoansType.GUARANTEED));

        }
        // Verifica se a renda é menor que 5000, a idade é menor que 30 e a localização é "SP"
        if (income.compareTo(BigDecimal.valueOf(5000)) < 0 && age < 30 && location.equals("SP")) {
            boolean tipoExistente = false;
            for (Loan loan : loans) {
                if (loan.getType() == LoansType.GUARANTEED) {
                    tipoExistente = true;
                    break;
                }
            }
            if (!tipoExistente) {
                loans.add(new Loan(LoansType.GUARANTEED));
            }
        }

        // Verifica se a renda é maior ou igual a 5000
        if (income.compareTo(BigDecimal.valueOf(5000)) <= 0) {
            loans.add(new Loan(LoansType.CONSIGNMENT));
        }
        // Se não atender a nenhum dos critérios anteriores, adiciona um empréstimo pessoal
        loans.add(new Loan(LoansType.PERSONAL));

        return loans;
    }


    }

