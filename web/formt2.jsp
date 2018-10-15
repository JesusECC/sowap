<%-- 
    Document   : formt2
    Created on : 14/10/2018, 10:41:52 PM
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>  
    </head>
    
    <body>
        <h2><bean:message key="empleado.banner"/></h2>
        <html:form action="/empleado">
            <table>
                <tr>
                    <td><bean:message key="empleado.dni"/></td>
                    <td><html:text property="dnix"/></td>
                   <!-- <td>html:select value="0"/></td>-->
                   <td><html:errors property="dnivacio"/>
                       <html:errors property="dninoval"/>
                   </td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.nombre"/></td>
                    <td><html:text property="nombresx"/></td>
                    <td><html:errors property="nombrevacio"/>
                        <html:errors property="nombrenoalfabetico"/>
                    </td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.apepat"/></td>
                    <td><html:text property="apepatx"/></td>
                    <td><html:errors property="apepatvacio"/>
                        <html:errors property="apepatnoalfa"/>
                    </td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.apemat"/></td>
                    <td><html:text property="apematx"/></td>
                    <td><html:errors property="apematvacio"/>
                        <html:errors property="apematnoalfa"/>
                    </td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.fechanac"/></td>
                    <td><html:text property="fech_nacx"/></td>
                    <td><html:errors property="fechavacia"/></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.email"/></td>
                    <td><html:text property="emailx"/></td>
                    <td><html:errors property="emailvacio"/>
                        <html:errors property="emailincorrecto"/>
                    </td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.ubigeo"/></td>
                    <td><html:text property="ubigeox"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.domicilio"/></td>
                    <td><!--html:text property="domicilio"/>--></td>
                    <td></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.numerotel"/></td>
                    <td><html:text property="telefonox"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.nivelestu"/></td>
                    <td><html:text property="nivel_estudiox"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.sueldobase"/></td>
                    <td><html:text property="sueldobasex"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><bean:message key="empleado.hijos"/></td>
                    <td><html:text property="hijosx"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td><html:submit value="Registrar"/></td>
                </tr>
                
            </table>    
        </html:form>
    </body>
</html>
