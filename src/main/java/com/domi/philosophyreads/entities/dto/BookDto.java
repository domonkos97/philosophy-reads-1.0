package com.domi.philosophyreads.entities.dto;

import com.domi.philosophyreads.entities.Philosopher;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDto {
    private Long id;
    private String title;
    private String synopsis;
    @ManyToOne
    private Long authorId;
}
