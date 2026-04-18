package com.smartinventory.service;

import com.smartinventory.dao.CategoryDAO;
import com.smartinventory.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public void saveCategory(Category category) {
        categoryDAO.save(category);
    }

    public void updateCategory(Category category) {
        categoryDAO.update(category);
    }

    public void deleteCategory(Long id) {
        categoryDAO.delete(id);
    }

    public Category getCategoryById(Long id) {
        return categoryDAO.findById(id);
    }

    public List<Category> getAllCategories() {
        return categoryDAO.findAll();
    }
}