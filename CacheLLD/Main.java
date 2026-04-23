package LLD.CacheLLD;
import LLD.CacheLLD.Services.CacheManager;
public class Main{
    public static void main(String[] args) {
        CacheManager cacheManager = new CacheManager(2,"LRU");
        cacheManager.put(1, 'a');
        cacheManager.put(2, 'b');
        System.out.println(cacheManager.get(1)); // Output: 'a'
        cacheManager.put(3, 'c'); // Evicts key 2
        cacheManager.switchPolicy("FIFO");
        cacheManager.put(4, 'd'); // Evicts key 1
        try {
            System.out.println(cacheManager.get(2)); // key 2 was evicted
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}