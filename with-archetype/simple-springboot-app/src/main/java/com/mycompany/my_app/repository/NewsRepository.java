package com.mycompany.my_app.repository;


import com.mycompany.my_app.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
}
