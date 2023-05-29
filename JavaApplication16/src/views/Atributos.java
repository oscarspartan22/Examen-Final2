/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;

/**
 *
 * @author oscar
 */
public class Atributos {
    private String actividad;
    private String codigo;
    private int id;
    private String nombre;
    private String responsable;
    private String uso;
    public static ArrayList<Atributos> atributos = new ArrayList<>();
    
        public Atributos(String actividad, String  codigo, int id, String nombre, String responsable, String uso){
        this.actividad = actividad;
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.responsable =  responsable;
        this.uso =  uso; 
    }
    
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    

          public String toString() {
        return "produccion {" + "Actividad = " + actividad + ", Codigo = " + codigo + ", Id = " + id + ", Nombre = " + nombre + ", Responsable = " + responsable + ", Uso = " + uso + '}';
    }
    public static void llenarProduccion(){
        insertarProduccion( "Proceso general de fabricación de nuevos productos", "FAB-000" ,1 , "FAB-000 FABRICACIÓN", "GERENCIA, PRODUCCIÓN, COMPRAS, CALIDAD", "planificadores");
        insertarProduccion( "SubProceso de órdenes de producción del plan anual", "FAB-001" ,2 , "FAB-001 Órdenes de producción Plan Anual", "FABRICACION", "GERENCIA");
        insertarProduccion( "SubProceso de lanzamiento de fabricación de nuevos productos", "FAB-002" ,3 , "FAB-002 Órdenes de producción", "FABRICACION", "PRODUCION");
        insertarProduccion( "SubProceso de Solicitud de Insumos", "FAB-002" ,4 , "FAB-003 Solicitud de Insumos  ", "FABRICACION", "PRODUCION");
        insertarProduccion( "SubProceso de Autorización de Insumos para su compra", "FAB-004" ,5 , "FAB-004 Autorización de Insumos", "FABRICACION", "PRODUCION");
        insertarProduccion( "SubProceso de Autorización de Insumos para su compra", "FAB-005" ,6 , "FAB-005 Autorización de Insumos", "FABRICACION", "COMPRAS");
        insertarProduccion( "SubProceso de Autorización de Insumos para su compra", "FAB-006" ,7 , "FAB-005 Control de Calidad", "FABRICACION", "CALIDAD");
    }
    
    public static void eliminarProduccion(int posicion){
        atributos.remove(posicion);
    }
        
    public static void ActualizarProduccion(int recNo, String actividad, String  codigo, int id, String nombre, String responsable, String uso){
        atributos.get(recNo).setActividad(actividad);
        atributos.get(recNo).setCodigo(codigo);
        atributos.get(recNo).setId(id);
        atributos.get(recNo).setNombre(nombre);
        atributos.get(recNo).setResponsable(responsable);
        atributos.get(recNo).setUso(uso);
    }
    
    public static void insertarProduccion(String actividad, String  codigo, int id, String nombre, String responsable, String uso){
        atributos.add(new Atributos(actividad, codigo, id, nombre, responsable, uso));
    }    
}
