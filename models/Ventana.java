/*******************************************************************************
 *                                                                             *
 * Práctica 5 - Login                                                          *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: CARS(Car Automated Repair System)                                 *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210313_build_0)                             *
 * Nombre de Archivo: Ventana.java                                             *
 * Fecha: 13/Abr/2021                                                          *
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

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class Ventana 
{
    // |------------------------Atributos privados-----------------------------|
    private int Ancho;
    private int Altura;
    private double MaxAncho;
    private double MaxAltura;
    private boolean Maximizada;
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    // Constructor de clase
    public void Ventana()
    {
        // Valores predeterminados de objeto
        Altura = 720;
        Ancho = 480;
        MaxAncho = 1080;
        MaxAltura = 1920;
        Maximizada = false;
    }
    
    // Constructor copia de clase
    public void Ventana(Ventana VentanaACopiar)
    {
        Altura = VentanaACopiar.Altura;
        Ancho = VentanaACopiar.Ancho;
        MaxAncho = VentanaACopiar.MaxAncho;
        MaxAltura = VentanaACopiar.MaxAltura;
        Maximizada = VentanaACopiar.Maximizada;
    }
    
    
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo Ancho
    public int getAncho()
    {
        return Ancho;
    }
    
    // Getter para atributo Altura
    public int getAltura()
    {
        return Altura;
    }
    
    // Getter para atributo MaxAncho
    public double getMaxAncho()
    {
        return MaxAncho;
    }
    
    // Getter para atributo MaxAltura
    public double getMaxAltura()
    {
        return MaxAltura;
    }
    
    // Getter para atributo Maximizada
    public boolean getMaximizada()
    {
        return Maximizada;
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo Ancho 
    public void setAncho(double AnchoAAsignar)
    {
        Ancho = (int) AnchoAAsignar;
    }
    
    // Setter para atributo Ancho 
    public void setAltura(double AlturaAAsignar)
    {
        Altura = (int) AlturaAAsignar;
    }
    
    // Setter para atributo MaxAncho
    public void setMaxAncho(double MaxAnchoAAsignar)
    {
        MaxAncho = MaxAnchoAAsignar;
    }
    
    // Setter para atributo MaxAltura
    public void setMaxAltura(double MaxAlturaAAsignar)
    {
        MaxAltura = MaxAlturaAAsignar;
    }
    
    // Setter para atributo Maximizada
    public void setMaximizada(boolean MaximizadaAAsignar)
    {
        Maximizada = MaximizadaAAsignar;
    }
}
