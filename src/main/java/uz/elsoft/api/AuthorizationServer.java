package uz.elsoft.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @see <a href="https://docs.spring.io/spring-authorization-server/reference/index.html">Spring authorization server</a>
 */
@SpringBootApplication
public class AuthorizationServer {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServer.class, args);
    }
}
