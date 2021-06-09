/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Reservacion.java                                         *
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
public class Reservacion implements Serializable
{
    // |----------------------Atributos privados-------------------------------|
    private String ID;
    private String ClienteID;
    private String HabitacionID;
    private String FechaReservacion;
    private String HoraReservacion;
    private String FechaSalida;
    private String Costo;
    
    
    // |---------------------Métodos públicos----------------------------------|
    // Constructor
    public Reservacion()
    {
        ID = "0";
        ClienteID = "0";
        HabitacionID = "0";
        FechaReservacion = "05/06/2021";
        HoraReservacion = "12:00";
        FechaSalida = "06/06/2021";
        Costo = "500";
    }
    
    // Constructor copia
    public Reservacion(Reservacion ReservacionOriginal)
    {
        ID = ReservacionOriginal.ID;
        ClienteID = ReservacionOriginal.ClienteID;
        HabitacionID = ReservacionOriginal.HabitacionID;
        FechaReservacion = ReservacionOriginal.FechaReservacion;
        HoraReservacion = ReservacionOriginal.HoraReservacion;
        FechaSalida = ReservacionOriginal.FechaSalida;
        Costo = ReservacionOriginal.Costo;
    }
    
    // |------------------------Setters----------------------------------------|
    // Setter para atributo ID
    public void setID(String IDAAsignar)
    {
        ID = IDAAsignar;
    }
    
    // Setter para atributo ClienteID
    public void setClienteID(String ClienteIDAAsignar)
    {
        ClienteID = ClienteIDAAsignar;
    }
    
    // Setter para atributo HabitacionID
    public void setHabitacionID(String HabitacionIDAAsignar)
    {
        HabitacionID = HabitacionIDAAsignar;
    }
    
    // Setter para atributo FechaReservacion
    public void setFechaReservacion(String FechaReservacionAAsignar)
    {
        FechaReservacion = FechaReservacionAAsignar;
    }
    
    // Setter para atributo HoraReservacion
    public void setHoraReservacion(String HoraReservacionAAsignar)
    {
        HoraReservacion = HoraReservacionAAsignar;
    }
    
    // Setter para atributo FechaSalida
    public void setFechaSalida(String FechaSalidaAAsignar)
    {
        FechaSalida = FechaSalidaAAsignar;
    }
    
    // Setter para atributo Costo
    public void setCosto(String CostoAAsignar)
    {
        Costo = CostoAAsignar;
    }
    
    // |-------------------------Getters---------------------------------------|
    // Getter para atributo ID
    public String getID()
    {
        return ID;
    }
    
    // Getter para atributo ClienteID
    public String getClienteID()
    {
        return ClienteID;
    }
    
    // Getter para atributo HabitacionID
    public String getHabitacionID()
    {
        return HabitacionID;
    }
    
    // Getter para atributo FechaReservacion
    public String getFechaReservacion()
    {
        return FechaReservacion;
    }
    
    // Getter para atributo HoraReservacion
    public String getHoraReservacion()
    {
        return HoraReservacion;
    }
    
    // Getter para atributo FechaSalida
    public String getFechaSalida()
    {
        return FechaSalida;
    }
    
    // Getter para atributo Costo
    public String getCosto()
    {
        return Costo;
    }
}
