/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import javax.xml.transform.*;
import java.net.*;
import java.io.*;
import UML.Parte;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class Parser
{
    List partes;
    Document dom;
    Element rootElement;
    public Parser(ArrayList <Parte> partes) 
    {
        //create a list to hold the contact objects
        
        this.partes=partes;
        System.out.println(this.partes);
        
    }

    
    
    public void runParser() throws IOException 
    {        
          
        createXMLDoc();
        createDOMTree();        
        printToFile();
    }
    
    
    private void createXMLDoc() {   
            try 
            {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                dom = docBuilder.newDocument();
		rootElement= dom.createElement("partes");
		dom.appendChild(rootElement);
            } 
            catch (ParserConfigurationException pce) 
            {
                
            }
    }
    private void createDOMTree() 
    {   
        Iterator it = partes.iterator();
        while (it.hasNext()) {
            Parte p = (Parte) it.next();
            //For each Contact object  create <contacto> element and attach it to root
           
            rootElement.appendChild(createParteElement(p));
            
        }
    }
    private Element createParteElement(Parte p) {
        String textoAuxiliar;
        Text nombreText;
        Element Parte = dom.createElement("parte");
        
        
        

        //create nombre element and nombre text node and attach it to contactElement
        Element idParte = dom.createElement("idparte");
        textoAuxiliar= String.valueOf(p.getIdParte());
        nombreText = dom.createTextNode(textoAuxiliar);
        idParte.appendChild(nombreText);
        Parte.appendChild(idParte);
       
        
        
        
        Element fecha = dom.createElement("fecha");
        textoAuxiliar= String.valueOf(p.getFecha());
        nombreText = dom.createTextNode(textoAuxiliar);
        fecha.appendChild(nombreText);
        Parte.appendChild(fecha);

        //create apellidos element and apellidos text node and attach it to contactElement
        Element kmInicio = dom.createElement("kminicio");
        textoAuxiliar= String.valueOf(p.getKmInicio());
        nombreText = dom.createTextNode(textoAuxiliar);
        
        kmInicio.appendChild(nombreText);
        Parte.appendChild(kmInicio);
        
        //create nombre element and nombre text node and attach it to contactElement
        Element kmFin = dom.createElement("kmfin");
        textoAuxiliar= String.valueOf(p.getIdParte());
        nombreText = dom.createTextNode(textoAuxiliar);
        kmFin.appendChild(nombreText);
        Parte.appendChild(kmFin);
        
        Element estado = dom.createElement("estado");
        textoAuxiliar= String.valueOf(p.getEstado());
        nombreText = dom.createTextNode(textoAuxiliar);
        estado.appendChild(nombreText);
        Parte.appendChild(estado);
        
        //create nombre element and nombre text node and attach it to contactElement
        Element gasoil = dom.createElement("gasoil");
        textoAuxiliar= String.valueOf(p.getGasoil());
        nombreText = dom.createTextNode(textoAuxiliar);
        gasoil.appendChild(nombreText);
        Parte.appendChild(gasoil);
        
        Element peaje = dom.createElement("peaje");
        textoAuxiliar= String.valueOf(p.getPeaje());
        nombreText = dom.createTextNode(textoAuxiliar);
        peaje.appendChild(nombreText);
        Parte.appendChild(peaje);
        
        Element dietas = dom.createElement("dietas");
        textoAuxiliar= String.valueOf(p.getDietas());
        nombreText = dom.createTextNode(textoAuxiliar);
        dietas.appendChild(nombreText);
        Parte.appendChild(dietas);
        
        Element otros = dom.createElement("otros");
        textoAuxiliar= String.valueOf(p.getOtros());
        nombreText = dom.createTextNode(textoAuxiliar);
        otros.appendChild(nombreText);
        Parte.appendChild(otros);
        
        //create nombre element and nombre text node and attach it to contactElement
        Element incidencia = dom.createElement("incidencia");
        textoAuxiliar= String.valueOf(p.getIdParte());
        nombreText = dom.createTextNode(textoAuxiliar);
        incidencia.appendChild(nombreText);
        Parte.appendChild(incidencia);
        
        Element hExtra = dom.createElement("hExtra");
        textoAuxiliar= String.valueOf(p.gethExtra());
        nombreText = dom.createTextNode(textoAuxiliar);
        hExtra.appendChild(nombreText);
        Parte.appendChild(hExtra);
        
        
        
      
        return Parte;
      
    }
       
    private void printToFile() 
    {

        try 
        {
            
            //print
           OutputFormat format=new OutputFormat(dom);
            format.setIndenting(true);
            XMLSerializer serializer = null;
            File file;
            
            
            
            
            //TransformerFactory tFactory = TransformerFactory.newInstance();


          //  Transformer transformer=tFactory.newTransformer(new javax.xml.transform.stream.StreamSource(new File("partes.xsl")));
               
            serializer = new XMLSerializer(new FileOutputStream(new File("partes.xml")), format);
             serializer.serialize(dom);
             /*
             transformer.transform(new javax.xml.transform.stream.StreamSource (("partes.xml"))
                        , new javax.xml.transform.stream.StreamResult( new FileOutputStream("partes.html")));

*/
        }
        catch (IOException ex) 
        {
         ex.printStackTrace();
        }
        
    }
    
    

}
