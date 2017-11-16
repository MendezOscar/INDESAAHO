package indesaaho.logica;

import indesaaho.modelos.Clientes;
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
public class transaccionClientes {

    ServiciosDB service = new ServiciosDB();

    public void createCliente(Clientes clie) {
        String query = "INSERT INTO CLIENTES "
                + "(IDCLIENTE, NOMBRE, APELLIDO, IDENTIDAD, DEPARTAMENTO, MUNICIPIO, DIRECCION, ESTADOCIVIL, "
                + "TELEFONO, GENERO, EDAD, PROFESION, TIPO, CONTADOR, AREA, DEPTO, RESPONSABILIDAD) "
                + "VALUES (? , ? , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, clie.getIdCliente());
            stmt.setString(2, clie.getNombre());
            stmt.setString(3, clie.getApellido());
            stmt.setString(4, clie.getIdentidad());
            stmt.setString(5, clie.getDepartamento());
            stmt.setString(6, clie.getMunicipio());
            stmt.setString(7, clie.getDireccion());
            stmt.setString(8, clie.getEstadocivil());
            stmt.setString(9, clie.getTelefono());
            stmt.setString(10, clie.getGenero());
            stmt.setInt(11, clie.getEdad());
            stmt.setString(12, clie.getProfesion());
            stmt.setString(13, clie.getTipo());
            stmt.setInt(14, clie.getNumero());
            stmt.setString(15, clie.getArea());
            stmt.setString(16, clie.getDepto());
            stmt.setString(17, clie.getResponsabilidad());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " El Cliente: " + clie.getIdCliente() + " se ha guardado Exitosamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "Error El Cliente: " + clie.getIdCliente() + " no se ha guardado Exitosamente.");
        }
    }

    public void updateCliente(String id, Clientes clie) throws SQLException {
        String query = "UPDATE CLIENTES "
                + "SET NOMBRE= ?, APELLIDO= ?, IDENTIDAD= ?, DEPARTAMENTO= ?, MUNICIPIO= ?, DIRECCION= ?, ESTADOCIVIL= ?, "
                + "TELEFONO= ?, GENERO= ?, EDAD= ?, PROFESION= ?, TIPO=?, CONTADOR=?, AREA=?, DEPTO=?, RESPONSABILIDAD=?"
                + "WHERE IDCLIENTE=?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, clie.getNombre());
            stmt.setString(2, clie.getApellido());
            stmt.setString(3, clie.getIdentidad());
            stmt.setString(4, clie.getDepartamento());
            stmt.setString(5, clie.getMunicipio());
            stmt.setString(6, clie.getDireccion());
            stmt.setString(7, clie.getEstadocivil());
            stmt.setString(8, clie.getTelefono());
            stmt.setString(9, clie.getGenero());
            stmt.setInt(10, clie.getEdad());
            stmt.setString(11, clie.getProfesion());
            stmt.setString(12, clie.getTipo());
            stmt.setInt(13, clie.getNumero());
            stmt.setString(14, clie.getArea());
            stmt.setString(15, clie.getDepto());
            stmt.setString(16, clie.getResponsabilidad());
            stmt.setString(17, clie.getIdCliente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Ciente: " + id + " se ha actualizado correctamente.");
        } catch (SQLException se) {
            System.out.println(se.toString());
            JOptionPane.showMessageDialog(null, "ERROR El Ciente: " + id + " no ha actualizado correctamente.");
        }
    }

    public void deleteCliente(String id) throws SQLException {
        Clientes clie = findByIdClientes(id);
        if (clie == null) {
            JOptionPane.showMessageDialog(null, "Codigo de cliente: " + id + " no existe.");
        }
        String query = "DELETE FROM CLIENTES WHERE IDCLIENTE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Codigo de cliente: " + id + "se ha borrado.");
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha borrado.");
        }
    }

    public Clientes findByIdClientes(String id) throws SQLException {
        String query = "SELECT * FROM CLIENTES WHERE IDCLIENTE = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                    rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                    rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                    rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                    rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + id + "no se ha encontrado.");
        }
        return null;
    }

    public Clientes findByIdentidadCliente(String identidad) throws SQLException {
        String query = "SELECT * FROM CLIENTES WHERE IDENTIDAD = ?";
        try (PreparedStatement stmt = service.con.prepareStatement(query)) {
            stmt.setString(1, identidad);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                return null;
            }
            return (new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                    rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                    rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                    rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                    rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR Codigo de cliente: " + identidad + "no se ha encontrado.");
        }
        return null;
    }

    public List<Clientes> obtenerClientesByTipo(String Tipo) {
        try {
            String query = "SELECT * FROM CLIENTES WHERE TIPO = " + "'" + Tipo + "'";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Clientes> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                        rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                        rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                        rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                        rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Clientes> obtenerUltimoCleinteByTipo(String Tipo) {
        try {
            String query = "SELECT * FROM CLIENTES WHERE TIPO = " + "'" + Tipo + "'" + " ORDER BY CONTADOR DESC";
            PreparedStatement stmt = service.con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ArrayList<Clientes> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                        rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                        rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                        rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                        rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
            }
            return depts;
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Clientes> findAllClientes() throws SQLException {
        try (Statement stmt = service.con.createStatement()) {
            String query = "SELECT * FROM CLIENTES";
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Clientes> depts = new ArrayList<>();
            while (rs.next()) {
                depts.add(new Clientes(rs.getString("IDCLIENTE"), rs.getString("NOMBRE"), rs.getString("APELLIDO"),
                        rs.getString("IDENTIDAD"), rs.getString("DEPARTAMENTO"), rs.getString("MUNICIPIO"),
                        rs.getString("DIRECCION"), rs.getString("ESTADOCIVIL"), rs.getString("TELEFONO"),
                        rs.getString("GENERO"), rs.getInt("EDAD"), rs.getString("PROFESION"), rs.getString("TIPO"),
                        rs.getInt("CONTADOR"), rs.getString("AREA"), rs.getString("DEPTO"), rs.getString("RESPONSABILIDAD")));
            }
            return depts;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "ERROR.");
        }
        return null;
    }
}
