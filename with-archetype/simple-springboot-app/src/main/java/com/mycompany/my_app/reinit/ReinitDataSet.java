package com.mycompany.my_app.reinit;

import com.mycompany.my_app.entity.NewsEntity;
import com.mycompany.my_app.repository.NewsRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("reinit")
@RequiredArgsConstructor
public class ReinitDataSet {

    private final NewsRepository newsRepository;

    @PostConstruct
    public void reiniDefaultDataSet() {
        newsRepository.save(new NewsEntity(null, "maven 4 soon ?", "may be 2027"));
        newsRepository.save(new NewsEntity(null, "java 27 ?", "very few improvements"));
    }
}
