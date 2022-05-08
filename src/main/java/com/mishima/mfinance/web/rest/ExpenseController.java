package com.mishima.mfinance.web.rest;

import com.mishima.mfinance.service.ExpenseService;
import com.mishima.mfinance.service.dto.ExpenseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("expenses", expenseService.findAll());
        return "expenses";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ExpenseDTO getExpenseById(@PathVariable Long id) {
        return expenseService.findById(id).orElse(null);
    }

}
