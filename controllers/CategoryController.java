package com.codewithgauri.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithgauri.blog.payloads.ApiResponse;
import com.codewithgauri.blog.payloads.CategoryDto;
import com.codewithgauri.blog.services.CategoryService;

@RestController
@RequestMapping("/api/categories")

public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	//create
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categorDto){
		
		CategoryDto createCategory=this.categoryService.createCategory(categorDto);
		return new ResponseEntity<CategoryDto>(createCategory,HttpStatus.CREATED);
	}
	
	

	//update
	@PutMapping("/{catId}")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto,@PathVariable Integer catId){
		
		CategoryDto updatedCategory=this.categoryService.updateCategory(categoryDto,catId);
		return new ResponseEntity<CategoryDto>(updatedCategory,HttpStatus.OK);
	}
	
	
	
	//delete
	
	@DeleteMapping("/{catId}")
	public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Integer catId){
		
		this.categoryService.deleteCategory(catId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deletedd successfully!!",true),HttpStatus.OK);
	}
	
	
	//get
	@GetMapping("/{catId}")
	public ResponseEntity<CategoryDto> getCategory(@PathVariable Integer catId){
		
		CategoryDto categoryDto=this.categoryService.getCategory(catId);
		return new ResponseEntity<CategoryDto>(categoryDto,HttpStatus.OK);
	}
	
	

	//getall
	@GetMapping("")
	public ResponseEntity<List<CategoryDto>> getCategories(){
		
	
		 List<CategoryDto> categories=this.categoryService.getCategories();
		return ResponseEntity.ok(categories);
	}
	
}
