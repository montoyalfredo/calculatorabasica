/*package io.quind.calculatorbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ConexionMysql {
    private static Connection conexion;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "A1fred8OQu1nd";
    private static final String url ="jdbc:mysql://localhost:3306/calculator";

    public ConexionMysql() {
        conexion = null;
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            if (conexion != null) {
                System.out.println("Conexión establecida");
            }
        } catch (Exception e){
            System.out.println("Error al conectar" + e);
                    };
    }
        public Connection getConnection() {
        return conexion;

        public void Desconectar () {
            conexion = null;
            if (conexion == null) {
                System.out.println("Conexión terminada");
            }
            }
    }

    PreparedStatement stmt = null;

    stmt = Connection.prepareStatement("INSERT INTO libros VALUES (?,?,?,?,?)");
    stmt.setString(1, String num1);

    private final string sqlInsert = "INSERT INTO calculator (num1, num2) VALUES (?,?)";


    }

};





Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/calculator","root", "A1fred8OQu1nd");

    Statement s = conexion.createStatement();
    ResultSet rs = s.executeQuery ("select * from calculator");

    string query ";
        st.executeUpdate (query);
        System.out.printIn("Un nuevo usuario fue ingresado");
*/
