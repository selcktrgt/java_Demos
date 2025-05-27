public class Main {

    public static void main(String[] args) {
        //customer. veya employee. yazdığımızda person sınıfında olan özelliklere
        //erişildiği görülür çünkü person sınıfından miras aldılar.
        Customer customer = new Customer();
        Employee employee = new Employee();

        //Aynı şekilde metodlarda da miras özelliği geçerli. CustomerManager. yazınca personManager sınıfındaki
        //metodlara erişebiliriz.
        employeeManager employeemanager = new employeeManager();
        CustomerManager customerManager = new CustomerManager();


    }
}
