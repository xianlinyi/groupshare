package club.xianlinyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: xianlinyi
 * @description: -
 */
@SpringBootApplication
@EnableEurekaServer
public class registerServer {
    public static void main(String[] args) {
        SpringApplication.run(registerServer.class,args);
    }
}
