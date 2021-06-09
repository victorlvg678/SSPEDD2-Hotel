/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: RegistroCRUD.java                                        *
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
package controllers;
// Archivos a importar para usar dentro de clase
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Registro;


// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */

// Clase principal de Archivo
public class RegistroCRUD 
{
    // Atributos privados
    private String RegistroTemp;
    private String URLTemp;
    // |------------------------Métodos públicos-------------------------------|
    
    // Constructor de clase
    public RegistroCRUD()
    {
        RegistroTemp = System.getenv("USERPROFILE") + 
                "\\AppData\\Local\\Temp\\RegistroTempHotel.data";
        URLTemp = "https://raw.githubusercontent.com/victorlvg678/SSPEDD2-Hotel/master/RegistroTempHotel.data";
    }
    
    // Constructor copia de clase
    public RegistroCRUD(RegistroCRUD RegistroCRUDOriginal)
    {
        RegistroTemp = RegistroCRUDOriginal.RegistroTemp;
        URLTemp = RegistroCRUDOriginal.URLTemp;
    }
    
    // |---------------------------Setters-------------------------------------|
    // Setter para atributo RegistroTemp
    public void setRegistroTemp(String RegistroTempAAsignar)
    {
        RegistroTemp = RegistroTempAAsignar;
    }
    
    // Setter para atributo URL
    public void setURL(String URLAAsignar)
    {
        URLTemp = URLAAsignar;
    }
    
    // |---------------------------Getters-------------------------------------|
    // Getter para atributo RegistroTemp
    public String getRegistroTemp()
    {
        return RegistroTemp;
    }
    
    // Getter para atributo URL
    public String getURL()
    {
        return URLTemp;
    }
    
    // |--------------------------Guardar---------------------------------------|
    // Método para añadir usuario a archivo temporal
    public void Guardar(Registro RegistroAGuardar)
    {
        // Intenta el siguiente bloque de instrucciones
        try{
            // Para recorrer registros
            int x;
            File ArchivoTemporal = new File(RegistroTemp);
            if(ArchivoTemporal.exists())
            {
                if(ArchivoTemporal.delete())
                {
                    System.out.println("Se ha eliminado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intentar eliminar " + 
                            ArchivoTemporal.getName());
                }
                if(ArchivoTemporal.createNewFile())
                {
                    System.out.println("Se ha creado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intenetar crear " + 
                            ArchivoTemporal.getName());
                }
            }
            else
            {
                if(ArchivoTemporal.createNewFile())
                {
                    System.out.println("Se ha creado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intenetar crear " + 
                            ArchivoTemporal.getName());
                }
            }
            // Creamos un outputstream para el archivo
            FileOutputStream FOS = new FileOutputStream(RegistroTemp, true);
            // Creamos un escritor para el outputstream en UTF-8
            OutputStreamWriter OSW = new OutputStreamWriter(FOS, StandardCharsets.UTF_8);
            // Creamos un buffer para el escritor
            BufferedWriter Writer = new BufferedWriter(OSW);
            Writer.append(Serializacion.Serializar(RegistroAGuardar));
            // Cerrar todo
            Writer.close();
            OSW.close();
            FOS.close();
        }
        catch(IOException ex)
        {
            // Define e
            Logger.getLogger(RegistroCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // |-----------------------Cargar------------------------------------------|
    public Registro Cargar()
    {
        // Instanciar Registro
        Registro RegistroCargado = new Registro();
        String RegistroB64;
        RegistroB64 = "";
        try
        {
            File ArchivoTemporal = new File(RegistroTemp);
            if(!ArchivoTemporal.exists())
            {
                if(ArchivoTemporal.createNewFile())
                {
                    System.out.println("Se ha creado " + ArchivoTemporal.getName());
                }
                else
                {
                    System.out.println("Ocurrió un problema al intenetar crear " + 
                            ArchivoTemporal.getName());
                }
            }
            else
            {
                // Creamos un inputstream para el archivo
                FileInputStream FIS = new FileInputStream(RegistroTemp);
                // Creamos un lector de dicho inputstream en UTF-8
                InputStreamReader ISR = new InputStreamReader(FIS, StandardCharsets.UTF_8);
                // Y creamos un buffer para el lector
                BufferedReader Reader = new BufferedReader(ISR);
                String StrTemp;
                StrTemp = Reader.readLine();
                while(StrTemp != null)
                {
                    RegistroB64 += StrTemp;
                    StrTemp = Reader.readLine();
                }
                // Cerrar todo
                Reader.close();
                ISR.close();
                FIS.close();
            }
        }
        catch(IOException ex)
        {
            // Define e
            Logger.getLogger(RegistroCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroCargado = Serializacion.Deserializar(RegistroB64);
        return RegistroCargado;
    }
}
