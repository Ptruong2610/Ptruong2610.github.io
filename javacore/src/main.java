public class main {
    public static void main(String[] args) {
        // chu vi hinh chu nhat: (a+b)*2
        // dien tich hinh chu nhat: a*b
        double heigh = 10;
        double width= 20;
        double p= (heigh+width)*2;
        double s= heigh*width;
        // dien tich hinh tron S= r*r*PI
        // chi vi hinh tron C= 2*r*PI
        //d duong kinh hinh trong d=2*r;
        final double S = 113;
        double r = Math.sqrt(S/Math.PI);
        double C = 2*r*Math.PI;
        System.out.println(2*r);
        System.out.print("Chu vi hinh tron la:");
        System.out.println(C);
        System.out.println(p);
        System.out.println(s);

        //<điều kiện> ? < biểu thức 1> : <Biểu thức2>;
        String condition = heigh> width ? "ok" : "no";
        System.out.println(condition);
    }
//    public static void chuVi(double heigh, double width){
//        double p= heigh*width;
//    }
}
