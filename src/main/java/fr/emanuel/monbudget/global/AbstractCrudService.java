package fr.emanuel.monbudget.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbstractCrudService<T> {

    protected JpaRepository<T, Long> repository;

    public T create(T object){
        return this.repository.save(object);
    }

    public List<T> findAll(){
        return this.repository.findAll();
    }

    public T findById(Long id){
        return this.repository.findById(id).get();
    }

}
