public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade){ // Construtor Pessoa é obrigatório a passagem de parâmetros
        this.nome = nome;
        this.idade = idade;
    }

    public void exibeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
