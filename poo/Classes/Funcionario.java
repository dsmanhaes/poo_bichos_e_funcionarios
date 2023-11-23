package poo.Classes;

// Representa os funcionários que podem utilizar o excel
public interface usaExcel {
    public void criaPlanilhas();
}

// Representa os funcionários da empresa como um todo
public abstract class Funcionario {
    public void cadastro (String nome);
    public void cadastro (String nome, int idade);
    public void cadastro (String nome, int idade, string cpf);
    public void batePonto();
}

// Representa os funcionários da empresa que atuam no RH
public class FuncionarioRH extends Funcionario implements usaExcel {

}

// Representa os funcionários da empresa que atuam como programador
public class FuncionarioProgramador extends Funcionario {

}

// Representa os funcionários da empresa que atuam com logística
public class FuncionarioLogistica extends Funcionario implements usaExcel {

}
