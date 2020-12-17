package edu.javavt18.service;

import edu.javavt18.dao.CarBrandDAO;
import edu.javavt18.model.CarBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JDBC implementation for {@link CarBrandService}.
 *
 * @see CarBrandService
 */
@Service("carBrandJdbcService")
public class CarBrandJdbcServiceImpl implements CarBrandService {

    /**
     * An instance of {@link edu.javavt18.dao.jdbc.CarBrandDAOJdbcImpl}.
     */
    @Autowired
    @Qualifier("getCarBrandJdbcDAO")
    private CarBrandDAO carBrandDAO;

    /**
     * <p>Persists {@link CarBrand} to the database either by adding it there or by updating.</p>
     * <p>If {@code item} is not in the database yet, saves it there.
     * Otherwise updates the row in the database with the same id as {@code item}.</p>
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param item item to persist to the database.
     */
    public void saveOrUpdate(CarBrand item) {
        carBrandDAO.saveOrUpdate(item);
    }

    /**
     * Deletes a {@link CarBrand} from the database with the given id.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param itemId id of the item which should be deleted.
     */
    public void delete(int itemId) {
        carBrandDAO.delete(itemId);
    }

    /**
     * Selects single {@link CarBrand} from the database with the given id.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @param itemId id of the item which should be selected.
     * @return {@link CarBrand} filled with data from the database row if a row with id = {@code itemId} exists there,
     * otherwise {@code null}.
     */
    public CarBrand get(int itemId) {
        return carBrandDAO.get(itemId);
    }

    /**
     * Selects all {@link CarBrand}s from the database.
     * <p>Uses JDBC to interact with the database.</p>
     *
     * @return {@link List} of {@link CarBrand} filled with all data from the database (could be empty).
     */
    public List<CarBrand> list() {
        return carBrandDAO.list();
    }
}