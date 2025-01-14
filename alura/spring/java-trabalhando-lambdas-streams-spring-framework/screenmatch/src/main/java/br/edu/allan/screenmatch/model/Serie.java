package br.edu.allan.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Serie(
		@JsonAlias("Title") String titulo, 
		@JsonAlias("totalSeasons") Integer totalTemporadas,
		@JsonAlias ("imdbRating") String notaImdb
//		@JsonProperty("imdbVotes") String votos
		) {

}
