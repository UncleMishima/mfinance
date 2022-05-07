package com.mishima.mfinance.service.impl;

import com.mishima.mfinance.repository.ExpenseRepository;
import com.mishima.mfinance.service.ExpenseService;
import com.mishima.mfinance.service.dto.ExpenseDTO;
import com.mishima.mfinance.service.mapper.ExpenseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultExpenseService implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private ExpenseMapper expenseMapper;

    @Override
    public List<ExpenseDTO> findAll() {
        return expenseMapper.toDto(expenseRepository.findAll());
    }

    @Override
    public Optional<ExpenseDTO> findById(Long id) {
        return expenseRepository.findById(id)
                .map(expenseMapper::toDto);
    }
}
