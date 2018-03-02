-- MySQL Workbench Synchronization
-- Generated: 2018-02-14 20:25
-- Model: Desafio-DB
-- Version: 1.0
-- Project: Desafio
-- Author: Diego Dalto
-- Carga de Instituições de Ensino de Coxim-MS.

USE `desafio-db`;

ALTER TABLE tb_usuario AUTO_INCREMENT = 1;
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Universidade Federal de Mato Grosso Do Sul - Câmpus de Coxim', 'cpcx@ufms.com.br', 'user', '123', STR_TO_DATE( "31/05/2014", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Silvio Feirreira', 'ufms1@com.br', 'user1', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Unopar', 'ufms2@com.br', 'user2', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('CESQP - Centro de Ensino Superior e Qualificação Profissional', 'ufms3@com.br', 'user3', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('UEMS - Campus Coxim', 'ufms4@com.br', 'user4', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Padre Nunes', 'ufms5@com.br', 'user5', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Novo Mundo', 'ufms6@com.br', 'user6', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('IFMS - Instituto Federal de Mato Grosso do Sul', 'ufms7@com.br', 'user7', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Municipal Marechal Rondon', 'ufms8@com.br', 'user8', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Faculdades Integradas de Coxim - Fico', 'ufms9@com.br', 'user9', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual DE 1º E 2º GRAUS Sílvio Ferreira', 'ufms10@com.br', 'user10', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('EM Estudante William Tavares de Oliveira - Pólo', 'ufms11@com.br', 'user11', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Damásio Educacional e Ibmec - Coxim', 'ufms12@com.br', 'user12', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Colégio PROFª. Julieta Mota Dos Santos', 'ufms13@com.br', 'user13', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Professora Clarice Rondon dos Santos', 'ufms14@com.br', 'user14', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Viriato Bandeira', 'ufms15@com.br', 'user15', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Semiramis da Rocha', 'ufms16@com.br', 'user16', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Particular Santa Teresa', 'ufms17@com.br', 'user17', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES ('Escola Estadual Pedro Mendes Fontoura', 'ufms18@com.br', 'user18', '123', STR_TO_DATE( "14/02/2018", "%d/%m/%Y"), 4);

ALTER TABLE tb_usuario AUTO_INCREMENT = 1;
INSERT INTO tb_instituicao(id, tipo) VALUES (1, 3);
INSERT INTO tb_instituicao(id, tipo) VALUES (2, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (3, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (4, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (5, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (6, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (7, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (8, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (9, 1);
INSERT INTO tb_instituicao(id, tipo) VALUES (10, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (11, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (12, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (13, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (14, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (15, 1);
INSERT INTO tb_instituicao(id, tipo) VALUES (16, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (17, 2);
INSERT INTO tb_instituicao(id, tipo) VALUES (18, 4);
INSERT INTO tb_instituicao(id, tipo) VALUES (19, 2);
