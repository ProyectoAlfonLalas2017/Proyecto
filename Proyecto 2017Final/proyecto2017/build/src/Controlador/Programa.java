/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import BD.*;
import Parser.Parser;
import UML.*;
import Ventanas.*;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Al
 */
public class Programa 
{
    private static VentanaLogin vL;
    private static VentanaPrincipalAdmin vpA;
    private static VentanaAlbaran al;
    private static VentanaAviso av;
    private static VentanaCentro ac;
    private static VentanaInsertarUsuario dc;
    private static VentanaParte vp;
    private static VentanaPerfil vpil;
    private static VentanaVehiculo vvh;
    private static VentanaPrincipalLogistica vpl;
    private static VentanaFondo vf;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException 
    {
        /*
        vpA =new VentanaPrincipalAdmin();
        vpA.setVisible(true);
        // TODO code application logic here7
        */
        vf=new VentanaFondo();
        vf.setVisible(true);
        vL =new VentanaLogin(vf, true);
        
        
    }
    public static Trabajador buscarTrabajador(String dni)
    {
        Trabajador t=new Trabajador(0,dni,null,null,null,null,null,null,null,null,null,0.0,null,null,null,null,null);
        t=TrabajadorBD.visualizar_datos_trabajador(t);
        return t;
    }
    
    public static void actualizarTrabajador(String dni,String nombre,String apellidouno,String apellidodos,String calle,
            String portal,String piso,String mano,String telefempre,String telefperso,Double salario,Date fechaNac,
                    String nombreCentro, int Categoria)
    {   
        Centro c;
        c=new Centro(0, nombreCentro,null,0,null,null,null,null);
        c=CentroBD.visualizarCentroNombre(c);
        Trabajador t= new Trabajador(0, dni, nombre, apellidouno, apellidodos, calle, portal, piso, mano, telefempre, telefperso,
                salario, fechaNac,new Centro(c.getIdCentro(),null,null,0,null,null,null,null),
                null,null, new Categoria(Categoria,null,null));
        TrabajadorBD.actualizarTrabajador(t);
    }
    
    public static Trabajador buscarTrabajadorLog(String usuario,String password)
    {
       
        Usuario us= UsuarioBD.comprobarUsuarioPassword(usuario, password);
        
        Trabajador t=TrabajadorBD.buscarIdTrabajadorParaLog(us);
        
        t=TrabajadorBD.visualizar_datos_trabajador(t);
        
        Categoria cat = TrabajadorBD.buscarCategoria(t);

        
        
        
        if("admin".equals(cat.getTipo()))
        {
            Administrador admin=new Administrador(t.getIdTrab(),t.getDni(),t.getNombre(),t.getApellidodos(),t.getApellidodos(), 
                    t.getCalle(),t.getPortal(),t.getPiso(),t.getMano(),t.getTelefempre(),t.getTelefperso(),t.getSalario(),
                    t.getFechaNac(),new Centro(t.getC().getIdCentro(),null,null,0,null,null,null,null),
                    new Aviso(t.getA().getIdAviso(),null,null,null,null),
                    new Usuario(t.getU().getIdUsuario(),null,null,null),
                    new Categoria(t.getCat().getIdTipo(),null,null));
            
            return admin;
        }
        return t;
    }

   
   /* public static Usuario buscarUsuario(String usuario, String password) 
    {
        
        
        Trabajador t =buscarTrabajadorLog(usuario,password);
    
      return us;
    }*/
    
    public static void cargarPartesParser()
    {
        
        ArrayList <Parte> partes=ParteBD.obtenerListaIdsPartes();
        
        ArrayList <Parte> partes2=new ArrayList<>();
        
        for(Parte p: partes)
        {
            
            p=ParteBD.visualizar_datos_parteId(p);
            
            partes2.add(p);
            
        }
        
        
        try 
        {
            Parser dpe = new Parser(partes2);
            
            dpe.runParser();
        } 
        catch (IOException ex) 
        {
            
        }
        
    }

    public static void insertarTrabjador(String dni,String nombre,String apellidouno,String apellidodos,String calle,
            String portal,String piso,String mano,String telefempre,String telefperso,Double salario,Date fechaNac,
                    String nombreCentro, int Categoria) 
    {
         Centro c;
        c=new Centro(0, nombreCentro,null,0,null,null,null,null);
        c=CentroBD.visualizarCentroNombre(c);
        Trabajador t= new Trabajador(0, dni, nombre, apellidouno, apellidodos, calle, portal, piso, mano, telefempre, telefperso,
                salario, fechaNac,new Centro(c.getIdCentro(),null,null,0,null,null,null,null),
                null,null, new Categoria(Categoria,null,null));
        TrabajadorBD.insertarTrabajador(t);
    }
    
    public static void abrirVentanaAdmin()
    {
        

        vpA=new VentanaPrincipalAdmin();
        vpA.setVisible(true);
        
        
    }
    
    public static void abrirVentanaLogistic()
    {
        
        vpl=new VentanaPrincipalLogistica();
        vpl.setVisible(true);
    }

    public static Parte buscarParte(Date fecha)
    {
        
        Parte p=new Parte(0, fecha, 0, 0,null, 0, 0, 0, 0, 0, 0,null,null);
        p=ParteBD.visualizar_datos_parte(p);
        ArrayList<Albaran> albaranes=new ArrayList<>();
        Albaran al2;
        for(Albaran al:albaranes)
        {
            al=new Albaran(0, 0, 0, null, p);
            p.setAlbaranes(al);
        }
        
        
        return p;
    }

    public static void insertarParte(Date fecha,double kmInicio,double kmFin,String estado,double gasoil,double peaje,
    double dietas,double otros,double incidencias,double hExtra, String dni, int codVehiculo)
    {
        Vehiculo v=new Vehiculo(0, codVehiculo, null, null);
        v=VehiculoBD.visualizar_datos_vehiculo_cod(v);
        Trabajador t=new Trabajador(0, dni, null, null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        t=TrabajadorBD.visualizar_datos_trabajador(t);
        Parte p=new Parte(0, fecha, 0, 0, estado, 0, 0, 0, 0, 0, 0,
                new Trabajador(t.getIdTrab(),null ,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null), 
                new Vehiculo(v.getIdVehiculo(),0,null,null));
        ParteBD.insertarParte(p);
    }

    public static void cerrarParte(Date fecha,String estado) 
    {
        Parte p = new Parte(0, fecha, 0, 0, null, 0, 0, 0, 0, 0, 0, null, null);
        p=ParteBD.visualizar_datos_parte(p);
        p.setEstado(estado);
        ParteBD.actualizarPartes(p);
        Aviso av=new Aviso(0, estado, estado, estado, new Trabajador(p.getT().getIdTrab(), 
                null,null,null,null,null,null,null,null,null,null,0.0,null,null,null,null,null));
        AvisoBD.borrarAviso(av);
    }

    public static Centro buscarCentro(String NombreC) 
    {
        Centro c=new Centro(0, NombreC,null, 0,null,null,null,null);
         c=CentroBD.visualizarCentroNombre(c);
         Trabajador t=new Trabajador(0,null,null,null,null,null,null,null,null,null,null,
                 0.0,null, c,null,null,null);
        t= TrabajadorBD.visualizar_datos_trabajador(t);
        c.setTrabajadores(t);
         
        
        return c;
    }

    public static void actualizarCentro(String nombre,String calle,int numero,String cp,String ciudad,String provincia ,
            String telefono) 
    {
        Centro c=new Centro(0, nombre, calle,numero, cp, ciudad, provincia, telefono);
        
        
        CentroBD.modificar(c);
    }

    

    public static void insertarCentro(String nombre,String calle,int numero,String cp,String ciudad,String provincia ,
            String telefono) 
    {
        Centro c=new Centro(0, nombre, calle,numero, cp, ciudad, provincia, telefono);
       CentroBD.insertarCentro(c);
    }

    public static Albaran buscarAlbaran(double hSalida,double hLlegada) 
    {
        Albaran al=new Albaran(0, hSalida, hLlegada,null,null);
        al=AlbaranBD.visualizar_datos_albaran(al);
        return al;
    }

    public static void actualizarAlbaran(double hsalida,double hllegada, int parte,int vehiculo) 
    {
        Albaran al=buscarAlbaran(hsalida,hllegada);
        Vehiculo v=new Vehiculo(0, vehiculo,null,null);
        v=VehiculoBD.visualizar_datos_vehiculo_cod(v);
        al=new Albaran( al.getIdAlbaran(),hsalida, hllegada, 
               new Vehiculo(v.getIdVehiculo(),0,null,null),
                new Parte(parte,null,0.0,0.0,null,0.0,0.0,0.0,0.0,0.0,0.0,null,null));
        AlbaranBD.actualizarAlbaranes(al);
    }

    public static void insertarAlbaran(Double hSalida, Double hLlegada, int vehiculo, int parte) 
    {
        Albaran al;
        Vehiculo v=new Vehiculo(0, vehiculo,null,null);
        v=VehiculoBD.visualizar_datos_vehiculo_cod(v);
        al=new Albaran( 0,hSalida, hLlegada, 
               new Vehiculo(v.getIdVehiculo(),0,null,null),
                new Parte(parte,null,0.0,0.0,null,0.0,0.0,0.0,0.0,0.0,0.0,null,null));
        AlbaranBD.insertarAlbaran(al);
    }

    public static void insertarUsuraio(String usuario, String contraseña, String dni) 
    {
        Trabajador t=new Trabajador(0, dni,null,null,null,null,null,null,null,null,null,0.0,null,null,null,null,null);
         t=TrabajadorBD.visualizar_datos_trabajador(t);
        Usuario u=new Usuario(0, usuario, contraseña,new Trabajador(t.getIdTrab(),null,null,null,null,null,null,null,null,null,
                null,0.0,null,null,null,null,null));
        UsuarioBD.insertarUsuario(u);
    }

    public static void actualizarUsuario(String usuario, String contraseña,String dni)
    {
        Trabajador t=new Trabajador(0, dni,null,null,null,null,null,null,null,null,null,0.0,null,null,null,null,null);
         t=TrabajadorBD.visualizar_datos_trabajador(t);
        Usuario u=new Usuario(0, usuario, contraseña,new Trabajador(t.getIdTrab(),null,null,null,null,null,null,null,null,null,
                null,0.0,null,null,null,null,null));
        UsuarioBD.actualizarUsuario(u);
    }

    public static void borrarUsuario(String usuario)
    {
        Usuario us;
        us= new Usuario(0, usuario,null,null);
        UsuarioBD.borrarUsuario(us);
    }

    public static void borrarCentro(String nombre)
    {
        Centro c=new Centro(0, nombre,null, 0,null,null,null,null);
        CentroBD.borrarCentro(c);
    }

    public static void borrarPerfil(String dni) 
    {
        Trabajador t=new Trabajador(0, dni,null,null,null,null,null,null,null,null,null,0.0,null,null,null,null,null);
        TrabajadorBD.borrarTrabajador(t);
    }

    public static Aviso buscarAviso(String codAviso) 
    {
        Aviso av=new Aviso(0, codAviso, null, null,null);
        
         av = AvisoBD.visualizar_datos_aviso_cod(av);
        return av;
    }

    public static void actualizarAviso(String codAviso, String nombre, String descripcion, String dni)
    {
        Trabajador t;
         Aviso  av=new Aviso(0, codAviso,null,null,null);
         av=AvisoBD.visualizar_datos_aviso_cod(av);
         av=new Aviso(av.getIdAviso(), codAviso, nombre, descripcion, null);
          AvisoBD.actualizarAviso(av);
          t=new Trabajador(0, dni,null,null,null,null,null,null,null
                 ,null, null,null,null,null,null,null,null);
          t=TrabajadorBD.visualizar_datos_trabajador(t);
          
          t=new Trabajador(t.getIdTrab(), dni,t.getNombre(),t.getApellidouno(),t.getApellidodos(),t.getCalle(),t.getPortal(),
                  t.getPiso(),t.getMano(),t.getTelefempre(),t.getTelefperso(),t.getSalario(),t.getFechaNac(),
                  new Centro(t.getC().getIdCentro(),null,null,0,null,null,null,null),
                  new Aviso(av.getIdAviso(),null,null,null,null),
                  new Usuario(t.getU().getIdUsuario(),null,null,null),
                  new Categoria(t.getCat().getIdTipo(),null,null));

          TrabajadorBD.actualizarTrabajador(t);

    }

    public static void insertarAviso(String codAviso, String nombre, String descripcion, 
            String dni) 
    {
        Trabajador t;
         Aviso  av1 =new Aviso(0, codAviso,null,null,null);
         av1 =AvisoBD.visualizar_datos_aviso_cod(av1 );
         av1 =new Aviso(av1 .getIdAviso(), codAviso, nombre, descripcion, null);
          AvisoBD.actualizarAviso(av1 );
          t=new Trabajador(0, dni,null,null,null,null,null,null,null
                 ,null, null,null,null,null,null,null,null);
          t=TrabajadorBD.visualizar_datos_trabajador(t);
          
          t=new Trabajador(t.getIdTrab(), dni,t.getNombre(),t.getApellidouno(),t.getApellidodos(),t.getCalle(),t.getPortal(),
                  t.getPiso(),t.getMano(),t.getTelefempre(),t.getTelefperso(),t.getSalario(),t.getFechaNac(),
                  new Centro(t.getC().getIdCentro(),null,null,0,null,null,null,null),
                  new Aviso(av1 .getIdAviso(),null,null,null,null),
                  new Usuario(t.getU().getIdUsuario(),null,null,null),
                  new Categoria(t.getCat().getIdTipo(),null,null));
  
   
          TrabajadorBD.actualizarTrabajador(t);
        
    }

    public static void borrarAviso(String codAviso,String dni)
    {
        Trabajador t;
         Aviso  av=new Aviso(0, codAviso,null,null,null);
         
         AvisoBD.borrarAviso(av);
         
          t=new Trabajador(0, dni,null,null,null,null,null,null,null
                 ,null, null,null,null,null,null,null,null);
          t=TrabajadorBD.visualizar_datos_trabajador(t);
          
          t=new Trabajador(t.getIdTrab(), dni,t.getNombre(),t.getApellidouno(),t.getApellidodos(),t.getCalle(),t.getPortal(),
                  t.getPiso(),t.getMano(),t.getTelefempre(),t.getTelefperso(),t.getSalario(),t.getFechaNac(),
                  new Centro(t.getC().getIdCentro(),null,null,0,null,null,null,null),
                  new Aviso(0,null,null,null,null),
                  new Usuario(t.getU().getIdUsuario(),null,null,null),
                  new Categoria(t.getCat().getIdTipo(),null,null));
  
   
          TrabajadorBD.actualizarTrabajador(t);
    }

    public static void abrirVentanaCentro() 
    {
        
        ac=new VentanaCentro();
        ac.setVisible(true);
    }

    public static void volverAtras()
    {
        vpA =new VentanaPrincipalAdmin();
        vpA.setVisible(true);
    }

    public static void abrirVentanaPerfil()
    {
        
        vpil=new VentanaPerfil();
        vpil.setVisible(true);
    }

    public static void abrirVentanaVehiculo() 
    {
        
        vvh= new VentanaVehiculo();
        vvh.setVisible(true);

    }

    public static void abrirVentanaTramitesLogin() 
    {
        
        dc = new VentanaInsertarUsuario();
        dc.setVisible(true);
    }

    public static void abrirVentanaAviso() 
    {
        
        av=new VentanaAviso();
        av.setVisible(true);
    }

    public static Vehiculo buscarVehiculo(int codigo)
    {
        Vehiculo v;
        v=new Vehiculo(0, codigo,null,null);
        v=VehiculoBD.visualizar_datos_vehiculo_cod(v);
        Parte p = new Parte(0,null,0.0,0.0,null,0.0,0.0,0.0,0.0,0.0,0.0,null,null);
        return v;
    }

    public static void actualizarVehiculo(int codigo,String marca,String matricula) 
    {
        Vehiculo v=new Vehiculo(0, codigo, matricula, marca);
        VehiculoBD.actualizarVehiculo(v);
    }
    
    public static void insertarVehiculo(int codigo,String marca,String matricula) 
    {
        Vehiculo v=new Vehiculo(0, codigo, matricula, marca);
        VehiculoBD.insetarVehiculo(v);
    }

    public static void borrarVehiculo(int codVehiculo)
    {
        Vehiculo v=new Vehiculo(0, codVehiculo,null,null);
        VehiculoBD.borrarVehiculo(v);
    }

    public static void abrirVentanaParte() 
    {
        
        vp=new VentanaParte();
        vp.setVisible(true);
    }

    public static void abrirVentanaAlbaran()
    {
        
        al=new VentanaAlbaran();
        al.setVisible(true);
    }

    public static void volverPartes() 
    {
        al.dispose();
        vp.setVisible(true);
        
        
    }

    public static void abrirAvisos() 
    {
        
        av =new VentanaAviso();
        av.setVisible(true);
    }

    

    
    
   
}
