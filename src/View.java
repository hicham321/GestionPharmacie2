
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

// cette class est l'interface de demarage 
public class View extends JFrame{
	
	private JLabel label = new JLabel("Pharmacie Chemamie");
	
	private JButton btnAnnuler = new JButton("Annuler");
	
	private JButton btnRecherche = new JButton("Recherche");
	
	private JButton VoirBase = new JButton("VoirBase");
	
	private Object [][] objet2dim ;
	
	private Object [] objet1dim ;
	
	private JTable tabvoir ;
	
	

	public View(){
		
		JPanel panel = new JPanel();
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setSize(600, 300);
		
		//pour le moment on va utilié sa 
		

		this.objet1dim= new Object[0];
		this.objet2dim=new Object[0][0];
		this.tabvoir=new JTable(this.objet2dim,this.objet1dim);

		
		panel.add(label);
		panel.add(btnAnnuler);
		panel.add(btnRecherche);
		panel.add(VoirBase);
		panel.add(tabvoir);

		this.add(panel);
		this.setTitle("Pricipale");
		
		
		
		
		
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
	
	public JTable gettable(){
		
		return this.tabvoir;
	}
	
	public void setobjet1dim( Object [] ob){
		
		this.objet1dim= ob ;
	}
	
	public void setobjet2dim(Object [][] ob){
		
		this.objet2dim= ob ;
	}
	
	public void setObjectpourTable(Object[][] ob2, Object [] ob1){
		
		//         hthis.tabvoir
	}
	
	
}