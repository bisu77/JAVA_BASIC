package object;

import java.util.ArrayList;

/**
 * Created by bizplay on 2017-08-11.
 */
public class Invoice {
    private static class Item { // Item is nested inside Invoice
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }
    public void billRequest(){
        if(items.size()==0){
            System.out.println("청구할 물품이 없습니다.");
            return ;
        }

        System.out.println("---------------------청 구 서 -----------------------");
        System.out.println("물품   수량   가격         합계");
        int size = items.size();        // items.size()가 for문에 조건문에 들어가면 size를 계속해서 연산하기 때문에 이 방법이 좋다.
        Item item = null;
        double total = 0.0;
        for(int i=0;i<size;i++){
            item = items.get(i);
            System.out.printf("%2s %4d %11.2f %13.2f \n",item.description, item.quantity, item.unitPrice, item.price());
            total += item.price();
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("                           총 합계 : %.2f\n", total);
    }
}