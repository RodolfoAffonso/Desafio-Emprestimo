package com.rodolfoafonso.desafioEmprestimo.mapper;

import com.rodolfoafonso.desafioEmprestimo.domain.Customer;
import com.rodolfoafonso.desafioEmprestimo.dto.CustomerDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-15T09:53:12-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
@Component
public class CustumerMapperImpl implements CustumerMapper {

    @Override
    public Customer mapper(CustomerDTO customerDTO) {
        if ( customerDTO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setAge( customerDTO.getAge() );
        customer.setCpf( customerDTO.getCpf() );
        customer.setName( customerDTO.getName() );
        customer.setIncome( customerDTO.getIncome() );
        customer.setLocation( customerDTO.getLocation() );

        return customer;
    }
}
