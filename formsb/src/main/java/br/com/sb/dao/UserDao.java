package br.com.sb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;

import br.com.sb.model.User;

public class UserDao{

	public void createUser(User user) {
		String sql = "INSERT INTO USUARIOS (nome, adm, recebeForm, email, senha) VALUES(?,?,?,?,?);";
		Connection conn = null;
		PreparedStatement insert = null;
		
		try {
			conn = new Dao().getConnection();
			insert = conn.prepareStatement(sql);
			
			insert.setString(1, user.getName());
			insert.setInt(2, user.getAdm());
			insert.setInt(3, user.getRecebeForm());
			insert.setString(4, user.getEmail());
			insert.setString(5, user.getPassword());
			insert.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(insert != null) {
					insert.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	} 
		
		public void selectUser(User user, String email) {
			String sql = "SELECT nome, adm, recebeForm, email, senha FROM usuarios WHERE email = ?;";
			Connection conn = null;
			PreparedStatement select = null;
			try {
				conn = new Dao().getConnection();
				
				select = conn.prepareStatement(sql);
				
				select.setString(1, email);
				
				ResultSet resultado = select.executeQuery();
				
				while (resultado.next()) {
					user.setName(resultado.getString(1));
					user.setAdm(resultado.getInt(2));
					user.setRecebeForm(resultado.getInt(3));
					user.setEmail(resultado.getString(4));
					user.setPassword(resultado.getString(5));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}  finally {
				try {
					if(select != null) {
						select.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}
		
		public ArrayList<User> selectAllUsers() {
			User user = null;
			ArrayList<User> users = new ArrayList<User>();
			String sql = "SELECT nome, adm, recebeForm, email, senha FROM usuarios;";
			Connection conn = null;
			PreparedStatement select = null;
			try {
				conn = new Dao().getConnection();
				
				select = conn.prepareStatement(sql);
				
				ResultSet resultado = select.executeQuery();
				
				if (resultado != null) {
					while (resultado.next()) {
						user = new User();
						user.setName(resultado.getString(1));
						user.setAdm(resultado.getInt(2));
						user.setRecebeForm(resultado.getInt(3));
						user.setEmail(resultado.getString(4));
						user.setPassword(resultado.getString(5));
						users.add(user);
					}
				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}  finally {
				try {
					if(select != null) {
						select.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			return users;
	}
		
		public void updateUser(User user, String email) {
			String sql = "UPDATE usuarios SET nome = ?, adm = ?, recebeForm = ?, email = ?, senha = ? WHERE email = ?;";
			Connection conn = null;
			PreparedStatement update = null;
			try {
				conn = new Dao().getConnection();
				
				update = conn.prepareStatement(sql);
				
				update.setString(6, email);
				
				update.setString(1, user.getName());
				update.setInt(2, user.getAdm());
				update.setInt(3, user.getRecebeForm());
				update.setString(4, user.getEmail());
				update.setString(5, user.getPassword());
				update.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}  finally {
				try {
					if(update != null) {
						update.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
	}
		
	public void deleteUser(User user, String email) {
		String sql = "DELETE from usuarios WHERE email = ?;";
		Connection conn = null;
		PreparedStatement delete = null;
		try {
			conn = new Dao().getConnection();
			
			delete = conn.prepareStatement(sql);
			
			delete.setString(1, email);
			
			delete.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			try {
				if(delete != null) {
					delete.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) {
				conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
