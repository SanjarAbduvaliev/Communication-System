package com.example.communicationsystem.payload;

import com.example.communicationsystem.payload.UserTemplateDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class EmployeRegDto extends UserTemplateDto {
    private Integer roleId;
}
