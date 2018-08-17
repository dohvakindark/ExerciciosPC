package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "human")
public class equipment {
	
	@Id
    private int id;
    @Column
    private String nome;
    @Column
    private String parameters;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getParameters() {
    	return parameters;
    }
    public void setParameters(String parameters) {
    	this.parameters = parameters;
    }

}
