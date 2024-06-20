package com.glombik26.familuna.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO comment
 *
 * @author Michael Glombik
 * created by Michael Glombik on 20.06.2024
 */
@RestController
public class HelloController {

 @GetMapping("/")
 public String index() {
  return "Hello World!";
 }
}
