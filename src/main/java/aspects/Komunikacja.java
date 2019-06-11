package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Komunikacja {
  @After("execution(* api.IKucharz.pobierzSkladnikiZMagazynu(..))")
  public void poinformujOPobraniuSkladnikow(){
    System.out.println("Pobrano składniki");
  }
}
