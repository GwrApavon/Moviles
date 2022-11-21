package com.example.baseadapter;

public class Datos {

    private String image;
    private String title;
    private String description;
    private boolean marcado;

    public Datos(String image, String title, String description, boolean checked) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.marcado = checked;
    }

    public String getImage(){
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public boolean isMarcado() {
        return marcado;
    }
    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

}
