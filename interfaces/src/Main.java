public class Main {

    public static void main(String[] args) {
        //ICustomerDal customerDal=new OracleCustomerDal();
        //interface ler new yapılamazlar, ama referans tutarlar.

     CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
     customerManager.add();
    }
}
