public class task20_punkt2 {

    public static <E> void  sid  (String s, E [] arr){

        E [] a = arr;
        task20_punkt2_AnyTape <E> sid = new task20_punkt2_AnyTape <E> ();
        sid.setArr(a);


        /*System.out.print(s + "  ");

        for(int i = 0; i< sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i)+" ");

        System.out.println();*/
    }



    public static void main(String [] args){

        String [] s = {"Hello", "World","!"};
        //sid("String" , s);

        Integer [] intr = new Integer[]{ 1,2,3,4,5,6,7,8};
        //sid("Integer" , intr);

        Double [] ad = {1.2,1.5,6.7};
        //sid("Double" , ad);
        intr[0] = 5;
        //sid("Integer", intr);
        task20_punkt2_AnyTape <String> s1 = new task20_punkt2_AnyTape<String>();
        task20_punkt2_AnyTape <Integer> s2 = new task20_punkt2_AnyTape<Integer>();
        task20_punkt2_AnyTape <Double> s3 = new task20_punkt2_AnyTape<Double>();

        s1.setArr(s);
        s1.printer();
        s2.setArr(intr);
        s2.printer();
        s3.setArr(ad);
        s3.printer();








    }

}
