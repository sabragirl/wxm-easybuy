package sdkd.com.ec.controller;

import sdkd.com.ec.dao.impl.EbProductDao;
import sdkd.com.ec.model.EbProduct;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Y on 2016/7/6.
 */
public class EbProductBarginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EbProductDao productDao = new EbProductDao();
        List<EbProduct> list = productDao.getProduct_bargin();
        request.setAttribute("productBarginList",list);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
