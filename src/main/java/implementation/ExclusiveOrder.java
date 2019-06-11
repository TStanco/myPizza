package implementation;

import api.GoodPizza;
import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

//  @Autowired
//  @GoodPizza

  @Value("#{listOfPizza[0]}")
  private IPizza pizza;
  @Autowired
  private List<IPizza>listOfPizza;

  public ExclusiveOrder() {
    super();
  }


  public void printOrder() {
    System.out.println("Zamówienie exclusive: "+ pizza.getName()+ ", cena: "+pizza.getPrice());
  }

  public IPizza getPizza() {
    return pizza;
  }

//  @Autowired
//  @GoodPizza
//  @Value("#{exoticPizza}")
  public void setPizza(IPizza pizza) {
//    pizza.setPrice(20);
    this.pizza = pizza;
  }
}
