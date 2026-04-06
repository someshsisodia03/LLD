package BuilderPattern.BetterSoln;

public class User {
    private  String name;
    private int age;
    private String email;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }
    public static class Builder {
        private String name;
        private int age;
        private String email;
    
        public Builder Name(String name) {
            this.name = name;
            return this;
        }
    
        public Builder Age(int age) {
            this.age = age;
            return this;
        }
    
        public Builder Email(String email) {
            this.email = email;
            return this;
        }
    
        public User build() {
            return new User(this);
        }
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
        User user = new User.Builder().Name("Alice").Age(30).Email("alice@example.com").build();
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());    
        System.out.println("Email: " + user.getEmail());
    }

}