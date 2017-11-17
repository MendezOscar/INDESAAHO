package indesaaho.logica;

import indesaaho.modelos.Retiro;
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
public class transaccionRetiro {

    ServiciosDB service = new ServiciosDB();

    public void createRetiro(Retiro ret) {
        String query = "INSERT INTO RETIRO "
                + "(IDRETIRO, FECHA, MONTO, CONTADOR, IDCUENTA, IDCLIENTE) "
                + "VALUES (? , ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, ret.getIdRetiro());
            stmt.setString(2, ret.getFecha());
            stmt.setFloat(3, ret.getMonto());
            stmt.setInt(4, ret.getContador());
            stmt.setString(5, ret.getIdCuenta());
            stmt.setString(6, ret.getIdCliente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El retiro: " + ret.getIdRetiro() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El retiro: " + ret.getIdRetiro() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateRetiro(String id, Retiro ret) throws SQLException {
        String query = "UPDATE RETIRO "
                + "SET FECHA=?, SALDO= ?, IDCUENTA=?, IDCLIENTE=?"
                + "WHERE IDRETIRO=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(2, ret.getFecha());
            stmt.setFloat(3, ret.getMonto());
            stmt.setInt(4, ret.getContador());
            stmt.setString(5, ret.getIdCuenta());
            stmt.setString(6, ret.getIdCliente());
            stmt.setString(1, ret.getIdRetiro());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El retiro: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El retiro: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteRetiro(String id) throws SQLException {
        Retiro ret = findByIdRetiro(id);
        if (ret == null) {
            JOptionPane.showMessageDialog(null, "Codigo de retiro: " + id + " no existe.");
        }
        String query = "DELETE FROM RETIRO WHERE IDRETIRO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de retiro: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de retiro: " + id + "no se ha borrado.");
        }
    }

    private Retiro findByIdRetiro(String id) {
        String query = "SELECT * FROM RETIRO WHERE IDRETIRO = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Retiro(rs.getString("IDRETIRO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                    rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Retiro> findAllRetiros() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM RETIRO";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Retiro> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Retiro(rs.getString("IDRETIRO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public List<Retiro> obtenerRetiroByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM RETIRO WHERE IDCLIENTE = " + "'" + idCliente + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Retiro> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Retiro(rs.getString("IDRETIRO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Retiro> obtenerUltimoRetiroByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM RETIRO WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Retiro> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Retiro(rs.getString("IDRETIRO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Retiro> obtenerUltimaRetiroByIdCliente(String idCliente) {
        try {
            String query = "SELECT * FROM RETIRO WHERE IDCLIENTE = " + "'" + idCliente + "'" + " ORDER BY CONTADOR ASC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Retiro> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Retiro(rs.getString("IDRETIRO"), rs.getString("FECHA"), rs.getFloat("MONTO"),
                        rs.getInt("CONTADOR"), rs.getString("IDCUENTA"), rs.getString("IDCLIENTE")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
