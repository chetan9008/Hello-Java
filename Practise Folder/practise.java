/**
 * practise
 */
public class practise {

    public static void main(String[] args) {
        Class.forName("com.mysql.jdbc.driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/3306/project");
        PreparedStatment pstm = con.preareStatement("insert  into empValue(?,?)");
        pstm.setInt(1, 12);
        pstm.setString(2, "chetan");
        int i = pstm.executeUpdate();
        System.out.println(i + " records updated");
        con.close();
    }
}