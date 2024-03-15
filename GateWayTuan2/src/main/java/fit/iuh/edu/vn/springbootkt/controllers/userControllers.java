package fit.iuh.edu.vn.springbootkt.controllers;
import fit.iuh.edu.vn.springbootkt.entities.User;
import fit.iuh.edu.vn.springbootkt.repositories.userRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
class userController {
    @Autowired
    private userRepositories userRepositories;
    @GetMapping("/users")
    List<User> getAllUsers() { return userRepositories.findAll();
    }
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userRepositories.save(user);
    }
//    @GetMapping("/users/{id}") // get user by id
//    User getUserById(@PathVariable int id) { return userRepositories.findById(String.valueOf(id)).get();
//    }
}
