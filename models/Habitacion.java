/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Habitacion.java                                          *
 * Fecha: 06/Jun/2021                                                          *
 * Materia: Seminario de solución de Problemas de Estructura de Datos II       *
 * NRC: 138619                                                                 *      
 * CVE: I5889                                                                  *
 * Sección: D21                                                                *
 * Profesor: Lupercio Coronel, Ramiro                                          *
 * Centro Universitario de Ciencias Exactas e Ingenierías                      *
 *                                                                             *
 ******************************************************************************/
// Paquede donde se encuentra el archivo
package models;
// Librerías a usar
import java.io.Serializable;


// Autor(es)
/**
 *
 * @author Valle Guerra, Victor Leonardo
 */

// Clase
public class Habitacion implements Serializable
{
    // |----------------------Atributos privados-------------------------------|
    private String ID;
    private String NoHabitacion;
    private String Estado;
    
    // |----------------------Métodos públicos---------------------------------|
    // Constructor
    public Habitacion()
    {
        ID = "0";
        NoHabitacion = "0";
        Estado = "Libre";
    }
    
    // Constructor copia
    public Habitacion(Habitacion HabitacionOriginal)
    {
        ID = HabitacionOriginal.ID;
        NoHabitacion = HabitacionOriginal.NoHabitacion;
        Estado = HabitacionOriginal.Estado;
    }
    
    // |-----------------------Setters-----------------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
    }
    
    // Setter para atributo NoHabitacion
    public void setNoHabitacion(String NoHabitacionAAsignar)
    {
        NoHabitacion = NoHabitacionAAsignar;
    }
    
    // Setter para atributo Estado
    public void setEstado(String EstadoAAsignar)
    {
        Estado = EstadoAAsignar;
    }
    
    // |----------------------Getters------------------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
    }
    
    // Getter para atributo NoHabitacion
    public String getNoHabitacion()
    {
        return NoHabitacion;
    }
    
    // Getter para atributo Estado
    public String getEstado()
    {
        return Estado;
    }
}
