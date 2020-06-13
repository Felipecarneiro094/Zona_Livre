package conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conectar {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;

    String url = "jdbc:mysql://apitest.seasyc.com.br:3306/u645041787_api";
    String user = "u645041787_root";
    String password = "h/>nv6pX";
    String driver = "com.mysql.jdbc.Driver";

    public void openConnection() {

        try {

            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao conectar com o Banco de Dados!", "ERRO", JOptionPane.ERROR_MESSAGE, null);

        }
    }

}
