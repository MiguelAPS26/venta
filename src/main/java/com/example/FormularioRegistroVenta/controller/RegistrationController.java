
package com.example.FormularioRegistroVenta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class RegistrationController {
    
    
    // Mostrar el formulario de registro
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Carga la vista register.html
    }

    // Procesar el formulario
    @PostMapping("/register")
    public String processRegistration(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String dni,
            @RequestParam String residence,
            @RequestParam String emergencyContact,
            @RequestParam String personalPhone,
            @RequestParam String bloodType,
            @RequestParam String allergies,
            @RequestParam String runningKm,
            Model model) {

        // Agregar datos al modelo para mostrarlos en la página de éxito
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("dni", dni);
        model.addAttribute("residence", residence);
        model.addAttribute("emergencyContact", emergencyContact);
        model.addAttribute("personalPhone", personalPhone);
        model.addAttribute("bloodType", bloodType);
        model.addAttribute("allergies", allergies);
        model.addAttribute("runningKm", runningKm);

        return "success"; // Redirige a la vista success.html
    }
    
}
