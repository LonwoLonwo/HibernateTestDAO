package domain;

import buisnessLogic.HibernateUtil;
import entity.Address;
import entity.Employee;
import entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import service.AddressService;
import service.EmployeeService;
import service.ProjectService;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Domain {

    public static void main(String[] args) throws SQLException {
        /*Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();*/

        /*StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();*/

        AddressService addressService = new AddressService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();


        Address address = new Address();
        address.setId(2L);
        address.setCountry("Marvel");
        address.setCity("New-York");
        address.setStreet("Time Square 2");
        address.setPostCode("123456");

        Project project = new Project();
        project.setTitle("Midtown High School of Science& Technology");

        Employee employee = new Employee();
        employee.setFirstName("Peter");
        employee.setLastName("Parker");

        Calendar calendar = Calendar.getInstance();
        calendar.set(2001, Calendar.AUGUST, 10);

        employee.setBirthday(new java.sql.Date(calendar.getTime().getTime()));
        employee.setAddress(address);

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
        project.setEmployees(employees);

        Set<Project> projects = new HashSet<Project>();
        projects.add(project);
        employee.setProjects(projects);

        addressService.getById(1L);

        HibernateUtil.shutdown();
    }
}
