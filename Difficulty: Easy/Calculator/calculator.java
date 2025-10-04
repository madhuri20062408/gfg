class Solution {
    public static void utility(int a, int b, int opr) {
        // code here
        int s=0;
        if(opr==1){
             System.out.print(String.valueOf(a + b));
        }
        else if(opr==2){
             System.out.print(String.valueOf( a-b));
        }
        else if(opr==3){
             System.out.print(String.valueOf(a * b));
             }
        else{
             System.out.print("Invalid Input");    
             }
    }
}