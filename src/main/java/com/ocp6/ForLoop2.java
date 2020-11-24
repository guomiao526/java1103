
package com.ocp6;


public class ForLoop2 {

   
    public static void main(String[] args) {
    double [][] rows = {
        {170.0, 180.5, 165.3},
        {60.4, 89.5, 41.2}
    };
    // enhanced for loop
//    for(double i:rows[0]){
//        System.out.println(i);
//        
//    }
//      for(double s:rows[1]){
//        System.out.println(s);
//        
//    }
for(double [] row:rows){
    for(double d : row){
        System.out.println(d);
    }
}

        for (int i=0 ; i<rows.length ; i++) {
            for(int j=0;j<rows[i].length;j++){
                
            
            System.out.println(rows[i][j]);
            }
        }
    }
    
        
        
    
    
}
