/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Startup.java                                             *
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
package main;
// Importar librerías para iniciar ventanas
import java.awt.Dimension;
import java.awt.Toolkit;
import views.Login;
import models.Ventana;
import models.Registro;
import controllers.RegistroCRUD;
import models.Usuario;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class Startup 
{

    // Parámetros a pasar a main
    /**
     * @param args the command line arguments
     */
    // |------------------------Atributos privados-----------------------------|
    
    // |------------------------Métodos privados-------------------------------|
    
    // |------------------------Atributos públicos-----------------------------|
        
    // |------------------------Métodos públicos-------------------------------|
    // Función principal
    public static void main(String[] args) 
    {
        // Arranque de programa
        System.out.println("Iniciando programa...");
        System.out.println("Creando ventana Login");
        // Obteniendo resoluciónd de pantalla
        Dimension TamanoVentana = Toolkit.getDefaultToolkit().getScreenSize();
        // Obteniendo Ancho
        double Ancho = TamanoVentana.getWidth();
        // Obteniendo Altura
        double Altura = TamanoVentana.getHeight();
        // Instanciar objeto ventana
        Ventana TamanoVentanaAAsignar = new Ventana();
        // Instanciar objeto Registro
        Registro Registros = new Registro();
        RegistroCRUD RegistroInicial = new RegistroCRUD();
        Registros = RegistroInicial.Cargar();
        // Asignamos valores a objeto
        TamanoVentanaAAsignar.setMaxAncho(Ancho);
        TamanoVentanaAAsignar.setMaxAltura(Altura);
        TamanoVentanaAAsignar.setAncho(480);
        TamanoVentanaAAsignar.setAltura(600);
        
        System.out.println(RegistroInicial.getRegistroTemp());
        System.out.println("Resolución de pantalla - Ancho : " +
                TamanoVentanaAAsignar.getMaxAncho() + 
                " px Alto : " + 
                TamanoVentanaAAsignar.getMaxAncho() +
                " px");
        // Crear instancia de ventana Menu
        Login VentanaLogin = new Login(TamanoVentanaAAsignar, Registros);
        System.out.println("Arrancando ventana Login");
        // Activar nueva ventana durante el arranque
        VentanaLogin.setVisible(true);
    }    
}
   