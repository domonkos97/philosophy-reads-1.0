package com.domi.philosophyreads.entities.dto;

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
    private Long authorId;
}
