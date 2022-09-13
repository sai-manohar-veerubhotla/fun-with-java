package ca.javafunblog.codingbat;

public class StartOZ {
    public String startOz(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.length() == 1) {
            String o = str.substring(0, 1); // o
            if (o.equals("o")) {
                return "o";
            }
        }

        String oz = str.substring(0, 2); // oz
        String o = str.substring(0, 1); // o
        String z = str.substring(1, 2); // z

        if (oz.equals("oz")) {
            return "oz";
        }

        if (o.equals("o")) {
            return "o";
        }

        if (z.equals("z")) {
            return "z";
        }


        return "";
    }



    public String delDel(String str) {
        if(str.equals("del")){
            return str;
        }
        if(str.length() >= 4 && !str.substring(1, 4).equals("del")){
            return str;
        }

        String[] strings = str.split("del");
        if(strings.length == 0){
            return "";
        }
        String result = "";
        for(String string : strings){
            result += string;
        }

        return result;

    }

    public static void main(String[] args) {
        StartOZ startOZ = new StartOZ();
        System.out.println(startOZ.delDel("del"));
    }


}
