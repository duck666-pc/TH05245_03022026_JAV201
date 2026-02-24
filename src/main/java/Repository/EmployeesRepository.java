package Repository;

import Model.Employees;
import Util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class EmployeesRepository {
    private Session session = null;
    public EmployeesRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }
    public List<Employees> getAll() {
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            return session.createQuery("FROM Employees", Employees.class).getResultList();
        }
    }

    public Employees getById(Integer id) {
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            return session.find(Employees.class, id);
        }
    }
}
