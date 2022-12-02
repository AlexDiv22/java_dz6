public class Goods {

    String name;
    int count;
    int price;
    // 1+3+3+1 = 8 => 2^n
  
    public void print() {
      System.out.println(
          String.format(
              "%s %d %d",
              name,
              count,
              price));
    }
  }
  