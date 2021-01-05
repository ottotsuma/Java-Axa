package jp.co.axa.apidemo.service;


import java.util.List;

import jp.co.axa.apidemo.entity.Employee;


public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}