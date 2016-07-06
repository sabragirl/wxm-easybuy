package sdkd.com.ec.dao.impl;

import sdkd.com.ec.dao.BaseDao;
import sdkd.com.ec.model.EbProduct;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016/7/6.
 */

public class EbProductDao extends BaseDao {
    /**
     * 促销商品
     * @return
     */
    public List<EbProduct> getProduct_bargin(){
        List<EbProduct> productList = new ArrayList<EbProduct>();
        String sql = "select * from easybuy_product where ep_bargin = 1";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbProduct product = new EbProduct();
                product.setEpPrice(rs.getDouble("ep_price"));
                product.setEpName(rs.getString("ep_name"));
                product.setEpPicture(rs.getString("ep_picture"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    /**
     * 热销产品
     * @return
     */
    public List<EbProduct> getProduct_hotSale(){
        List<EbProduct> productList = new ArrayList<EbProduct>();
        String sql = "select * from easybuy_product order by ep_sales desc limit 0,12";
        try {
            ResultSet rs = this.executeSearch(sql,null);
            while (rs.next()){
                EbProduct product = new EbProduct();
                product.setEpPrice(rs.getDouble("ep_price"));
                product.setEpName(rs.getString("ep_name"));
                product.setEpPicture(rs.getString("ep_picture"));
                //添加到集合中
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
