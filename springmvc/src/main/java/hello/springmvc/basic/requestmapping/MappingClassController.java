package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping//GET /mapping/users
    public String users() {
        return "get users";
    }

    @PostMapping//POST /mapping/users
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")//GET /mapping/users/{userId}
    public String findUser(@PathVariable String userId) {
        return "get userId=" + userId;
    }

    @PatchMapping("/{userId}")//PATCH /mapping/users/{userId}
    public String updateUser(@PathVariable String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")//DELETE /mapping/users/{userId}
    public String deleteUser(@PathVariable String userId) {
        return "delete userId=" + userId;
    }
}