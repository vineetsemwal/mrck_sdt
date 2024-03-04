package constants;

public class Application {
    private static Application application=new Application();

    private int port;
    private String applicationName;
    private Application(){}


    public static Application getInstance(){
        return application;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
}
