public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstNameParameter) {
        firstName = firstNameParameter;
    }

    public void setLastName(String lastNameParameter) {
        lastName = lastNameParameter;
    }

    public void setAge(int ageParameter) {
        age = ageParameter;
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            age = ageParameter;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else {
            return firstName + " " + lastName;
        }

    }
}
