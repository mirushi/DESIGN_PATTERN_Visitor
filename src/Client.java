public class Client {
    public static void main(String[] args) {
        ElectronicEquipment fan = new Fan();
        ElectronicEquipment refrigerator = new Refrigerator();
        ElectronicEquipment airCondition = new AirCondition();

        Visitor exportReportVisitor = new ExportVisitor();

        fan.accept(exportReportVisitor);
        refrigerator.accept(exportReportVisitor);
        airCondition.accept(exportReportVisitor);
    }
}
