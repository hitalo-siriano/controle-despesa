package com.projeto.controle_despesa.controller;

import com.projeto.controle_despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListagemDasDespesasController {

    @Autowired
    private DespesaRepository despesaRepository;

    @GetMapping("/lista-despesa")
    public String listaTodasDespesa(Model model) {


        model.addAttribute("despesaModel", despesaRepository.findAll());
        return "lista-despesa";
    }
}
