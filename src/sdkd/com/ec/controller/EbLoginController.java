package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbUserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by Y0 on 2016/7/7.
 */
public class EbLoginController extends HttpServlet {

    public String handleString(String s) {
        try {
            byte bb[] = s.getBytes("UTF-8");
            s = new String(bb);
        }
        catch(Exception ee) {

        }
        return s;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String backnews = "";
        //EbUser ebuser = new EbUser();

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String veryCode = request.getParameter("veryCode");


        if(userName == null) userName = "";
        if(passWord == null) passWord = "";
        if(veryCode == null) veryCode = "";

        if(veryCode != "1234") {
            backnews = "验证码输入错误！";

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
        } // 验证码输入错误，返回注册页面


        String sql = "select * from easybuy_user where eb_user_name=(?) and eb_password=(?)";

        List<String> params = null;
        EbUserDao userDao = new EbUserDao();

        params.add(userName);
        params.add(passWord);

        ResultSet rs = userDao.executeSearch(sql, params);

        if(rs == null) {
            backnews = "密码错误或用户不存在!";

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
            return ;
        }
        else {
            backnews = "用户登录成功!";
        }
        userDao.close();

        request.setAttribute("backnews", backnews);
        //跳转
        request.getRequestDispatcher("/reg-result.jsp").forward(request,response);
    }
}
