public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro();

        carroUm.marca = "Ford";
        carroUm.cor = "Vermelho";
        carroUm.motor = "1.6";

        System.out.println("Marca do carro: " + carroUm.marca);
        System.out.println("Cor do carro: " + carroUm.cor);
        System.out.println("Motor do carro: " + carroUm.motor);
    }
}