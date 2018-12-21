/**
 * Tác giả: Hoàng Việt Anh
 * Desrciption.
 * Class MyBigNumber là lớp để tính tổng của 2 số s1 và s2.
 * Hàm sum trong Class MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số.
 */
 
public class MyBigNumber {   
    
    public String sum(final String s1,final String s2) {       
        
        String finalResult = "";                  
        int dodai1 = s1.length();                    
        int dodai2 = s2.length();                   
        int sosanhdodai = (dodai1 > dodai2) ? dodai1 : dodai2;
        int vitri1;                                  
        int vitri2;
        char laykitu1;
        char laykitu2;
        int biennho = 0;                               
        int s = 0;                                      
        
        for (int i = 0; i < sosanhdodai; i++) {
            vitri1 = dodai1 - i - 1;                   
            vitri2 = dodai2 - i - 1;
            laykitu1 = (vitri1 >= 0) ? s1.charAt(vitri1) : '0';
            laykitu2 = (vitri2 >= 0) ? s2.charAt(vitri2) : '0';
            s = (laykitu1 - '0') + (laykitu2 - '0') + biennho;                
            finalResult = (s % 10) + finalResult;                            
            biennho = s / 10;
        }
        if (biennho >= 1) {                              
            finalResult = 1 + finalResult;       
        }
        
        return finalResult;
    }
}