import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


//cette class est l'interface de resultat
public class View2 extends JFrame {
	// en entré
	
	private JTextField IDtext= new JTextField(10);
	
	
	// en sortie
	
	private JTextField NomText = new JTextField(10);
	
	private JTextField Prenomtext = new JTextField(10);
	
	private JTextField Credittext= new JTextField(10);
	
	private JButton Okbtn= new JButton("Ok");
	
	public View2 (){
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(600, 300);
		
		JPanel panel = new JPanel();
		
		panel.add(IDtext);
		panel.add(NomText);
		panel.add(Prenomtext);
		
		panel.add(Credittext);
		panel.add(Okbtn);
		
		this.add(panel);
		
		
		
	
	}
	
	public void addlistnerview2 (ActionListener listner){
		
		this.Okbtn.addActionListener(listner);
		
	}
	
   public JTextField getIDtext (){
	   
	   return this.IDtext ;
   }
   
   public void setIDtext( JTextField text){
	   
	   this.IDtext= text;
   }
	
	
	
	
}

