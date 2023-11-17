public class Autocar extends Autovehicul{
    private  int nrLocuri;
    private boolean wifi;
    private  int capacitateBagaje;
    public Autocar(String marca, String model, int an, String culoare, int consum, int nrLocuri, boolean wifi, int capacitateBagaje) {
        super(marca, model, an, culoare, consum);
        this.nrLocuri = nrLocuri;
        this.wifi = wifi;
        this.capacitateBagaje = capacitateBagaje;
    }
    public int getNrLocuri() {
        return nrLocuri;
    }
    public boolean isWifi() {
        return wifi;
    }
    public int getCapacitateBagaje() {
        return capacitateBagaje;
    }
    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public void setCapacitateBagaje(int capacitateBagaje) {
        this.capacitateBagaje = capacitateBagaje;
    }
    @Override
    public void alimenteazaAutovehiculul(){
        System.out.println("Autocarul a fost alimentat cu 20 litri!");
    }
    //Overload
    public void nrDePersoaneLaBord(int persoane){
        System.out.println("Autocarul va lua " + persoane + "persoane");
    }

    public void nrDePersoaneLaBord(int persoane, String tara){
        System.out.println("Din" + tara + " autocarul va lua " + persoane + " persoane");
    }
    public String toString() {
        return "\nAutocar:"+ "\n"
                +"Marca: " + this.getMarca() + "\n" +
                "Model: " + this.getModel()+ "\n" +
                "An: " + this.getAn()+ "\n" +
                "Culoare: " + this.getCuloare()+ "\n" +
                "Consum: " + this.getConsum()+"\n"+
                "Nr. locuri: " + this.nrLocuri+ "\n" +
                "WiFi: " + this.wifi+ "\n" +
                "Capacitate bagaje: " + this.capacitateBagaje+"\n" ;
    }
}
