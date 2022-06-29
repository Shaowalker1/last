
package javaapplication4;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UserAccount extends JFrame {
    
    public UserAccount() {
//        JFrame jframe= new JFrame();
//        setTitle("sample profile ");
//        setSize(500,300);
//        setLayout(new FlowLayout());
//        JTextField jTextField = new JTextField(12);
//        add(jTextField);
//        JButton jButton = new JButton("creat ");
//        add(jButton);
//        setVisible(true);


    }

    public static void main ( String [] a) throws ClassNotFoundException, SQLException
    {
//         UserAccount useraccount = new UserAccount();
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentprofile","root","");
         Statement statement = connection.createStatement();
        statement.executeUpdate("insert into useraccount(id,ful_name,department)"+"values(2,'ab','cs')");
//        ResultSet rs = statement.executeQuery("select * from user_account");
//        while(rs.next()){
//          System.out.println("id :"+ " " + rs.getInt("id"));
//        }
        
    }
}
    
 
    



