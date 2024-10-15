package fr.emanuel.monbudget.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class AbstractCrudController<T> {

    private final AbstractCrudService<T> service;

    @Autowired
    public AbstractCrudController(AbstractCrudService<T> service) {
        this.service = service;
    }

    @PostMapping
    public T create(@RequestBody T object){
        return this.service.create(object);
    }

    @PutMapping
    public T update(){
        return null;
    }

    @DeleteMapping
    public T delete(){
        return null;
    }

    @GetMapping("/{id}")
    public T get(@PathVariable long id){
        return this.service.findById(id);
    }

    @GetMapping
    public List<T> findAll(){
        return this.service.findAll();
    }


}
