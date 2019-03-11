package pl.sda.tasks.weekend2.encapsulation.task.users;

public class UserManager {
    private UserModel user;

    public void createUser(String firstName, String lastName, int age) {
        user = new UserModel(firstName, lastName, age);
    }

    public UserModel getUser() {
        return user;
    }
}
