package LLD.RepositoryPattern.iterators;
import LLD.RepositoryPattern.repository.*;
import java.util.*;
public class userIteratorImpl implements userIterator<List<String>>{
    private final int limit;
    private int offset=0;
    List<String> current_users;
    UserRepository userRepo;

    public userIteratorImpl(int limit,UserRepository userRepo) {
        this.limit = limit;
        this.userRepo = userRepo;
        current_users = userRepo.getUser(limit, offset);
        offset+=limit;
    }
    @Override
    public boolean hasNext() {
        return !current_users.isEmpty();
    }
    @Override
    public List<String> next() {
        List<String> result = current_users;
        current_users = userRepo.getUser(limit, offset);
        offset+=limit;
        return result;
    }
    
}