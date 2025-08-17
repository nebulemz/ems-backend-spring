package net.lems.emsbackend.service.impl;

import net.lems.emsbackend.dto.EmployeeDto;
import net.lems.emsbackend.entity.Employee;
import net.lems.emsbackend.mapper.EmployeeMapper;
import net.lems.emsbackend.repository.EmployeeRepository;
import net.lems.emsbackend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployeeDto(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
