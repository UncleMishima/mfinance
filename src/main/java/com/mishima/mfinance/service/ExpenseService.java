package com.mishima.mfinance.service;

import com.mishima.mfinance.service.dto.ExpenseDTO;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {

    List<ExpenseDTO> findAll();

    Optional<ExpenseDTO> findById(@NonNull Long id);
}
