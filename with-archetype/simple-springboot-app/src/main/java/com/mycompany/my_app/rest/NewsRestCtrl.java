package com.mycompany.my_app.rest;

import com.mycompany.my_app.model.News;
import com.mycompany.my_app.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api-news/v1/news")
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class NewsRestCtrl {
    private final NewsService newsService;

    @GetMapping("/{id}")
    public ResponseEntity<News> getCompteByNum(@PathVariable("id") long id) {
        return ResponseEntity.of(newsService.searchById(id));
        //ResponseEntity.of(choseOptional) retourne automatiquement ResponseEntity.ok(choseOptional.get())
        //si pas empty et HttpStatus.NOT_FOUND si empty
    }

    //RECHERCHE MULTIPLE :
    //URL de déclenchement: ...../rest/api-news/v1/news
    //                    ou ..../rest/api-news/v1/news?title=...
    @GetMapping()
    public List<News> getNewsByCriteria(
            @RequestParam(value = "title", required = false) String title) {
       // if (title == null)
            return newsService.searchAll();
       // else
            //return newsService.searchByTitle(title);
    }

}
