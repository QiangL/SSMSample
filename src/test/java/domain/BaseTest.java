package domain;

import domain.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liqiag
 * @discription BaseTest
 * @date 2018-05-28
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BaseTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test() {
        System.out.println(userMapper.listUser());
    }
}
