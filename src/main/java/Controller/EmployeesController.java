package Controller;
import Model.Employees;
import Repository.EmployeesRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "employees", value = "/employees")
public class EmployeesController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("/employees")) {
            EmployeesRepository employeesRepository = new EmployeesRepository();
            List<Employees> listEmployees = employeesRepository.getAll();
            req.setAttribute("listEmployees", listEmployees);
            req.getRequestDispatcher("/view-Employees.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
