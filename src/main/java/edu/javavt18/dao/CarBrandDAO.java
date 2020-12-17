package edu.javavt18.dao;

import edu.javavt18.model.CarBrand;
import java.util.List;

public interface CarBrandDAO{

    void saveOrUpdate(CarBrand item);

    void delete(int itemId);

    CarBrand get(int itemId);

    List<CarBrand> list();

}