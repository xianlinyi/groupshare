package club.xianlinyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xianlinyi
 * @description: -
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class configServer {
    public static void main(String[] args) {
        SpringApplication.run(configServer.class,args);
    }
}
