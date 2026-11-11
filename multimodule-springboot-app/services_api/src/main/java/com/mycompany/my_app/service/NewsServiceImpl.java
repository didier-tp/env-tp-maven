package com.mycompany.my_app.service;

import com.mycompany.my_app.mapper.MyMapper;
import com.mycompany.my_app.model.News;
import com.mycompany.my_app.persistence.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class NewsServiceImpl implements NewsService{

    private final MyMapper myMapper;

    private final NewsRepository newsRepository;


    @Override
    public Optional<News> searchById(Long id) {
        return newsRepository.findById(id).map(myMapper::newsEntityToNews)
                                          .or(Optional::empty);
    }

    @Override
    public List<News> searchAll() {
        return myMapper.newsEntityListToNewsList(newsRepository.findAll());
    }
}
