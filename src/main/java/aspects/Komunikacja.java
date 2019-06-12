package aspects;

//import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

  @Pointcut("args(argumentInt)")
  public void pointcutInt(int argumentInt){
  }

  @Pointcut ("target(api.IKucharz)")
  public void pointcutTarget(){
  }

  @Pointcut("@target(annotation)")
  public void pointcutTargetAnnotation(Deprecated annotation){
  }

  @Pointcut("within(implementation.Kucharz)")
  public void pointcutWithin(){
  }

  @Before("pointcutWithin()&& pointcutInt(arg)")
  public void porada (int arg){
    System.out.println("PORADA ");
  }

//  @After("execution(* api.IKucharz.pobierzSkladnikiZMagazynu(..))")
//  public void poinformujOPobraniuSkladnikow(){
//    System.out.println("Pobrano składniki");
//  }
//  @Around("execution(* api.IKucharz.wydajPizze(..))")
//  public void wydaniePizzy(ProceedingJoinPoint joinPoint){
//    try {
//      System.out.println("Komunikuemy, że pizza jest gotowa");
//      joinPoint.proceed();
//      System.out.println("Komunikuemy, że wydano pizzę");
//
//    } catch (Throwable throwable) {
//      throwable.printStackTrace();
//    }
//  }

}
