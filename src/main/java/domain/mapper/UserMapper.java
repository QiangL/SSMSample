package domain.mapper;

import domain.module.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liqiag
 * @discription UserMapper
 * @date 2018-05-28
 **/
public interface UserMapper {

    User findById(@Param("id") Integer id);

    List<User> listUser();

    boolean save(@Param("user") User user);

    boolean delete(@Param("user") User user);

}
