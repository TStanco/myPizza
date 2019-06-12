package config;

import api.IKucharz;
import api.IZapiekanka;
import aspects.AspektZapiekanka;
import aspects.Komunikacja;
import aspects.KontrolaMagazynu;
import implementation.ImplZapiekanka;
import implementation.Kucharz;
import implementation.PomocnikKucharza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {


  @Bean
  public IZapiekanka interfejsZapiekanka(){
    return new ImplZapiekanka();
  }

  @Bean
  public AspektZapiekanka aspektZapiekanka(){
    return new AspektZapiekanka();
  }

  @Bean
  @Qualifier("kucharz")
  public IKucharz kucharz(){
    return new Kucharz();
  }

  @Bean
  @Qualifier("pomocnik_kucharza")
  public IKucharz pomocnikKucharza(){
    return new PomocnikKucharza();
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
