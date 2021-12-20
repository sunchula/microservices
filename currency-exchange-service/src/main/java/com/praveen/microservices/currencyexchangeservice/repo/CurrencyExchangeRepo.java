package com.praveen.microservices.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.praveen.microservices.currencyexchangeservice.bean.CurrencyExchange;

public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long>{

	CurrencyExchange findByFromAndTo(String from, String to);
}
