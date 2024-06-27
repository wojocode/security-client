package pl.kurs.java.integration.security;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.kurs.java.integration.FeignConfig;
import pl.kurs.java.integration.security.model.UserWithRolesDto;


import java.util.Optional;

@FeignClient(name = "security-service", configuration = FeignConfig.class)
/*
TODO: make it bulletproof, and hit instance that always is alive
 */
public interface SecurityClient {
    @GetMapping("/api/v1/users/{username}")
        //TODO: przerobic na Optional i zrobic ze jesli nie znajdzie usera o danym username to niech zwraca Optional.empty()
    Optional<UserWithRolesDto> findByUsername(@PathVariable String username);
}
