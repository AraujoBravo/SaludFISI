/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.administrador;

import com.mycompany.dao.Dao;
import com.mycompany.dao.EmployeeDao;
import com.mycompany.dao.MaterialDao;
import com.mycompany.dao.TaskDao;
import com.mycompany.dao.UsuarioDao;
import com.mycompany.models.Employee;
import com.mycompany.models.Material;
import com.mycompany.models.Task;
import com.mycompany.models.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JuanEAB
 */
@WebServlet(name = "controlador_crear_tarea", urlPatterns = {"/controlador_crear_tarea"})
public class controlador_crear_tarea extends HttpServlet {

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
            out.println("<title>Servlet controlador_crear_tarea</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador_crear_tarea at " + request.getContextPath() + "</h1>");
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
        RequestDispatcher rd;
        Dao materialDao = new MaterialDao();
        List<Material> lista_materiales = materialDao.getAll();

        UsuarioDao usuarioDao = new UsuarioDao();
        List<Usuario> lista_empleados = usuarioDao.getAll();

        request.setAttribute("lista_materiales", lista_materiales);
        request.setAttribute("lista_empleados", lista_empleados);
        rd = request.getRequestDispatcher("/vista/administrador/crear_tarea.jsp");
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
        String nombre = request.getParameter("nombre");
        String descripcion  = request.getParameter("descripcion");
        Date fecha_inicio  = Date.valueOf(request.getParameter("fecha_inicio"));
        Date fecha_fin = Date.valueOf(request.getParameter("fecha_fin"));
        Integer id_material = 0;
        if(request.getParameter("material_id")!=null)
            id_material = Integer.valueOf(String.valueOf(request.getParameter("material_id")));
        Integer id_user = Integer.valueOf(String.valueOf(request.getParameter("empleado_user_id")));
        
        
        UsuarioDao userDao = new UsuarioDao();
        int id_empleado = userDao.getEmpleado(id_user);
        
        Dao tareaDao = new TaskDao();
        Task tarea = new Task();
        tarea.setTitleTask(nombre);
        tarea.setDescriptionTask(descripcion);
        tarea.setIdEmployee(id_empleado);
        tarea.setDate_start(fecha_inicio);
        tarea.setDate_end(fecha_fin);
        tarea.setEstado("Asignado");
        tareaDao.save(tarea);
        
        List<Task> lista_tareas = tareaDao.getAll();
        request.setAttribute("lista_tareas", lista_tareas);
        rd = request.getRequestDispatcher("/vista/administrador/lista_tareas.jsp");
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
