package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Komunikacja {
  @After("execution(* api.IKucharz.pobierzSkladnikiZMagazynu(..))")
  public void poinformujOPobraniuSkladnikow(){
    System.out.println("Pobrano składniki");
  }
  @Around("execution(* api.IKucharz.wydajPizze(..))")
  public void wydaniePizzy(ProceedingJoinPoint joinPoint){
    try {
      System.out.println("Komunikuemy, że pizza jest gotowa");
      joinPoint.proceed();
      System.out.println("Komunikuemy, że wydano pizzę");

    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }

}
