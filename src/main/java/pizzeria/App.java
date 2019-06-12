package pizzeria;

import api.IKucharz;
import api.IOrder;
import api.IZapiekanka;
import config.AppConfig;
import config.AutoConfig;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    IOrder order  = context.getBean(IOrder.class);
//    order.printOrder();
//    IOrder order2 = context.getBean(Order.class);
//    order2.printOrder();

    IKucharz k = (IKucharz) context.getBean("kucharz");
    ((IZapiekanka)k).przygotujZapiekanke();


//    k.pobierzSkladnikiZMagazynu(1);
//    k.przygotujPizze(2);
//    k.wydajPizze();
//    IKucharz pomocnik = (IKucharz) context.getBean("pomocnikKucharza");
//    pomocnik.pobierzSkladnikiZMagazynu();

  }
}
