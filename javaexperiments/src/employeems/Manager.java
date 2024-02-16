package employeems;

import java.time.LocalDateTime;

public class Manager extends Employee {
    private String handlingProject;
    private int mangingEmployeesCount;

    private String clientInterviewDate;

    public Manager(int id, String name, int age, String project, int employeesCount) {
        super(id, name, age);
        this.handlingProject = project;
        this.mangingEmployeesCount = employeesCount;
    }

    public void setHandlingProject(String project) {
        this.handlingProject = project;
    }

    public String getHandlingProject() {
        return handlingProject;
    }

    public String getClientInterviewDate() {
        return clientInterviewDate;
    }

    public void incrementManagedEmployees() {
        mangingEmployeesCount++;
    }

    public int getMangingEmployeesCount() {
        return mangingEmployeesCount;
    }


    public void setupClientInterviewToday() {
        clientInterviewDate = "2024-02-16";
    }

}
