package LLD.RepositoryPattern;

import LLD.RepositoryPattern.repository.UserRepository;
import LLD.RepositoryPattern.repository.userRepositoryImpl;
import java.util.*;

public class Driver{
    private final UserRepository userRepo;

    public Driver(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    void display(){
        List<String>users = userRepo.getUser(10,0);
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }
    }
    public static void main(String[] args) {
        InMemoryData db = new InMemoryData();
        db.addUser();
        Driver d = new Driver(new userRepositoryImpl(db));
        d.display();        
    }
} 