package com.mishima.mfinance.service.mapper;

import com.mishima.mfinance.entity.Category;
import com.mishima.mfinance.service.dto.CategoryDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {

    @Override
    Category toEntity(CategoryDTO dto);

    @Override
    CategoryDTO toDto(Category entity);

    @Override
    List<Category> toEntity(List<CategoryDTO> dtoList);

    @Override
    List<CategoryDTO> toDto(List<Category> entityList);
}
