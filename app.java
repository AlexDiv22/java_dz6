import java.io.Writer;
import java.text.ParseException;
import java.util.ArrayList;

class Goods {

  public int count;
  public String name;
  public double price;


  // 2^n = 16;
  //

  class ProxyName {
    String val;

    public ProxyName(String v) {
      this.val = v != null ? v : "EMPTY";

      if (v != null)
        this.val = v;
      else
        this.val = "EMPTY";
    }

    public String getVal() {
      return val;
    }
  }

  public Goods(String name) {
    this.name = new ProxyName(name).getVal();
  }

  public Goods(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public Goods(int count, String name) {
    this.count = count;
    this.name = name;
  }

  public Goods(int count, String name, int price) {
    this.count = count;
    this.name = name;
    this.price = price;
  }

  public void print() {
  }
}

public class app {
  public static void main(String[] args) throws InterruptedException, ParseException {
    Goods g1 = new Goods(0, null, 0);
    CreateGoods g2 = new CreateGoods();

    g1 = g2.Create();
    g1.print();

    g1 = g2.setName("Mersedes").setCount(50).setPrice(4599).Create();
    g1.print();

    g1 = g2.setName("BMW").Create();
    g1.print();


  }
}
