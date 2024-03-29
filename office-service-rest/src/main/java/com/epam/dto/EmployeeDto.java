package com.epam.dto;

import javax.validation.constraints.NotBlank;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel(description = "Represents the info which is required to create an Employee")
@Getter
@Setter
public class EmployeeDto extends RepresentationModel<EmployeeDto> {

    @ApiModelProperty(value = "employeeId")
    private Long id;

    @ApiModelProperty(value = "firstName")
    @NotBlank(message = "Every office needs to know first name of its employee!")
    private String firstName;

    @ApiModelProperty(value = "lastName")
    @NotBlank(message = "Every office needs to know last name of its employee!")
    private String lastName;

    @ApiModelProperty(value = "country")
    @NotBlank(message = "Employees location is important for project distribution!")
    private String country;


    @ApiModelProperty(value = "position")
    @NotBlank(message = "Without knowing an employee's position, how the office would pay them the right salary?")
    private String position;
}
