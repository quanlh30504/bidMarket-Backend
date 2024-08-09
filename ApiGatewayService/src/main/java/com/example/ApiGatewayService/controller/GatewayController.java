//package com.example.ApiGatewayService.controller;
//
//import com.example.ApiGatewayService.config.KeycloakLogoutHandler;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/")
//@RequiredArgsConstructor
//public class GatewayController {
//    private final KeycloakLogoutHandler keycloakLogoutHandler;
//
//    @DeleteMapping("/logout")
//    public ResponseEntity<String> logout(@AuthenticationPrincipal Jwt jwt, HttpServletRequest request, HttpServletResponse response) {
//        Authentication authentication = (Authentication) jwt;
//        keycloakLogoutHandler.logout(request, response, authentication);
//        return ResponseEntity.ok("Logged out successfully");
//    }
//
//}
