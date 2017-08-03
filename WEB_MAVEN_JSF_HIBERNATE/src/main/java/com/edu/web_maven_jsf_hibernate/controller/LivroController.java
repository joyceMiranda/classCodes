package com.edu.web_maven_jsf_hibernate.controller;


import com.edu.web_maven_jsf_hibernate.dao.CategoriaDao;
import com.edu.web_maven_jsf_hibernate.dao.LivroDao;
import com.edu.web_maven_jsf_hibernate.model.Categoria;
import com.edu.web_maven_jsf_hibernate.model.Livro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class LivroController {
    private Livro livro;
    private DataModel listaLivros;
    private List<Categoria> listaCategorias;

    public DataModel getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(DataModel listaLivros) {
        this.listaLivros = listaLivros;
    }

    public List<Categoria> getListaCategorias() {
        listaCategorias = (new CategoriaDao()).list();
        return listaCategorias;
    }

    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    private String action;
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public Livro getLivro() {
        return livro;
    }
    
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public DataModel getListarLivros() {
        List<Livro> lista = new LivroDao().list();
        listaLivros = new ListDataModel(lista);
        return listaLivros;
    }
    
    public String prepararAdicionarLivro(){
        livro = new Livro();
        action = "add";
        return "gerenciarLivro" ;
    }
    
    public String prepararAlterarLivro(){
        livro = (Livro)(listaLivros.getRowData());
        action = "edt";
        return "gerenciarLivro";
    }
    
    public String excluirLivro(){
        Livro livroTemp = (Livro)(listaLivros.getRowData());
        LivroDao dao = new LivroDao();
        dao.remove(livroTemp);
        return "indexLivro?faces-redirect=true";
    }
    
    public String adicionarLivro(){
        LivroDao dao = new LivroDao();
        dao.save(livro);
        return "indexLivro?faces-redirect=true";
    }
    
    public String alterarLivro(){
        LivroDao dao = new LivroDao();
        dao.update(livro);
        return "indexLivro?faces-redirect=true";
    }  
    
    
}
