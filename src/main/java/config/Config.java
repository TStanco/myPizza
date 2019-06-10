package config;

import api.IPizza;
import implementation.ExoticPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
  @Bean
  public IPizza pizza() {
    return new ExoticPizza(23, "egzotyczna");

  }
//
//  @Bean
//  public IOrder order(IPizza pizza) {
//    return new Order(pizza);
//  }
}
