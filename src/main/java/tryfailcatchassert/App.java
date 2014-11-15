package tryfailcatchassert;

public class App {
    private State state;
    private String name;

    public void configure() {
        if (name == null) {
            throw new IllegalStateException("name is null");
        }
    }

    public void start() {
        // some code
    }

    public void shutdown() {
        if (name.isEmpty()) {
            throw new IllegalStateException("name is empty");
        }
        // some more code
    }

    public void setName(String name) {
        this.name = name;
    }
}
