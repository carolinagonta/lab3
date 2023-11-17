public class Autovehicul {
    private String marca;
    private String model;
    private int an;
    private String culoare;
    private int consum;

    public Autovehicul(String marca, String model, int an, String culoare, int consum) {
        this.marca = marca;
        this.an = an;
        this.model = model;
        this.culoare = culoare;
        this.consum = consum;
    }
    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }
    public int getAn() {
        return an;
    }
    public String getCuloare() {
        return culoare;
    }
    public int getConsum() {
        return consum;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setAn(int an) {
        this.an = an;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public void setConsum(int consum) {
        this.consum = consum;
    }
    public void alimenteazaAutovehiculul(){
        System.out.println("Alimenteaza autovehiculul daca este necesar!");
    }
}
