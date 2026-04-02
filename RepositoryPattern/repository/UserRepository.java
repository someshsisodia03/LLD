package LLD.RepositoryPattern.repository;
import java.util.*;

public interface UserRepository{
    List<String> getUser(int limit,int offset);
}