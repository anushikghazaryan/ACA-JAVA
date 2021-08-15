package Week4.Task1;

import java.util.Arrays;

public class UserGroup implements Cloneable{
    private User[] users;
    private int nextIndex;

    public UserGroup() {
        users = new User[10];
        nextIndex = 0;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void addUser(User user) {
        if(nextIndex < 10) {
            try {
                users[nextIndex++] = user.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        } else {
            throw new IndexOutOfBoundsException("no space to add user");

        }
    }

    @Override
    protected UserGroup clone() throws CloneNotSupportedException {
        UserGroup clone = (UserGroup) super.clone();
        clone.users = users.clone();
        for (int i = 0; i < nextIndex; i++) {
            users[i] = users[i].clone();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "UserGroup{" + "users=" + Arrays.toString(users) + ", nextIndex=" + nextIndex + '}';
    }
}
