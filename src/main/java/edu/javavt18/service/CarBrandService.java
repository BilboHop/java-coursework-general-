package edu.javavt18.service;

import edu.javavt18.model.CarBrand;

import java.util.List;

/**
 * Service for manipulations with {@link CarBrand}.
 *
 * @see CarBrand
 */
public interface CarBrandService {

    /**
     * <p>Persists {@link CarBrand} to the database either by adding it there or by updating.</p>
     * <p>If {@code item} is not in the database yet, saves it there.
     * Otherwise updates the row in the database with the same id as {@code item}.</p>
     *
     * @param item item to persist to the database.
     */
    void saveOrUpdate(CarBrand item);

    /**
     * Deletes a {@link CarBrand} from the database with the given id.
     *
     * @param itemId id of the item which should be deleted.
     */
    void delete(int itemId);

    /**
     * Selects single {@link CarBrand} from the database with the given id.
     *
     * @param itemId id of the item which should be selected.
     * @return {@link CarBrand} filled with data from the database row if a row with id = {@code itemId} exists there,
     * otherwise {@code null}.
     */
    CarBrand get(int itemId);

    /**
     * Selects all {@link CarBrand}s from the database.
     *
     * @return {@link List} of {@link CarBrand} filled with all data from the database (could be empty).
     */
    List<CarBrand> list();
}