public class Camion extends Autovehicul {
    private int cantitate;
    private boolean platforma;
    private int nrRemorci;

    public Camion(String marca, String model, int an, String culoare, int consum, int cantitate, boolean platforma, int nrRemorci) {
        super(marca, model, an, culoare, consum);
        this.cantitate = cantitate;
        this.platforma = platforma;
        this.nrRemorci = nrRemorci;
    }
    public int getCantitate() {
        return cantitate;
    }
    public boolean isPlatforma() {
        return platforma;
    }
    public int getNrRemorci() {
        return nrRemorci;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public void setPlatforma(boolean platforma) {
        this.platforma = platforma;
    }
    public void setNrRemorci(int nrRemorci) {
        this.nrRemorci = nrRemorci;
    }
    @Override
    public void alimenteazaAutovehiculul(){
        System.out.println("Camionul a fost alimentat cu 10 litri!");
    }

    public String toString() {
        return "\nCamion:"+ "\n"
                + "Marca: " + this.getMarca() + "\n" +
                "Model: " + this.getModel()+ "\n" +
                "An: " + this.getAn()+ "\n" +
                "Culoare: " + this.getCuloare()+ "\n" +
                "Consum: " + this.getConsum()+"\n"+
                "Cantitate: " + this.cantitate+ "\n" +
                "Platforma: " + this.platforma+ "\n" +
                "Nr. remorci: " + this.nrRemorci+"\n" ;
    }
}
