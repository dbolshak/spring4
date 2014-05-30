import org.springframework.jdbc.core.JdbcTemplate

import javax.sql.DataSource

/**
 * Created by dbolshak on 30.05.2014.
 */
class Bootstrap {
    DataSource dataSource

    void init() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource)
        jdbcTemplate.execute("create table people (id NUMERIC not null, name varchar(50))")
    }
}
