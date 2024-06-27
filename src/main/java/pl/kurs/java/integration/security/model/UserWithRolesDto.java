package pl.kurs.java.integration.security.model;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserWithRolesDto {
    private String name;
    private String password;
    private List<String> roles;
}
