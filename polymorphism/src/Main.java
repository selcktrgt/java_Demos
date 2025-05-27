public class Main {

    public static void main(String[] args) {
    //BaseLogger[] loggers=new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
    //for(BaseLogger logger:loggers){
      //  logger.Log("Log mesajı");

        //içeriye extends edilmiş istediğimiz logger ları yazabiliriz ve bunlar customer manager'de
        //constructor'a, baselogger tipli değişkene parametre olarak gidiyor ve o değişkenin loggerini buradaki
        //yazdığımız logger'lar ile değiştirmiş oluyoruz.
        CustomerManager customerManager=new CustomerManager(new FileLogger());

        customerManager.add();
    }


    }


