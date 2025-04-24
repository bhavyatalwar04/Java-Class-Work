
import java.sql.*;

class TestJDBC {

    public static void main(String[] args) throws Exception {
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/jdbc";
        String user = "root";
        String pwd = "Kbvnoas@7";
        Class.forName(driverClassName);
        Connection con = DriverManager.getConnection(url, user, pwd);
        System.out.println("con---->" + con);
        Statement st = con.createStatement();
        String sql = "INSERT INTO emp1(name,salary) VALUE('Aman',256856.05)";
        st.executeUpdate(sql);
        st.close();
        con.close();
        System.out.println("---SQL executed successfully---");
    }

}
