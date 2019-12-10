/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.io.IOException;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Alumno;
import pojos.Documentacion;
import pojos.Mensaje;

/**
 * REST Web Service
 *
 * @author ponch
 */
@Path("alumno")
public class AlumnoWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AlumnoWS
     */
    public AlumnoWS() {
    }

    @Path("loginAlumno")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alumno> loginUsuario(
            @FormParam("matricula") String matricula,
            @FormParam("curp") String curp){
        List<Alumno> list = null;
        SqlSession conn = null;
        Alumno usu = new Alumno();
        usu.setMatricula(matricula);
        usu.setCurp(curp);
        System.out.println("hola jaja");
        System.out.println("matricula: "+matricula);
        System.out.println("curp: "+curp);
        
        try {
            conn = MyBatisUtil.getSession();
            list = conn.selectList("Alumno.login", usu);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
    
    @Path("getAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alumno> getAll(){
        List<Alumno> list = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtil.getSession();
            list = conn.selectList("Alumno.getAll");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    @Path("registroDocumentacion")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Mensaje registrarDocumentacion(
            @FormParam("identificacion") String identificacion,
            @FormParam("actaNacimiento") String actaNacimiento,
            @FormParam("cetificadoEstudios") String certificadoEstudios,
            @FormParam("comprobanteDomicilio") String comprobanteDomicilio,
            @FormParam("fotografia") String fotografia,
            @FormParam("idAlumno") Integer idAlumno) {
        Documentacion doc = new Documentacion();
        doc.setIdentificacion(identificacion);
        doc.setActaNacimiento(actaNacimiento);
        doc.setCertificadoEstudios(certificadoEstudios);
        doc.setComprobanteDomicilio(comprobanteDomicilio);
        doc.setFotografia(fotografia);
        doc.setIdAlumno(idAlumno);
        Mensaje mensaje;
        try (SqlSession conn = MyBatisUtil.getSession()) {
            conn.insert("Documentacion.guardarDocumentos", doc);
            conn.commit();
            mensaje = new Mensaje(false,"Se han guardado correctamente los documentos");
        } catch (IOException ex) {
            mensaje = new Mensaje(true,ex.getMessage());
        }
        return mensaje;
    }
}
