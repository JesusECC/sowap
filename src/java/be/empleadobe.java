/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be;

/**
 *
 * @author Diego
 */
public class empleadobe {
    private int id;
    private String dni;
    private String nombres;
    private String apepat;
    private String apemat;
    private String telefono;
    private String email;
    private String ubigeo;
    private String fech_nac;
    private int documento;
    private int persona;
    private String nivel_estudio;
    private float sueldobase;
    private int hijos;

    public empleadobe() {
    }

    public empleadobe(int id, String dni, String nombres, String apepat, String apemat, String telefono, String email, String ubigeo, String fech_nac, int documento, int persona, String nivel_estudio, float sueldobase, int hijos) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apepat = apepat;
        this.apemat = apemat;
        this.telefono = telefono;
        this.email = email;
        this.ubigeo = ubigeo;
        this.fech_nac = fech_nac;
        this.documento = documento;
        this.persona = persona;
        this.nivel_estudio = nivel_estudio;
        this.sueldobase = sueldobase;
        this.hijos = hijos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getFech_nac() {
        return fech_nac;
    }

    public void setFech_nac(String fech_nac) {
        this.fech_nac = fech_nac;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }
}