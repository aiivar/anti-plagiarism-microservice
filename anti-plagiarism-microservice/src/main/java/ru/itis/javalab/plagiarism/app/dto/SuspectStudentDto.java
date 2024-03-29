package ru.itis.javalab.plagiarism.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuspectStudentDto {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String path;

}
