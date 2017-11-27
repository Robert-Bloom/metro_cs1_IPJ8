public class Interval {

    public static void main(String[] args) {
        double min = Double.parseDouble(args[0]);
        double max = Double.parseDouble(args[1]);
        double x = Double.parseDouble(args[2]);


        String toString = "";

        if(max <= min){
            toString = "Invalid parameters";
            System.out.println(toString);
        }

        for(double i = min; i < max; i=i+x){
            toString = toString + " "+ i + ",";
        }
            toString = toString + " " + max;
            System.out.print(toString);

    }
}
