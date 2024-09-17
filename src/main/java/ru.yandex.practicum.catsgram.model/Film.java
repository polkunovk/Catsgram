package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Film {
    private int id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private int duration;
}
