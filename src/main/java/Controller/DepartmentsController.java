package Controller;

import Model.Departments;
import Repository.DepartmentsRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "departments", value = "/departments")
public class DepartmentsController extends HttpServlet {
    DepartmentsRepository departmentsRepository = new DepartmentsRepository();
    List<Departments> listDepartments = new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("/departments")) {
            req.setAttribute("listDepartments", listDepartments);
            req.getRequestDispatcher("/view.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
