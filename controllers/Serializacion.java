/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: Serializacion.java                                       *
 * Fecha: 06/Jun/2021                                                          *
 * Materia: Seminario de solución de Problemas de Estructura de Datos II       *
 * NRC: 138619                                                                 *      
 * CVE: I5889                                                                  *
 * Sección: D21                                                                *
 * Profesor: Lupercio Coronel, Ramiro                                          *
 * Centro Universitario de Ciencias Exactas e Ingenierías                      *
 *                                                                             *
 ******************************************************************************/
// Paquete donde se encuentra el archivo
package controllers;
// Librerías a usar
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;
import models.Registro;
// Autor(es)
/**
 *
 * @author Valle Guerra, Victor Leonardo
 */
public class Serializacion 
{
    // |-------------------Métodos privados------------------------------------|
    // Método estático para Serializar
    public static String Serializar(Registro ObjetoASerializar)
    {
        byte [] ObjetoSerializado;
        String ObjetoSerializadoB64 = "";
        try 
        {
            ByteArrayOutputStream BO = new ByteArrayOutputStream();
            ObjectOutputStream SO = new ObjectOutputStream(BO);
            SO.writeObject(ObjetoASerializar);
            ObjetoSerializado = BO.toByteArray();
            SO.flush();
            SO.close();
            ObjetoSerializadoB64 = Base64.getEncoder().encodeToString(ObjetoSerializado);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return ObjetoSerializadoB64;
    }

    // Método estático para Deserializar
    public static Registro Deserializar(String ObjetoSerializado)
    {
        Registro ObjetoFinal;
        ObjetoFinal = new Registro();
        try 
        {
            byte[] BytesDecodificados = Base64.getDecoder().decode(ObjetoSerializado);
            ByteArrayInputStream BI = new ByteArrayInputStream(BytesDecodificados);
            ObjectInputStream SI = new ObjectInputStream(BI);
            ObjetoFinal = (Registro) SI.readObject();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        return ObjetoFinal;
    }

}
