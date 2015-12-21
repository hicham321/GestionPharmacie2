
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
				
		panel.add(recherchebtnid);
		
		panel.add(Nomtext);
		
		panel.add(recherchenom);
		
		panel.add(PrenomText);
		
		panel.add(rechercheprenom);
		
		panel.add(Annulerbtn);

		
		this.add(panel);
		
		
	}
	
	
	public void addlistnerView1(ActionListener listner ){
		
		this.recherchebtnid.addActionListener(listner);
		this.Annulerbtn.addActionListener(listner);
		this.Nomtext.addActionListener(listner);
		this.PrenomText.addActionListener(listner);
		
		
		
	} 
	
	public JButton getrecherchebtnid (){
		
		return this.recherchebtnid ;
	}
	
    public JButton getNombtn (){
		
		return this.recherchenom ;
	}
    
    public JButton getPrenombtn   (){
		
		return this.rechercheprenom ;
	}
	
	
	public JButton getAnnulerbtn(){
		
		return this.Annulerbtn;
		
	}
	public String getIDtext(){
		
		return this.IDtext.getText();
	}
	
	
	

}
