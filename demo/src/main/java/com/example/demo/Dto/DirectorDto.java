package com.example.demo.Dto;

import lombok.Data;
import java.util.List;

@Data
public class DirectorDto {
    private Long id;
    private String fullName;
    private String biography;

    private List<Long> movieIds;
}