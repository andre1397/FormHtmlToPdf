package br.com.sb.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.sb.dao.UserDao;

public class User {
	
	private String name;
	private int adm;
	private int recebeForm;
	private String password;
	private String email;
	
	public User() {
		
	}
	
	public User(String name, int adm, int recebeForm, String email, String password) {
		this.name = name;
		this.adm = adm;
		this.recebeForm = recebeForm;
		this.password = password;
		this.email = email;
	}
	
	public int getAdm() {
		return adm;
	}

	public void setAdm(int adm) {
		this.adm = adm;
	}
	
	public int getRecebeForm() {
		return recebeForm;
	}

	public void setRecebeForm(int recebeForm) {
		this.recebeForm = recebeForm;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void salvar() {
		new UserDao().createUser(this);
	}
	
	public Map<String, String> consultar(String email) {
		Map<String, String> dadosUser = new HashMap<String, String>();
		new UserDao().selectUser(this, email);
		dadosUser.put("nome", this.getName());
		dadosUser.put("adm", Integer.toString(this.getAdm()));
		dadosUser.put("recebeForm", Integer.toString(this.getRecebeForm()));
		dadosUser.put("email", this.getEmail());
		dadosUser.put("senha", this.getPassword());
		
		return dadosUser;
	}
	
	public List<User> consultarUsuarios(){
		List<User> usuarios = new UserDao().selectAllUsers();
		return usuarios;
	}
	
	public void alteraUsuario(String email){
		new UserDao().updateUser(this, email);
	}
	
	public void deletaUsuario(String email) {
		new UserDao().deleteUser(this, email);
	}
	
	
}
