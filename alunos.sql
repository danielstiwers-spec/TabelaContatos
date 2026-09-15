CREATE DATABASE IF NOT EXISTS escola.db;
USE escola.db;

CREATE TABLE IF NOT EXISTS alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    contato TEXT NOT NULL,
);

INSERT INTO alunos (nome, contato) VALUES ('Maria', '[{nome: "Pai", telefone: "123456789"}, {nome: "Mãe", telefone: "987654321"}]');

SELECT * FROM alunos;

SELECT JSON_EXTRACT(contato, '$[0].nome') AS nome_pai FROM alunos;

SELECT nome, json_array_length(contato) AS qtd_contato FROM alunos;