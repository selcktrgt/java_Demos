public class Main {

    public static void main(String[] args) {
        accountManager accountmanager=new accountManager();
        accountmanager.deposit(100);


        try {
            accountmanager.withdraw(90);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        try {
            accountmanager.withdraw(50);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }





    }
}
