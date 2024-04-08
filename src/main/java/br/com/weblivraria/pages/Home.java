package br.com.weblivraria.pages;

import java.io.IOException;

import br.com.weblivraria.dao.DAOLivro;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pagina = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"pt-br\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Home Livraria</title>\r\n"
				+ "\r\n"
				+ "    <style>\r\n"
				+ "        body{\r\n"
				+ "            margin: 0px;\r\n"
				+ "            padding: 0px;\r\n"
				+ "        }\r\n"
				+ "        header{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            color: #84847c;\r\n"
				+ "            font-family: sans-serif;\r\n"
				+ "        }\r\n"
				+ "        #areausuario{\r\n"
				+ "            padding: 15px; \r\n"
				+ "            border-bottom: 1px solid silver ;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa{\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            align-items: center;\r\n"
				+ "            height: 100px;\r\n"
				+ "            border-bottom: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ "        #localizacao img {\r\n"
				+ "            width: 16px;\r\n"
				+ "            height: 16px;\r\n"
				+ "        }\r\n"
				+ "        #usuario img{\r\n"
				+ "            width: 16px;\r\n"
				+ "            height: 16px;\r\n"
				+ "        }\r\n"
				+ "        #areapesquisa img{\r\n"
				+ "            width: 320px;\r\n"
				+ "            height: 200px;\r\n"
				+ "        }\r\n"
				+ "        #carrinho img{\r\n"
				+ "            width: 25px;\r\n"
				+ "            height: 25px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        form img{\r\n"
				+ "            width: 16px !important;\r\n"
				+ "            height: 16px !important;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        form{\r\n"
				+ "            background-color: whitesmoke;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            margin-left: 80px;\r\n"
				+ "            margin-right: 80px;\r\n"
				+ "        }\r\n"
				+ "        input[type=text]{\r\n"
				+ "            width: 700px;\r\n"
				+ "            border: 0px;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            outline: none;\r\n"
				+ "        }\r\n"
				+ "        input[type=\"submit\"]{\r\n"
				+ "            background-color: #84847c;\r\n"
				+ "            color: whitesmoke;\r\n"
				+ "            border: 0px;\r\n"
				+ "            font-size: 12pt;\r\n"
				+ "        }\r\n"
				+ "        #carrinho{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            padding: 15px;\r\n"
				+ "            color: #84847c;\r\n"
				+ "        }\r\n"
				+ "        #areamenu{\r\n"
				+ "            padding: 15px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a{\r\n"
				+ "            color: #84847c;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            margin-left: 10px;\r\n"
				+ "            margin-right: 10px;\r\n"
				+ "        }\r\n"
				+ "        #areamenu a:hover{\r\n"
				+ "            color: olive;\r\n"
				+ "        }\r\n"
				+ "        footer{\r\n"
				+ "            background-color: #ecebeb;\r\n"
				+ "            color: #84847c;\r\n"
				+ "            font-family: sans-serif;\r\n"
				+ "            padding: 40px;\r\n"
				+ "        }\r\n"
				+ "        #rodape h2{\r\n"
				+ "            color:#84847c;\r\n"
				+ "        }\r\n"
				+ "        #rodape{\r\n"
				+ "            line-height: 30px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "        }\r\n"
				+ "        footer a{\r\n"
				+ "            color: olive;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "        #contato a{\r\n"
				+ "            display: flex;\r\n"
				+ "            align-items: center;\r\n"
				+ "        }\r\n"
				+ "        #contato img{\r\n"
				+ "            width: 25px;\r\n"
				+ "            height: 25px;\r\n"
				+ "            \r\n"
				+ "        }\r\n"
				+ "        #generos a{\r\n"
				+ "            display: block;\r\n"
				+ "        }\r\n"
				+ "        #generos{\r\n"
				+ "            width: 400px;\r\n"
				+ "        }\r\n"
				+ "        #copy {\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-top: 1px solid silver;\r\n"
				+ "        }\r\n"
				+ "        #listalivros{\r\n"
				+ "            display: flex;\r\n"
				+ "            flex-wrap: wrap;\r\n"
				+ "            width: 90%;\r\n"
				+ "            margin-left: auto;\r\n"
				+ "            margin-right: auto;\r\n"
				+ "            justify-content: center;\r\n"
				+ "        }\r\n"
				+ "        .livro{\r\n"
				+ "            width: 15%;\r\n"
				+ "           \r\n"
				+ "            border: 1px solid whitesmoke;\r\n"
				+ "            padding: 50px;\r\n"
				+ "        }\r\n"
				+ "        .livro img{\r\n"
				+ "            width: 100%;\r\n"
				+ "            \r\n"
				+ "            \r\n"
				+ "        }\r\n"
				+ "        .livro h4{\r\n"
				+ "            font-family: Verdana;\r\n"
				+ "            font-size: 14pt;\r\n"
				+ "\r\n"
				+ "        }\r\n"
				+ "        .livro p{\r\n"
				+ "            font-family: Verdana;\r\n"
				+ "            color: olive;\r\n"
				+ "            font-size: 15pt;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <div id = \"areausuario\">\r\n"
				+ "            <div id =\"localizacao\">\r\n"
				+ "                <img src=\"pin.png\" alt=\"\">\r\n"
				+ "                Localização da loja\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "            <div id =\"usuario\">\r\n"
				+ "                <img src=\"login.png\" alt=\"\">\r\n"
				+ "                Logar / Cadastrar\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "        <div id = \"areapesquisa\">\r\n"
				+ "            <img src=\"logolivraria.png\" alt=\"\">\r\n"
				+ "            <form action=\"ServiceSearch\" method=\"get\">\r\n"
				+ "                <img src=\"lupa.png\" alt=\"\">\r\n"
				+ "                <input type=\"text\" placeholder=\"Pesquise seu livro\">\r\n"
				+ "                <input type=\"submit\" value=\"Buscar\">\r\n"
				+ "            </form>\r\n"
				+ "\r\n"
				+ "            <div id=\"carrinho\"><img src=\"carrinho.png\" alt=\"\">R$ 0,00</div>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id = \"areamenu\">\r\n"
				+ "\r\n"
				+ "            <nav>\r\n"
				+ "                <a href=\"HOME\">HOME</a>\r\n"
				+ "                <a href=\"#\">ROMANCE</a>\r\n"
				+ "                <a href=\"#\">FANTASIA</a>\r\n"
				+ "                <a href=\"#\">TERROR</a>\r\n"
				+ "                <a href=\"#\">BIOGRAFIAS</a>\r\n"
				+ "                <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                <a href=\"#\">DRAMA</a>\r\n"
				+ "                <a href=\"#\">HQs</a>\r\n"
				+ "            </nav>\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </header>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    <content>\r\n"
				+ "        <div id=\"painel\"><img src=\"painel3.png\" alt=\"\"></div>\r\n"
				+ "        <h2>Nossos Produtos</h2>\r\n"
				+ "        <div id=\"listalivros\">\r\n"
				;
				String conteudo ="";
				DAOLivro dlivro = new DAOLivro();
				for (int i = 0; i < dlivro.listar().size() ; i++) {
				
				
				conteudo+= "            <div class=\"livro\">\r\n"
				+ "                <img src="+dlivro.listar().get(i).getCapa()+" alt=\"\">\r\n"
				+ "                <h4>"+dlivro.listar().get(i).getTitulo()+"</h4>\r\n"
				+ "                <p class=\"preco\"> R$ "+dlivro.listar().get(i).getPreco()+"</p>\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "            \r\n"
				;
				}
				
				pagina+= conteudo;
		
		
		
		
		pagina+="        </div>\r\n"
				+ "    </content>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    <footer>\r\n"
				+ "\r\n"
				+ "        <div id=\"rodape\">\r\n"
				+ "            <div id =\"contato\">\r\n"
				+ "           <h2>Nossos Contatos</h2>\r\n"
				+ "            (11) 96583-7854 | 96325-7852 <br>\r\n"
				+ "            Av. Rangi, 698 - Ilha Kyoshi - Reino da Terra - MA <br>\r\n"
				+ "            <a href=\"https://wa.me/5511964340412\"><img src=\"whatsapp2.png\" alt=\"\">(11) 96434-0412</a>\r\n"
				+ "     \r\n"
				+ "            </div>\r\n"
				+ "            \r\n"
				+ "            <div id = \"generos\">\r\n"
				+ "                <h2>Generos</h2>\r\n"
				+ "                <nav>\r\n"
				+ "                    <a href=\"HOME\">HOME</a>\r\n"
				+ "                    <a href=\"#\">ROMANCE</a>\r\n"
				+ "                    <a href=\"#\">FANTASIA</a>\r\n"
				+ "                    <a href=\"#\">TERROR</a>\r\n"
				+ "                    <a href=\"#\">BIOGRAFIAS</a>\r\n"
				+ "                    <a href=\"#\">SUSPENSE</a>\r\n"
				+ "                    <a href=\"#\">DRAMA</a>\r\n"
				+ "                    <a href=\"#\">HQs</a>\r\n"
				+ "                </nav>\r\n"
				+ "            </div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "        <div id=\"copy\">\r\n"
				+ "            ©Copyright-todos os direitos reservados | desing by <a href=\"https://github.com/Maysa502/ProjetoLivraria\">Maysa Arruda</a></div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		
		response.getWriter().append(pagina);
	}

}
