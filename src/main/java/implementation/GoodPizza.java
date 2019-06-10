package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
//@Qualifier("dobra")
public class GoodPizza implements IPizza {
  private int price;
  private String name;

//  public GoodPizza(int price, String name) {
  public GoodPizza(
          @Value("14") int price, @Value("dobra") String name) {
    this.price = price;
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
