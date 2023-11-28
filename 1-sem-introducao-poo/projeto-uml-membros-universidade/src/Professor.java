public class Professor extends Funcionario{
    private int regime; // Horas semanais de trabalho
    private String titulacao;

    public void setRegime(int reg){
        this.regime = reg;
    }

    public int getRegime(){
        return this.regime;
    }

    public void setTitulacao(String tit){
        this.titulacao = tit;
    }

    public String getTitulacao(){
        return this.titulacao;
    }
}
