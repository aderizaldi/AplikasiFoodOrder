package ade.food.order;
import static ade.food.order.Cashier.getStringArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class testMain {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Data data = new Data();
        ArrayList<String> dataBest = new ArrayList();
        dataBest = data.getDataBest();
        for(int i = 0; i < dataBest.size();i++){
            System.out.println(dataBest.get(i));
        }
    }

}
