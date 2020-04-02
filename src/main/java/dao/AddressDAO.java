package dao;

//Тут сервисы реализуют дао интерфейсы и обращаются к базе.
//Нужно чтобы дао имплементации были отдельно реализованы, к примеру AdressDAOImpl должен содержать запросы к базе,
// который в свою очередь используется сервисом AdressService в котором содержится проверка и логика.
//Взаимодействие с базой будет идти по цепочке через сервис слой к дао слою (service - dao - base).

import entity.Address;

import java.sql.SQLException;
import java.util.List;

public interface AddressDAO {

    //create
    void add(Address address) throws SQLException;

    //read
    List<Address> getAll() throws SQLException;

    Address getById(Long id) throws SQLException;

    //update
    void update(Address address) throws SQLException;

    //delete
    void remove(Address address) throws SQLException;

}
