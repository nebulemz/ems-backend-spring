package net.lems.emsbackend.mapper;

import net.lems.emsbackend.dto.EmployeeDto;
import net.lems.emsbackend.entity.Employee;

public class EmployeeMapper {

    // Entity -> DTO
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    // DTO -> Entity
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
