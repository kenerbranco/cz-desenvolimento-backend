public class Carro {
    private String nome;
    private String marca;

    Carro(){
        // Caso não seja declarado o construtor, por default é criado automaticamente
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}
