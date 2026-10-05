package psv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {

    private Connection con;

    public CarroDAO(Connection con) {
        setCon(con);
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    // INSERT
    public String inserir(CarroBean carro) {

        String sql = "INSERT INTO carro (placa, cor, descricao) VALUES (?, ?, ?)";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {

                return "Inserido com sucesso.";

            } else {

                return "Erro ao inserir";
            }

        } catch (SQLException e) {

            return e.getMessage();
        }
    }

    // UPDATE
    public String alterar(CarroBean carro) {

        String sql = "UPDATE carro SET cor = ?, descricao = ? WHERE placa = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {

                return "Alterado com sucesso.";

            } else {

                return "Erro ao alterar";
            }

        } catch (SQLException e) {

            return e.getMessage();
        }
    }

    // DELETE
    public String excluir(CarroBean carro) {

        String sql = "DELETE FROM carro WHERE placa = ?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {

                return "Excluído com sucesso.";

            } else {

                return "Erro ao excluir";
            }

        } catch (SQLException e) {

            return e.getMessage();
        }
    }

    // SELECT
    public List<CarroBean> listarTodos() {

        String sql = "SELECT * FROM carro";

        List<CarroBean> listaCarro = new ArrayList<>();

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                CarroBean cb = new CarroBean();

                cb.setPlaca(rs.getString(1));
                cb.setCor(rs.getString(2));
                cb.setDescricao(rs.getString(3));

                listaCarro.add(cb);
            }

            return listaCarro;

        } catch (SQLException e) {

            return null;
        }
    }
}