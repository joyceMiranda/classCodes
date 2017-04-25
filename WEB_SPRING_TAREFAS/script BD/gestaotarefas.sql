--
-- Database: 'gestaotarefas'
--

-- --------------------------------------------------------

--
-- Table structure for table 'tarefas'
--

CREATE TABLE tarefas(
  id bigint NOT NULL AUTO_INCREMENT,
  descricao varchar(255) NOT NULL,
  finalizado tinyint(1) DEFAULT NULL,
  dataFinalizacao date DEFAULT NULL,
  primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table 'usuarios'
--

CREATE TABLE usuarioss (
  id bigint NOT NULL AUTO_INCREMENT,
  login varchar(15) NOT NULL,
  senha varchar(8) NOT NULL,
   primary key (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

