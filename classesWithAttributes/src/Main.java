public class Main {

    public static void main(String[] args) {

     //Constructor metod ile böyle bir yazım yaptık, istersek bir alttakiyle set edebiliriz.
     Product product=new Product(2,"laptop","Asus",5000,3,
             "Siyah","123");

     //product.setName("Laptop");
     //product.setId(1);
     //product.setDescription("Asus Laptop");
     //product.setPrice(5000);
     //product.setStockAmount(3);

     ProductManager productManager=new ProductManager();
     productManager.Add(product);




    }
}
