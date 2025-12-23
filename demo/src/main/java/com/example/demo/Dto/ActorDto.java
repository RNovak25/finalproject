package com.example.demo.Dto;

import lombok.Data;
import java.util.List;

@Data
public class ActorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String agentEmail;

    private List<Long> movieIds;
}