package edu.ncst.websx.servlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//失败
@WebServlet(name="cancledelete",urlPatterns = "/cancledelete")
public class CancleDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ct_id = req.getParameter("ct_id");
        // 调用DBUtil.deleteContact(ct_id);
            DBUtil.cancelDeleteContact(ct_id);
            RequestDispatcher rd = req.getRequestDispatcher("ContactList.jsp");
            rd.forward(req, resp);
  }
}