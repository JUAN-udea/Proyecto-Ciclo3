package com.ciclo3.Proyecto.Modelos;

public class ObjectAnswer {
    private Object objeto;
    private String message;

    //Constructor
    public ObjectAnswer(Object objeto, String message) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
