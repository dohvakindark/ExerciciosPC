package main;
import java.util.Date;
public class funcionario extends pessoa {
    public funcionario(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}
