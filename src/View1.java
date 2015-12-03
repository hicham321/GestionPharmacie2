
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// cette class est l'interface de recherche 

public class View1 extends JFrame{
	
	private  JTextField IDtext = new JTextField(10);
	
	private JButton Annulerbtn = new JButton("Annuler");
	
	private JButton recherchebtn = new JButton("Recherche");
	
	public View1 (){
		
		this.setSize(600, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.add(IDtext);
		
		panel.add(Annulerbtn);
		
		panel.add(recherchebtn);
		
		this.add(panel);
		
		
	}
	
	
	public void addlistnerView1(ActionListener listner ){
		
		this.recherchebtn.addActionListener(listner);
		
		
	} 
	
	
	

}
