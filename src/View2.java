import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//cette class est l'interface de resultat
public class View2 extends JFrame {
	// en entré
	
	private JLabel idlabel= new JLabel("Le ID ");
	
	private JTextField IDtext= new JTextField(10);
	
	
	// en sortie
	
	private JLabel nomlabel = new JLabel("Le Nom");
	
	private JTextField NomText = new JTextField(10);
	
	private JLabel prenomlabel = new JLabel("Le prenom");
	
	private JTextField Prenomtext = new JTextField(10);
	
	private JLabel creditLabel = new JLabel("Le Nom");

	private JTextField Credittext= new JTextField(10);
	
	private JButton Okbtn= new JButton("Ok");
	
	public View2 (){
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setSize(600, 300);
		
		JPanel panel = new JPanel();
		panel.add(idlabel);
		panel.add(IDtext);
		
		panel.add(nomlabel);
		panel.add(NomText);
		
		panel.add(prenomlabel);
		panel.add(Prenomtext);
		
		panel.add(creditLabel);
		panel.add(Credittext);
		
		panel.add(Okbtn);
		
		this.add(panel);
		
		this.setTitle("Resultat");
		
	
	}
	
	public void addlistnerview2 (ActionListener listner){
		
		this.Okbtn.addActionListener(listner);
		
	}
	
   public JTextField getIDtext (){
	   
	   return this.IDtext ;
   }
   public JTextField getNomtext(){
	   
	   return this.NomText;
   }
   
   public JTextField getPrenomText(){
	   
	   return this.Prenomtext;
   }
   
  
	
	
	
	
}

