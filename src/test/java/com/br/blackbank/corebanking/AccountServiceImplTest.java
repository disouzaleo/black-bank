package com.br.blackbank.corebanking;

import com.br.blackbank.corebanking.service.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class AccountServiceImplTest {

    private AccountServiceImpl accountServiceImpl;

    @Before
    public void setUp() {
        accountServiceImpl = new AccountServiceImpl();
    }

    @Test
    public void createDummyAccount(){
        @Bean

    }
}
