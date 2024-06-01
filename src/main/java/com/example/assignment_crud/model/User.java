package com.example.assignment_crud.model;

import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private Map<String, Integer> subjectMarks;
}
