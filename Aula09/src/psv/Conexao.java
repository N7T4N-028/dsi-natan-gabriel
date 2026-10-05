package psv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection abrirConexao() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/estacionamento";
            String usuario = "root";
            String senha = "";

            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão aberta.");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return con;
    }

    public static void fecharConexao(Connection con) {

        try {

            con.close();

            System.out.println("Conexão fechada.");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}