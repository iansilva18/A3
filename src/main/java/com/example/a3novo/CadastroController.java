package com.example.a3novo;


import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class CadastroController {

    @FXML
    private TextField nomeField;

    @FXML
    private TextField numeroEmergenciaField;

    @FXML
    private DatePicker dataNascimentoPicker;

    @FXML
    private TextField idadeField;

    @FXML
    private TextField alturaField;

    @FXML
    private TextField pesoField;

    @FXML
    protected void salvarCadastro() throws IOException {
        String nome = nomeField.getText();
        String numeroEmergencia = numeroEmergenciaField.getText();
        LocalDate dataNascimento = dataNascimentoPicker.getValue();
        int idade = Integer.parseInt(idadeField.getText());
        double altura = Double.parseDouble(alturaField.getText());
        double peso = Double.parseDouble(pesoField.getText());


        Paciente paciente = new Paciente(nome, numeroEmergencia, dataNascimento, idade, altura, peso);

        // Salve o paciente conforme necessário (em um banco de dados, arquivo, etc.)
        // ...

        System.out.println("Nome: " + nome);
        System.out.println("Número de Emergência: " + numeroEmergencia);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);

        // Alterne para a tela de medir glicemia
        HelloApplication.changeScene("Glicemia.fxml");
    }
}
