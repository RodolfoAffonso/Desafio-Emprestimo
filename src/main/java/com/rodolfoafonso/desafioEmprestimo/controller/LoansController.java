package com.rodolfoafonso.desafioEmprestimo.controller;
import com.rodolfoafonso.desafioEmprestimo.domain.Customer;
import com.rodolfoafonso.desafioEmprestimo.domain.Loan;
import com.rodolfoafonso.desafioEmprestimo.dto.CustomerDTO;
import com.rodolfoafonso.desafioEmprestimo.dto.CustomerResponse;
import com.rodolfoafonso.desafioEmprestimo.mapper.CustumerMapper;
import com.rodolfoafonso.desafioEmprestimo.service.LoansService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/loans")
public class LoansController {

    private final LoansService loansService ;
    private final CustumerMapper mapper;

    @PostMapping
    public ResponseEntity<CustomerResponse> lend(@RequestBody CustomerDTO customerDTO){
        Customer customer = mapper.mapper(customerDTO);
        List<Loan> loans = loansService.getLoans(customer);
           return ResponseEntity.status(HttpStatus.OK)
                   .contentType(MediaType.APPLICATION_JSON)
                   .body(new CustomerResponse(customer.getName(), loans));

    }



}
