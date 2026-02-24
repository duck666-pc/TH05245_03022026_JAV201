package Repository;

import Model.Departments;
import Util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class DepartmentsRepository {

    public List<Departments> getAll() {
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            return session.createQuery("FROM Departments", Departments.class).getResultList();
        }
    }

    public Departments getById(Integer id) {
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            return session.find(Departments.class, id);
        }
    }
}
