package implementation;

import api.GoodPizza;
import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

  @Autowired
  @GoodPizza
  private IPizza pizza;

  public ExclusiveOrder() {
    super();
  }

  @Override
  public void printOrder() {
    System.out.println("Zamówienie exclusive: "+ pizza.getName()+ "cena: "+pizza.getPrice());
  }

  public IPizza getPizza() {
    return pizza;
  }

//  Autowired
//  @GoodPizza
  public void setPizza(IPizza pizza) {
    this.pizza = pizza;
  }
}
