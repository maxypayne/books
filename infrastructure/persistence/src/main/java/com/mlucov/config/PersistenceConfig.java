package com.mlucov.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration(proxyBeanMethods = false)
@EnableTransactionManagement
@EnableJpaRepositories(value = "com.mlucov", enableDefaultTransactions = false)
@ComponentScan(basePackages = "com.mlucov")
@EntityScan(value = "com.mlucov")
public class PersistenceConfig {

}
