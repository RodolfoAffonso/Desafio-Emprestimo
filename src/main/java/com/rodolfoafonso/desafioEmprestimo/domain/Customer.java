package com.rodolfoafonso.desafioEmprestimo.domain;

import com.rodolfoafonso.desafioEmprestimo.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {

    private int age ;
    private String cpf ;
    private String name;
    private BigDecimal income ;
    private String location ;

}
