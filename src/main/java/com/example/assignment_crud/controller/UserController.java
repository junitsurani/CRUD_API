package com.example.assignment_crud.controller;

import com.example.assignment_crud.model.User;
import com.example.assignment_crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint to create a new user
    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {
        try {
            String result = userService.createUser(user);
            return ResponseEntity.ok("User created successfully. Updated time: " + result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create user: " + e.getMessage());
        }
    }

    // Endpoint to get a user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUser(@PathVariable String id) {
        try {
            User user = userService.getUser(id);
            if (user != null) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with ID " + id + " not found.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to retrieve user: " + e.getMessage());
        }
    }

    // Endpoint to update a user
    @PutMapping
    public ResponseEntity<String> updateUser(@RequestBody User user) {
        try {
            String result = userService.updateUser(user);
            return ResponseEntity.ok("User updated successfully. Updated time: " + result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update user: " + e.getMessage());
        }
    }

    // Endpoint to delete a user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        try {
            String result = userService.deleteUser(id);
            return ResponseEntity.ok("User deleted successfully. Updated time: " + result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete user: " + e.getMessage());
        }
    }
}
