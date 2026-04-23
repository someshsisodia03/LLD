package LLD.CacheLLD.Eviction;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.PolicyType;
public interface PolicyEviction {
    char get(int key);
    void put(int key, char value);
    int getCapacity();
    int getSize();
    PolicyType getPolicyType();
    Node remove();
}