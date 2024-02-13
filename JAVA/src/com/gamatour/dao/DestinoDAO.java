package com.gamatour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.gamatour.model.Destino;

public class DestinoDAO {
    private static String sql;
    private final Connection connection;

    public DestinoDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void criarDestino(Destino destino) {
        sql = "INSERT INTO Destino (nome_destino) VALUES (?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, destino.getNomeDestino());

            stmt.executeUpdate();
            System.out.println("\u001B[32mDestino criado com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mDestino não foi criado, tente novamente!\u001B[0m" + " Mensagem: " + e.getMessage());
        }
    }

    // READ
    @SuppressWarnings("null")
    public void readAllDestinos() {
        sql = "SELECT * FROM Destino";
      
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        	ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Destino destino = new Destino();
                destino.setIdDestino(resultSet.getInt("id_Destino"));
                destino.setNomeDestino(resultSet.getString("nome_destino"));
              
            }

            ResultSet r =null;
			if (!r.next()) {
                System.out.println("\u001B[31mNenhum destino encontrado!\u001B[0m");
            }

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados requeridos!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }
    }
  
    public Destino consultarDestino(int idDestino) {
        sql = "SELECT * FROM Destino WHERE id_Destino = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idDestino);
            ResultSet resultSet = stmt.executeQuery();
            Destino destino = null;
            while (resultSet.next()) {
                destino = new Destino();
                destino.setIdDestino(resultSet.getInt("id_Destino"));
                destino.setNomeDestino(resultSet.getString("nome_destino"));
            }

            if (destino == null) {
                System.out.println("\u001B[31mNenhum destino encontrado!\u001B[0m");
            }

            return destino;

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados requeridos!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }

        return null;
    }

    // UPDATE
    public void atualizarDestino(Destino destino) {
        sql = "UPDATE Destino SET nome_destino=? WHERE id_Destino=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, destino.getNomeDestino());
            stmt.setInt(2, destino.getIdDestino());

            stmt.executeUpdate();
            System.out.println("\u001B[32mDestino atualizado com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mDestino não foi atualizado, tente novamente!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }
    }

    // DELETE
    public void deletarDestino(int idDestino) {
        sql = "DELETE FROM Destino WHERE id_Destino=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idDestino);

            stmt.executeUpdate();

            System.out.println("\u001B[32mDestino excluído com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mDestino não foi excluído, tente novamente!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }
    }

	public void consultarDestinos() {
		// TODO Auto-generated method stub
		
	}
}