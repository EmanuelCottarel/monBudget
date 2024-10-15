package fr.emanuel.monbudget.category.controller;

import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget.category.model.Category;
import fr.emanuel.monbudget.category.service.CategoryService;
import fr.emanuel.monbudget.global.AbstractCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController extends AbstractCrudController<Category> {

    @Autowired
    private AccountService service;

    public CategoryController(CategoryService service) {
        super(service);
    }
}
