package LLD.BuilderPattern.HTTPAssignment;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class HttpRequest {
    private final String method;
    private final String url;
    private final String body;
    private final Map<String, String> headers;

    private HttpRequest(Builder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.body = builder.body;
        this.headers = new HashMap<>(builder.headers);
    }
    public static class Builder{
        private String method;
        private String url;
        private String body;
        private Map<String, String> headers = new HashMap<>();
        public Builder Method(String method){
            this.method = method;
            return this;
        }
        public Builder Url(String url){
            try {
                URI uri = new URI(url);
                if(uri.isAbsolute() == false){
                    throw new IllegalArgumentException("URL must be absolute: " + url);
                }
                
            } catch (Exception e) {
                System.out.println("Invalid URL: " + url);
            }
            this.url = url;
            return this;
        }
        public Builder Body(String body){
            this.body = body;
            return this;
        }
        public Builder Header(String key, String value){
            this.headers.put(key, value);
            return this;
        }
        public HttpRequest build(){
            List<String> validMethods = List.of("GET", "POST", "PUT", "DELETE", "PATCH");
            if (method == null || !validMethods.contains(method.toUpperCase())) {
                throw new IllegalArgumentException("Invalid HTTP method: " + method);
            }
            try {
                if(method.equals("GET") && body!=null){
                    throw new IllegalArgumentException("GET request cannot have a body");
                } 
            } 
            catch (Exception e) {
                System.out.println("Invalid body for GET request");
            }
            return new HttpRequest(this);
        }
    }
    public static void main(String[] args) {
            HttpRequest request = new HttpRequest.Builder()
                    .Method("GET")
                    .Url("http://example.com/api/data")
                    .Body("{\"key\":\"value\"}")
                    .Header("Content-Type", "application/json")
                    .build();
        }
    }
