public class Main {
    public static void main(String[] args) {
        String b = "red";

        switch (b) {
            case "red":
                System.out.println("stop");
                break;
            case "yellow":
                System.out.println("get ready");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}