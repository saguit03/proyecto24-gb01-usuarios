package es.unex.asee.gb01.contents.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import es.unex.asee.gb01.contents.dto.CategoryDTO;
import es.unex.asee.gb01.contents.dto.MovieDTO;
import es.unex.asee.gb01.contents.dto.SeasonDTO;
import es.unex.asee.gb01.contents.dto.SeriesDTO;

@FeignClient(name = "contenidos-client", url = "http://localhost:8082")
public interface ContentsClient {

    @GetMapping("/movies/{idMovie}")
    MovieDTO getMovie(@PathVariable("idMovie") Integer idMovie);

    @GetMapping("/categories/{idCategory}")
    CategoryDTO getCategory(@PathVariable("idCategory") Integer idCategory);

    @GetMapping("/series/{idSeries}")
    SeriesDTO getSeries(@PathVariable("idSeries") Integer idSeries);

    @GetMapping("/series/{idSeason}")
    SeasonDTO getSeason(@PathVariable("idSeason") Integer idSeason);
}
