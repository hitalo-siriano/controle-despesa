package com.projeto.controle_despesa.controller;

import com.projeto.controle_despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.projeto.controle_despesa.model.DespesaModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroDeNovaDespesaController {
    @Autowired
    private DespesaRepository  despesaRepository;


    @PostMapping("/cadastro-despesa")
    public String cadastroNovaDespesa(@ModelAttribute DespesaModel despesaModel, Model model) {

        despesaRepository.save(despesaModel);

        return "cadastro-despesa";
    }

    @GetMapping("/cadastro-despesa")
    public String cadastroNovaDespesa(Model model) {

        return "cadastro-despesa";
    }

}