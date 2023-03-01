package ru.netology.springbootauthorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.springbootauthorizationservice.model.Authorities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    private final String USERNAME = "Tima";
    private final String PASSWORD = "1234567";

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals(USERNAME) && password.equals(PASSWORD)) {
            return Arrays.asList(Authorities.values());
        }
        return new ArrayList<>();
    }
}
