public class Refrigerator extends ElectronicEquipment {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForRefrigerator(this);
    }
}
