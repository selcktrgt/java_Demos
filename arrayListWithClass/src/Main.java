import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        Customer engin= new Customer(1,"Engin","Soyad");
        customers.add(engin);
        customers.add(new Customer(1,"Derin","soyad"));
        customers.add(new Customer(1,"Salih","soyad"));


        customers.remove(engin);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
