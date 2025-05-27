public abstract class GameCalculator {
    public abstract void hesapla();
    //metodu abstract yapınca, inheritance alan classlarda bu metod override edilmeli
    //yani o classların kendi hesapla metodları olmak zorunda demektir.
    //Abstract classlar new yapılamaz.

    public void gameOver() {
        System.out.println("Oyun bitti");
    }

}
