public class Main {
    public static void main(String[] args) {
        boolean datasucces = Data.validate("password", "password", "password");
        if (datasucces) {
            System.out.println("данные приняты");
        } else {
            System.out.println("данные неприняты");
        }
    }
}
