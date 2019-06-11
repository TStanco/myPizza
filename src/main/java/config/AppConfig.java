package config;

import api.IKucharz;
import aspects.Komunikacja;
import aspects.KontrolaMagazynu;
import implementation.Kucharz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

  @Bean
  public IKucharz kucharz(){
    return new Kucharz();
  }
  @Bean
  public Komunikacja komunikacja(){
    return new Komunikacja();
  }
  @Bean
  public KontrolaMagazynu kontrolaMagazynu(){
    return new KontrolaMagazynu();
  }


}
