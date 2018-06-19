package main;
import java.util.Date;
public class professor extends pessoa {
    public professor(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
}
