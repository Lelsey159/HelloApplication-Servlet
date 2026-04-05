/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author LESLEY
 */

@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>My First Servlet</title>");
        out.println("<style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
        out.println("body { ");
        out.println("    font-family: 'Segoe UI', sans-serif;");
        out.println("    background: #1a1a2e;");
        out.println("    min-height: 100vh;");
        out.println("    display: flex;");
        out.println("    justify-content: center;");
        out.println("    align-items: center;");
        out.println("}");
        out.println(".card {");
        out.println("    background: #16213e;");
        out.println("    padding: 50px 60px;");
        out.println("    border-radius: 12px;");
        out.println("    box-shadow: 0 4px 20px rgba(0,0,0,0.3);");
        out.println("    text-align: center;");
        out.println("    max-width: 420px;");
        out.println("    border: 1px solid #0f3460;");
        out.println("}");
        out.println(".line {");
        out.println("    width: 40px;");
        out.println("    height: 3px;");
        out.println("    background: #e94560;");
        out.println("    margin: 0 auto 25px;");
        out.println("}");
        out.println("h1 {");
        out.println("    color: #eaeaea;");
        out.println("    font-size: 26px;");
        out.println("    font-weight: 300;");
        out.println("    margin-bottom: 20px;");
        out.println("    letter-spacing: 1px;");
        out.println("}");
        out.println(".message {");
        out.println("    color: #a0a0a0;");
        out.println("    font-size: 15px;");
        out.println("    line-height: 1.8;");
        out.println("    margin-bottom: 30px;");
        out.println("}");
        out.println(".time {");
        out.println("    font-size: 11px;");
        out.println("    color: #533483;");
        out.println("    text-transform: uppercase;");
        out.println("    letter-spacing: 2px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='card'>");
        out.println("<div class='line'></div>");
        out.println("<h1>Welcome to My First Servlet</h1>");
        out.println("<p class='message'>Hello, welcome to my first servlet!</p>");
        out.println("<p class='time'>" + new java.util.Date() + "</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}