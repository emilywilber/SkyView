public class SkyViewTester {

    public static void main(String[] args) {
        
        double[] values = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        
        SkyView view = new SkyView(4, 3, values);
        System.out.println(view);
        System.out.println();
        
        double[] values2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
        
        SkyView view2 = new SkyView(3, 2, values2);
        System.out.println(view2);
        System.out.println();
        
        System.out.println( view.getAverage(1, 2, 0, 1));
        
    }
}