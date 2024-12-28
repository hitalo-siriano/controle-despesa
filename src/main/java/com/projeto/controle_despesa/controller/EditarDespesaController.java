package com.projeto.controle_despesa.controller;

import com.projeto.controle_despesa.model.DespesaModel;
import com.projeto.controle_despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EditarDespesaController {
    @Autowired
    private DespesaRepository despesaRepository;

    @PostMapping("/editar-despesa/{id}")
    public String cadastroNovaDespesa(@ModelAttribute DespesaModel despesaModel, Model model) {

        despesaRepository.save(despesaModel);

        return "redirect:/editar-despesa/" + despesaModel.getId();
    }

    @GetMapping("/editar-despesa/{id}")
    public String cadastroNovaDespesa(@PathVariable Long id, Model model) {

        Optional<DespesaModel> op = despesaRepository.findById(id);

        model.addAttribute("despesa", op.get());
        return "editar-despesa";
    }

}
