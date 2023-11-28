public class Carro extends Veiculo{

    // Atributo
    private float combustivel;

    // Construtores
    public Carro(float velocidade, int passageiros, float combustivel){
        super(velocidade, passageiros);
        this.combustivel = combustivel;
    }
    public Carro(){
        this(0f, 0, 0f);
    }

    // Métodos de acesso
    public void setCombustivel(float combustivel){
        this.combustivel = combustivel;
    }

    public float getCombustivel(){
        return this.combustivel;
    }

    // Métodos obrigatórios
    public void acelera(){
        setVelocidade(getVelocidade() + 1);
    }

    public void freia(){
        setVelocidade(getVelocidade() - 1);
    }
}
