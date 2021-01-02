public class Fan extends ElectronicEquipment {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForFan(this);
    }
}
