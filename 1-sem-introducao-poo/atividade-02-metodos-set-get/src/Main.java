public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setMotor("2.0");
        c1.setCor("Prata");
        c1.setMarca("Citroen");

        c2.setMotor("1.6");
        c2.setCor("Vermelho");
        c2.setMarca("Ford");

        System.out.println("Motor: " + c1.getMotor());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Marca: " + c1.getMarca());

        System.out.println("Motor: " + c2.getMotor());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Marca: " + c2.getMarca());
    }
}