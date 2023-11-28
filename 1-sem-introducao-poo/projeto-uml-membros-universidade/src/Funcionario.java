public class Funcionario extends MembroUniversidade{
    private float salario;
    private String admissao;

    public void setSalario(float sal){
        salario = sal;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setAdmissao(String adm){
        admissao = adm;
    }

    public String getAdmissao(){
        return this.admissao;
    }
}
