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
//@GoodPizza
public class ExoticPizza implements IPizza {
  private int price;
  private String name;
  @Value("#{goodPizza.price matches'[1-555][1-555]'}")
  boolean bool;


    public ExoticPizza(
//          @Value("#{goodPizza.getPrice()}") int price,
//          @Value("#{T(java.lang.Math).random()*10}") int price,
          @Value("#{goodPizza.price>13? 13:20}") int price,
          @Value("#{goodPizza.getName()?.toUpperCase()}") String name) {
//  public ExoticPizza(int price, String name) {

    super();
    this.price = price;
    this.name = name;
  }

  public int getPrice() {
    System.out.println(bool);
    return price;
  }


  public void setPrice(int price) {
    this.price=price;
  }

  public String getName() {
    return name;
  }
}
