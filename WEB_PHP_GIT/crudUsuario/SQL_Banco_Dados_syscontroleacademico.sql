-- Database: "syscontroleacademico"

CREATE DATABASE IF NOT EXISTS syscontroleacademico;

USE syscontroleacademico;

-- --------------------------------------------------------

--
-- Table structure for table "usuario"
--
CREATE TABLE usuario (
  idusuario int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(250) NOT NULL,
  login varchar(15) NOT NULL,
  senha varchar(10) NOT NULL,
  primary key (idUsuario)
) ENGINE=INNODB DEFAULT CHARSET=latin1;


INSERT INTO usuario (idusuario, nome, login, senha) VALUES
(1, 'Joyce', 'adm', '123');


