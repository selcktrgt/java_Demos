public class Product {

    //Constructor metod ile set yapabiliriz, ayrıca buna overloading denir, yani aynı metod ismi kullanarak
    //başka metodlar da yaratabiliriz fakat parametre kısmında farklılık olmak zorunda, aynı parametre ismi kullanılabilir.
 public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod){

     this.id=id;
     this.name=name;
     this.description=description;
     this.price=price;
     this.stockAmount=stockAmount;
     this.renk=renk;
     this.kod=kod;
 }

    //attribute or field
    private int id;
    String name;
    String description;
    double price;
    int stockAmount;
    String renk;
    String kod;

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id){

        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.kod.substring(0,1)+id;
    }



    //yukarıdaki değişkenlerden birisine sağ tıklayıp refactor kısmından encapsulate
    //fields denirse otomatik getter ve setter verilebilir.
}
