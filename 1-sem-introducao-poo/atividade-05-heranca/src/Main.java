public class Main {
    public static void main(String[] args) {

        // Construção objeto da classe Veiculo
        Veiculo veiculoUm = new Veiculo();
        veiculoUm.setNome("Fusion");
        veiculoUm.setVelocidade(8.0f);
        System.out.println("Nome carro: " + veiculoUm.getNome());
        System.out.println("Velocidade atual: " + veiculoUm.getVelocidade());

        // Método acelerar veiculo
        veiculoUm.acelera();
        System.out.println("Velocidade após acelerar: " + veiculoUm.getVelocidade());

        // Método frear veiculo
        veiculoUm.frea();
        System.out.println("Velocidade após frear: " + veiculoUm.getVelocidade());

        // Contrução objeto Carro com herança da classe Veiculo
        Carro carroUm = new Carro();
        carroUm.exibeFuncionamento();
        carroUm.setNome("Golf");
        carroUm.liga();
        carroUm.exibeFuncionamento();
    }
}