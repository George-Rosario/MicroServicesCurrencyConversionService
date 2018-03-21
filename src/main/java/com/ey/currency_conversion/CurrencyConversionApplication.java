package com.ey.currency_conversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients("com.ey.currency_conversion")
@EnableDiscoveryClient
public class CurrencyConversionApplication {

  public static void main(String[] args) {
    SpringApplication.run(CurrencyConversionApplication.class, args);
  }
  
 /* @Bean
  public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
  }*/
}