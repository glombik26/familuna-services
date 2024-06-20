package com.glombik26.familuna.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO comment
 *
 * @author Michael Glombik
 * created by Michael Glombik on 20.06.2024
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

 @PostMapping("/login")
 public ResponseEntity<String> login() {
  return ResponseEntity.ok("Login works");
 }
}
