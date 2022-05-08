package com.mishima.mfinance.service.mapper;

import com.mishima.mfinance.entity.Expense;
import com.mishima.mfinance.service.dto.ExpenseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ExpenseMapper extends EntityMapper<ExpenseDTO, Expense> {

    @Override
    Expense toEntity(ExpenseDTO dto);

    @Mapping(source = "category.name", target = "categoryName")
    @Override
    ExpenseDTO toDto(Expense entity);

    @Override
    List<Expense> toEntity(List<ExpenseDTO> dtoList);

    @Override
    List<ExpenseDTO> toDto(List<Expense> entityList);

}
