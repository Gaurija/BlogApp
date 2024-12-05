package com.codewithgauri.blog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codewithgauri.blog.payloads.CategoryDto;


public interface CategoryService {
	
	//CREATE
	
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	
	//UPDATE
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//DELETE
	 void deleteCategory(Integer categoryId);
	
	//GET
	
	 CategoryDto getCategory(Integer categoryId);

	
	//GETALL
	List<CategoryDto> getCategories();
}
