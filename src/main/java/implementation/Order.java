package implementation;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {
  private IPizza pizza;

  public Order(@Value("#{goodPizza}") IPizza pizza) {
//  public Order(@Qualifier("dobra") IPizza pizza) {
    super();
//    pizza.setPrice(10);
    this.pizza = pizza;
  }
  public void printOrder (){
    System.out.println("Zamówienie: "+pizza.getName()+ ", cena: "+ pizza.getPrice());
  }

}
