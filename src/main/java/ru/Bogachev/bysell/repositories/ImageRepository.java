package ru.Bogachev.bysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.bysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
