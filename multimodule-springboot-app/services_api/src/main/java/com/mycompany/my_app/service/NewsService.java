package com.mycompany.my_app.service;

import com.mycompany.my_app.model.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    public Optional<News> searchById(Long id);
    public List<News> searchAll();
}
