package com.example.proyect.TiendaMueble.Controllers;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class AuthWebController {
    private final AuthService authService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginRequest", new LoginRequest());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute LoginRequest loginRequest, HttpSession session, RedirectAttributes redirectAttrs) {
        try {
            AuthResponse response = authService.login(loginRequest);
            session.setAttribute("jwt", response.getToken());
            return "redirect:/inicio";
        } catch (Exception e) {
            redirectAttrs.addFlashAttribute("error", "Credenciales inválidas");
            return "redirect:/login";
        }
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("registerRequest", new RegisterRequest());
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@ModelAttribute RegisterRequest registerRequest, HttpSession session, RedirectAttributes redirectAttrs) {
        try {
            AuthResponse response = authService.register(registerRequest);
            // No guardar token en sesión, solo redirigir a login
            redirectAttrs.addFlashAttribute("success", "Registro exitoso. Por favor inicia sesión.");
            return "redirect:/login";
        } catch (Exception e) {
            redirectAttrs.addFlashAttribute("error", "Error en el registro: " + e.getMessage());
            return "redirect:/register";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
} 