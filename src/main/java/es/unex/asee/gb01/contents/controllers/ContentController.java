package es.unex.asee.gb01.contents.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import es.unex.asee.gb01.contents.clients.ContentsClient;
import es.unex.asee.gb01.contents.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
@RequestMapping("/contents")
public class ContentController {
    @Autowired ContentsClient contentsClient;

    @GetMapping("/movies/{idMovie}")
    public MovieDTO getMovie(@PathVariable("idMovie") Integer idMovie) {
        List<MovieDTO> movies = contentsClient.getMovie(idMovie);
        if (!movies.isEmpty()) {
            return movies.get(0); // Return the first movie
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found");
    }


    @GetMapping("/categories/{idCategory}")
    public List<CategoryDTO> getCategory(@PathVariable("idCategory") Integer idCategory) {
        return contentsClient.getCategory(idCategory);
    }

    @GetMapping("/series/{idSeries}")
    public List<SeriesDTO> getSeries(@PathVariable("idSeries") Integer idSeries) {
        return contentsClient.getSeries(idSeries);
    }

    @GetMapping("/seasons/{idSeason}")
    public List<SeasonDTO> getSeason(@PathVariable("idSeason") Integer idSeason) {
        return contentsClient.getSeason(idSeason);
    }

}
