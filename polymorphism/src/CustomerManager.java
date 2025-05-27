public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        //baselogger olan logger üstte constructur'da yapılanlar sayesinde database logger haline geldi
        //ve burada database'nin log'unu çağırıyoruz
        this.logger.log("log mesajı");
    }

}
