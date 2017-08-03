package com.edu.web_maven_jsf_hibernate.converter;

import com.edu.web_maven_jsf_hibernate.dao.CategoriaDao;
import com.edu.web_maven_jsf_hibernate.model.Categoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("CategoriaConverter")
public class CategoriaConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if (value != null && !value.isEmpty()) {
            long categoria_id = Long.valueOf(value);
            CategoriaDao catDao =  new CategoriaDao();
            Categoria categoria = catDao.getCategoria(categoria_id);
            return categoria;
        }else{
            return null;
        }        
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if (value instanceof Categoria) {
            Categoria entity = (Categoria) value;
            return Long.toString(entity.getId());
        }else{
            return "";
        }
    }

}
    

