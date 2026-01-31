package BT2_3;

public class BT3 {
    public static void main(String[] args) {
        // 1. Khai báo biến với thông số mới
        double canNang = 75.0;  // kg
        double chieuCao = 1.65; // m

        // 2. Tính BMI sử dụng Math.pow (chieuCao mũ 2)
        // Công thức: BMI = canNang / (chieuCao * chieuCao)
        double bmi = canNang / Math.pow(chieuCao, 2);

        // 3. Làm tròn kết quả đến 2 chữ số thập phân
        double bmiLamTron = Math.round(bmi * 100.0) / 100.0;
        System.out.println("Cân nặng: " + canNang + " kg");
        System.out.println("Chiều cao: " + chieuCao + " m");
        System.out.println("Chỉ số BMI của bạn là: " + bmiLamTron);

        // 4. Phân loại BMI
        if (bmi < 18.5) {
            System.out.println("=> Kết luận: Bạn hơi gầy rồi, bồi bổ thêm nhé!");
        } else if (bmi < 25) {
            System.out.println("=> Kết luận: Tuyệt vời! Thể trạng rất cân đối.");
        } else if (bmi < 30) {
            System.out.println("=> Kết luận: Bạn đang ở ngưỡng thừa cân.");
        } else {
            System.out.println("=> Kết luận: Cảnh báo béo phì! Hãy tập thể dục thôi.");
        }
    }
}
