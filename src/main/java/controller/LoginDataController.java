package controller;

import model.LoginData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repository.LoginDataRepo;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginDataController {

    @Autowired
    private LoginDataRepo repository;

    public void createNewUser(String username, Integer uuid, String email){}

    @PostConstruct
    public void createTestUser(){
        List<LoginData> users = new ArrayList<>();
        users.add(new LoginData("Ronaldo", 11, "ronaldo@gmail.com", "liga1", "liga2", "liga3", "liga4", "liga5", "liga6", "liga7", 7));
        users.add(new LoginData("Messi", 12, "leo@gmail.com", "liga1", "liga2", "liga3", "liga4", "liga5", "liga6", "liga7", 7));
        users.add(new LoginData("GOAT", 13, "tmueller_legende@rolex.com", "Legendenliga", "liga2", "liga3", "liga4", "liga5", "liga6", "liga7", 7));
        users.add(new LoginData("Kobe's ganzer Stolz", 14, "DerEchteBomber@poldi.com", "Legendenliga", "liga2", "liga3", "liga4", "liga5", "liga6", "liga7", 7));
        repository.saveAll(users);
    }

    @GetMapping("/getAllUsers")
    public List<LoginData> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/getUserFilterByLeague/{league}")
    public List<LoginData> getUserFilterByLeague1(@PathVariable String league){
        return repository.findByLeague1(league);
    }
}
