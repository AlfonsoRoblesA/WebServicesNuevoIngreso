/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author ponch
 */
public class Documentacion {
    
    private Integer idDocumentacion;
    private String identificacion;
    private String actaNacimiento;
    private String certificadoEstudios;
    private String comprobanteDomicilio;
    private String fotografia;
    private Integer idAlumno;

    public Documentacion() {
    }

    public Documentacion(Integer idDocumentacion, String identificacion, String actaNacimiento, String certificadoEstudios, String comprobanteDomicilio, String fotografia, Integer idAlumno) {
        this.idDocumentacion = idDocumentacion;
        this.identificacion = identificacion;
        this.actaNacimiento = actaNacimiento;
        this.certificadoEstudios = certificadoEstudios;
        this.comprobanteDomicilio = comprobanteDomicilio;
        this.fotografia = fotografia;
        this.idAlumno = idAlumno;
    }

    public Integer getIdDocumentacion() {
        return idDocumentacion;
    }

    public void setIdDocumentacion(Integer idDocumentacion) {
        this.idDocumentacion = idDocumentacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    public String getCertificadoEstudios() {
        return certificadoEstudios;
    }

    public void setCertificadoEstudios(String certificadoEstudios) {
        this.certificadoEstudios = certificadoEstudios;
    }

    public String getComprobanteDomicilio() {
        return comprobanteDomicilio;
    }

    public void setComprobanteDomicilio(String comprobanteDomicilio) {
        this.comprobanteDomicilio = comprobanteDomicilio;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    
}
