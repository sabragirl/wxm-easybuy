package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNoticesDao;
import sdkd.com.ec.model.EbNotices;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ZhangGejin on 2016/7/6.
 */
public class EbNoticesController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        EbNoticesDao noticesDao = new EbNoticesDao();
        List<EbNotices> list = noticesDao.getNotices();
        request.setAttribute("noticeList",list);

        //跳转
        request.getRequestDispatcher("/index.jsp").forward(request,response);


        /**
         * login
         */
        /*EbUser user =  login();
        request.getSession().setAttribute("user",user);*/
        /*String paraId = request.getParameter("id");
        if(paraId!=null && !"".equals(paraId)){
            int id = Integer.valueOf(id);
            EbNews news = newsDao.getNewsById(id);
            request.setAttribute("news",news);
        }*/
    }
}
