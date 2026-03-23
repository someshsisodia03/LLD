package BuilderPattern.ImprovedSoln;

public class User {
    private String name;
    private int age;
    private String email;

    public User(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.email = builder.getEmail();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public static void main(String[] args) {
        User user = new Builder().Name("Alice").Age(30).Email("alice@example.com").build();
    }

}