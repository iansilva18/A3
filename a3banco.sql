-- Cria o esquema (banco de dados)
CREATE DATABASE clinica_medica;

-- Seleciona o esquema para uso
USE clinica_medica;

-- Cria a tabela Paciente
CREATE TABLE Paciente (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    numero_emergencia VARCHAR(20) NOT NULL,
    data_nascimento DATE NOT NULL,
    idade INT NOT NULL,
    altura DOUBLE NOT NULL,
    peso DOUBLE NOT NULL,
    PRIMARY KEY (id)
);

-- Cria a tabela Medico
CREATE TABLE Medico (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100) NOT NULL,
    crm VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

-- Cria a tabela Glicemia
CREATE TABLE Glicemia (
    id INT NOT NULL AUTO_INCREMENT,
    paciente_id INT NOT NULL,
    valor INT NOT NULL,
    data_medicao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (paciente_id) REFERENCES Paciente(id)
);
