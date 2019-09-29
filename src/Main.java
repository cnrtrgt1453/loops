public class Main {

    public static void main(String[] args) {

        //For Döngüsü
        for (int i=1;i<=10;i++)
            System.out.println(i);

        System.out.println("For döngü sona erdi..");

        //While
        /*while döngüsünün içerisine girmeden önce
         i yi dışarıda tanımlamamız gerekir*/
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("while döngüsü bitti");


        //Do-While Döngüsü
        /*do-while döngüsünde önce işlem yapılır sonra çalıştırılır. while de önce koşullar kontrol ettirilir ve sonra
        * kodun çalışıp çalışmadığı anlaşılır*/

        int j=1;
        do {

            System.out.println(j);
            j=j+2;

        }while (j<10);
    }
}
