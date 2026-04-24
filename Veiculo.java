public abstract class Veiculo {
    private String placa;
    private double capacidade;

    public Veiculo(String placa, double capacidade) {
        this.placa = placa;
        setCapacidade(capacidade); 
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade não pode ser negativa.");
        }
        this.capacidade = capacidade;
    }
}
