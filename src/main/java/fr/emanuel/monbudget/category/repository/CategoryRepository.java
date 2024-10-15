package fr.emanuel.monbudget.category.repository;

import fr.emanuel.monbudget.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
