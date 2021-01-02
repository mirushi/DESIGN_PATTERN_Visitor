public class ExportVisitor extends Visitor {

    public void doForFan (Fan fan) {
        //Xuất báo cáo cho quạt máy.
        System.out.println("This is a fan report");
    };
    public void doForAirCondition (AirCondition airCondition) {
        //Xuất báo cáo cho máy lạnh.
        System.out.println("This is an air condition report");
    };
    public void doForRefrigerator (Refrigerator refrigerator) {
        //Xuất báo cáo cho tủ lạnh.
        System.out.println("This is a refrigerator report");
    };

}
