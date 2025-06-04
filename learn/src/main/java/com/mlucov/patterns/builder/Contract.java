package com.mlucov.patterns.builder;

import lombok.Builder;

import java.util.Date;

public class Contract {
    public Date startDate;
    public Contract(ContractBuilder builder) {
        this.startDate = builder.startDate;
    }
    public static class ContractBuilder {
        private Date startDate;
        public ContractBuilder withStartDate(Date date) {
            this.startDate = date;
            return this;
        }
        public Contract build() {
           return new Contract(this);
        }
    }
}
