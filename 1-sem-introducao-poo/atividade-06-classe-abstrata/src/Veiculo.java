public abstract class Veiculo {

    // Atributos
    private float velocidade;
    private int passageiros;

    // Construtores
    public Veiculo(){
        this.velocidade = 0f;
        this.passageiros = 0;
    }
    public Veiculo(float velocidade, int passageiros){
        this.velocidade = velocidade;
        this.passageiros = passageiros;
    }

    // Métodos concretos de acesso
    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public void setPassageiros(int passageiros){
        this.passageiros = passageiros;
    }

    public int getPassageiros(){
        return this.passageiros;
    }

    // Métodos abstratos
    public abstract void acelera();
    public abstract void freia();
}
