package pro.sky.springInitializrhw.service;

import pro.sky.springInitializrhw.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add (String firstName, String lastName);

    Employee remove (String firstName, String lastName) throws EnumConstantNotPresentException;
    Employee find (String firstName, String lastName);

    Collection<Employee> findAll();
}
