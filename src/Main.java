public class Main {
     public static void main(String[] args) {

         książka harryPotter = new książka("harryPotter", "JK Rowling,", 300, true);


         harryPotter.wypiszinfo();
         harryPotter.wypozycz();
         harryPotter.zwroc();

         System.out.println("--------------------");


         książka quovadis = new książka ("quo vadis", "Henryk Sienkiewicz", 500, false);

         quovadis.wypiszinfo();
         quovadis.wypozycz();
         quovadis.zwroc();

         System.out.println("--------------------");

         książka pantadeusz = new książka ("pan tadeusz", "adam mickiewicz", 700, true);

         pantadeusz.wypiszinfo();
         pantadeusz.wypozycz();
         pantadeusz.zwroc();



     }
}