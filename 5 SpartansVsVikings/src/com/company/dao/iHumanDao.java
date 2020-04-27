package com.company.dao;

import com.company.domain.Human;

public interface iHumanDao extends AbstractDao<Human> {
    Human getByName(Human value);
}
