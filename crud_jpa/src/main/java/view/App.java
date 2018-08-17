package view;

import javax.swing.JFrame;
import model.equipment;
import controller.equipmentJpaDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	equipment Equipment = new equipment();
    	Equipment.setId(1);
    	Equipment.setNome("Espada Flamigera");
    	Equipment.setParameters("STR:8 AGI:8 80dmg");
    	equipmentJpaDAO.getInstance().merge(Equipment);
    	System.out.println("Objetos salvo com sucesso!!!");
    	
    }
}
