public class OperatingInfo {
    public static void main(String[] args) {
        System.out.println("Operating System: " + System.getProperty("os.name"));
        System.out.println("Operating System Version: " + System.getProperty("os.version"));
        System.out.println("Operating System Architectue: " + System.getProperty("os.arch"));
        System.out.println("User name: " + System.getProperty("user.name"));
        System.out.println("User Home: " + System.getProperty("user.home"));
        System.out.println("User Directory: " + System.getProperty("user.dir"));
    }
}
