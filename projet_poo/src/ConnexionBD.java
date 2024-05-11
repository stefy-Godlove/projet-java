import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

import documents.Document;

public class ConnexionBD {
    public static Connection conn = null;
    public static void connexion(){
        String url = "jdbc:mysql://localhost:3306/smartlibrary";
        String username = "root";
        String password = "";


        // on etabli la connexion avec la bd
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        

    }

    public static Document[] getAllDocuments(){
        Document[] documents = null;

        try {
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT count(code) as nbr FROM document");
            ResultSet rs2;
            int nbr = 0;
            //transformer un string en int
            if (rs.next()) {
                nbr = Integer.parseInt(rs.getString("nbr"));
                documents = new Document[nbr];
            }
            if(documents != null){
                rs2 = stmt2.executeQuery("SELECT * FROM ");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return documents;
    }
}
