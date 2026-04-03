package LLD.RepositoryPattern.repository;
import LLD.RepositoryPattern.InMemoryData;
import java.util.*;

public class userRepositoryImpl implements UserRepository {
    private final InMemoryData db;

    public userRepositoryImpl(InMemoryData db) {
        this.db = db;
    }
    @Override
    public List<String> getUser(int limit,int offset){
        List<String>users = db.getUser();
        int start = offset;
        int end = Math.min(start+limit, users.size());
        if(start>=users.size()) return List.of();
        
        return users.subList(start, end);
    }
}