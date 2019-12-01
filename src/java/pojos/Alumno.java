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
public class Alumno {
    private Integer idAlumno;
    private String nombre;
    private String matricula;
    private String curp;

    public Alumno() {
    }

    public Alumno(Integer idAlumno, String nombre, String matricula, String curp) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.matricula = matricula;
        this.curp = curp;
    }

    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
}
