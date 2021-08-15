package Week4.Task1;

public class User implements Cloneable{
    private String firstName;
    private String lastName;
    private String userName;
    private String email;

    public User() {

    }

    public User(User user) {
        if(user != null) {
            this.firstName = user.getFirstName();
            this.lastName = user.getLastName();
            this.userName = user.getUserName();
            this.email = user.getEmail();
        } else {
            throw new NullPointerException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", userName='" + userName + '\'' + ", email='" + email + '\'' + '}';
    }
}
