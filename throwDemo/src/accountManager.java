public class accountManager {

    private double balance;

    public void deposit(int amount){
        balance +=amount;
        System.out.println(amount+"TL yatırıldı, güncel hesap bakiyesi:"+balance+"TL");
    }
    public void withdraw(int amount) throws Exception {
        if(balance>=amount) {
            balance -= amount;
            System.out.println(amount+"TL çekildi, güncel Hesap bakiyesi:" + balance+"TL");
        }else{
            throw new Exception("Hesap bakiyesi yetersiz");
        }
    }

}
