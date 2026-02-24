package Repository;

import Model.Departments;
import Util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class DepartmentsRepository {
    private Session session = null;
    public DepartmentsRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }
    public List<Departments> getAll() {
        return session.createQuery("SELECT dh FROM Departments dh").getResultList();
    }
    public Departments getById(Integer id){
        return session.find(Departments.class, id);
    }
}
