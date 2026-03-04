class Service {
    void process(Task t) {
        System.out.println("Service is processing task: " + t.name);
    }
}

class Task {
    String name;
    Service service;

    Task(String name, Service service) {
        this.name = name;
        this.service = service;
    }
    void start() {
        System.out.println("Task '" + name + "' is starting...");
        service.process(this);
    }
}

public class ThisAsArgument {
    public static void main(String[] args) {
        Service myService = new Service();
        Task myTask = new Task("Data Cleaning", myService);

        myTask.start();
    }
}
