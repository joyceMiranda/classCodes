package jpa_generic_dao.controller;

import jpa.model.Curso;
import jpa_generic_dao.dao.ConnectionFactory;
import jpa_generic_dao.dao.GenericDAO;
import jpa_generic_dao.model.Aluno;

public class TestGenericDAO {
    public static void main(String[] args) {
        
        //criando obj...
        Aluno aluno = new Aluno("Fulano", "TADS");
        
        //persistindo o objeto...
        GenericDAO<Aluno> alunoDao = new GenericDAO<>(
                ConnectionFactory.getEntityManagerUpdate());
        
        alunoDao.save(aluno);
        
        alunoDao.closeConnection();
        
        //persistindo o objeto...
        GenericDAO<Curso> cursoDAO = new GenericDAO<>(
                ConnectionFactory.getEntityManager());
        
        //criando obj...
        Curso curso = new Curso("TADS", "Tecnol. Análise de Sistemas");
        cursoDAO.save(curso);
        
        cursoDAO.closeConnection();
        
    }
}
