package ar.edu.utn.frc.tup.lciii.clients;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MicroBRestClient {

    String baseResourceUrl = "http://localhost:8081/ping";

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getMicro() {
        return restTemplate.getForEntity(baseResourceUrl, String.class);
    }
}
