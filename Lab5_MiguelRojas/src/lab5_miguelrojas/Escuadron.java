package lab5_miguelrojas;

import java.util.ArrayList;

public class Escuadron {

    private String nombre_escuadron;
    private String lugar_base;
    private String lider;
    private String tipo_escuadron;
    private ArrayList lista_miembros = new ArrayList();
    
    public Escuadron(){
        
    }

    public Escuadron(String nombre_escuadron, String lugar_base, String lider, String tipo_escuadron) {
        this.nombre_escuadron = nombre_escuadron;
        this.lugar_base = lugar_base;
        this.lider = lider;
        this.tipo_escuadron = tipo_escuadron;
    }

    public String getNombre_escuadron() {
        return nombre_escuadron;
    }

    public void setNombre_escuadron(String nombre_escuadron) {
        this.nombre_escuadron = nombre_escuadron;
    }

    public String getLugar_base() {
        return lugar_base;
    }

    public void setLugar_base(String lugar_base) {
        this.lugar_base = lugar_base;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo_escuadron() {
        return tipo_escuadron;
    }

    public void setTipo_escuadron(String tipo_escuadron) {
        this.tipo_escuadron = tipo_escuadron;
    }

    public ArrayList getLista_miembros() {
        return lista_miembros;
    }

    public void setLista_miembros(ArrayList lista_miembros) {
        this.lista_miembros = lista_miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre_escuadron=" + nombre_escuadron + ", lugar_base=" + lugar_base + ", lider=" + lider + ", tipo_escuadron=" + tipo_escuadron + ", lista_miembros=" + lista_miembros + '}';
    }
    
    
}