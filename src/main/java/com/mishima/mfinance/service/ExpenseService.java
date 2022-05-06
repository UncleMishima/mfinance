package com.mishima.mfinance.service;

import com.mishima.mfinance.service.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    List<ExpenseDTO> findAll();
}
