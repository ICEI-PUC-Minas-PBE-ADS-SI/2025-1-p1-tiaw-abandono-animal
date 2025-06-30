import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroONG")
public class CadastroONG extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        String nomeOng = request.getParameter("nome_ong");
        String cnpj = request.getParameter("cnpj");
        String email = request.getParameter("email");
        String contato = request.getParameter("contato");
        String observacoes = request.getParameter("observacoes");

        // Validações simples no backend
        if (!cnpj.matches("\\d{14}")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "CNPJ inválido. Deve conter 14 dígitos numéricos.");
            return;
        }

        if (!contato.matches("\\d{10,15}")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Contato inválido. Deve conter entre 10 e 15 dígitos numéricos.");
            return;
        }

        String json = String.format(
            "{\n \"nome_ong\": \"%s\",\n \"cnpj\": \"%s\",\n \"email\": \"%s\",\n \"contato\": \"%s\",\n \"observacoes\": \"%s\"\n}",
            nomeOng, cnpj, email, contato, observacoes
        );

        System.out.println("Cadastro recebido: " + json);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Cadastro realizado com sucesso!</h2>");
        response.getWriter().println("<pre>" + json + "</pre>");
    }
}
