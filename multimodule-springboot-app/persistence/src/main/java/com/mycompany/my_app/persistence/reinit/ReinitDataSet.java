package com.mycompany.my_app.persistence.reinit;

import com.mycompany.my_app.persistence.entity.NewsEntity;
import com.mycompany.my_app.persistence.repository.NewsRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("persistence-reinit")
@RequiredArgsConstructor
@Slf4j
public class ReinitDataSet {

    private final NewsRepository newsRepository;

    @PostConstruct
    public void reiniDefaultDataSet() {
        newsRepository.save(new NewsEntity(null, "maven 4 soon ?", "may be 2027"));
        newsRepository.save(new NewsEntity(null, "java 27 ?", "very few improvements"));
        log.info("com.mycompany.my_app.persistence.reinit.ReinitDataSet.reiniDefaultDataSet()");
    }
}
