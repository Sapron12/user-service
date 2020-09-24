package com.example.userservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(val userRepository: UserRepository) {


    @GetMapping("/user/{username}")
    fun getUser(@PathVariable username: String): User {
        createUsers()
        return userRepository.findUserByUsername(username)
    }

    private fun createUsers() {
        userRepository.deleteAll()
        for (n in 1..5) {
            userRepository.save(User(0, "user$n", "12345", "USER"))
            userRepository.save(User(0, "admin$n", "12345", "ADMIN"))
        }
    }
}
