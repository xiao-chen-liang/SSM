import Dao.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class jdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        String sql1 = "insert into t_user values(null, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql1, "root", "123", 23, "女", "123@qq.com");
    }

    @Test
    public void testSelect() {
        String sql1 = "select * from t_user";
        List<User> users = jdbcTemplate.query(sql1, new BeanPropertyRowMapper<>(User.class));
        System.out.println(users);

        String sql2 = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql2, Integer.class);
        System.out.println(count);
    }
}
