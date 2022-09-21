import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static Registry WorkersRegistry = null;
    private List<Employee> workers = new ArrayList<>();

    public Registry(){}

    public static Registry getRegistry() {
        if (WorkersRegistry == null) {
            WorkersRegistry = new Registry();
        }
        return WorkersRegistry;
    }

    public void addWorker(Employee emp) throws EmployeeInRegistryException {
        if (workers.contains(emp)) {
            throw new EmployeeInRegistryException(
                    "Робітник " + emp.getName() + " " + emp.getSurname() + " вже є в реєстрі"
            );
        }
        workers.add(emp);
    }

    public void printList() {
        for(Employee emp: workers){
            System.out.println(emp);
        }
    }

}
