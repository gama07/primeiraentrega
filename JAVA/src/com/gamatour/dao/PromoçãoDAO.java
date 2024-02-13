package com.gamatour.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.gamatour.dao.PromoçãoDAO;
import com.gamatour.model.Promoção;


public class PromoçãoDAO {
    private static String sql;
    private final Connection connection;

    public PromoçãoDAO(Connection connection) {
        this.connection = connection;
    }

    // CREATE
    public void criarPromoção(Promoção promoção) {
        sql = "INSERT INTO Promoção (desconto) VALUES (?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, promoção.getDesconto());

            stmt.executeUpdate();
            System.out.println("\u001B[32mPromoção criada com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mPromoção não foi criada, tente novamente!\u001B[0m" + " Mensagem: " + e.getMessage());
        }
    }

    // READ
    @SuppressWarnings("null")
	public void readAllPromocoes() {
        sql = "SELECT * FROM Promoção";
        Promoção promoção= new Promoção();

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
             
                promoção.setIdPromocao(resultSet.getInt("id_Promoção"));
                promoção.setDesconto(resultSet.getInt("desconto"));
            
            }

            ResultSet r=null;
			if (!r.next()) {
                System.out.println("\u001B[31mNenhuma promoção encontrada!\u001B[0m");
            }

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados requeridos!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }

    }

    public Promoção consultarPromocao(int idPromoção) {
        sql = "SELECT * FROM Promoção WHERE id_Promoção = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idPromoção);
            ResultSet resultSet = stmt.executeQuery();
            Promoção promoção = null;
            while (resultSet.next()) {
                promoção = new Promoção();
                promoção.setIdPromocao(resultSet.getInt("id_Promoção"));
                promoção.setDesconto(resultSet.getInt("desconto"));
            }

            if (promoção == null) {
                System.out.println("\u001B[31mNenhuma promoção encontrada!\u001B[0m");
            }

            return promoção;

        } catch (SQLException e) {
            System.out.println("\u001B[31mNão foi possível acessar os dados requeridos!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }

        return null;
    }

    // UPDATE
    public void atualizarPromocao(Promoção promoção) {
        sql = "UPDATE Promoção SET desconto=? WHERE id_Promoção=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, promoção.getDesconto());
            stmt.setInt(2, promoção.getIdPromoção());

            stmt.executeUpdate();
            System.out.println("\u001B[32mPromoção atualizada com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mPromoção não foi atualizada, tente novamente!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }
    }

    // DELETE
    public void deletarPromoção(int idPromoção) {
        sql = "DELETE FROM Promoção WHERE id_Promoção=?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idPromoção);

            stmt.executeUpdate();

            System.out.println("\u001B[32mPromoção excluída com sucesso!\u001B[0m");

        } catch (SQLException e) {
            System.out.println("\u001B[31mPromoção não foi excluída, tente novamente!\u001B[0m" +
                    " Mensagem: " + e.getMessage());
        }
    }

	public void verPromoção() {
		// TODO Auto-generated method stub
		
	}

	
}