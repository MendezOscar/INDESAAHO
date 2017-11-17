package indesaaho.logica;

import indesaaho.modelos.Deposito;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionDeposito {

    ServiciosDB service = new ServiciosDB();

    public void createDeposito(Deposito dep) {
        String query = "INSERT INTO DEPOSITO "
                + "(IDDEPOSITO, FECHA, MONTO, CONTADOR, IDCUENTA, IDCLIENTE) "
                + "VALUES (? , ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, dep.getIdDeposito());
            stmt.setString(2, dep.getFecha());
            stmt.setFloat(3, dep.getMonto());
            stmt.setInt(4, dep.getContador());
            stmt.setString(5, dep.getIdCuenta());
            stmt.setString(6, dep.getIdCliente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El deposito: " + dep.getIdDeposito() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El deposito: " + dep.getIdDeposito() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateDeposito(String id, Deposito dep) throws SQLException {
        String query = "UPDATE DEPOSITO "
                + "SET FECHA=?, SALDO= ?, IDCUENTA=?, IDCLIENTE=?"
                + "WHERE IDDEPOSITO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, dep.getFecha());
            stmt.setFloat(2, dep.getMonto());
            stmt.setInt(3, dep.getContador());
            stmt.setString(4, dep.getIdCuenta());
            stmt.setString(5, dep.getIdCliente());
            stmt.setString(6, dep.getIdDeposito());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El deposito: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El deposito: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteDeposito(String id) throws SQLException {
        Deposito dep = findByIdDeposito(id);
        if (dep == null) {
            JOptionPane.showMessageDialog(null, "Codigo de deposito: " + id + " no existe.");
        }
        String query = "DELETE FROM DEPOSITO WHERE IDDEPOSITO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de deposito: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de deposito: " + id + "no se ha borrado.");
        }
    }

    private Deposito findByIdDeposito(String id) {
        String query = "SELECT * FROM DEPOSITO WHERE IDDEPOSITO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Deposito(rs.getString("IDDEPOSITO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                    rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Deposito> findAllDeposito() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM DEPOSITO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Deposito> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deposito(rs.getString("IDDEPOSITO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public List<Deposito> obtenerDepositoByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM DEPOSITO WHERE IDCLIENTE = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deposito> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deposito(rs.getString("IDDEPOSITO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deposito> obtenerUltimoDepositoByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM DEPOSITO WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deposito> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deposito(rs.getString("IDDEPOSITO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Deposito> obtenerUltimoDepositoByIdClienteAcs(String idCliente) {
        try {
            String query = "SELECT * FROM DEPOSITO WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Deposito> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Deposito(rs.getString("IDDEPOSITO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
