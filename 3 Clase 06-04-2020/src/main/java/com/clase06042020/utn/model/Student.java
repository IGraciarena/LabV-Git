package com.clase06042020.utn.model;

import com.clase06042020.utn.model.inter.IGetSalaryForStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student extends Person {
    IGetSalaryForStudent iGetSalaryForStudent;

    public void setIGetSalaryForStudent(IGetSalaryForStudent iGetSalaryForStudent){
        this.iGetSalaryForStudent = iGetSalaryForStudent;
    }

    // todo hacer un controlador studiante y employer
    // put /student/1 @putmapping("/") update person
}
