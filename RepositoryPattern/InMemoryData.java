package LLD.RepositoryPattern;

import java.util.*;

public class InMemoryData{
    private final List<String>users=new ArrayList<>();
    public void addUser(){
        for(int i=0;i<2000;i++) users.add("User :"+i);
    }
    public List<String> getUser(){
        return users;
    }

}