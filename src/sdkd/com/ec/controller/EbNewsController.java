package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbNewsDao;
import sdkd.com.ec.dao.impl.EbNoticesDao;
import sdkd.com.ec.dao.impl.EbProductDao;
import sdkd.com.ec.model.EbNews;
import sdkd.com.ec.model.EbNotices;
import sdkd.com.ec.model.EbProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by SDUST-132 on 2016/7/6.
 */
public class EbNewsController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        EbNewsDao newsDao = new EbNewsDao();
        List<EbNews> list = newsDao.getNews();
        request.setAttribute("newList",list);

        EbNoticesDao noticesDao = new EbNoticesDao();
        List<EbNotices> list2 = noticesDao.getNotices();
        request.setAttribute("noticeList",list2);

        EbProductDao productDao = new EbProductDao();
        List<EbProduct> list3 = productDao.getProduct_bargin();
        request.setAttribute("productBarginList",list3);

        EbProductDao product2Dao = new EbProductDao();
        List<EbProduct> list4 = product2Dao.getProduct_hotSale();
        request.setAttribute("productHotsaleList",list4);

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
