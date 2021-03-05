try
{
   Class.forName("com.mysql.jdbc.Driver");
} catch (Exception e)
{
   e.printStackTrace();
}


Connection conexion = DriverManager.getConnection ("jdbc:mysql://localhost/calculator","root", "A1fred8OQu1nd");

Statement s = conexion.createStatement();
ResultSet rs = s.executeQuery ("select * from calculator");

st.executeUpdate("CREATE TABLE calculator (id INT AUTO_INCREMENT, PRIMARY KEY(id), num1 VARCHAR(20), num2 VARCHAR(20), operación VARCHAR(20))");



String num1[] = "number1";
String apellidos[]={"Gomez","Lopez","Alvarez"};
String telefonos[]={"123","456","789"};
...
for (int i=0;i<nombres.length;i++)
   st.executeUpdate("INSERT INTO contacto (nombre, apellidos, telefono) VALUES ('"+nombres[i]+"','"+apellidos[i]+"','"+telefonos[i]+"' )");

while (rs.next())
{
    System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getDate(3));
}

conexion.close();