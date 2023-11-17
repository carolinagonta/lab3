// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Autocar autocar=new Autocar("Mercedes", "Citaro",2007, "alb", 20,70,true, 500);
       Autovehicul camion = new Camion("Daf", "Scania", 2004, "rosu", 30, 4, false, 2);
       Autovehicul masina= new Masina("BMW", "x6", 2020, "negru", 7, 5,false,30,true,4,"automat");
       System.out.println(autocar);
       System.out.println(camion);
       System.out.println(masina);

       autocar.alimenteazaAutovehiculul();
       camion.alimenteazaAutovehiculul();
       masina.alimenteazaAutovehiculul();

       autocar.nrDePersoaneLaBord(50);
       autocar.nrDePersoaneLaBord(64, "Franta");
    }
}