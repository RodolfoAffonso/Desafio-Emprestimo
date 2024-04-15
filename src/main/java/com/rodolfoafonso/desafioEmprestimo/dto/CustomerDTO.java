package com.rodolfoafonso.desafioEmprestimo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CustomerDTO {

    private int age ;
    private String cpf ;
    private String name;
    private BigDecimal income ;
    private String location ;
}
