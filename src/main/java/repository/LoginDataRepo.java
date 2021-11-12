package repository;

import model.LoginData;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface LoginDataRepo extends CassandraRepository<LoginData, Integer> {

    List<LoginData> findByLeague1(String league);
}
