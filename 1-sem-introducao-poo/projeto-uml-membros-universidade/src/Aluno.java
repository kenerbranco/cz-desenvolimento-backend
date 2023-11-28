public class Aluno extends MembroUniversidade{
    private int rgm;
    private String curso;

    public void setRGM(int rgm){
        this.rgm = rgm;
    }

    public int getRGM(){
        return this.rgm;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }
}
