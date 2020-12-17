package edu.javavt18.service;

import edu.javavt18.model.CarModel;

import java.util.List;

/**
 * Service for manipulations with {@link CarModel}.
 *
 * @see CarModel
 */
public interface CarModelService {

    /**
     * <p>Persists {@link CarModel} to the database either by adding it there or by updating.</p>
     * <p>If {@code item} is not in the database yet, saves it there.
     * Otherwise updates the row in the database with the same id as {@code item}.</p>
     *
     * @param item item to persist to the database.
     */
    void saveOrUpdate(CarModel item);

    /**
     * Deletes a {@link CarModel} from the database with the given id.
     *
     * @param itemId id of the item which should be deleted.
     */
    void delete(int itemId);

    /**
     * Selects single {@link CarModel} from the database with the given id.
     *
     * @param itemId id of the item which should be selected.
     * @return {@link CarModel} filled with data from the database row if a row with id = {@code itemId} exists there,
     * otherwise {@code null}.
     */
    CarModel get(int itemId);

    /**
     * Selects all {@link CarModel}s from the database.
     *
     * @return {@link List} of {@link CarModel} filled with all data from the database (could be empty).
     */
    List<CarModel> list();
}