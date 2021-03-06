package com.fullcycle.FCCatalogo.application.dto;

import java.io.Serializable;
import java.util.UUID;

import com.fullcycle.FCCatalogo.domain.entity.Category;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class CategoryDTO implements Serializable {
    
    @Autowired
    private Mapper dozerMapper;

    private static final long serialVersionUID = 1L;
    private String name;
    private UUID id;

    public Category toEntity() {
        System.out.println(dozerMapper);
        Category entity = dozerMapper.map(this, Category.class);
        System.out.println("toEntity" + entity.getName());
        return entity;
    }
}
