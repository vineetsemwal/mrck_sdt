package employeems;

public class EmployeeDataAccess implements IEmployeeDataAccess {
    private Employee store[] = new Employee[10];

    private int index;

    @Override
    public Employee[] getAllEmployees() {
        return store;
    }

    private int generatedId;

    int newId() {
        return ++generatedId;
    }


    @Override
    public Manager registerManager(String name, int age, String project, int empCount)
            throws InvalidEmployeeNameException, InvalidAgeException,
            InvalidProjectException,InvalidEmployeesCountException {
        validateName(name);
        validateAge(age);
        validateProject(project);
         validateEmployeesCount(empCount);
        int id = newId();
        Manager manager = new Manager(id, name, age, project, empCount);
        store[index] = manager;
        index++;
        return manager;
    }

    @Override
    public Developer registerDeveloper(String name, int age, String languages[], String tools[])
            throws InvalidEmployeeNameException, InvalidAgeException,
            InvalidLanguagesException, InvalidToolsException {
        validateName(name);
        validateAge(age);
        validateLanguages(languages);
        validateTools(tools);
        int id = newId();
        Developer developer = new Developer(id, name, age, languages, tools);
        store[index] = developer;
        index++;
        return developer;
    }

    @Override
    public Employee findById(int id)throws InvalidEmployeeIDException,EmployeeNotFoundException {
        if (id < 1) {
           throw new InvalidEmployeeIDException("id is invalid");
        }
        for (int i = 0; i < store.length; i++) {
            Employee iterated = store[i];
            if (iterated.getId() == id) {
                return iterated;
            }
        }
        throw new EmployeeNotFoundException("employee not found");
    }

    void validateLanguages(String languages[]) throws InvalidLanguagesException {
        if (languages == null || languages.length < 1) {
            throw new InvalidLanguagesException("invalid languages");
        }


    }

    void validateTools(String tools[]) throws InvalidToolsException {
        if (tools == null || tools.length < 1) {
            throw new InvalidToolsException("invalid languages");
        }

    }

    void validateProject(String project) throws InvalidProjectException {
        if (project == null || project.isBlank()) {
            throw new InvalidProjectException("invalidInput");
        }
    }


    void validateAge(int age) throws InvalidAgeException {
        if (age < 21 || age > 60) {
            throw new InvalidAgeException("age is invalid");
        }
    }

    void validateName(String name) throws InvalidEmployeeNameException {
        if (name == null || name.isBlank()) {
            throw new InvalidEmployeeNameException("invalidInput");
        }
    }
    void validateEmployeesCount(int employeesCount)
            throws InvalidEmployeesCountException{
        if (employeesCount<0){
            throw new InvalidEmployeesCountException("managed employees count can't be negative");
        }
    }


}
