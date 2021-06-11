package springbootpostgresql.springpostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "springbootpostgresql.springpostgresql")
@EntityScan( basePackages = {"springbootpostgresql.springpostgresql"} )
public class SpringJdbcTemplate2PostgreSqlApplication   {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcTemplate2PostgreSqlApplication.class, args);
	}
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO students (id,name, email) VALUES ('"+4 + "'," + "'Ankit', 'name@gmail.com')";
		int rows = jdbcTemplate.update(sql);
		System.out.println("rows---"+rows);
		if (rows > 0) {
			System.out.println("A new row has been inserted.");
		}
		
		String sql3="Delete from students where id>=3";
		int rows2 = jdbcTemplate.update(sql3);
		System.out.println("rows---"+rows2+sql3);
		
			String sql1 = "INSERT INTO book (bookid,bookname, author,price) VALUES ('"+4+ "'," + "'Ascfr', 'yuioo','100')";
		int rows1 = jdbcTemplate.update(sql1);
		if (rows1 > 0) {
			System.out.println("A new row has been inserted.in Book");
	}
	}
}
