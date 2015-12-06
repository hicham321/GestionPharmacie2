import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



// cette  class va contenir  les donnée necessaire pour les class View et Controller 
//Cette class va contenir la connection ver la base de donneé et les requetes SQL necessaire pour manipulé
//les donnée de la base 

public class Model {
	
	
	// crie une connection vers la base 
	
	private Connection con ; 
	
	private Statement st ;
	
	private ResultSet resultat ; 
	
	//Cette methode va crier un connection avec notre base de donnee SQL existent 
	
	public void connection (){
		
		try{
			
			// ici si la connection avec le driver 
			Class.forName("com.mysql.jdbc.Driver");
			
			this.con= DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName", "user", "password");
			
			// ici on crie un Stetement
			this.st= this.con.createStatement();
			
			
		}catch(Exception e){
			System.out.println("Erreur : "+ e);
		}
		
		
	}
	
	//dans cette section on va crier notre method pour manipulé les donnée dans la base 
	
	
	//dummy method
	public void insertdata(String nom , int age, String tableName ){
		try {
			
			
			String query = "INSERT INTO "+tableName+ " VALUES("+ nom +","+ age + ")";
			
		} catch (Exception e) {
			
			System.out.println("Erreur :"+ e);
		}
		
	}
	
	// la requete de recherche 
	
	public boolean rechercheDonnee (int ID){
		
		boolean trouve = false;
		
		try{
			
			
			String query="";
			
		    query = "SELECT ID FROM PERSONE WHERE ID.PERSONE = "+ID ;
		    
		    if(query.length()!= 0){
		    	
			 trouve= true;
		    }
		   
		
		}catch(Exception e ){
			
			System.out.println("Erreur :"+ e);
			
		}
		 return trouve;
		
		
	}
	
	
	

}

