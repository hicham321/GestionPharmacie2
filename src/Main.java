// la class main 

public class Main {
     // la methode main pour l'execution du programme 
	
	public static void main(String[] args) {
		
		
		Model m = new Model();
		View v = new View();
		View1 v1 = new View1();
		View2 v2 = new View2();
		
		
		Controller c = new Controller (m,v,v1,v2);
		
		v.setVisible(true);

	}
	
	
	
	

}
