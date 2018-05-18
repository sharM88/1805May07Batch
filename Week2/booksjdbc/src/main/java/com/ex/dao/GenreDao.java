package com.ex.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ex.pojos.Genre;
import com.ex.util.ConnectionFactory;

public class GenreDao implements Dao<Genre, Integer>{

	public List<Genre> getAll() {
		List<Genre> genres = new ArrayList<Genre>();
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			String query = "select * from genre";

			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(query);

			while(rs.next()) {
				Genre temp = new Genre();
				temp.setId(rs.getInt(1)); //can access by name or index(starts with 1)
				temp.setName(rs.getString(2));
				genres.add(temp);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return genres;
	}

	public Genre findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Genre save(Genre obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public Genre update(Genre obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
