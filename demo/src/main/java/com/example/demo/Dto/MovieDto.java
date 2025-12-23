package com.example.demo.Dto;

import lombok.Data;
import java.util.List;

@Data
public class MovieDto {
    private Long id;
    private String title;
    private String productionCode;

    private Long directorId;
    private List<Long> actorIds;
}
