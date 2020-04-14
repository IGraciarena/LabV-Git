package com.clase06042020.utn.model;

import com.clase06042020.utn.model.inter.IGetSalaryForEmployer;

public class GetSalaryForEmployerImp implements IGetSalaryForEmployer {

    @Override
    public Integer GetSalary() {
        return 20;
    }
}
