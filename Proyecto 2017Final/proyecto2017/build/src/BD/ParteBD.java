/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Albaran;
import UML.Parte;
import UML.Trabajador;
import UML.Vehiculo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Al
 */
public class ParteBD extends GenericoBD
{
    public static ArrayList obtenerListaIdsPartes() 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();

        ArrayList<Albaran>albaranes;
        ArrayList <Parte> idsPartes=new ArrayList<>();
        Parte p;
        try
        {
            CallableStatement cs = conn.prepareCall("{call PAQUETE_PARTE2.visualizar_lista_id_parte(?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet)cs.getObject(1);
            while(rs.next())
            {
                p = new Parte(rs.getInt(1), null, 0, 0, null, 0, 0, 0, 0, 0, 0, null, null);
                albaranes=AlbaranBD.visualizarListaIdsAlbaranesParte(p);
                for(Albaran al:albaranes)
                {
                    p.setAlbaranes(al);
                }
                idsPartes.add(p);
                
            }
    
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
           cerrarConexion();
        }
        return idsPartes;
        
    }
    
    public static ArrayList obtenerListaIdsPartesTrabajador(Trabajador t) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        int idTranajador=t.getIdTrab();
        ArrayList<Albaran>albaranes;
        ArrayList <Parte> idsPartes=new ArrayList<>();
        Parte p;
        try
        {
            CallableStatement cs = conn.prepareCall("{call PAQUETE_PARTE2.visualizar_lista_id_parte(?,?)}");
            cs.setInt(1, idTranajador);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet)cs.getObject(1);
            while(rs.next())
            {
                p = new Parte(rs.getInt(1), null, 0, 0, null, 0, 0, 0, 0, 0, 0, null, null);
                albaranes=AlbaranBD.visualizarListaIdsAlbaranesParte(p);
                for(Albaran al:albaranes)
                {
                    p.setAlbaranes(al);
                }
                idsPartes.add(p);
                
            }
            
            
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
           cerrarConexion();
        }
        return idsPartes;
        
    }
    
    public static ArrayList obtenerListaIdsPartesVehiculo(Vehiculo v2) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        int idVehiculo=v2.getIdVehiculo();
        ArrayList<Vehiculo>vehiculos;
        ArrayList <Parte> idsPartes=new ArrayList<>();
        Parte p;
        try
        {
            CallableStatement cs = conn.prepareCall("{call PAQUETE_PARTE2.visualizar_lista_id_parte(?,?)}");
            cs.setInt(1, idVehiculo);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet)cs.getObject(1);
            while(rs.next())
            {
                p = new Parte(rs.getInt(1), null, 0, 0, null, 0, 0, 0, 0, 0, 0, null, null);
                vehiculos=AlbaranBD.visualizarListaIdsAlbaranesParte(p);
                for(Vehiculo v:vehiculos)
                {
                    p.setV(v);
                }
                idsPartes.add(p);
                
            }
            
            
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
           cerrarConexion();
        }
        return idsPartes;
        
    }
    
   
    
    public static Parte visualizar_datos_parte(Parte p) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        Date fecha=p.getFecha();
        
    
        
        try
        {
            CallableStatement cs = conn.prepareCall("{call PAQUETE_PARTE2.visualizar_datos_parte_fecha(?,?)}");
            ArrayList<Albaran>albaranes;
            cs.setDate(1, fecha);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = (ResultSet)cs.getObject(2);
            if(rs.next())
            {
                p= new Parte(rs.getInt(1),rs.getDate(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),rs.getInt(9),rs.getInt(10),rs.getInt(11),
                        new Trabajador(rs.getInt(12),null,null,null,null,null,null,null,null,null,null,0.0, null, 
                                null, null, null, null),
                        new Vehiculo(rs.getInt(13), 0, null,null));
                albaranes=AlbaranBD.visualizarListaIdsAlbaranesParte(p);
                for(Albaran al:albaranes)
                {
                    p.setAlbaranes(al);
                }
                
            }
        }
        catch(SQLException e)
        {
            
        }
        finally
        {
           cerrarConexion();
        }
        return p;
    }
    
    public static Parte visualizar_datos_parteId(Parte p) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        int idParte=p.getIdParte();
        abrirConexion();
        String plantilla;
        ResultSet resultado;
        ArrayList<Albaran>albaranes;

        Statement s;
        try
        {
            
            
            
            plantilla="select idParte,fecha,kmInicio,kmFin,estado,gasoil,peaje,dietas,otros,"
                    + "incidencias,hExtra,trabajador,vehiculo from partes where idParte= "+idParte;
            
            
            s = conn.createStatement();
            
            resultado = s.executeQuery( plantilla );
            
            
            if(resultado.next())
            {
                p= new Parte(idParte,resultado.getDate(2), resultado.getDouble(3),resultado.getDouble(4),
                        resultado.getString(5),resultado.getDouble(6),resultado.getDouble(7),resultado.getDouble(8),
                        resultado.getDouble(9),resultado.getDouble(10),resultado.getDouble(11), 
                        new Trabajador(resultado.getInt(12),null,null,null,null,null,null,null,null,null,
                                null,0.0,null,null,null,null,null), 
                        new Vehiculo(resultado.getInt(13),0,null,null));
                albaranes=AlbaranBD.visualizarListaIdsAlbaranesParte(p);
                for(Albaran al:albaranes)
                {
                    p.setAlbaranes(al);
                }

            }
        }
        catch(SQLException EX)
        {
         
        }
        return p;
    }
     
    
     
    public static void actualizarPartes(Parte p) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        int idParte=p.getIdParte();
        String plantilla;
        try
        {
            
                plantilla = "UPDATE PARTES SET FECHA="+p.getFecha()+",KMINICIO="+p.getKmFin()+",KMFIN="+p.getKmFin()
                        +",ESTADO='"+p.getEstado()+"',GASOIL="+p.getGasoil()+",PEAJE="+p.getPeaje()+",DIETAS="+p.getDietas()
                        +",OTROS="+p.getOtros()+",INCIDENCIAS="+p.getIncidencias()+",HEXTRA="+p.gethExtra()
                        +",TRABAJADOR="+p.getT().getIdTrab()+",VEHICULO="+p.getV().getIdVehiculo()
                        +" WHERE IDPARTE="+idParte;
            

        PreparedStatement ps = conn.prepareStatement(plantilla);
        ps.executeUpdate();
        conn.commit();
        }
        catch(SQLException e)
        {
           
           
        }
        finally
        {
           cerrarConexion();
        }
    }
    
    public static void insertarParte(Parte p) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        String plantilla;
        try
        {
            
                plantilla = "INSERT INTO PARTES (FECHA,KMINICIO,KMFIN,ESTADO,GASOIL,PEAJE,DIETAS,OTROS,INCIDENCIAS,HEXTRA,"
                        + "TRABAJADOR,VEHICULO) VALUES ("+p.getFecha()+","+p.getKmFin()+","+p.getKmFin()
                        +",'"+p.getEstado()+"',"+p.getGasoil()+","+p.getPeaje()+","+p.getDietas()
                        +","+p.getOtros()+","+p.getIncidencias()+","+p.gethExtra()
                        +","+p.getT().getIdTrab()+","+p.getV().getIdVehiculo()+")";
            

        PreparedStatement ps = conn.prepareStatement(plantilla);
        ps.executeUpdate();
        conn.commit();
        }
        catch(SQLException e)
        {

        }
        finally
        {
           cerrarConexion();
        }
    }
    
    public static void borrarParte(Parte p) 
    {
        abrirConexion();
        Connection conn = GenericoBD.getCon();
        int idParte = p.getIdParte();
        try
        {
            String plantilla = "DELETE FROM PARTES WHERE idParte='" +idParte;
            PreparedStatement ps = conn.prepareStatement(plantilla);
            ps.executeUpdate();
            conn.commit();
        }
        catch(SQLException e)
        {
           
        }
        finally
        {
           cerrarConexion();
        }
    }
    
}
