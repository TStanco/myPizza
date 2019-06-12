package aspects;

import api.IZapiekanka;
import implementation.ImplZapiekanka;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspektZapiekanka {
  @DeclareParents(value = "api.IKucharz+", defaultImpl = ImplZapiekanka.class)
  public static IZapiekanka iZapiekanka;

}
