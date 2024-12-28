package com.projeto.controle_despesa.controller;

import com.projeto.controle_despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DeletaDespesaController {
    @Autowired
    private DespesaRepository despesaRepository;

    @GetMapping("/excluir-despesa/{id}")
    public String deleta(@PathVariable Long id){
        despesaRepository.deleteById(id);
        return "redirect:/lista-despesa";

    }


}
