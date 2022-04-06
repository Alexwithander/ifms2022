/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsi.lpiv.laboratorio;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex
 */
@WebServlet("/calc")
public class MeuSegundoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("<h1>Calculadora</h1>");
        out.print("<form method='POST'>");
        out.print("N1: <input name='n1'>");
        out.print("N2: <input name='n2'>");
        out.print("<button type='submit'>Somar</button>");
        out.print("</form>");
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n1 = req.getParameter("n1");
        String n2 = req.getParameter("n2");
        Integer res = Integer.parseInt(n1) + Integer.parseInt(n2);
        
        PrintWriter out = resp.getWriter();
        out.print("<h1>Resultado de ");
        out.print(n1+" + "+n2);
        out.print("</h1>");
        out.print("<h2>");
        out.print(res);
        out.print("</h2>");
        
        out.print("<form method='GET'>");
        out.print("<button type='submit'>Voltar</button>");
        out.print("</form>");
    }
    
    
    
    
    
}
