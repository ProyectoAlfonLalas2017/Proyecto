/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import static BD.GenericoBD.abrirConexion;
import UML.Aviso;
import UML.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Al
 */
public class AvisoBD extends GenericoBD
{
    public static ArrayList visualizar_codAvisos() 
    {
        abrirConexion();
        String plantilla;
        ResultSet resultado;
        
        Connection conn = GenericoBD.getCon();
        Aviso av = null;
        ArrayList<Aviso>avisos=new ArrayList<>();
        
        Statement s;
        try
        {
            
            
            
            plantilla="select codAvisofrom avisos";
            
            
            s = conn.createStatement();
            
            resultado = s.executeQuery( plantilla );
            
            
            if ( resultado.next() )
            
                
               av=new Aviso(resultado.getInt(1),resultado.getString(2), resultado.getString(3),resultado.getString(4),
                       new Trabajador(resultado.getInt(5),
                       null,null,null,null,null,null,null,null,null, 
                       null,0.0,null,null,null,null,null));
                
            avisos.add(av);
            
        }
        catch(SQLException EX)
        {
         EX.printStackTrace();
        }
        return avisos;
    }
     
    public static Aviso visualizar_datos_aviso_cod(Aviso av) 
    {
        abrirConexion();
        String plantilla;
        ResultSet resultado;
        
        Connection conn = GenericoBD.getCon();

        
        Statement s;
        try
        {
            
            
            
            plantilla="select idAviso,codAviso,nombre,descripcion from avisos where codAviso="+av.getCodAviso();
            
            
            s = conn.createStatement();
            
            resultado = s.executeQuery( plantilla );
            
            
            if ( resultado.next() )
            
                
               av=new Aviso(resultado.getInt(1),resultado.getString(2), resultado.getString(3),resultado.getString(4),
                       new Trabajador(resultado.getInt(5),
                       null,null,null,null,null,null,null,null,null, 
                       null,0.0,null,null,null,null,null));
                
            
            
        }
        catch(SQLException EX)
        {
         EX.printStackTrace();
        }
        return av;
    }
    
    public static void insertarAviso(Aviso av) 
    {
        abrirConexion();
        String plantilla;
        
        
        Connection conn = GenericoBD.getCon();

        
        Statement s;
        try
        {
            
            
            
            plantilla="INSERT INTO AVISOS (codAviso,nombre,descripcion) VALUES ("+av.getCodAviso()+",'"+av.getNombre()
                    +"','"+av.getDescripcion()+"')";
            
            
            PreparedStatement ps = conn.prepareStatement(plantilla);
            ps.executeUpdate();
            conn.commit();
                
            
            
        }
        catch(SQLException EX)
        {
         EX.printStackTrace();
        }
        
    }
    
    public static void actualizarAviso(Aviso av) 
    {
        abrirConexion();
        String plantilla;
        
        
        Connection conn = GenericoBD.getCon();

        
        Statement s;
        try
        {
            
            
            
            plantilla="UPDATE AVISOS SET codAviso="+av.getCodAviso()+",nombre='"+av.getNombre()
                    +"',descripcion='"+av.getDescripcion()+"' where codAviso='"+av.getCodAviso()+"'";
            
            
            PreparedStatement ps = conn.prepareStatement(plantilla);
            ps.executeUpdate();
            conn.commit();
                
            
            
        }
        catch(SQLException EX)
        {
         EX.printStackTrace();
        }
        
    }
    
    public static void borrarAviso(Aviso av) 
    {
        abrirConexion();
        String plantilla;
        
        
        Connection conn = GenericoBD.getCon();

        
        Statement s;
        try
        {
            
            
            
            plantilla="DELETE FROM avisos WHERE codAviso="+av.getCodAviso();
            
            
            PreparedStatement ps = conn.prepareStatement(plantilla);
            ps.executeUpdate();
            conn.commit();
                
            
            
        }
        catch(SQLException EX)
        {
         EX.printStackTrace();
        }
        
    }
    
}
