package DAO;

import java.sql.SQLException;
import java.util.List;

import Modele.Article;

public class TestingFonct {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// test pour ajouter un article
		ArticleDaoImpm test = new ArticleDaoImpm();
		Article a1 = test.save(new Article("ali", 10, 110));
		System.out.println(a1.toString());
		System.out.println("finch article");
		List<Article> artcs = test.articalelist("%a%");
		for(Article a:artcs) {
			System.out.println(a.toString());
		}

//
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//
//		// test pour chercher un article
//		System.out.println("search for articles");
//
//		List<Article> prods = dao.articleParMC("%d%");
//		for (Article p : prods) {
//			System.out.println(p.toString());
//		}

	}

}
