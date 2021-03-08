package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AcricleDao;
import DAO.ArticleDaoImpm;

//s@WebServlet(name = "test", value = "/test")
public class ServletArticle extends HttpServlet {

	private AcricleDao metie;

	@Override
	public void init() throws ServletException {
		metie = new ArticleDaoImpm();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("article.jsp").forward(req, resp);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//		ArticleDaoImpm article = new ArticleDaoImpm();
//		String nom = request.getParameter("nom");
//		int prix = Integer.parseInt(request.getParameter("prix"));
//		int quantite = Integer.parseInt(request.getParameter("quant"));
//
//		try {
//			article.Add(nom, prix, quantite);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		// resp.sendRedirect("");
//	}
//
//	// @Override
//	// protected void doGet(HttpServletRequest request, HttpServletResponse resp)
//	// throws ServletException, IOException {
////		String nom = request.getParameter("nom");
////		// int prix = request.getParameter("prix");
////		int prix = Integer.parseInt(request.getParameter("prix"));
////		int quantite = Integer.parseInt(request.getParameter("quantite"));
////
////		try {
////			ArticleDaoImpm.Add(nom, prix, quantite);
////		} catch (ClassNotFoundException | SQLException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		resp.sendRedirect("listeClients");
////	}
//	private void listarticle(HttpServletRequest req, HttpServletResponse res) {
//		List<Article> listArticles = (List<Article>) ArticleDaoImpm.DisplayAll();
//		req.setAttribute("listArticles", listArticles);
//		RequestDispatcher desp = req.getRequestDispatcher("index.jsp");
//		desp.forward(req, res);
//
//	}
}
