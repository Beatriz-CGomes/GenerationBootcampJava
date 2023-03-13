CREATE DATABASE db_RH;
USE db_RH;

CREATE TABLE tb_funcionarios(
id bigint auto_increment,
nome varchar(50) not null,
matricula int not null,
salario  decimal not null,
cargo varchar(70) not null,
PRIMARY KEY (id)
);

INSERT INTO tb_funcionarios(nome, matricula, salario, cargo)
VALUES ("Alice", 1340, 5500, "Analista Web");

INSERT INTO tb_funcionarios(nome, matricula, salario, cargo)
VALUES ("Matheus", 1345, 2500, "Assistente Administrativo");

INSERT INTO tb_funcionarios(nome, matricula, salario, cargo)
VALUES ("Jorge", 145, 8000, "Gerente de Produtos");

INSERT INTO tb_funcionarios(nome, matricula, salario, cargo)
VALUES ("Katia", 185, 6200, "Analista de Marktplace");

INSERT INTO tb_funcionarios(nome, matricula, salario, cargo)
VALUES ("Douglas", 1645, 1500, "Estagiario de produto");

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

-- Atualização e Deleção --

UPDATE tb_funcionarios SET cargos =" estagiario de produto", salario = 1500 WHERE id = 5;

SELECT * FROM  tb_funcionarios;