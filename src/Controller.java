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
				
				v.setobjet1dim(m.ob1);
				v.setobjet2dim(m.ob);
					
				
			}
			if(arg0.getSource()==v.getbtnAnnuler()){
				
				v.dispose();
					
			}
			else{
				//JOptionPane.showMessageDialog(null, "Cliquer un boutton  ");
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
					if (v1.getIDtext().isEmpty() || m.isInteger(v1.getIDtext())== false ) {
						
						JOptionPane.showMessageDialog(null, "Entrer un id numeric");
					}
					else{
					v2.setVisible(true);
					v2.getIDtext().setText(v1.getIDtext());;
					v2.getIDtext().setEditable(false);
					}
					
					
				} catch (Exception e) {
					
					System.out.println("Erreur :"+e);
				}
				
			}
			
			if(arg0.getSource()== v1.getNombtn()){
				try {
					
					//la requete pour recherche pour nom 
					
					
					
					
					//si le nom aparteint au base 
                    if (v1.getNomtext().isEmpty()  ) {
						
						JOptionPane.showMessageDialog(null, "Entrer un nom");
					}
					else{
					v2.setVisible(true);
					v2.getNomtext().setText(v1.getNomtext());
					v2.getNomtext().setEditable(false);
					
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erreur : "+e);
				}
				
			}
			if(arg0.getSource()==v1.getPrenombtn()){
				try {
					//reuete de recherche par prenom 
					
					
					//si le prenom aparteint au base 
					if (v1.getPrenomtext().isEmpty()) {
						JOptionPane.showMessageDialog(null, "entrer un prenom ");
						
					} else {
						
						v2.setVisible(true);
						v2.getPrenomText().setText(v1.getPrenomtext());
						v2.getPrenomText().setEditable(false);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Erreur "+ e);
				}
				
				
			}
			
			if(arg0.getSource()== v1.getAnnulerbtn()){
					
				v1.dispose();
				
			}
			
		}
		
	}
	class lisnterForView2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			
			
		}
		
		
	}

}

