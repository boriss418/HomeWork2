package homeWorke16;

import homeWorke16entity.Entity;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Entity> entityList = new ArrayList<>();
        File file = new File("C:\\Users\\37529\\IdeaProjects\\eu.senla\\products");
        File fileOrders = new File("C:\\Users\\37529\\IdeaProjects\\eu.senla\\order");
        int lastID = 0;

        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                String [] s = line.split("/");
                Entity entity = new Entity(Integer.parseInt(s[0]), s[1], getDate(s[2]));
                entityList.add(entity);
                lastID =Integer.parseInt(s[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите 1 если хотите работать с таварами, 2 с заказами, 0 выход");
                String num1 = sc.next();

                if("0".equals(num1)){
                    break;
                }
                if("1".equals(num1)){
                    while (true){
                        System.out.println("Выбирите что делать с таварами:");
                        System.out.println("0 - выход, 1 - посмотреть все, 2 - добавить товар, 3 - удалить тавар.");
                        String nu = sc.next();
                        if("1".equals(nu)){
                            System.out.println(entityList);
                        }
                        if ("0".equals(nu)){
                            break;
                        }
                        if (!("0".equals(nu)||"1".equals(nu)||"2".equals(nu)||"3".equals(nu))){
                            System.out.println("Введен неверный символ!!!");
                        }
                        if ("2".equals(nu)){
                            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
                            System.out.println("Введите название товара: ");
                            String name = sc.next();
                            System.out.println("Введите дату изготовления: ...-...-...");
                            String date = sc.next();
                            pw.write("\n"+(lastID+1)+ "/"+name +"/"+ date);
                            lastID++;
                            pw.close();
                        }
                        if("3".equals(nu)){
                            System.out.println("Введите ID товара который нужно удалить: ");
                            String delID = sc.next();

                            Scanner scan = new Scanner(file);
                            File newFile = new File("C:\\Users\\37529\\IdeaProjects\\eu.senla\\bufProduct");
//                            String ID =""; String name = ""; String date = "";
                            try{
                                BufferedWriter prw = new BufferedWriter(new FileWriter(newFile, true));

//                                FileWriter fw =new FileWriter("C:\\Users\\37529\\IdeaProjects\\eu.senla\\bufferProduct", true);
//                                BufferedWriter bw = new BufferedWriter(fw);
//                                PrintWriter pw = new PrintWriter(bw);
//                                Scanner x =new Scanner(new File("C:\\Users\\37529\\IdeaProjects\\eu.senla\\products"));
//                                x.useDelimiter("[,\n]");
                                while (scan.hasNextLine()){
                                    String line = scan.nextLine();
                                    String[] s = line.split("/");
                                    String ID =s[0]; String name = s[1]; String date = s[2];
                                    prw.write(ID+name+date);
//
//                                    if (!s[0].equals(delID )){
//                                    prw.write(ID+name+date);
//                                        System.out.println(true);

//                                    }else{
//                                        System.out.println(false);
//                                    }
                               // }
                                }

                                prw.close();
//                                x.close();
//                                pw.flush();
//                                pw.close();
//                                file.delete();
//                                File dump = new File("C:\\Users\\37529\\IdeaProjects\\eu.senla\\products");
//                                newFile.renameTo(dump);
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());;
                            }
//                            PrintWriter pw1 = new PrintWriter(new FileWriter(file, true));
//                            //PrintWriter nf = new PrintWriter(new FileWriter(newFile, true));
//                            FileWriter fw =new FileWriter("C:\\Users\\37529\\IdeaProjects\\eu.senla\\bufferProduct", true);
//                            BufferedWriter bw = new BufferedWriter(fw);
//                            PrintWriter pw = new PrintWriter(bw);
//                            while (scan.hasNextLine()) {
//                                String line = scan.nextLine();
//                                String[] s = line.split("/");
//                                if (!s[0].equals(delID)) {
//                                    System.out.println(true);
//                                    pw.print(line);
//                                }
//                                    PrintWriter pw = new PrintWriter(new FileWriter(product,true));
//                                    pw.write("\n"+delID);
//                                    pw.close();
//                                }
                           // }

//                            Scanner scan = new Scanner(file);
//                            while (scan.hasNextLine()) {
//                                String line = scan.nextLine();
//                                String[] s = line.split("/");
//
//
//                                    PrintWriter pw = new PrintWriter(new FileWriter(file,!s[0].equals(delID)));
//                                    pw.write("\n"+line);
//                                    pw.close();
//
//                            }
                        }
                    }
                }
                if("2".equals(num1)){
                    while (true){
                        System.out.println("Выберите что делать с заказами: ");
                        System.out.println("0 - выход, 1 - посмотреть все, 2 - добавить заказ, 3 - удалить заказ.");
                        String nu2 = sc.next();
                        if (nu2.equals("0")){
                            break;
                        }
                        if (!("0".equals(nu2)||"1".equals(nu2)||"2".equals(nu2)||"3".equals(nu2))){
                            System.out.println("Введен неверный символ!!!");
                        }
                        if (nu2.equals("1")){

                        }
                    }
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private static LocalDate getDate(String date){
        String [] dateSp = date.split("-");
        return LocalDate.of(Integer.parseInt(dateSp[2]),Integer.parseInt(dateSp[1]),Integer.parseInt(dateSp[0]));
    }
}
