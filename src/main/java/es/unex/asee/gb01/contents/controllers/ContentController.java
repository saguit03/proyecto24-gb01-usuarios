package es.unex.asee.gb01.contents.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.unex.asee.gb01.contents.clients.ContentsClient;
import es.unex.asee.gb01.contents.dto.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/contents")
public class ContentController {
    @Autowired ContentsClient contentsClient;

    @GetMapping("/movies/{idMovie}")
    public MovieDTO getMovie(@RequestParam("idMovie") Integer idMovie) {
        System.out.println("idMovie: " + idMovie);
        return contentsClient.getMovie(idMovie);
    }

    @GetMapping("/categories/{idCategory}")
    public CategoryDTO getCategory(@RequestParam("idCategory") Integer idCategory) {
        return contentsClient.getCategory(idCategory);
    }

    @GetMapping("/series/{idSeries}")
    public SeriesDTO getSeries(@RequestParam("idSeries") Integer idSeries) {
        return contentsClient.getSeries(idSeries);
    }

    @GetMapping("/seasons/{idSeason}")
    public SeasonDTO getSeason(@RequestParam("idSeason") Integer idSeason) {
        return contentsClient.getSeason(idSeason);
    }

}
