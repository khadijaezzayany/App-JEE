package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConnctPostg.ConnectionClass;
import Modele.Article;

public class ArticleDaoImpm implements AcricleDao {

	@Override
	public Article save(Article a) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionClass.getMyConnexion();
		try {
			PreparedStatement stmt = connection
					.prepareStatement("INSERT INTO article(nom,prix,quantite) VALUES(?,?,?)");

			stmt.setString(1, a.getNom());
			stmt.setInt(2, a.getPrix());
			stmt.setInt(3, a.getQuantite());
			stmt.executeUpdate();
			PreparedStatement stmt2 = connection.prepareStatement("SELECT MAX(ID) AS MAX_ID FROM ARTICLE");
			ResultSet rs = stmt2.executeQuery();
			if (rs.next()) {
				a.setId(rs.getInt("MAX_ID"));
			}
			stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return a;
	}

	@Override
	public List<Article> articalelist(String ar) throws ClassNotFoundException, SQLException {
		List<Article> articles = new ArrayList<Article>();
		Connection connection = ConnectionClass.getMyConnexion();

		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM ARTICLE WHERE NOM LIKE ?");
			stmt.setString(1, ar);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Article a = new Article();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrix(rs.getInt("prix"));
				a.setQuantite(rs.getInt("quantite"));

				articles.add(a);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return articles;
	}

	@Override
	public Article getArticale(int id) throws ClassNotFoundException, SQLException {
		Article a1 = null;
		Connection connection = ConnectionClass.getMyConnexion();

		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM article WHERE id=?");
			// ps.setInt(1, id);
			ps.setInt(1, a1.getId());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				a1 = new Article();
				a1.setId(rs.getInt("id"));
				a1.setNom(rs.getString("nom"));
				a1.setPrix(rs.getInt("prix"));
				a1.setQuantite(rs.getInt("quantite"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return a1;
	}

	@Override
	public void deleteArticle(int id) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionClass.getMyConnexion();
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM ARTICLE WHERE ID=?");
			stmt.setInt(1, id);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Article update(Article a) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionClass.getMyConnexion();
		try {
			PreparedStatement ps = connection
					.prepareStatement("UPDATE ARTICLE SET NOM=?,QUANTITE=?, TYPE=?, PRIX=? WHERE ID=?");
			ps.setString(1, a.getNom());
			ps.setInt(4, a.getPrix());
			ps.setInt(2, a.getQuantite());
			ps.setInt(5, a.getId());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;

	}

//	static Connection conn;
//
//	public void Add(String nom, int prix, int quantite) throws ClassNotFoundException, SQLException {
//		Article article = new Article();
//		try {
//			conn = ConnectionClass.getMyConnexion();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		String sql = "INSERT INTO article(nom,prix,quantite) VALUES(?,?,?)";
//		PreparedStatement statement = conn.prepareStatement(sql);
//		statement.setString(1, nom);
//		statement.setInt(2, prix);
//		statement.setInt(3, quantite);
//		statement.executeQuery();
//
//	}
//
//	@Override
//	public void Update(int id, String nom, int prix, int quantite) throws SQLException {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public static Iterator<Article> DisplayAll() {
//		// Article articles = new Article();
//		List<Article> listArticle = new ArrayList<Article>();
//		Statement stmt = null;
//		try {
//			conn = ConnectionClass.getMyConnexion();
//			String sql = "select * from article";
//			PreparedStatement st = conn.prepareStatement(sql);
//			Article acrticle;
//			ResultSet rs = st.executeQuery();
//			while (rs.next()) {
//				acrticle = new Article(rs.getInt("id"), rs.getString("nom"), rs.getInt("prix"), rs.getInt("quantite"));
////				int id = rs.getInt("id");
////				String nom = rs.getString("nom");
////				int prix = rs.getInt("prix");
////				int quantite = rs.getInt("quantite");
//
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return (Iterator<Article>) listArticle;
//
//	}
}
