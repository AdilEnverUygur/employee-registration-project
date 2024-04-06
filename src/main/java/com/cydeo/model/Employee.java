package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

//    @NotNull     --> Field shouldn't be null
//    @NotEmpty    --> Field shouldn't be ""
//    @NotBlank    --> Field shouldn't be "        "

//    @NotNull     --> @NotNull
//    @NotEmpty    --> @NotNull + @NotEmpty
//    @NotBlank    --> @NotNull + @NotEmpty + @NotBlank



    @NotBlank
    @Size(max = 12,min = 2)
    private String firstName;

    @NotBlank
    @Size(max = 12,min = 2)
    private String lastName;

    // Thymeleaf Accepts yyyy-MM-dd, But LocalDate accepts mm-dd-yyy  - yyyy-dd-mm
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
