package edu.javavt18.service;

import edu.javavt18.dao.CarModelDAO;
import edu.javavt18.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JDBC implementation for {@link CarModelService}.
 *
 * @see CarModelService
 */
@Service("carModelJdbcService")
public class CarModelJdbcServiceImpl implements CarModelService {

    /**
     * An instance of {@link edu.javavt18.dao.jdbc.CarModelDAOJdbcImpl}.
     */
    @Autowired
    @Qualifier("getCarModelJdbcDAO")
    private CarModelDAO carModelDAO;


    /**
     * <p>Persists {@link CarModel} to the database either by adding it there or by updating.</p>
     * <p>If {@code item} is not in the database yet, saves it there.
     * Otherwise updates the row in the database with the same id as {@code item}.</p>
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param item item to persist to the database.
     */
    public void saveOrUpdate(CarModel item) {
        carModelDAO.saveOrUpdate(item);
    }

    /**
     * Deletes a {@link CarModel} from the database with the given id.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param itemId id of the item which should be deleted.
     */
    public void delete(int itemId) {
        carModelDAO.delete(itemId);
    }

    /**
     * Selects single {@link CarModel} from the database with the given id.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param itemId id of the item which should be selected.
     * @return {@link CarModel} filled with data from the database row if a row with id = {@code itemId} exists there,
     * otherwise {@code null}.
     */
    public CarModel get(int itemId) {
        return carModelDAO.get(itemId);
    }

    /**
     * Selects all {@link CarModel}s from the database.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @return {@link List} of {@link CarModel} filled with all data from the database (could be empty).
     */
    public List<CarModel> list() {
        return carModelDAO.list();
    }
}