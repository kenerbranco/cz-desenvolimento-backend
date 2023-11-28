public class Carro extends Veiculo{
    private boolean ligado;

    Carro(){
        this.ligado = false; // Na construção do objeto, o mesmo tem funcionamento desligado
    }

    public void liga(){
        ligado = true;
    }

    public void desliga(){
        ligado = false;
    }

    public void exibeFuncionamento(){
        if(this.ligado){ // Simplificação (this.ligado == true)
            System.out.println("Carro Ligado");
        } else{
            System.out.println("Carro Desligado");
        }
    }
}
