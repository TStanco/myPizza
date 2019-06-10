package implementation;

import api.GoodPizza;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
//@Qualifier("egzotyczna")
@GoodPizza
public class ExoticPizza implements IPizza {
  private int price;
  private String name;


    public ExoticPizza(
          @Value("1") int price,
          @Value("Egzotyczna ") String name) {
//  public ExoticPizza(int price, String name) {

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
