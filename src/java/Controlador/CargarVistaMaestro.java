/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Core.business.IObservado;
import Core.business.IObservador;
import Core.business.MaestroObservado;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JuanEAB
 */
@WebServlet(name = "CargarVistaMaestro", urlPatterns = {"/CargarVistaMaestro"})
public class CargarVistaMaestro extends HttpServlet{

    ArrayList<String[]> mensajes = new ArrayList<>();
    ArrayList<String[]> alumnos = new ArrayList<>();
    IObservado maestroObservado = new MaestroObservado();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CargarIndex</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CargarIndex at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        RequestDispatcher rd;
        request.getSession().setAttribute("mensajes", mensajes);
        request.getSession().setAttribute("alumnos", alumnos);
        request.getSession().setAttribute("observado", maestroObservado);
        rd = request.getRequestDispatcher("/vista/VistaMaestro.jsp");
        rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd;
        if (request.getParameter("enviar").equals("Enviar mensaje")) {
            String[] mensaje = new String[2];
            mensaje[0] = request.getParameter("mensaje");
            mensaje[1] = request.getParameter("time");
            mensajes.add(mensaje);
            //request.setAttribute("mensajes", mensajes);
        }
        else{
            String[] alumno = new String[3];
            alumno[0] = request.getParameter("nombre_alumno");
            alumno[1] = request.getParameter("password");
            alumno[2] = request.getParameter("time_alumno");
            alumnos.add(alumno);
        }
        rd = request.getRequestDispatcher("/vista/VistaMaestro.jsp");
        rd.forward(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}