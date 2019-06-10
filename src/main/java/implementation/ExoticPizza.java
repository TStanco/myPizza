package implementation;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExoticPizza implements IPizza {
  private int price;
  private String name;



  public ExoticPizza(
          @Value("1") int price,
          @Value("Egzotyczna") String name) {
    super();
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
