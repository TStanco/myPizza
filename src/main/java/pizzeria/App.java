package pizzeria;

import api.IKucharz;
import api.IOrder;
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

    IKucharz kucharz = context.getBean(IKucharz.class);
    kucharz.pobierzSkladnikiZMagazynu();
  }
}
