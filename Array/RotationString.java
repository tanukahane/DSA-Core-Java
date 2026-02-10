public class RotationString {

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";

        if (s1.length() != s2.length()){
            System.out.println("Not a rotation. ");
            return;
        }

        String temp = s1 + s2 ;

        if(temp.contains(s2)){
            System.out.println("s2 is rotation of s1 ");
        } else {
            System.out.println("not a roatation ");
        }





    }
    
}
