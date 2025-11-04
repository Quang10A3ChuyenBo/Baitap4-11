package model;

public class Student {
    private String id;
    private String fullName;
    private String email;

    public Student(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student: " + fullName + " (" + id + "), Email: " + email;
    }
}
