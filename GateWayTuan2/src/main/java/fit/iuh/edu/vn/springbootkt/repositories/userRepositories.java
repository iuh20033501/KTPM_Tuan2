package fit.iuh.edu.vn.springbootkt.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import fit.iuh.edu.vn.springbootkt.entities.User;
@Repository
public interface userRepositories extends JpaRepository<User, String> {


}
