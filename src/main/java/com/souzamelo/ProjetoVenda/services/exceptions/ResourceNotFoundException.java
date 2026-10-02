package com.souzamelo.ProjetoVenda.services.exceptions;

import jakarta.persistence.Id;

public class ResourceNotFoundException extends  RuntimeException{

    public  ResourceNotFoundException(Object id){
        super("Resource not found, ID "+ id);


    }
}
