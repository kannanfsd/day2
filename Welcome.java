public class Welcome {
  public static void main(String[] args) {
    User user = new User();
    user.firstName = "Jack";
    user.lastName = "Rose";
    user.display();
  }
}
class User {
  String firstName;
  String lastName;
  public void display() {
    System.out.println("Welcome back Mr./Ms."+firstName+" "+lastName);
  }
}