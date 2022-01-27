package ade.food.order;

import java.io.*;
import java.util.*;

public class Data {
    public ArrayList<String> getDataRegister() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/user.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataRegister(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/user.txt", true)))) {
            tulis.println(str);
        }
    }
    
    public ArrayList<String> getDataHot() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/hot.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataHot(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/hot.txt", true)))) {
            tulis.println(str);
        }
    }
    
    public ArrayList<String> getDataCold() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/cold.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataCold(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/cold.txt", true)))) {
            tulis.println(str);
        }
    }
    public ArrayList<String> getDataNoodle() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/noodle.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataNoodle(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/noodle.txt", true)))) {
            tulis.println(str);
        }
    }
    public ArrayList<String> getDataMeat() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/meat.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataMeat(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/meat.txt", true)))) {
            tulis.println(str);
        }
    }
    public ArrayList<String> getDataSeafood() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/seafood.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataSeafood(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/seafood.txt", true)))) {
            tulis.println(str);
        }
    }
    public ArrayList<String> getDataRice() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/rice.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void addDataRice(String str) throws IOException{
        try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/rice.txt", true)))) {
            tulis.println(str);
        }
    }
    
    public void addLastLogin(String str) throws IOException{
        try (FileWriter tulis = new FileWriter("data/lastLogin.txt")) {
            tulis.write(str);
        }
    }
    
    public String getLastLogin() throws FileNotFoundException{
        Scanner inp = new Scanner(new FileReader("data/lastLogin.txt"));
        String data = inp.nextLine();
        return data;
    }
    
    public void addThisOrder(String str) throws IOException{
       try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/thisOrder.txt", true)))) {
            tulis.println(str);
        }
    }
    
    public ArrayList<String> getThisOrder() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/thisOrder.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
    
    public void newOrder() throws IOException{
        try (FileWriter tulis = new FileWriter("data/thisOrder.txt")) {
            tulis.write("null-0\n");
        }
    }
    
     public ArrayList<String> getDataTrans() throws FileNotFoundException{
        ArrayList<String> data = new ArrayList();
        Scanner inp = new Scanner(new FileReader("data/trans.txt"));
        while(inp.hasNextLine()){
            data.add(inp.nextLine());
        }
        return data;
    }
     
     public void addDataTrans(String str) throws IOException{
       try (PrintWriter tulis = new PrintWriter(new BufferedWriter(new FileWriter("data/trans.txt", true)))) {
            tulis.println(str);
        }
    }
     public void rewritedDataTrans(ArrayList<String> arr) throws IOException{
        try (FileWriter tulis = new FileWriter("data/trans.txt")) {
            for(int i = 0; i < arr.size(); i++){
                String j = arr.get(i);
                tulis.write(j + "\n");
            }
        }
     }
     public ArrayList<String> getDataBest() throws FileNotFoundException, IOException{
         ArrayList<String> dataTrans = new ArrayList();
         ArrayList<String> dataBest = new ArrayList();
         dataTrans = getDataTrans();
         for(int i = 0; i < dataTrans.size(); i++){
            Scanner inp = new Scanner(new FileReader("data/best.txt"));
             String s = dataTrans.get(i);
             String[] splitted = s.split("\\$");
             String[] splitted2 = splitted[0].split("\\;");
             for(int j = 0; j < splitted2.length; j ++){
                 dataBest.add(splitted2[j]+";"+"1");
             }
         }
      
         int ii = dataBest.size();
         int i = 0;
         while(i < ii){
             String[] splitted4 = dataBest.get(i).split("\\;");
             int jj = dataBest.size();
             int j = 0;
             while(j < jj){             
                 String[] splitted5 = dataBest.get(j).split("\\;");
                 if(i != j){
                     if(splitted4[0].equals(splitted5[0])){
                         int n = Integer.parseInt(splitted4[1]);
                         n++;
                         String nn = Integer.toString(n);
                         dataBest.set(i, splitted4[0]+";"+nn);
                         dataBest.remove(j);
                         jj--;
                         ii--;
                         break; 
                     }
                 }
                 j++;
             }
             i++;
         }
         
         for(int x = 0; x < dataBest.size(); x++){      
             for(int y = 1; y < dataBest.size()-1; y++){
                 String[] splitted4 = dataBest.get(y).split("\\;");
                 int xx = Integer.parseInt(splitted4[1]);
                 
                 String[] splitted5 = dataBest.get(y-1).split("\\;");
                 int yy = Integer.parseInt(splitted5[1]);
                 if(xx >= yy){
                     String temp = dataBest.get(y-1);
                     dataBest.set(y-1, dataBest.get(y));
                     dataBest.set(y, temp);
                 }
             }
         }
         
         return dataBest;
     }
}
