/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Diego
 */
public class empleadoActionForm extends org.apache.struts.action.ActionForm {
        
        private int idx;
        private String dnix;
        private String nombresx;
        private String apepatx;
        private String apematx;
        private String telefonox;
        private String emailx;
        private String ubigeox;
        private String fech_nacx;
        private int documentox;
        private int personax;
        private String nivel_estudiox;
        private float sueldobasex;
        private int hijosx;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getDnix() {
        return dnix;
    }

    public void setDnix(String dnix) {
        this.dnix = dnix;
    }

    public String getNombresx() {
        return nombresx;
    }

    public void setNombresx(String nombresx) {
        this.nombresx = nombresx;
    }

    public String getApepatx() {
        return apepatx;
    }

    public void setApepatx(String apepatx) {
        this.apepatx = apepatx;
    }

    public String getApematx() {
        return apematx;
    }

    public void setApematx(String apematx) {
        this.apematx = apematx;
    }

    public String getTelefonox() {
        return telefonox;
    }

    public void setTelefonox(String telefonox) {
        this.telefonox = telefonox;
    }

    public String getEmailx() {
        return emailx;
    }

    public void setEmailx(String emailx) {
        this.emailx = emailx;
    }

    public String getUbigeox() {
        return ubigeox;
    }

    public void setUbigeox(String ubigeox) {
        this.ubigeox = ubigeox;
    }

    public String getFech_nacx() {
        return fech_nacx;
    }

    public void setFech_nacx(String fech_nacx) {
        this.fech_nacx = fech_nacx;
    }

    public int getDocumentox() {
        return documentox;
    }

    public void setDocumentox(int documentox) {
        this.documentox = documentox;
    }

    public int getPersonax() {
        return personax;
    }

    public void setPersonax(int personax) {
        this.personax = personax;
    }

    public String getNivel_estudiox() {
        return nivel_estudiox;
    }

    public void setNivel_estudiox(String nivel_estudiox) {
        this.nivel_estudiox = nivel_estudiox;
    }

    public float getSueldobasex() {
        return sueldobasex;
    }

    public void setSueldobasex(float sueldobasex) {
        this.sueldobasex = sueldobasex;
    }

    public int getHijosx() {
        return hijosx;
    }

    public void setHijosx(int hijosx) {
        this.hijosx = hijosx;
    }
    
    /*
     *
     */
    
    public empleadoActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        
        String nombrevalidar = "[a-zA-Z ]";
        ActionErrors errors = new ActionErrors();
        
        if (getDnix().equals("")){
            errors.add("dnivacio", new ActionMessage("empleado.dnivacio"));    
        }else {
            if (getDnix().length() != 8){
            errors.add("dninoval", new ActionMessage("empleado.dninovalido"));
            }
        }

        if (getNombresx().equals("")){
            errors.add("nombrevacio", new ActionMessage("empleado.nombrevacio"));
        }else {
            if(Pattern.matches(nombrevalidar,getNombresx()) != true ){
                System.out.println(Pattern.matches(nombrevalidar,getNombresx()));
                errors.add("nombrenoalfabetico", new ActionMessage("empleado.nombrenoalfabetico"));
            }
        }
        
        if (getApepatx().equals("")){
            errors.add("apepatvacio", new ActionMessage("empleado.apellidopatvacio"));
        }else {
            if(getApepatx().contains("[a-zA-Z ]") == false){
            errors.add("apepatnoalfa", new ActionMessage("empleado.apellidopatnoalfabetico"));
            }
        }

        if (getApematx().equals("")){
            errors.add("apematvacio", new ActionMessage("empleado.apellidomatvacio"));
        }else {
            if(getApematx().contains("[a-zA-Z ]") == false){
            errors.add("apematnoalfa", new ActionMessage("empleado.apellidomatnoalfabetico"));
            }
        }
        
        if (getFech_nacx().equals("")){
            errors.add("fechavacia", new ActionMessage("empleado.fechanacvacia"));
        }
        if (getEmailx().equals("")){
            errors.add("emailvacio", new ActionMessage("empleado.emailvacio"));
        }else {
            if (getEmailx().contains("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$") == false){
            errors.add("emailincorrecto", new ActionMessage("empleado.emailsinformato"));
            }
        }
        
        return errors;
    }
}
