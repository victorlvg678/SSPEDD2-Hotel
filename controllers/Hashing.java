/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Hashing.java                                             *
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

// Librerías a usar para hacer hashing sin salting
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */
public class Hashing {
    
    // |---------------------Métodos públicos----------------------------------|
    // Método público estático para obtener hash de contraseña
    public static String Hash(String ContrasenaAHashear)
    {
        String HashContrasena = null;
        try {
            // Creamos instancia de MessageDigest para SHA-256
            MessageDigest SHA256 = MessageDigest.getInstance("SHA-256");
            // Añadimos los bytes de la contraseña a SHA256
            SHA256.update(ContrasenaAHashear.getBytes());
            // Obtenemos los bytes del hash
            byte[] bytes = SHA256.digest();
            // Convertimos a hexadecimal
            StringBuilder SB = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                SB.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            // Obtenemos hash
            HashContrasena = SB.toString();
        } 
        catch (NoSuchAlgorithmException e) 
        {
            e.printStackTrace();
        }
        return HashContrasena;
    }
}
