/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ClubMemberInput;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        UserDataFile file = new UserDataFile();
        UserInterface gui = new UserInterface();
    }
}


