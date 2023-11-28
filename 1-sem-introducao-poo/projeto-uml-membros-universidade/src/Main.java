public class Main {
    public static void main(String[] args) {

        // Teste classe MembroUniversidade (Superclass) ---------------------
        MembroUniversidade usuarioUm = new MembroUniversidade();

        // Teste atributo nome + métodos (set/get)
        usuarioUm.setNome("João");
        System.out.println(usuarioUm.getNome());

        // Teste atributo nascimento + métodos (set/get)
        usuarioUm.setNascimento("01/01/2023");
        System.out.println(usuarioUm.getNascimento());


        // Teste classe Aluno (Subclass) ---------------------
        Aluno usuarioDois = new Aluno();

        // Teste atributo RGM + métodos (set/get)
        usuarioDois.setRGM(122333);
        System.out.println(usuarioDois.getRGM());

        // Teste atributo curso + métodos (set/get)
        usuarioDois.setCurso("Desenvolvimento Back-end");
        System.out.println(usuarioDois.getCurso());


        // Teste classe Bolsista (Subclass) ---------------------
        Bolsista usuarioTres = new Bolsista();

        // Teste atributo valorBolsa + métodos (set/get)
        usuarioTres.setValorBolsa(250.5f);
        System.out.println(usuarioTres.getValorBolsa());


        // Teste classe Funcionario (Subclass) ---------------------
        Funcionario usuarioQuatro = new Funcionario();

        // Teste atributo salario + métodos (set/get)
        usuarioQuatro.setSalario(4500f);
        System.out.println(usuarioQuatro.getSalario());

        // Teste atributo admissao + métodos (set/get)
        usuarioQuatro.setAdmissao("03/04/2023");
        System.out.println(usuarioQuatro.getAdmissao());


        // Teste classe Professor (Subclass) ---------------------
        Professor usuarioCinco = new Professor();

        // Teste atributo regime + métodos (set/get)
        usuarioCinco.setRegime(40);
        System.out.println(usuarioCinco.getRegime());

        // Teste atributo titulacao + métodos (set/get)
        usuarioCinco.setTitulacao("Instrutor de Formação II");
        System.out.println(usuarioCinco.getTitulacao());
    }
}