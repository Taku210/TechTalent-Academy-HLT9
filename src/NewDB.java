        import java.sql.DriverManager;
        import java.sql.Connection;
        import java.sql.Statement;
        import java.sql.ResultSet;
        import java.sql.SQLException;


public class NewDB {
    public static void main(String[] args) {
        String driveName = "com.mysql.cj.jdbc.Driver";//mysql database
        String url = "jdbc:mysql:localhost:3306/graduation";//database location
        String user = "root";//database user name
        String password = "Crickets123";//database password
        //exception handling -> try-catch
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306/graduation", "root", "Crickets123");//return Connection
            Statement stmt = con.createStatement();//return Statement
            ResultSet rs = stmt.executeQuery("select * from graduation");//return all records
            while (rs.next()) {
                System.out.println("studentID:" + rs.getInt(1));
                System.out.println("student name:" + rs.getString(2));
                System.out.println("studentemail:" + rs.getString(3));
                System.out.println("destination:" + rs.getString(4));
                System.out.println("speciality:" + rs.getInt(5));

            }
            int row_count = stmt.executeUpdate("insert into graduation (studentID, studentname, studentemail, destination, speciality");
        }

        catch(Exception ex)
        {
            //handling exceptions and error
            System.out.println("DB error :"+ex);
        }//catch ends
    }//main ends
}//class ends
