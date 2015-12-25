import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



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
	
	// pour jJtable
	
	Object [][] ob ;
	
	Object [] ob1;
	
	
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

 // Methode pour determiner si une chaine de character est un Integer.
 //http://stackoverflow.com/questions/237159/whats-the-best-way-to-check-to-see-if-a-string-represents-an-integer-in-java

public static boolean isInteger(String str) {
    if (str == null) {
        return false;
    }
    int length = str.length();
    if (length == 0) {
        return false;
    }
    int i = 0;
    if (str.charAt(0) == '-') {
        if (length == 1) {
            return false;
        }
        i = 1;
    }
    for (; i < length; i++) {
        char c = str.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}

//recuperer les colon de la table personne 

public Object [] colonbase(){
	
	Object [] obj ={"#"};
	try{
		
		
	    String query = "SELECT * FROM PERSONE  " ;
	    this.resultat = st.executeQuery(query);
	    ResultSetMetaData metadonnee = this.resultat.getMetaData();
	    
	    //recupérer les noms des colones 
	     String colon1 = metadonnee.getColumnName(0);
	     obj[0]= colon1;
	     
	    while (this.resultat.next()) {
	    	// obtenir les chaines de character du base de donnée
	    	
	       
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
	
	
	return obj ;
}

// recuperer les donnée de la table persone 

public Object [][] donneebase(){
	
	Object [][] obj ={};
	try{
		
		
	    String query = "SELECT * FROM PERSONE  " ;
	    this.resultat = st.executeQuery(query);	
	    
	    int compte = 0;
	    while (this.resultat.next()) {
	    	// obtenir les chaines de character du base de donnée
	    	String id = this.resultat.getString(0);
	    	String nom = this.resultat.getString(1);
	    	String prenom = this.resultat.getString(2);
	    	String credit = this.resultat.getString(3);
            
            obj[compte][0]=id;
            obj[compte][1]=nom;
            obj[compte][2]=prenom;
            obj[compte][3]=credit;

           compte++; 
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
	
	
	return obj ;
	
	
}


// ajouter au credit




	
	

}

