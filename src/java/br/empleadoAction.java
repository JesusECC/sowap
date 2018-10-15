/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import be.empleadobe;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Diego
 */

public class empleadoAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */

    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        empleadoActionForm emp = (empleadoActionForm) form;
        
        empleadobe e = new empleadobe();
        
        e.setDni(emp.getDnix());
        e.setNombres(emp.getNombresx());
        e.setApepat(emp.getApepatx());
        e.setApemat(emp.getApematx());
        e.setTelefono(emp.getTelefonox());
        e.setUbigeo(emp.getUbigeox());
        e.setEmail(emp.getEmailx());
        e.setFech_nac(emp.getEmailx());
        e.setDocumento(emp.getDocumentox());
        e.setPersona(emp.getPersonax());
        e.setNivel_estudio(emp.getNivel_estudiox());
        e.setHijos(emp.getHijosx());
        e.setSueldobase(emp.getSueldobasex());
        
        ActionForward af = new ActionForward();
        af = mapping.findForward("welcome");
        
        /*if(){
            
        }*/
        return mapping.findForward(SUCCESS);
    }
}
