package main;
import java.util.Date;
public class aluno extends pessoa {
    public aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public String matricula;
    public double tirarCopias(int qtd) { //Preço para tirar copias para alunos
        return 0.07 * (double) qtd;
    }
}
