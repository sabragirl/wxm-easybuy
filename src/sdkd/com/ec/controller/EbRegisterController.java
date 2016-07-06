package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbUserDao;
import sdkd.com.ec.model.EbUser;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 注册
 * Created by 王晓敏 on 2016/7/6.
 */
public class EbRegisterController extends HttpServlet {

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
        request.setAttribute("backnews", backnews);

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String rePassWord = request.getParameter("rePassWord");
        String veryCode = request.getParameter("veryCode");


        if(userName == null) userName = "";
        if(passWord == null) passWord = "";
        if(rePassWord == null) rePassWord = "";
        if(veryCode == null) veryCode = "";

        if(!veryCode.equals("1234")) {
            backnews = "验证码输入错误！";
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
        } // 验证码输入错误，返回注册页面

        if(!passWord.equals(rePassWord)) {
            backnews = "两次密码不同，注册失败！";

            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request, response);
            return ;
        }
        boolean isLD = true;

        boolean boo = userName.length()>0&&passWord.length()>0&&isLD;

        String sql = "insert into easybuy_user(eu_user_name, eu_password) values(?, ?)";

        List<String> params = new ArrayList<String>();
        EbUserDao userDao = new EbUserDao();

        if(boo) {
            params.add(userName);
            params.add(passWord);

            int m =  userDao.exeucteModify(sql, params);
            if(m != 0) {
                backnews = "注册成功！啊啊啊啊啊";
            }
            else {
                backnews = "该玩家昵称已被使用，请您更换昵称！";
            }
        }
        else {
            backnews = "信息填写不完整或名字中有非法字符！";
        }
//        userDao.close();


        //跳转
        request.getRequestDispatcher("/reg-result.jsp").forward(request,response);

        userDao.close();
    }
}
