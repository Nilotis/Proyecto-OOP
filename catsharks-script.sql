-- Script para BBDD conectada con Java Nil Carmona Quesada

-- -----------------------------------------------
-- Creación
-- -----------------------------------------------

DROP DATABASE IF EXISTS catsharks;
CREATE DATABASE catsharks;
USE catsharks;

-- -----------------------------------------------
-- Biomas
-- -----------------------------------------------

CREATE TABLE bioma (
	habitat VARCHAR(40),
	profundidad INT,
	tmp_navegacion INT,
	nubosidad VARCHAR(30),
	direccion_viento VARCHAR(20),
	fuerza_viento VARCHAR(10),
	hora_llegada TIME,
	num_embarcaciones INT,
	temperatura INT,
	tipo_cebo VARCHAR(30),
	parasitos BOOLEAN,
	presencia_anzuelos BOOLEAN,
	num_anzuelos INT,
	PRIMARY KEY (habitat)
) engine=innodb;

-- -----------------------------------------------
-- Animales
-- -----------------------------------------------

CREATE TABLE animal (
	id_animal INT AUTO_INCREMENT,
	especie VARCHAR(40),
	habitat VARCHAR(40),
	sexo VARCHAR(10),
	PRIMARY KEY (id_animal,especie),
	FOREIGN KEY (habitat) REFERENCES bioma (habitat)
	ON DELETE CASCADE ON UPDATE CASCADE
) engine=innodb;

-- -----------------------------------------------
-- Creación de usuario
-- -----------------------------------------------
-- Este usuario es el utilizado para hacer las consultas SQL. 
-- Descomenta los comandos que necesites. 

-- SET GLOBAL validate_password.policy=LOW;
-- SET GLOBAL validate_password.length=3;
-- DROP USER IF EXISTS 'ncq_java'@'localhost';
-- CREATE USER 'ncq_java'@'localhost' identified by '1234';

-- -----------------------------------------------
-- Permisos de usuario
-- -----------------------------------------------

-- GRANT ALL PRIVILEGES ON catsharks.* TO 'ncq_java'@'localhost';
