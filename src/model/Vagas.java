package model;

public class Vagas {
    
    private int vagasLivres;
    private int vagasOcupadas;
    private int total;

    public Vagas(int vagasLivres, int vagasOcupadas) {
        this.vagasLivres = vagasLivres;
        this.vagasOcupadas = vagasOcupadas;
        this.total = this.vagasLivres + this.vagasOcupadas;
    }

    public int getVagasLivres() {
        return vagasLivres;
    }

    public void setVagasLivres(int vagasLivres) {
        this.vagasLivres = vagasLivres;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "Vagas{" + "vagasLivres=" + vagasLivres + ", vagasOcupadas=" + vagasOcupadas + ", total=" + total + '}';
    }   
}
