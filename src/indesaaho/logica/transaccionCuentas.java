package indesaaho.logica;

import indesaaho.modelos.Cuentas;
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
public class transaccionCuentas {

    ServiciosDB service = new ServiciosDB();

    public void createCuenta(Cuentas cue) {
        String query = "INSERT INTO CUENTAS "
                + "(IDCUENTA, NOMBRE, CONTADOR) "
                + "VALUES (? , ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getIdCuenta());
            stmt.setString(2, cue.getNombre());
            stmt.setInt(3, cue.getContador());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " La cuenta: " + cue.getIdCuenta() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La cuenta: " + cue.getIdCuenta() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCuenta(String id, Cuentas cue) throws SQLException {
        String query = "UPDATE CUENTAS "
                + "SET NOMBRE= ?"
                + "WHERE IDCUENTA=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, cue.getNombre());
            stmt.setString(2, cue.getIdCuenta());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La cuenta: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La cuenta: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCuenta(String id) throws SQLException {
        Cuentas cue = findByIdCuentas(id);
        if (cue == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + " no existe.");
        }
        String query = "DELETE FROM CUENTAS WHERE IDCUENTA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha borrado.");
        }
    }

    public Cuentas findByIdCuentas(String id) {
        String query = "SELECT * FROM CUENTAS WHERE IDCUENTA = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cuentas(rs.getString("IDCUENTA"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Cuentas> findAllCuentas() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTAS";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Cuentas> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Cuentas(rs.getString("IDCUENTA"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public Cuentas findByIdNombre(String tipo) {
        String query = "SELECT * FROM CUENTAS WHERE NOMBRE = " + "'" + tipo + "'";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Cuentas(rs.getString("IDCUENTA"), rs.getString("NOMBRE"), rs.getInt("CONTADOR")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + tipo + "no se ha encontrado.");
        }
        return null;
    }
}
