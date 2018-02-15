-- MySQL Workbench Synchronization
-- Generated: 2018-02-12 21:40
-- Model: Desafio-DB
-- Version: 1.0
-- Project: Desafio
-- Author: Diego Dalto

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_endereco` (
  `id` INT(10) UNSIGNED NOT NULL,
  `logradouro` VARCHAR(128) NULL DEFAULT NULL,
  `numero` SMALLINT(4) UNSIGNED NULL DEFAULT NULL,
  `s_n` TINYINT(1) NULL DEFAULT NULL,
  `complemento` VARCHAR(64) NULL DEFAULT NULL,
  `bairro` VARCHAR(64) NULL DEFAULT NULL,
  `cep` VARCHAR(9) NULL DEFAULT NULL,
  `codigo_municipio` INT(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_endereco_municipio` (`codigo_municipio` ASC),
  INDEX `fk_endereco_usuario` (`id` ASC),
  UNIQUE INDEX `usuario_id_UNIQUE` (`id` ASC),
  CONSTRAINT `fk_endereco_municipio`
    FOREIGN KEY (`codigo_municipio`)
    REFERENCES `desafio-db`.`tb_municipio` (`codigo_ibge`)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
  CONSTRAINT `fk_endereco_usuario`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_usuario` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(64) NOT NULL,
  `email` VARCHAR(64) NOT NULL,
  `usuario` VARCHAR(48) NOT NULL,
  `senha` VARCHAR(64) NOT NULL,
  `data_criacao` DATE NOT NULL,
  `tipo` ENUM('ALUNO', 'PROFESSOR', 'RESPONSAVEL', 'ESCOLA') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `codigo_UNIQUE` (`id` ASC),
  UNIQUE INDEX `usuario_UNIQUE` (`usuario` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_jogador` (
  `id` INT(10) UNSIGNED NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `deficiencias` SET('AUDITIVA', 'FISICA', 'MENTAL', 'VISUAL') NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_jogador_usuario`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_aluno` (
  `id` INT(10) UNSIGNED NOT NULL,
  `instituicao_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `data_inicio` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_aluno_escola` (`instituicao_id` ASC),
  CONSTRAINT `fk_aluno_jogador`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_jogador` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_aluno_escola`
    FOREIGN KEY (`instituicao_id`)
    REFERENCES `desafio-db`.`tb_instituicao` (`id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_instituicao` (
  `id` INT(10) UNSIGNED NOT NULL,
  `tipo` ENUM('MUNICIPAL', 'ESTADUAL', 'FEDERAL', 'PARTICULAR') NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_escola_usuario`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_professor` (
  `id` INT(10) UNSIGNED NOT NULL,
  `titulacao` ENUM('GRADUANDO', 'GRADUADO', 'ESPECIALISTA', 'MESTRE', 'DOUTOR', 'POS_DOUTOR') NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_professor_jogador`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_jogador` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_turma` (
  `id` INT(10) UNSIGNED NOT NULL,
  `professor_id` INT(10) UNSIGNED NOT NULL,
  `instituicao_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `nome` VARCHAR(64) NOT NULL,
  `periodo` ENUM('MATUTINO', 'VESPERTINO', 'INTEGRAL', 'NOTURNO') NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `codigo_UNIQUE` (`id` ASC),
  INDEX `fk_turma_professor` (`professor_id` ASC),
  INDEX `fk_turma_escola` (`instituicao_id` ASC),
  CONSTRAINT `fk_turma_professor`
    FOREIGN KEY (`professor_id`)
    REFERENCES `desafio-db`.`tb_professor` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_turma_escola`
    FOREIGN KEY (`instituicao_id`)
    REFERENCES `desafio-db`.`tb_instituicao` (`id`)
    ON DELETE SET NULL
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_turma_aluno` (
  `turma_id` INT(10) UNSIGNED NOT NULL,
  `aluno_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`turma_id`, `aluno_id`),
  INDEX `fk_turma_aluno_aluno` (`aluno_id` ASC),
  INDEX `fk_turma_aluno_turma` (`turma_id` ASC),
  CONSTRAINT `fk_turma_aluno_turma`
    FOREIGN KEY (`turma_id`)
    REFERENCES `desafio-db`.`tb_turma` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_turma_aluno_aluno`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `desafio-db`.`tb_aluno` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_instituicao_professor` (
  `instituicao_id` INT(10) UNSIGNED NOT NULL,
  `professor_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`instituicao_id`, `professor_id`),
  INDEX `fk_escola_professor_professor` (`professor_id` ASC),
  INDEX `fk_escola_professor_escola` (`instituicao_id` ASC),
  CONSTRAINT `fk_escola_professor_escola`
    FOREIGN KEY (`instituicao_id`)
    REFERENCES `desafio-db`.`tb_instituicao` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_escola_professor_professor`
    FOREIGN KEY (`professor_id`)
    REFERENCES `desafio-db`.`tb_professor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_responsavel` (
  `id` INT(10) UNSIGNED NOT NULL,
  `cpf` CHAR(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC),
  CONSTRAINT `fk_tb_responsavel_tb_usuario1`
    FOREIGN KEY (`id`)
    REFERENCES `desafio-db`.`tb_usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_municipio` (
  `codigo_ibge` INT(10) UNSIGNED NOT NULL,
  `nome` VARCHAR(64) NOT NULL,
  `uf` ENUM('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES', 'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 'SP', 'SE', 'TO') NOT NULL,
  PRIMARY KEY (`codigo_ibge`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo_ibge` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_telefone` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `usuario_id` INT(10) UNSIGNED NOT NULL,
  `tipo` ENUM('CELULAR', 'RESIDENCIAL', 'INSTITUCIONAL') NULL DEFAULT NULL,
  `numero` VARCHAR(11) NOT NULL,
  `principal` TINYINT(1) NULL DEFAULT 1,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_telefone_usuario_idx` (`usuario_id` ASC),
  CONSTRAINT `fk_telefone_usuario`
    FOREIGN KEY (`usuario_id`)
    REFERENCES `desafio-db`.`tb_usuario` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_serie` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `aluno_id` INT(10) UNSIGNED NOT NULL,
  `ano` TINYINT(1) NOT NULL,
  `nivel` ENUM('PRE_ESCOLA', 'FUNDAMENTAL', 'MEDIO', 'SUPERIOR') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `codigo_UNIQUE` (`id` ASC),
  INDEX `fk_serie_aluno_idx` (`aluno_id` ASC),
  UNIQUE INDEX `codigo_aluno_UNIQUE` (`aluno_id` ASC),
  CONSTRAINT `fk_serie_aluno`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `desafio-db`.`tb_aluno` (`id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `desafio-db`.`tb_responsavel_aluno` (
  `responsavel_id` INT(10) UNSIGNED NOT NULL,
  `aluno_id` INT(10) UNSIGNED NOT NULL,
  `professor_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`responsavel_id`, `aluno_id`),
  INDEX `fk_tb_responsavel_has_tb_aluno_tb_aluno1_idx` (`aluno_id` ASC),
  INDEX `fk_tb_responsavel_has_tb_aluno_tb_responsavel1_idx` (`responsavel_id` ASC),
  INDEX `fk_tb_responsavel_has_tb_aluno_tb_professor1_idx` (`professor_id` ASC),
  CONSTRAINT `fk_tb_responsavel_has_tb_aluno_tb_responsavel1`
    FOREIGN KEY (`responsavel_id`)
    REFERENCES `desafio-db`.`tb_responsavel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_responsavel_has_tb_aluno_tb_aluno1`
    FOREIGN KEY (`aluno_id`)
    REFERENCES `desafio-db`.`tb_aluno` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tb_responsavel_has_tb_aluno_tb_professor1`
    FOREIGN KEY (`professor_id`)
    REFERENCES `desafio-db`.`tb_professor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
