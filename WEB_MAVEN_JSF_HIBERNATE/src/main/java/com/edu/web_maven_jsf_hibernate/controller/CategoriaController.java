
package com.edu.web_maven_jsf_hibernate.controller;

import com.edu.web_maven_jsf_hibernate.dao.CategoriaDao;
import com.edu.web_maven_jsf_hibernate.model.Categoria;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class CategoriaController {
    
    
    private String categoriaBuscada;
    private Categoria categoria;
    private DataModel listaCategorias;
    private String action;
    
    
    public String getCategoriaBuscada() {
        return categoriaBuscada;
    }

    public void setCategoriaBuscada(String categoriaBuscada) {
        this.categoriaBuscada = categoriaBuscada;
    }

    public DataModel getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(DataModel listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public DataModel getListarCategorias() {
        return buscarCategorias();

    }
    
    public DataModel buscarCategorias() {
        try {
            if(categoriaBuscada == null)
                categoriaBuscada = "";
            
            List<Categoria> lista = new CategoriaDao().findByName(categoriaBuscada);
            listaCategorias = new ListDataModel(lista);
            
        } catch (Exception ex) {
        }
        
        return listaCategorias;

    }
    

    
    public String prepararAdicionarCategoria(){
        categoria = new Categoria();
        action = "add";
        return "gerenciarCategoria" ;
    }
    
    public String prepararAlterarCategoria(){
        categoria = (Categoria)(listaCategorias.getRowData());
        action = "edt";
        return "gerenciarCategoria";
    }
    
    public String excluirCategoria(){
        FacesContext faces = FacesContext.getCurrentInstance();
        faces.getExternalContext().getFlash().setKeepMessages(true);

        try {
            Categoria categoriaTemp = (Categoria)(listaCategorias.getRowData());
            CategoriaDao dao = new CategoriaDao();
            dao.remove(categoriaTemp);
            faces.addMessage(null, new FacesMessage("Categoria removida com sucesso."));
        } catch (Exception ex) {
            faces.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Não foi possível remover essa Categoria.", ex.getMessage()));
        }

        return "indexCategoria?faces-redirect=true";
    }
    
    public String adicionarCategoria(){
        FacesContext faces = FacesContext.getCurrentInstance();
        faces.getExternalContext().getFlash().setKeepMessages(true);

        CategoriaDao dao = new CategoriaDao();
        dao.save(categoria);
        
        faces.addMessage(null, new FacesMessage("Categoria adicionada com sucesso."));

        categoria = new Categoria();
        categoriaBuscada = "";
        
        return "gerenciarCategoria?faces-redirect=true" ;
    }
    
    public String alterarCategoria(){
        CategoriaDao dao = new CategoriaDao();
        dao.update(categoria);
        return "indexCategoria?faces-redirect=true";
    }  
    
    
}
