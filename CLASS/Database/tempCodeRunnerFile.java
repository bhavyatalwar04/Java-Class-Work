
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
        String sql = "SELECT * FROM emp1";
        Result rs=st.executeQuery(sql);
        while(rs.next()){
            System.out.println("name: "+rs.getString("name"));
        }

        st.close();
        con.close();
        System.out.println("---SQL executed successfully---");
    }

}
