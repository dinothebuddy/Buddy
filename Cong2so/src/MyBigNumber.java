/**
 * Tác giả: Hoàng Việt Anh
 * Desrciption.
 * Class MyBigNumber là lớp để tính tổng của 2 số s1 và s2.
 * Hàm sum trong Class MyBigNumber là hàm để thực hiện phép cộng 2 chuỗi số.
 */
 
public class MyBigNumber {   
    
    public String sum(final String s1,final String s2) {       
        
        String finalResult = ""; // biến trả về                   
        int dodai1 = s1.length(); // độ dài của chuỗi thứ nhất                   
        int dodai2 = s2.length(); // độ dài của chuỗi thứ hai                  
        int sosanhdodai = (dodai1 > dodai2) ? dodai1 : dodai2; // so sánh độ dài chuỗi
        int vitri1; // Vị trí của chuỗi thứ nhất                                   
        int vitri2; // Vị trí của chuỗi thứ hai
        char laykitu1; // Lấy kí tự ở vị trí cuối cùng của chuỗi thứ nhất
        char laykitu2; // Lấy kí tự ở vị trí cuối cùng của chuỗi thứ hai
        int biennho = 0; // biến ghi nhớ khi cộng 2 số lớn hơn 9                               
        int s = 0; // Khởi tạo biến tổng bằng 0                                      
        
        for (int i = 0; i < sosanhdodai; i++) {
            vitri1 = dodai1 - i - 1; // Lấy vị trí của chuỗi thứ nhất                   
            vitri2 = dodai2 - i - 1; // Lấy vị trí của chuỗi thứ hai
            laykitu1 = (vitri1 >= 0) ? s1.charAt(vitri1) : '0'; // Lấy kí tự từ phải sang trái của chuỗi thứ nhất
            laykitu2 = (vitri2 >= 0) ? s2.charAt(vitri2) : '0'; // Lấy kí tự từ phải sang trái của chuỗi thứ hai
            s = (laykitu1 - '0') + (laykitu2 - '0') + biennho; // Biến đổi kí tự thành số rồi cộng                 
            finalResult = (s % 10) + finalResult; // Lấy s chia dư rồi cộng vào kết quả                           
            biennho = s / 10; // Cập nhật lại biến ghi nhớ
        }
        if (biennho >= 1) {                              
            finalResult = 1 + finalResult; // Nếu cuối cùng còn biến ghi nhớ thì ghép vào trước kết quả       
        }
        
        return finalResult; // Trả về kết quả cuối cùng
    }
}