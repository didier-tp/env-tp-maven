package com.mycompany.my_app.mapper;

import com.mycompany.my_app.entity.NewsEntity;
import com.mycompany.my_app.model.News;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring") //for @Autowired or ...
public interface MyMapper {

    MyMapper INSTANCE = Mappers.getMapper( MyMapper.class );

    NewsEntity newsToNewsEntity(News source);
    News newsEntityToNews(NewsEntity source);
    List<NewsEntity> newsListToNewsEntityList(List<News> source);
    List<News> newsEntityListToNewsList(List<NewsEntity> source);

    //...
}
