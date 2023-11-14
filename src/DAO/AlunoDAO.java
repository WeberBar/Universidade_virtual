package DAO;

import Classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AlunoDAO {
    
    public void inserir(Aluno aluno) {
        String sql = "call universidade_app.AdicionarAluno(?, ?, ?, ?, ?);";

        try (Connection conn = ConnectionFactory.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, aluno.getRa());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getCpf());
            stmt.setString(4, aluno.getTelefone());
            stmt.setString(5, aluno.getSenha());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao inserir produto: " + ex.getMessage());
        }
    }
}
