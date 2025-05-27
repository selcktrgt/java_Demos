public class Main {

    public static void main(String[] args) {

        String [][] sehirler=new String[3][3];
        sehirler[0][0]="istanbul";
        sehirler[0][1]="bilecik";
        sehirler[0][2]="kütahya";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="konya";
        sehirler[1][2]="kırıkkale";
        sehirler[2][0]="trabzon";
        sehirler[2][1]="rize";
        sehirler[2][2]="artvin";

        for(int i=0;i<3;i++){
            System.out.println("------------");
            for(int j=0;j<3;j++){

                System.out.println(sehirler[i][j]);

            }


        }
    }
}
