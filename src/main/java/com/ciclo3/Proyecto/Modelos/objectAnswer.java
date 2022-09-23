package com.ciclo3.Proyecto.Modelos;

public class objectAnswer {
    private Object objeto;
    private String message;

    //Constructor
    public objectAnswer(Object objeto, String message) {
        this.objeto = objeto;
        this.message = message;
    }
    //Constructor vacio
    public objectAnswer() {
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
