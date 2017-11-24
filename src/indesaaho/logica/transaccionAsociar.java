package indesaaho.logica;

import indesaaho.modelos.Asociar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Mendez
 */
public class transaccionAsociar {

    ServiciosDB service = new ServiciosDB();

    public void createAsociar(Asociar aso) {
        String query = "INSERT INTO CUENTASASOCIADAS "
                + "(IDASOCIACION, TIPOCUENTA, IDCLIENTE, NOMBRE, IDCUENTA, CONTADOR, SALDO, FECHA, CUENTA, IDCAJERO) "
                + "VALUES (? , ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, aso.getIdAsociar());
            stmt.setString(2, aso.getTipocuenta());
            stmt.setString(3, aso.getIdCliente());
            stmt.setString(4, aso.getNombre());
            stmt.setString(5, aso.getIdCuenta());
            stmt.setInt(6, aso.getContador());
            stmt.setFloat(7, aso.getSaldo());
            stmt.setString(8, aso.getDate());
            stmt.setInt(9, aso.getCuenta());
            stmt.setString(10, aso.getIdCajero());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " La asociacion: " + aso.getIdAsociar() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error La asociacion: " + aso.getIdAsociar() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateAsociar(String id, Asociar aso) throws SQLException {
        String query = "UPDATE CUENTASASOCIADAS "
                + "SET TIPOCUENTA=?, IDCLIENTE=?, NOMBRE= ?, IDCUENTA=?, SALDO?, FECHA=?, CUENTA=?, IDCAJERO=?"
                + "WHERE IDASOCIACION=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, aso.getTipocuenta());
            stmt.setString(2, aso.getIdCliente());
            stmt.setString(3, aso.getNombre());
            stmt.setString(4, aso.getIdCuenta());
            stmt.setFloat(5, aso.getSaldo());
            stmt.setString(6, aso.getDate());
            stmt.setInt(7, aso.getCuenta());
            stmt.setString(8, aso.getIdCliente());
            stmt.setString(9, aso.getIdAsociar());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "La asociacion: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR La asociacion: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteAsociar(String id) throws SQLException {
        Asociar cue = findByIdAsociar(id);
        if (cue == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + " no existe.");
        }
        String query = "DELETE FROM CUENTASASOCIADAS WHERE IDASOCIACION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de cuenta: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha borrado.");
        }
    }

    public Asociar findByIdAsociar(String id) {
        String query = "SELECT * FROM CUENTASASOCIADAS WHERE IDASOCIACION = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Asociar(rs.getString("IDASOCIACION"), rs.getString("TIPOCUENTA"), rs.getString("IDCLIENTE"),
                    rs.getString("NOMBRE"), rs.getString("IDCUENTA"), rs.getInt("CONTADOR"), rs.getFloat("SALDO"),
                    rs.getString("FECHA"), rs.getInt("CUENTA"),rs.getString("IDCAJERO") ));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cuenta: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public List<Asociar> findAllAsociar() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTASASOCIADAS";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Asociar> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Asociar(rs.getString("IDASOCIACION"), rs.getString("TIPOCUENTA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getString("IDCUENTA"), rs.getInt("CONTADOR"), rs.getFloat("SALDO"),
                        rs.getString("FECHA"), rs.getInt("CUENTA"), rs.getString("IDCAJERO")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }

    public List<Asociar> findAsociarByIdCliente(String idCliente) throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTASASOCIADAS WHERE IDCLIENTE = " + "'" + idCliente + "'";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Asociar> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Asociar(rs.getString("IDASOCIACION"), rs.getString("TIPOCUENTA"), rs.getString("IDCLIENTE"),
                        rs.getString("NOMBRE"), rs.getString("IDCUENTA"), rs.getInt("CONTADOR"), rs.getFloat("SALDO"),
                        rs.getString("FECHA"), rs.getInt("CUENTA"), rs.getString("IDCAJERO")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
    
     public Asociar findAsociarByTipoCuenta(String idCliente, String tipoCuenta) throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CUENTASASOCIADAS WHERE  IDCLIENTE = " + "'" + idCliente + "'" + " AND TIPOCUENTA = " + "'" + tipoCuenta + "'";
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.next()) {
                return null;
            }
            return (new Asociar(rs.getString("IDASOCIACION"), rs.getString("TIPOCUENTA"), rs.getString("IDCLIENTE"),
                    rs.getString("NOMBRE"), rs.getString("IDCUENTA"), rs.getInt("CONTADOR"), rs.getFloat("SALDO"),
                    rs.getString("FECHA"), rs.getInt("CUENTA"),rs.getString("IDCAJERO")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
}
