public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro(10f, 4, 50);
        System.out.println("Velocidade atual: " + carroUm.getVelocidade());
        carroUm.acelera();
        System.out.println("Velocidade após acelerar: " + carroUm.getVelocidade());
        carroUm.acelera();
        System.out.println("Velocidade após acelerar de novo: " + carroUm.getVelocidade());
        carroUm.freia();
        System.out.println("Velocidade após freiar: " + carroUm.getVelocidade());
    }
}