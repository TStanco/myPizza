package implementation;

import api.IKucharz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Deprecated
public class PomocnikKucharza implements IKucharz {

  @Autowired
  @Qualifier("pomocnik_kucharza")
  private IKucharz kucharz;

  public void pobierzSkladnikiZMagazynu(int liczbaSkladnikow) {
    System.out.println("Pomocnik pobiera: "+liczbaSkladnikow+ " składników");
  }

  public void pobierzSkladnikiZMagazynu() {
    System.out.println("Pomocnik pobiera skladniki");
  }

  public void przygotujPizze() {
    System.out.println("Pomocnik oddelegowuje zadanie do kucharza");
    kucharz.przygotujPizze();
  }

  public void przygotujPizze(int idPizzy) {
    System.out.println("Pomocnik oddelegowuje przygotowanie pizzy o id: "+idPizzy+" do kucharza");
    kucharz.przygotujPizze(idPizzy);
  }

  public void wydajPizze() {
    System.out.println("Pomocnik wydaje pizzę");
  }
}
