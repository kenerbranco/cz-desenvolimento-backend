public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro();

        // Método construtor Carro sem parâmetros Carro()
        carroUm.setNome("Fiesta");
        System.out.println(carroUm.getNome());
        carroUm.setMarca("Ford");
        System.out.println(carroUm.getMarca());

        // Método construtor Pessoa com parâmetros Pessoa(String nome, int idade)
        Pessoa pessoaUm = new Pessoa("Théo", 1);
        pessoaUm.exibeInfo();
    }
}