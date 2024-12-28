package com.projeto.controle_despesa.repository;

import java.util.UUID;

import com.projeto.controle_despesa.model.DespesaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<DespesaModel, Long>
{
}
