package br.com.acme.payrollapi.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private long id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;



}
