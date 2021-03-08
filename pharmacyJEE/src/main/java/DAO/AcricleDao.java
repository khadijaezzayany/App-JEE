package DAO;

import java.sql.SQLException;
import java.util.List;

import Modele.Article;

public interface AcricleDao {
//	public void Add(String nom, int prix, int quantite) throws ClassNotFoundException, SQLException;
//	  public  Iterator<Article> DisplayAll();
//
//
//	public void Update(int id, String nom, int prix, int quantite) throws SQLException;
//	
//	//public void (int id) throws SQLException;

	public Article save(Article a) throws ClassNotFoundException, SQLException;

	public List<Article> articalelist(String mc) throws ClassNotFoundException, SQLException;

	public Article getArticale(int id) throws ClassNotFoundException, SQLException;

	public Article update(Article a) throws ClassNotFoundException, SQLException;

	public void deleteArticle(int id) throws ClassNotFoundException, SQLException;
}
