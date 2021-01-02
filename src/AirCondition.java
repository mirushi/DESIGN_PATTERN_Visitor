public class AirCondition extends ElectronicEquipment {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForAirCondition(this);
    }
}
