package com.example.a3novo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicoDAO {
    public void inserirMedico(CadastroMedicoController  medico) throws SQLException {
        String sql = "INSERT INTO Medico (nome, especialidade, crm) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getEspecialidade());
            stmt.setString(3, medico.getCrm());

            stmt.executeUpdate();
        }
    }
}
