package service;
import domain.Device;
import domain.Employee;
import domain.Developer;
import domain.Tester;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    ArrayList<Employee> DS = new ArrayList<>();
    Device ad = new Device("2","pro");
    Employee a = new Developer("2","huy",19,10,ad,13);
    Device bd = new Device("1","vip");
    Employee b = new Developer("1","huyvip2",15,11,bd,12);
    Device cd = new Device("1","vip");
    Employee c = new Developer("3","huyvip2",16,13,cd,2);
    Employee d = new Developer("2","huyvip6",16,13,cd,2);
    Employee e = new Developer("1","huyvip5",15,11,bd,12);
    public List<Employee> getAllEmployees(){
        List<Employee> a = new ArrayList<>();
        for(Employee e : DS) {
            a.add(e);
        }
        return a;
    }
    public Employee getEmployeeById(String id){
        for(Employee e : DS) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
    public List<Employee> getEmployeeByName(String name){
       List<Employee> a = new ArrayList<>();
        for(Employee e : DS){
            if(e.getName().equalsIgnoreCase(name)){
                a.add(e);
            }
        }
        return a;
    }
}
