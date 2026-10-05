package psv;

import java.sql.Connection;

public class Teste {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        Conexao.fecharConexao(con);
    }
}