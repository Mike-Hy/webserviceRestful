package com.webservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.webservice.pojo.Student;

/**
 * 
 * @author Administrator
 *
 */
@Repository
public class JdbcCorporateEventDao implements CorporateEventDao {

	private JdbcTemplate jdbcTemplate;
	
	 @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	 @Override
	public int getStudentCount() {
		return this.jdbcTemplate.queryForObject("select count(*) from student where name = ?",Integer.class,"kobe");
	}

	 @Override
	public List<Student> getStudents() {
		return this.jdbcTemplate.query("select id,number,name,tel,address from student",new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Student(rs.getString("id"), rs.getString("number"), rs.getString("name"), 
												   rs.getString("tel")	,rs.getString("address"));
			}
		});
	}

	@Override
	public Student getStudentById(int id) {
		return this.jdbcTemplate.queryForObject("select id,number,name,tel,address from student where id = ? ", new RowMapper<Student>() {
			@Override
			public Student mapRow(ResultSet rs, int arg1) throws SQLException {
				return new Student(rs.getString("id"), rs.getString("number"), rs.getString("name"), 
						   rs.getString("tel")	,rs.getString("address"));
			}
		}, id);
	}

}
