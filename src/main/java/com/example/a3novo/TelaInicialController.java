package com.example.a3novo;

import javafx.fxml.FXML;

import java.io.IOException;

public class TelaInicialController {

    @FXML
    private void irParaCadastroPaciente() throws IOException {
        HelloApplication.changeScene("Cadastro.fxml");
    }

    @FXML
    private void irParaCadastroMedico() throws IOException {
        // Adicione aqui a lógica para ir para a tela de cadastro de médico
    }
}

