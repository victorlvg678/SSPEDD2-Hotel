/*******************************************************************************
 *                                                                             *
 * Práctica                                                                    *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Registro.java                                            *
 * Fecha: 06/Jun/2021                                                          *
 * Materia: Seminario de solución de Problemas de Estructura de Datos II       *
 * NRC: 138619                                                                 *      
 * CVE: I5889                                                                  *
 * Sección: D21                                                                *
 * Profesor: Lupercio Coronel, Ramiro                                          *
 * Centro Universitario de Ciencias Exactas e Ingenierías                      *
 *                                                                             *
 ******************************************************************************/

// Paquete donde se incluye dicho archivo
package models;
// Librerías a usar para arreglos
import java.io.Serializable;
import java.util.ArrayList;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */
// Clase principal de Archivo
public class Registro implements Serializable
{
    // |------------------------Atributos privados-----------------------------|
    private ArrayList<Usuario> RegistroUsuarios = new ArrayList<Usuario>();;
    private ArrayList<Habitacion> RegistroHabitaciones = new ArrayList<Habitacion>();
    private ArrayList<Reservacion> RegistroReservaciones = new ArrayList<Reservacion>();;
    
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public void Registro()
    {
        RegistroUsuarios = new ArrayList<Usuario>();
        RegistroHabitaciones = new ArrayList<Habitacion>();
        RegistroReservaciones = new ArrayList<Reservacion>();
    }
    
    // Constructor copia de clase
    public void Registro(Registro RegistroACopiar)
    {
        RegistroUsuarios = new ArrayList<>(RegistroACopiar.RegistroUsuarios);
        RegistroHabitaciones = new ArrayList<>(RegistroACopiar.RegistroHabitaciones);
        RegistroReservaciones = new ArrayList<>(RegistroACopiar.RegistroReservaciones);
    }
    
    // |--------------------------Anular---------------------------------------|
    // Método AnulaTodo
    public void AnulaTodo()
    {
        RegistroUsuarios.clear();
        RegistroHabitaciones.clear();
        RegistroReservaciones.clear();
    }
    
    // Método AnulaRegistroUsuarios
    public void AnulaRegistroUsuarios()
    {
        RegistroUsuarios.clear();
    }
    
    // Método AnulaRegistroHabitaciones
    public void AnulaRegistroHabitaciones()
    {
        RegistroHabitaciones.clear();
    }
    
    // Método AnulaRegistroReservaciones
    public void AnulaRegistroReservaciones()
    {
        RegistroReservaciones.clear();
    }
    
    
    // |------------------------Insertar---------------------------------------|
    // Método para insertar lista o arreglo de Usuarios completa
    public void InsertarListaUsuarios(ArrayList<Usuario> ListaUsuarios)
    {
        RegistroUsuarios = new ArrayList<>(ListaUsuarios);
    }
    
    // Método InsertarUsuarios
    public void InsertarUsuarios(Usuario UsuarioAAsignar)
    {
        RegistroUsuarios.add(UsuarioAAsignar);
    }
    
    // Método InsertarUsuarios con posición
    public void InsertarUsuarios(int Posicion, Usuario UsuarioAAsignar)
    {
        RegistroUsuarios.add(Posicion, UsuarioAAsignar);
    }
    
    // Método para insertar lista o arreglo de habitaciones
    public void InsertarListaHabitaciones(ArrayList<Habitacion> ListaHabitaciones)
    {
        RegistroHabitaciones = new ArrayList<>(ListaHabitaciones);
    }
    
    // Método InsertarHabitaciones
    public void InsertarHabitaciones(Habitacion HabitacionAAsignar)
    {
        RegistroHabitaciones.add(HabitacionAAsignar);
    }
    
    // Método InsertarHabitaciones con posición
    public void InsertarHabitaciones(int Posicion, Habitacion HabitacionAAsignar)
    {
        RegistroHabitaciones.add(Posicion, HabitacionAAsignar);
    }
    
    // Método para insertar lista o arreglo de reservaciones
    public void InsertarListaReservaciones(ArrayList<Reservacion> ListaReservaciones)
    {
        RegistroReservaciones = new ArrayList<>(ListaReservaciones);
    }
    
    // Método InsertarReservaciones
    public void InsertarReservaciones(Reservacion ReservacionAAsignar)
    {
        RegistroReservaciones.add(ReservacionAAsignar);
    }
    
    // Método InsertarReservaciones con posición
    public void InsertarReservaciones(int Posicion, Reservacion ReservacionAAsignar)
    {
        RegistroReservaciones.add(Posicion, ReservacionAAsignar);
    }
    
    
    
    // |------------------------Eliminar---------------------------------------|
    // Método EliminarUsuarios por objeto
    public boolean EliminarUsuarios(Usuario UsuarioAEliminar)
    {
        return RegistroUsuarios.remove(UsuarioAEliminar);
    }
    
    // Método EliminarUsuarios por posición
    public Usuario EliminarUsuarios(int Posicion)
    {
        return RegistroUsuarios.remove(Posicion);
    }
    
    // Método EliminarHabitaciones por objeto
    public boolean EliminarHabitaciones(Habitacion HabitacionAEliminar)
    {
        return RegistroHabitaciones.remove(HabitacionAEliminar);
    }
    
    // Método EliminarHabitaciones por posición
    public Habitacion EliminarHabitaciones(int Posicion)
    {
        return RegistroHabitaciones.remove(Posicion);
    }
    
    // Método EliminarReservaciones por objeto
    public boolean EliminarReservaciones(Reservacion ReservacionAEliminar)
    {
        return RegistroReservaciones.remove(ReservacionAEliminar);
    }
    
    // Método EliminarReservaciones por posición
    public Reservacion EliminarReservaciones(int Posicion)
    {
        return RegistroReservaciones.remove(Posicion);
    }
    
    // |-----------------------------Vacio-------------------------------------|
    // Método VacioUsuarios
    public boolean VacioUsuarios()
    {
        if(RegistroUsuarios.size() <= 0)
        {
            return true;
        }
        return false;
    }
    
    // Método VacioHabitaciones
    public boolean VacioHabitaciones()
    {
        if(RegistroHabitaciones.size() <= 0)
        {
            return true;
        }
        return false;
    }
    
    // Método VacioReservaciones
    public boolean VacioReservaciones()
    {
        if(RegistroReservaciones.size() <= 0)
        {
            return true;
        }
        return false;
    }
    
    
    // Método VacioRegistro
    public boolean VacioRegistro()
    {
        if(VacioUsuarios() && VacioHabitaciones() &&
            VacioReservaciones())
        {
            return true;
        }
        return false;
    }
    
    // |-----------------------------Tamano------------------------------------|
    // Método getTamanoUsuarios
    public int getTamanoUsuarios()
    {
        return RegistroUsuarios.size();
    }

    // Método getTamanoHabitaciones
    public int getTamanoHabitaciones()
    {
        return RegistroHabitaciones.size();
    }
    
    // Método getTamanoReservaciones
    public int getTamanoReservaciones()
    {
        return RegistroReservaciones.size();
    }
    
    // |-----------------------------Buscar------------------------------------|
    // Método BuscarUsuarios
    public int BuscarUsuarios(Usuario UsuarioABuscar)
    {
        return RegistroUsuarios.indexOf(UsuarioABuscar);
    }
    
    // Método BuscarHabitaciones
    public int BuscarHabitaciones(Habitacion HabitacionABuscar)
    {
        return RegistroHabitaciones.indexOf(HabitacionABuscar);
    }
    
    // Método BuscarReservaciones
    public int BuscarReservaciones(Reservacion ReservacionABuscar)
    {
        return RegistroReservaciones.indexOf(ReservacionABuscar);
    }
    
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para RegistroUsuarios por posición
    public Usuario getUsuario(int Posicion)
    {
        return RegistroUsuarios.get(Posicion);
    }
    
    // Getter para RegistroHabitaciones por posición
    public Habitacion getHabitacion(int Posicion)
    {
        return RegistroHabitaciones.get(Posicion);
    }
    
    // Getter para RegistroReservaciones por posición
    public Reservacion getReservacion(int Posicion)
    {
        return RegistroReservaciones.get(Posicion);
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo RegistroUsuarios por posición
    public Usuario setUsuario(int Posicion, Usuario UsuarioAAsignar)
    {
        return RegistroUsuarios.set(Posicion, UsuarioAAsignar);
    }
    
    // Setter para atributo RegistroHabitaciones por posición
    public Habitacion setHabitacion(int Posicion, Habitacion ClienteAAsignar)
    {
        return RegistroHabitaciones.set(Posicion, ClienteAAsignar);
    }
    
    // Setter para atributo RegistroReservaciones por posición
    public Reservacion setReservacion(int Posicion, Reservacion VehiculoAAsignar)
    {
        return RegistroReservaciones.set(Posicion, VehiculoAAsignar);
    }   
}
