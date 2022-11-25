package com.example.baseadapter;

public class Datos {

    private int image;
    private String title;
    private String description;
    private boolean marcado;

    public Datos(int image, String title, String description, boolean checked) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.marcado = checked;
    }

    public int getImage(){
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean getMarcado() {
        return marcado;
    }

}
