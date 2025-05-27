public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("My SQL Eklendi.");

    }
    //classlar birden fazla interface'yi implement edebilir.
}
