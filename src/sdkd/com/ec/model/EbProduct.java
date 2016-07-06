package sdkd.com.ec.model;

/**
 * Created by Y on 2016/7/6.
 */
public class EbProduct {
    private int epId;
    private String epName;
    private String epDescription;
    private double epPrice;
    private int epStock;
    private int epcId;
    private int epcChildId;
    private String epFileName;
    private String epSales;
    private String epPicture;
    private int epbargin;

    public int getEpId() {

        return epId;
    }

    public void setEpId(int epId) {
        this.epId = epId;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public String getEpDescription() {
        return epDescription;
    }

    public void setEpDescription(String epDescription) {
        this.epDescription = epDescription;
    }

    public double getEpPrice() {
        return epPrice;
    }

    public void setEpPrice(double epPrice) {
        this.epPrice = epPrice;
    }

    public int getEpStock() {
        return epStock;
    }

    public void setEpStock(int epStock) {
        this.epStock = epStock;
    }

    public int getEpcId() {
        return epcId;
    }

    public void setEpcId(int epcId) {
        this.epcId = epcId;
    }

    public int getEpcChildId() {
        return epcChildId;
    }

    public void setEpcChildId(int epcChildId) {
        this.epcChildId = epcChildId;
    }

    public String getEpFileName() {
        return epFileName;
    }

    public void setEpFileName(String epFileName) {
        this.epFileName = epFileName;
    }

    public String getEpSales() {
        return epSales;
    }

    public void setEpSales(String epSales) {
        this.epSales = epSales;
    }

    public String getEpPicture() {
        return epPicture;
    }

    public void setEpPicture(String epPicture) {
        this.epPicture = epPicture;
    }

    public int getEpbargin() {
        return epbargin;
    }

    public void setEpbargin(int epbargin) {
        this.epbargin = epbargin;
    }
}
