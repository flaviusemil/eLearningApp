package ro.condurache.flavius.eLearningPlatform.POJO;

/**
 * Created by Flavius Condurache on 6/9/17.
 * User Model
 */

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private boolean isInstructor;

    // <editor-fold desc="Constructors">

    public User() {

    }

    public User(String firstName, String lastName, boolean isInstructor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInstructor = isInstructor;
    }

    public User(int userId, String firstName, String lastName, boolean isInstructor) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInstructor = isInstructor;
    }

    // </editor-fold>

    // <editor-fold desc="Getters and Setters">

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public boolean isInstructor() {
        return isInstructor;
    }

    public void setInstructor(boolean instructor) {
        isInstructor = instructor;
    }

    // </editor-fold>
}
