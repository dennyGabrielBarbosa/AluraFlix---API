package com.challenge.videos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.videos.modelo.Categorias;
import com.challenge.videos.modelo.Videos;

@Repository
public interface VideosRepository extends JpaRepository<Videos, Long> {

	List<Videos> findByTituloContains(String titulo);
	List<Videos> findAllVideosByCategoria(Optional<Categorias> optional);
}