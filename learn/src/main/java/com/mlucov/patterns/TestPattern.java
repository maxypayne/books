package com.mlucov.patterns;

//import learn.patterns.builder.Contract;

import com.mlucov.patterns.builder.Contract;

import java.util.Date;

public class TestPattern {
    Contract.ContractBuilder builder = new Contract.ContractBuilder();

    public void test(){
        Contract contract = this.builder.withStartDate(new Date()).build();
    }
}
