package edu.javavt18.dao;

import edu.javavt18.model.CarModel;

import java.util.List;

public interface CarModelDAO {

    void saveOrUpdate(CarModel item);

    void delete(int itemId);

    CarModel get(int itemId);

    List<CarModel> list();

}