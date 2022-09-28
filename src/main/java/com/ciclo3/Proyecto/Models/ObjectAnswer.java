package com.ciclo3.Proyecto.Models;

public class ObjectAnswer {
    private Object objeto;
    private String message;

    //Constructor
    public ObjectAnswer(String message, Object objeto) {
        this.objeto = objeto;
        this.message = message;
    }

    //Constructor vacio
    public ObjectAnswer() {
    }

    //Setter and getter
    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }
}
