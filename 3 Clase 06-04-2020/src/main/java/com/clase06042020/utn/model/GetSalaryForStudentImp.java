package com.clase06042020.utn.model;

import com.clase06042020.utn.model.inter.IGetSalaryForStudent;

public class GetSalaryForStudentImp implements IGetSalaryForStudent {

    @Override
    public Integer getSalary() {
        return 10;
    }
}
