package constants;

public class ApplicationMain {
    public static void main(String[] args) {
        Application application1=Application.getInstance();
        application1.setApplicationName("chatapp");
        application1.setPort(80);
        System.out.println("application1 ="+application1.getPort()+" "+application1.getApplicationName());
        Application application2=Application.getInstance();
        System.out.println("application2 ="+application2.getPort()+" "+application2.getApplicationName());

    }
}
