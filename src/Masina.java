public class Masina extends Autocar{
    private boolean airbag;
    private int nrUsi;
    private String tipTransmisie;

    public Masina(String marca, String model, int an, String culoare, int consum, int nrLocuri, boolean wifi, int capacitateBagaje, boolean airbag, int nrUsi, String tipTransmisie) {
        super(marca, model, an, culoare, consum, nrLocuri, wifi, capacitateBagaje);
        this.airbag = airbag;
        this.nrUsi = nrUsi;
        this.tipTransmisie = tipTransmisie;
    }
    public boolean getAirbag() {
        return airbag;
    }
    public int getNrUsi() {
        return nrUsi;
    }
    public String getTipTransmisie() {
        return tipTransmisie;
    }
    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }
    public void setNrUsi(int nrUsi) {
        this.nrUsi = nrUsi;
    }
    public void setTipTransmisie(String tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }
//    public void stareAutovehicul(){
//        System.out.println("Masina este pornita");
//    }
//    public void stareCombustibil(){
//        System.out.println("Masina are suficent combustibil!");
//    }
    @Override
    public void alimenteazaAutovehiculul(){
        System.out.println("Masina nu trebuie sa fie alimentata!");
    }
    public String toString() {
        return "\nMasina:"+ "\n"
                + "Marca: " + this.getMarca() + "\n" +
                "Model: " + this.getModel()+ "\n" +
                "An: " + this.getAn()+ "\n" +
                "Culoare: " + this.getCuloare()+ "\n" +
                "Consum: " + this.getConsum()+"\n"+
                "Airbag: " + this.airbag+ "\n" +
                "Nr.usi: " + this.nrUsi+ "\n" +
                "Tip tansmisie: " + this.tipTransmisie+"\n" ;
    }
}
