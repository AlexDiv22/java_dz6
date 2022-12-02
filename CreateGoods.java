public class CreateGoods {

    Goods temp;
    
    public CreateGoods(){
        temp = new Goods(0, null, 0);
        temp.name = "--";
        temp.count = -1;
        temp.price = -1;
    }

    public CreateGoods setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateGoods setCount(int count) {
      temp.count = count;
      return this;
    }
  
    public CreateGoods setPrice(int price) {
      temp.price = price;
      return this;
    }

  
    public Goods Create() {
      return temp;
    }
  }
  