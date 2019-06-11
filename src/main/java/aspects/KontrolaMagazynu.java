package aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class KontrolaMagazynu {

  @Before("execution(* api.IKucharz.pobierzSkladnikiZMagazynu(..))")
  public void sprawdzSkladnikiMagazynu() {
    System.out.println("Sprawdzam magazyn");
  }

  @AfterThrowing("execution(* api.IKucharz.pobierzSkladnikiZMagazynu(..))")
  public void zasygnalizujBrakWMagazynie(){
    System.out.println("Braki w magazynie!!!");
  }

}
