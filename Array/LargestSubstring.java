public class LargestSubstring {
    public static void main(String[] args) {
        
        String s = "abcdefabbc";
        int maxLength = 0;

        for(int i=0 ; i< s.length() ; i++ ){

            boolean [] visited = new boolean[256];
            int currentLength = 0;

            for(int j=i ; j<s.length() ; j++){

               if(visited[s.charAt(j)]){
                    break;
              }
                visited[s.charAt(j)] = true ;
                currentLength++;
            }

            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        System.out.println("length of longest subsring " + maxLength);
    }
    
}
