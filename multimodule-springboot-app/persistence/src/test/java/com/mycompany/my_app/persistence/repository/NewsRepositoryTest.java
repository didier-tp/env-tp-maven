package com.mycompany.my_app.persistence.repository;

import com.mycompany.my_app.PersistenceSubConfiguration;
import com.mycompany.my_app.persistence.entity.NewsEntity;
import com.mycompany.my_app.persistence.repository.NewsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {PersistenceSubConfiguration.class})
@ActiveProfiles({  "persistence-dev"  })
@Slf4j
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class NewsRepositoryTest {

    private final NewsRepository newsRepository;

    @Test
    public void testAjoutNewsEtRelecture(){
        NewsEntity saveNewsEntity = newsRepository.save(new NewsEntity(null, "maven 4 soon ?", "may be 2027"));
        Long pk = saveNewsEntity.getId();

        NewsEntity reloadedNewsEntity = newsRepository.findById(pk).get();
        log.debug("reloadedNewsEntity="+reloadedNewsEntity);
        assertEquals("maven 4 soon ?",reloadedNewsEntity.getTitle());
    }

}
