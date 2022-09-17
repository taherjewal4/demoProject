package dataStructure;

import java.util.ArrayList;

public class DataStructureClass {


    public static void main(String[] args) {

//        String [] strArray = new String[2];
//
//        strArray[0] ="A";
//        strArray[1] ="B";
//        strArray[2] ="C";
//        strArray[3] ="D";
//        strArray[4] ="E";

//        for (int i =0; i < strArray.length ; i++){
//            System.out.println(strArray[i]);
//        }



//
//        String [] name1= {" David", "Jhon", "Eric"};
//
//
//        System.out.println(name1.length);
//
//
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("David"); //0
        nameList.add("Rose"); //1

        nameList.add("Rosti"); //2
        nameList.add("Jhon"); //3
        nameList.add("Eric"); //4



        for (int i = 0 ; i < nameList.size() ; i ++){
            System.out.println(nameList.get(i));
        }
//        System.out.println();
//        nameList.remove("Eric");
//
//        for (int i = 0 ; i < nameList.size() ; i ++){
//            System.out.println(nameList.get(i));
//        }
//        System.out.println();
//        nameList.add("Jhonb2");
//
//        for (int i = 0 ; i < nameList.size() ; i ++){
//            System.out.println(nameList.get(i));
//        }

//
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        linkedList.add("David");
//
//        linkedList.add("Rose");
//
//        linkedList.add("Rosti");
//        linkedList.add("Jhon");
//        linkedList.add("Eric");
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }



    }
}
