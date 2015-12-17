
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// cette class est l'interface de recherche 

public class View1 extends JFrame{
	
	
	
	private  JTextField IDtext = new JTextField(10);
	
	private JTextField Nomtext = new JTextField(10);
	
	private JTextField PrenomText = new JTextField(10);
	
	private JButton Annulerbtn = new JButton("Annuler");
	
	private JButton recherchebtnid = new JButton("Recherche par id");
	
	private JButton recherchenom  = new JButton("Recherche par nom");
	
	private JButton rechercheprenom = new JButton("Recherche par prenom ");


	
	
	
	public View1 (){
		
		this.setSize(600, 300);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.add(IDtext);
		
		panel.add(Annulerbtn);
		
		panel.add(recherchebtnid);
		
		panel.add(recherchenom);
		
		panel.add(rechercheprenom);
		
		this.add(panel);
		
		
	}
	
	
	public void addlistnerView1(ActionListener listner ){
		
		this.recherchebtnid.addActionListener(listner);
		this.Annulerbtn.addActionListener(listner);
		
		
		
	} 
	
	public JButton getrecherchebtnid (){
		
		return this.recherchebtnid ;
	}
	
	public JButton getAnnulerbtn(){
		
		return this.Annulerbtn;
		
	}
	public String getIDtext(){
		
		return this.IDtext.getText();
	}
	
	
	

}
