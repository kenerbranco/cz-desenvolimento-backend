public class Veiculo {
    private String nome;
    private float velocidade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelocidade(float velocidade){
        this.velocidade = velocidade;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public void acelera(){
        if(this.velocidade <= 10){
            this.velocidade++;
        }
    }

    public void frea(){
        if(this.velocidade > 0){
            this.velocidade--;
        }
    }
}
