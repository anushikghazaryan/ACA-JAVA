package Week4.Task1;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Anush");
        user.setLastName("Ghazaryan");
        user.setUserName("Anushik");
        user.setEmail("anushghazaryan.23@gmail.com");

        User user1 = new User(user);
        System.out.println(user1);

        User user2 = null;
        try {
            user2 = user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(user2);

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user);
        userGroup.addUser(user1);
        userGroup.addUser(user2);
        System.out.println(userGroup);

        UserGroup userGroup1 = null;
        try {
            userGroup1 = userGroup.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(userGroup1);

        user1.setUserName("aaaaaaa");
        user1.setFirstName("Lianush");

        final User[] users = userGroup.getUsers();
        users[0] = user1;
        System.out.println(userGroup);
        System.out.println(userGroup1);
    }
}
