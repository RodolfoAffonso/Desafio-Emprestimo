package com.rodolfoafonso.desafioEmprestimo.mapper;

import com.rodolfoafonso.desafioEmprestimo.domain.Customer;
import com.rodolfoafonso.desafioEmprestimo.dto.CustomerDTO;
import org.mapstruct.Mapping;


@org.mapstruct.Mapper(componentModel = "spring")
public interface CustumerMapper {

    @Mapping(source = "age", target = "age")
    Customer mapper (CustomerDTO customerDTO);
}
