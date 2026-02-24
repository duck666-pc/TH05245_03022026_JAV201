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
        return session.createQuery("SELECT dh FROM Employees dh").getResultList();
    }
    public Employees getById(Integer id){
        return session.find(Employees.class, id);
    }
}
