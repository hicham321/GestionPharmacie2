import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



// cette  class va contenir  les donnée necessaire pour les class View et Controller 
//Cette class va contenir la connection ver la base de donneé et les requetes SQL necessaire pour manipulé
//les donnée de la base 

//on va crie multiple pour chaque requete sql par ce que cette methode est plus efficase que crier un seul 
//pour tout le program 

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
			
			System.out.println("le driver at ete charger");
			
			this.con= DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName", "user", "password");
			
			System.out.println("connection ....");
			
			// ici on crie un Statement
			this.st= this.con.createStatement();
					
			
		}catch(Exception e){
			System.out.println("Erreur : "+ e);
		}
		
		
	}
	
	//dans cette section on va crier notre method pour manipulé les donnée dans la base 
	
	
	//dummy method
	public void insertdata(String nom , int age, String tableName ){
		try {
			this.connection();
			
			String query = "INSERT INTO "+tableName+ " VALUES("+ nom +","+ age + ")";
			
		} catch (Exception e) {
			
			System.out.println("Erreur :"+ e);
		}finally {
		    if (this.resultat != null) {
		        try {
		            this.resultat.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (this.st != null) {
		        try {
		            this.st.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (con != null) {
		        try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		
	}
	
	// la requete de recherche 
	
	public boolean recherchecondition (int ID){
		
		this.connection();
		
		boolean trouve = false;
		
		try{
			
			
			String query="";
			
		    query = "SELECT ID FROM PERSONE WHERE ID.PERSONE = "+ID ;
		    
		    ResultSet rs = this.st.executeQuery(query);

		    
		    if(query.length()!= 0){
		    	
			 trouve= true;
		    }
		   
		
		}catch(Exception e ){
			
			System.out.println("Erreur :"+ e);
			
		}finally {
		    if (this.resultat != null) {
		        try {
		            this.resultat.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (this.st != null) {
		        try {
		            this.st.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (con != null) {
		        try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		 return trouve;
		
		
	}
public String recherche (int ID){
		
	    this.connection();
		String data="";
		try{
			
			
		    String query = "SELECT ID FROM PERSONE WHERE ID.PERSONE = "+ID ;
		    this.resultat = st.executeQuery(query);
		    
		    while (this.resultat.next()) {
		    	// obtenir les chaines de character du base de donnée
		    	
		        data = resultat.getString(1);
		    }
		    
	
		    
		   
		
		}catch(Exception e ){
			
			System.out.println("Erreur :"+ e);
			
		}finally {
		    if (this.resultat != null) {
		        try {
		            this.resultat.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (this.st != null) {
		        try {
		            this.st.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		    if (con != null) {
		        try {
		            con.close();
		        } catch (SQLException e) { /* ignored */}
		    }
		}
		 return data ;
		
		
	}
	
	

}

