package controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class App {



    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }

    @Bean
    public WebClient.Builder getWebclientBuilder(){
        return WebClient.builder();
    }
}
