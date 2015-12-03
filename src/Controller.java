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
		
		v.addlistnermainView(new listnerforMainView());
		v1.addlistnerView1(new listnerForView1());
		v2.addlistnerview2(new lisnterForView2());

		
		
	}
	
	class listnerforMainView implements ActionListener{
		
         
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			if(arg0.getSource()==v.getRechercheBtn()){
				
			}
			if(arg0.getSource()==v.getVoirBase()){
				
			}
			if(arg0.getSource()==v.getbtnAnnuler()){
					
			}
			else{
				JOptionPane.showMessageDialog(null, "Cliquer un boutton  ");
			}
			
		}
		
		
	}
	class listnerForView1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class lisnterForView2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}

}

