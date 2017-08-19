import object.Invoice;

/**
 * Created by bizplay on 2017-08-08.
 */
public class Example_15 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("사과",10,1200);
        invoice.addItem("당근",7,750);
        invoice.addItem("수박",3,17310);
        invoice.billRequest();
    }
}
