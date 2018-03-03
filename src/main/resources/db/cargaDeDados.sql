-- MySQL Workbench Synchronization
-- Generated: 2018-02-14 20:25
-- Model: Desafio-DB
-- Version: 1.0
-- Project: Desafio
-- Author: Diego Dalto
-- Carga de Instituições de Ensino de Coxim-MS.

USE `desafio-db`;

/*carga usuario*/
ALTER TABLE tb_usuario
  AUTO_INCREMENT = 1;
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Universidade Federal de Mato Grosso Do Sul - Câmpus de Coxim', 'cpcx@ufms.com.br', 'user', '123',
        STR_TO_DATE("31/05/2014", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Estadual Silvio Feirreira', 'ufms1@com.br', 'user1', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Unopar', 'ufms2@com.br', 'user2', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('CESQP - Centro de Ensino Superior e Qualificação Profissional', 'ufms3@com.br', 'user3', '123',
   STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('UEMS - Campus Coxim', 'ufms4@com.br', 'user4', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Estadual Padre Nunes', 'ufms5@com.br', 'user5', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Novo Mundo', 'ufms6@com.br', 'user6', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('IFMS - Instituto Federal de Mato Grosso do Sul', 'ufms7@com.br', 'user7', '123',
   STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Municipal Marechal Rondon', 'ufms8@com.br', 'user8', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Faculdades Integradas de Coxim - Fico', 'ufms9@com.br', 'user9', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Escola Estadual DE 1º E 2º GRAUS Sílvio Ferreira', 'ufms10@com.br', 'user10', '123',
   STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('EM Estudante William Tavares de Oliveira - Pólo', 'ufms11@com.br', 'user11', '123',
   STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Damásio Educacional e Ibmec - Coxim', 'ufms12@com.br', 'user12', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Colégio PROFª. Julieta Mota Dos Santos', 'ufms13@com.br', 'user13', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"),
   4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Escola Estadual Professora Clarice Rondon dos Santos', 'ufms14@com.br', 'user14', '123',
   STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Estadual Viriato Bandeira', 'ufms15@com.br', 'user15', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Escola Estadual Semiramis da Rocha', 'ufms16@com.br', 'user16', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo)
VALUES ('Escola Particular Santa Teresa', 'ufms17@com.br', 'user17', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_usuario (nome, email, usuario, senha, data_criacao, tipo) VALUES
  ('Escola Estadual Pedro Mendes Fontoura', 'ufms18@com.br', 'user18', '123', STR_TO_DATE("14/02/2018", "%d/%m/%Y"), 4);

/*carga instituição*/
INSERT INTO tb_instituicao (id, tipo) VALUES (1, 3);
INSERT INTO tb_instituicao (id, tipo) VALUES (2, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (3, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (4, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (5, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (6, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (7, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (8, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (9, 1);
INSERT INTO tb_instituicao (id, tipo) VALUES (10, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (11, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (12, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (13, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (14, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (15, 1);
INSERT INTO tb_instituicao (id, tipo) VALUES (16, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (17, 2);
INSERT INTO tb_instituicao (id, tipo) VALUES (18, 4);
INSERT INTO tb_instituicao (id, tipo) VALUES (19, 2);

/*carga de telefone*/
ALTER TABLE tb_telefone
  AUTO_INCREMENT = 1;
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (1, 1, '2065493048', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (2, 1, '1551631233', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (3, 1, '3154441046', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (4, 2, '1245545664', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (5, 1, '6825138860', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (6, 1, '7241776023', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (6, 2, '8387624588', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (8, 1, '2716097609', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (9, 1, '1649415781', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (10, 3, '6105178144', FALSE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (11, 1, '9016432056', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (12, 1, '5864234446', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (13, 3, '3532835165', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (14, 1, '8582069261', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (15, 1, '8866961948', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (16, 3, '2933570150', FALSE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (17, 1, '2684137283', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (18, 1, '8638760448', TRUE);
INSERT INTO tb_telefone (usuario_id, tipo, numero, principal) VALUES (19, 2, '5227242750', TRUE);

/*carga municipio*/
/*MS*/
ALTER TABLE tb_municipio
  AUTO_INCREMENT = 1;
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (1, 'Coxim', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (2, 'Corumbá', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (3, 'Porto Murtinho', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (4, 'Ribas do Rio Pardo', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (5, 'Aquidauana', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (6, 'Água Clara', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (7, 'Três Lagoas', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (8, 'Rio Verde de Mato Grosso', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (9, 'Campo Grande', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (10, 'Camapuã', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (11, 'Santa Rita do Pardo', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (12, 'Brasilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (13, 'Inocência', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (14, 'Costa Rica', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (15, 'Miranda', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (16, 'Paranaíba', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (17, 'Ponta Porã', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (18, 'Maracaju', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (19, 'Sidrolândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (20, 'Bonito', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (21, 'Bela Vista', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (22, 'Figueirão', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (23, 'Nova Andradina', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (24, 'Alcinópolis', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (25, 'Amambai', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (26, 'Dourados', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (27, 'Sonora', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (28, 'Nova Alvorada do Sul', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (29, 'Rio Brilhante', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (30, 'São Gabriel do Oeste', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (31, 'Chapadão do Sul', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (32, 'Pedro Gomes', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (33, 'Cassilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (34, 'Anaurilândia', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (35, 'Selvíria', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (36, 'Naviraí', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (37, 'Bandeirantes', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (38, 'Anastácio', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (39, 'Jardim', 12);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (40, 'Caracol', 12);
/*outros estados*/
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (41, 'Rio Branco', 1);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (42, 'Maceió', 2);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (43, 'Macapá', 3);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (44, 'Manaus', 4);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (45, 'Salvador', 5);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (46, 'Fortaleza', 6);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (47, 'Brasília', 7);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (48, 'Vitória', 8);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (49, 'Goiânia', 9);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (50, 'São Luís', 10);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (51, 'Cuiabá', 11);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (52, 'Belo Horizonte', 18);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (53, 'Belém', 13);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (54, 'João Pessoa', 14);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (55, 'Curitiba', 15);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (56, 'Recife', 16);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (57, 'Teresina', 17);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (58, 'Rio de Janeiro', 19);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (59, 'Natal', 20);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (60, 'Porto Alegre', 21);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (61, 'Porto Velho', 22);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (62, 'Boa Vista', 23);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (63, 'Florianópolis', 24);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (64, 'São Paulo', 25);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (65, 'Aracaju', 26);
INSERT INTO tb_municipio (codigo_ibge, nome, uf) VALUES (66, 'Palmas', 27);

/*carga de endereços*/
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (1, 'Rua 13 de Maio', '231', FALSE, 'casa residencial', 'São Judas Tadeu', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (2, 'Rua Minas Gerais', '162', FALSE, 'casa residencial', 'Santa Maria', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (3, 'Rua Star wars', '231', FALSE, 'casa residencial', 'Vila Bela', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (4, 'Rua Game of Thornes', '231', FALSE, 'casa residencial', 'Vila Da Barra', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (5, 'Rua Pedro Abreu', '231', FALSE, 'casa residencial', 'Jardim Pequi 1', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (6, 'Rua Santo Agostinho', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (7, 'Rua Brother Wincherster', '231', FALSE, 'casa residencial', 'Nova Coxim', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (8, 'Rua Metamorfose Ambulante', '231', FALSE, 'casa residencial', 'Piracema', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (9, 'Rua 6 de Julho', '231', FALSE, 'casa residencial', 'Planalto', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (10, 'Rua Senhor Divino', '231', FALSE, 'casa residencial', 'Zona Rural', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (11, 'Rua Hoje em Dia', '231', FALSE, 'casa residencial', 'Eldorado', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (12, 'Rua Santa Catarina', '231', FALSE, 'casa residencial', 'Mato Grosso', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (13, 'Rua 10 de Dezembro', '231', FALSE, 'casa residencial', 'Santo André', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (14, 'Rua João Pessoa', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (15, 'Rua Governador Pedro', '231', FALSE, 'casa residencial', 'Centro', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (16, 'Av. Viriginia Ferreira', '231', FALSE, 'casa residencial', 'Pontal', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (17, 'Rua Filinto Miller', '231', FALSE, 'casa residencial', 'Vila Bela', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (18, 'Rua Gaspar Rias Coelho', '231', FALSE, 'casa residencial', 'Flávio Garcia', '7940000', 1);
INSERT INTO tb_endereco (id, logradouro, numero, s_n, complemento, bairro, cep, codigo_municipio)
VALUES (19, 'Rua Antônio João', '231', FALSE, 'casa residencial', 'Prevesul', '7940000', 1);

/*carga de jogadores*/
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (1, STR_TO_DATE("31/01/2012", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (2, STR_TO_DATE("02/02/2013", "%d/%m/%Y"), 2);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (3, STR_TO_DATE("21/03/2014", "%d/%m/%Y"), 3);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (4, STR_TO_DATE("03/04/2015", "%d/%m/%Y"), 4);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (5, STR_TO_DATE("05/05/2016", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (6, STR_TO_DATE("23/06/2017", "%d/%m/%Y"), 2);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (7, STR_TO_DATE("25/07/2018", "%d/%m/%Y"), 3);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (8, STR_TO_DATE("31/08/2011", "%d/%m/%Y"), 4);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (9, STR_TO_DATE("30/09/2012", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (10, STR_TO_DATE("12/10/2013", "%d/%m/%Y"), 2);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (11, STR_TO_DATE("16/11/2014", "%d/%m/%Y"), 4);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (12, STR_TO_DATE("21/12/2015", "%d/%m/%Y"), 3);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (13, STR_TO_DATE("13/01/2016", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (14, STR_TO_DATE("07/02/2017", "%d/%m/%Y"), 2);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (15, STR_TO_DATE("05/03/2018", "%d/%m/%Y"), 4);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (16, STR_TO_DATE("07/04/2010", "%d/%m/%Y"), 3);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (17, STR_TO_DATE("03/05/2011", "%d/%m/%Y"), 1);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (18, STR_TO_DATE("13/06/2012", "%d/%m/%Y"), 2);
INSERT INTO tb_jogador(id, data_nascimento, deficiencias) VALUES (19, STR_TO_DATE("15/07/2013", "%d/%m/%Y"), 3);

/*carga de alunos*/
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(1, 1, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(2, 2, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(3, 3, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(4, 4, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(5, 5, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(6, 6, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(7, 7, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(8, 8, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(9, 9, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(10, 10, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(11, 11, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(12, 12, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(13, 13, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(14, 14, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(15, 15, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(16, 16, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(17, 17, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(18, 18, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));
INSERT INTO tb_aluno(id, instituicao_id, data_inicio) VALUES(19, 19, STR_TO_DATE("03/03/2018", "%d/%m/%Y"));

/*carga de professores*/
INSERT INTO tb_professor(id, titulacao) VALUES (1, 1);
INSERT INTO tb_professor(id, titulacao) VALUES (2, 2);
INSERT INTO tb_professor(id, titulacao) VALUES (3, 3);
INSERT INTO tb_professor(id, titulacao) VALUES (4, 4);
INSERT INTO tb_professor(id, titulacao) VALUES (5, 5);
INSERT INTO tb_professor(id, titulacao) VALUES (6, 6);
INSERT INTO tb_professor(id, titulacao) VALUES (7, 1);
INSERT INTO tb_professor(id, titulacao) VALUES (8, 2);
INSERT INTO tb_professor(id, titulacao) VALUES (9, 3);
INSERT INTO tb_professor(id, titulacao) VALUES (10, 4);
INSERT INTO tb_professor(id, titulacao) VALUES (11, 5);
INSERT INTO tb_professor(id, titulacao) VALUES (12, 6);
INSERT INTO tb_professor(id, titulacao) VALUES (13, 1);
INSERT INTO tb_professor(id, titulacao) VALUES (14, 2);
INSERT INTO tb_professor(id, titulacao) VALUES (15, 3);
INSERT INTO tb_professor(id, titulacao) VALUES (16, 4);
INSERT INTO tb_professor(id, titulacao) VALUES (17, 5);
INSERT INTO tb_professor(id, titulacao) VALUES (18, 6);
INSERT INTO tb_professor(id, titulacao) VALUES (19, 1);

/*carga de responsaveis*/
INSERT INTO tb_responsavel(id, cpf) VALUES (1, '001');
INSERT INTO tb_responsavel(id, cpf) VALUES (2, '002');
INSERT INTO tb_responsavel(id, cpf) VALUES (3, '003');
INSERT INTO tb_responsavel(id, cpf) VALUES (4, '004');
INSERT INTO tb_responsavel(id, cpf) VALUES (5, '005');
INSERT INTO tb_responsavel(id, cpf) VALUES (6, '006');
INSERT INTO tb_responsavel(id, cpf) VALUES (7, '007');
INSERT INTO tb_responsavel(id, cpf) VALUES (8, '008');
INSERT INTO tb_responsavel(id, cpf) VALUES (9, '009');
INSERT INTO tb_responsavel(id, cpf) VALUES (10, '010');
INSERT INTO tb_responsavel(id, cpf) VALUES (11, '011');
INSERT INTO tb_responsavel(id, cpf) VALUES (12, '012');
INSERT INTO tb_responsavel(id, cpf) VALUES (13, '013');
INSERT INTO tb_responsavel(id, cpf) VALUES (14, '014');
INSERT INTO tb_responsavel(id, cpf) VALUES (15, '015');
INSERT INTO tb_responsavel(id, cpf) VALUES (16, '016');
INSERT INTO tb_responsavel(id, cpf) VALUES (17, '017');
INSERT INTO tb_responsavel(id, cpf) VALUES (18, '018');
INSERT INTO tb_responsavel(id, cpf) VALUES (19, '019');

/*carga de turmas*/
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (1, 1, 1, 'turma a', 1);
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (2, 2, 2, 'turma b', 2);
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (3, 3, 3, 'turma c', 3);
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (4, 4, 4, 'turma d', 4);
INSERT INTO tb_turma(id, professor_id, instituicao_id, nome, periodo) VALUES (5, 5, 5, 'turma e', 1);

/*carga de series*/
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (1, true, 1);
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (2, true, 2);
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (3, true, 3);
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (4, true, 4);
INSERT INTO tb_serie(aluno_id, ano, nivel) VALUES (5, true, 1);