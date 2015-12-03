
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// cette class est l'interface de demarage 
public class View extends JFrame{
	
	private JLabel label = new JLabel("Pharmacie Chemamie");
	
	private JButton btnAnnuler = new JButton("Annuler");
	
	private JButton btnRecherche = new JButton("Recherche");
	
	private JButton VoirBase = new JButton("VoirBase");
	
	

	public View(){
		
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(600, 300);
		
		panel.add(label);
		panel.add(btnAnnuler);
		panel.add(btnRecherche);
		panel.add(VoirBase);
		
		this.add(panel);
		
		
		
		
		
	}
	public void addlistnermainView(ActionListener listner){
		
		btnRecherche.addActionListener(listner);
		VoirBase.addActionListener(listner);
		btnAnnuler.addActionListener(listner);
		
	}
	public JButton getRechercheBtn (){
		return this.btnRecherche;
	}
	public JButton getVoirBase(){
		return this.VoirBase;
	}
	public JButton getbtnAnnuler(){
		return this.btnAnnuler;
	}
	
}