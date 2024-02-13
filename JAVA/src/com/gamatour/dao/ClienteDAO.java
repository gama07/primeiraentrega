package com.gamatour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.gamatour.model.Cliente;

    public class ClienteDAO {
	private static String sql;
    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void criarCliente(Cliente cliente) {
        sql = "INSERT INTO cliente (nomeCliente, telefoneCliente, CpfCliente, EmailCliente) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getTelefoneCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setString(4, cliente.getEmailCliente());

            stmt.executeUpdate();
            System.out.println("\u001B[32mCliente criado com sucesso!\u001B[0m" +
                    "\u001B[32mNome: \u001B[0m" + cliente.getNomeCliente() +
                    "\u001B[32mEmail:\u001B[0m" + cliente.getEmailCliente());
        } catch (SQLException e) {
            System.out.println("\u001B[31mCliente não foi criado, tente novamente!\u001B[0m" + " Mensagem: " + e.getMessage());
        }
    }

    // READ
    @SuppressWarnings("null")
	public void readAllClientes() {
        sql = "SELECT * FROM cliente";
      
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNomeCliente(resultSet.getString("nomeCliente"));
                cliente.setTelefoneCliente(resultSet.getString("telefoneCliente"));
                cliente.setCpfCliente(resultSet.getString("CpfCliente"));
                cliente.setEmailCliente(resultSet.getString("EmailCliente"));
           
            }

        	ResultSet r = null;
			if (!r.next()) {
                System.out.println("\u001B[31mNenhum cliente encontrado!\u001B[0m");
            }

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados!\u001B[0m" +
                    "Mensagem: " + e.getMessage());
        }
        }

    public Cliente consultarCliente(int idCliente) {
        sql = "SELECT * FROM cliente WHERE idCliente = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);
            ResultSet resultSet = stmt.executeQuery();
            Cliente cliente = null;
            while (resultSet.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNomeCliente(resultSet.getString("nomeCliente"));
                cliente.setTelefoneCliente(resultSet.getString("telefoneCliente"));
                cliente.setCpfCliente(resultSet.getString("CpfCliente"));
                cliente.setEmailCliente(resultSet.getString("EmailCliente"));
            }

            if (cliente == null) {
                System.out.println("\u001B[31mNenhum cliente encontrado!\u001B[0m");
            }

            return cliente;

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados!\u001B[0m" +
                    "Mensagem: " + e.getMessage());
        }

        return null;
    }

    // UPDATE
    public void atualizarCliente(Cliente cliente) {
        sql = "UPDATE cliente SET nomeCliente=?, telefoneCliente=?, CpfCliente=?, EmailCliente=? WHERE idCliente=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getTelefoneCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setString(4, cliente.getEmailCliente());
            stmt.setInt(5, cliente.getIdCliente());

            stmt.executeUpdate();
            System.out.println("\u001B[32mCliente atualizado com sucesso!\u001B[0m\n" +
                    "\u001B[32mNome: \u001B[0m" + cliente.getNomeCliente() +
                    "\u001B[32mEmail:\u001B[0m" + cliente.getEmailCliente());

        } catch (SQLException e) {
            System.out.println("\u001B[31mCliente não foi atualizado, tente novamente!\u001B[0m" +
                    "Mensagem: " + e.getMessage());
        }
    }

    // DELETE
    public void deletarCliente(int idCliente) {
        sql = "DELETE FROM cliente WHERE idCliente=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCliente);

            stmt.executeUpdate();

            System.out.println("\u001B[32mCliente excluído com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mCliente não foi excluído, tente novamente!\u001B[0m" +
                    "Mensagem: " + e.getMessage());
        }
    }

	public void consultarClientes() {
		// TODO Auto-generated method stub
		
	}
}
