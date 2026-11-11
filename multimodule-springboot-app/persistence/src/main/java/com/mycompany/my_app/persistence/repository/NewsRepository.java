package com.mycompany.my_app.persistence.repository;


import com.mycompany.my_app.persistence.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
}
