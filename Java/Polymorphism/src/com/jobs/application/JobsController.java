package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

    private EmployeeRepository repository = new EmployeeRepository();

    public JobsController() {

    }

    public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
        repository.addMember(boss);
    }

    public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee employee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
        repository.addMember(employee);
    }

    public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
        Employee maganer = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
        repository.addMember(maganer);
    }


    public void payAllEmployeers() {
        for (AbsStaffMember employee : repository.getAllMembers()) {
            employee.pay();
        }

    }

    public String getAllEmployees() {
        String employees = "\n";
        for (AbsStaffMember employee : repository.getAllMembers()) {
            employees += employee.getName() + " Salary: " + employee.getTotalPaid() + "\n";
        }
        return employees;
    }

    public void createVolunteer(String name, String address, String phone) throws Exception {
        Volunteer volunteer = new Volunteer(name, address, phone);
        repository.addMember(volunteer);
    }


}
