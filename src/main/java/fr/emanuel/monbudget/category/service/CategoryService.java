package fr.emanuel.monbudget.category.service;

import fr.emanuel.monbudget.category.model.Category;
import fr.emanuel.monbudget.category.repository.CategoryRepository;
import fr.emanuel.monbudget._global.AbstractCrudService;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends AbstractCrudService<Category> {
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }
}
