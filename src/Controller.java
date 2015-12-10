import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter;
import com.sun.webkit.ContextMenu.ShowContext;


public class Controller {
	
	private View v= new View();
	
	private View1 v1= new View1();
	
	private View2 v2 = new View2 ();
	
	private Model m = new Model();
	
	
	public Controller ( Model model , View view , View1 view1 ,View2 view2){
		this.m= model ;
		
		this.v = view;
		this.v1 = view1;
		this.v2 = view2;
		
		//avant tous il faut connecté avec la base 
		

		// ajouté des actionListner pour les actions sur l'interface 
		
		v.addlistnermainView(new listnerforMainView());
		v1.addlistnerView1(new listnerForView1());
		v2.addlistnerview2(new lisnterForView2());
		
		
	}
	
	class listnerforMainView implements ActionListener{
		
		
		
         
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			// TODO Auto-generated method stub
			
			if(arg0.getSource()==v.getRechercheBtn()){
				
				//voir la form 1 pour la recherche des elements 
				try{
					
				v1.setVisible(true);
				
				}catch(Exception e){
					
					System.out.println("error :" + e);
				}
				
				
			}
			if(arg0.getSource()==v.getVoirBase()){
				// ultilise la requete pour voir la base du donnée dans le model 
				
				
			}
			if(arg0.getSource()==v.getbtnAnnuler()){
				
				v.dispose();
					
			}
			else{
				JOptionPane.showMessageDialog(null, "Cliquer un boutton  ");
			}
			
		}
		
		
	}
	class listnerForView1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if(arg0.getSource()==v1.getrecherchebtnid()){
				
				try {
					
					//manipul� la requete pour obtenir les info
					
					
					
					
					// affiché l'interface de resultat
					
					v2.setVisible(true);
					v2.getIDtext().setText(v1.getIDtext());;
					v2.getIDtext().setEditable(false);
					
					
				} catch (Exception e) {
					
					System.out.println("Erreur :"+e);
				}
				
			}
			
			if(arg0.getSource()== v1.getAnnulerbtn()){
				
				try {
					
				v1.dispose();
				
				} catch (Exception e) {
					System.out.println("Erreur :"+e);
				}
				
			}
			
		}
		
	}
	class lisnterForView2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			
			
		}
		
		
	}

}

