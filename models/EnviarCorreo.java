/*******************************************************************************
 *                                                                             *
 * Práctica Hotel                                                              *
 * Autor: Valle Guerra, Victor Leonardo                                        *
 * Proyecto: Hotel                                                             *
 * [Major].[Minor].[Revision].[Build]                                          *
 * Versión : 1.0.0.0 (dev_release20210605_build_0)                             *
 * Nombre de Archivo: EnviarCorreo.java                                        *
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
// Librerías a usar para enviar correos
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
// Parámetros que indican autor(es) de programa
/**
 * @author Valle Guerra, Victor Leonardo 
 */
// Clase principal de Archivo
public class EnviarCorreo 
{
    // |------------------------Atributos Privados-----------------------------|
    private String Remitente;
    private String Destinatario;
    private String Asunto;
    private String Mensaje;
    private String ServerSMTP;
    private String Host;
    private String Encoding;
    // |------------------------Método Publicos--------------------------------|
    // Constructor de clase
    public EnviarCorreo()
    {
        Remitente = "ejemplo@email.com";
        Destinatario = "ejemplo@email.com";
        Asunto = "Correo de Prueba";
        Mensaje = "Este Correo es de prueba"; 
        ServerSMTP = "smtp.ejemplo.com";
        Host = "localhost";
        Encoding =  "UTF-8";
    }
    
    // Constructor copia de clase
    public EnviarCorreo(EnviarCorreo EnviarCorreoACopiar)
    {
        Remitente = EnviarCorreoACopiar.Remitente;
        Destinatario = EnviarCorreoACopiar.Destinatario;
        Asunto = EnviarCorreoACopiar.Asunto;
        Mensaje = EnviarCorreoACopiar.Mensaje; 
        ServerSMTP = EnviarCorreoACopiar.ServerSMTP;
        Host = EnviarCorreoACopiar.Host;
        Encoding = EnviarCorreoACopiar.Encoding;
    }
    
    
    // Método EnviarCorreoA
    public void EnviarCorreoA() 
    {    
        // Obtiene propiedades de sistema
        Properties Propiedades = System.getProperties();
        // Configurar servidor smtp
        Propiedades.setProperty(ServerSMTP, Host);
        // Obtiene la sesión predeterminada
        Session Sesion = Session.getDefaultInstance(Propiedades);
        // Intena mandar correo
        try 
        {
           // Creamos un objeto MIME predeterminado
           MimeMessage Correo = new MimeMessage(Sesion);
           // Añadir headers al correo
           Correo.addHeader("Content-type", "text/HTML; charset=UTF-8");
           Correo.addHeader("format", "flowed");
           Correo.addHeader("Content-Transfer-Encoding", "8bit");
           // Coloca campo de remitente en el header del correo
           Correo.setFrom(new InternetAddress(Remitente));
           // Coloca campo de destinatario en el header del correo
           Correo.addRecipient(Message.RecipientType.TO, new InternetAddress(Destinatario));
           // Coloca campo de asunto en el header del correo
           Correo.setSubject(Asunto, Encoding);
           // Ahora coloca el mensaje del correo actual
           Correo.setText(Mensaje, Encoding);
           // Asignar fecha de envío al correo
           Correo.setSentDate(new Date());
           // Envía correo
           Transport.send(Correo);
           System.out.println("Se ha enviado el correo exitosamente desde " + 
           Remitente + " a " + Destinatario);
        }
        catch (MessagingException mex)
        {
           System.err.println(mex.getMessage());
        }
   }
    // |-----------------------------Getters-----------------------------------|
    // Getter para atributo Remitente
    public String getRemitente()
    {
        return Remitente;
    }
    
    // Getter para atributo Destinatario
    public String getDestinatario()
    {
        return Destinatario;
    }
    
    // Getter para atributo Asunto
    public String getAsunto()
    {
        return Asunto;
    }
    
    // Getter para atributo Mensaje
    public String getMensaje()
    {
        return Mensaje;
    }
    
    // Getter para atributo ServerSMTP
    public String getServerSMTP()
    {
        return ServerSMTP;
    }
    
    // Getter para atributo Host
    public String getHost()
    {
        return Host;
    }
    
    // Getter para atributo Encoding
    public String getEncoding()
    {
        return Encoding;
    }
    
    // |-----------------------------Setters-----------------------------------|
    // Setter para atributo Remitente
    public void setRemitente(String RemitenteAAsignar)
    {
        Remitente = RemitenteAAsignar;
    }
    
    // Setter para atributo Destinatario
    public void setDestinatario(String DestinatarioAAsignar)
    {
        Destinatario = DestinatarioAAsignar;
    }
    
    // Setter para atributo Asunto
    public void setAsunto(String AsuntoAAsignar)
    {
        Asunto = AsuntoAAsignar;
    }
    
    // Setter para atributo Mensaje
    public void setMensaje(String MensajeAAsignar)
    {
        Mensaje = MensajeAAsignar;
    }
    
    // Setter para atributo ServerSMTP
    public void setServerSMTP(String ServerSMTPAAsignar)
    {
        ServerSMTP = ServerSMTPAAsignar;
    }
    
    // Setter para atributo Host
    public void setHost(String HostAAsignar)
    {
        Host = HostAAsignar;
    }
    
    // Setter para atributo Encoding
    public void setEncoding(String EncodingAAsignar)
    {
        Encoding = EncodingAAsignar;
    }
}
