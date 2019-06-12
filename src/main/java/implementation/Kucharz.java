package implementation;

import api.IKucharz;

public class Kucharz implements IKucharz {

  public void przygotujPizze() {
    System.out.println("Kucharz przygotowuje pizze");
  }

  public void wydajPizze() {
    System.out.println("Kucharz wydaje pizze");
  }

  public void pobierzSkladnikiZMagazynu() {
    System.out.println("Kucharz pobiera składniki");
//    throw new IllegalAccessError();
  }

  public void pobierzSkladnikiZMagazynu(int liczbaSkladnikow) {
    System.out.println("Kucharz pobiera "+ liczbaSkladnikow + " składników");
  }

  public void przygotujPizze(int idPizzy) {
    System.out.println("Kucharz przygotowuje pizze o id: " + idPizzy);
  }
}
