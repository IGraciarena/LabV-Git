package com.company.domain;

import com.company.interfaces.iPee;

public class VikingPeeImp implements iPee {
    @Override
    public Integer pee() {
        return 5;
    }
}
