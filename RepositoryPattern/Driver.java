package LLD.RepositoryPattern;

import LLD.RepositoryPattern.iterators.userIterator;
import LLD.RepositoryPattern.iterators.userIteratorImpl;
import LLD.RepositoryPattern.repository.*;
import java.util.*;

public class Driver{
    // private final UserRepository userRepo;
    private final userIterator<List<String>> userIter;

    // public Driver(UserRepository userRepo) {
    //     this.userRepo = userRepo;
    // }

    public Driver(userIterator<List<String>> userIter) {
        this.userIter = userIter; //constructor injection
    }

    // void display(){
    //     List<String>users = userRepo.getUser(10,0);
    //     for(int i=0;i<users.size();i++){
    //         System.out.println(users.get(i));
    //     }
    // }
    void display(){
        while(userIter.hasNext()){
            List<String> users = userIter.next();
            System.out.println(users);
        }
    }
    public static void main(String[] args) {
        InMemoryData db = new InMemoryData();
        db.addUser();
        // Driver d = new Driver(new userRepositoryImpl(db));
        // d.display();        
        Driver d = new Driver(new userIteratorImpl(10,new userRepositoryImpl(db)));
        d.display();
    }
} 