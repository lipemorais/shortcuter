import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("Hello!");
    }
}
