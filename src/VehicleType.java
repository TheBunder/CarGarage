import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum VehicleType {
    MOTORCYCLE(1), CAR(2), TRUCK(3);

    public final int value;

    VehicleType(int value) {
        this.value = value;
    }

    private static final Map<Integer, VehicleType> map = Arrays.stream(VehicleType.values())
            .collect(Collectors.toMap(v -> v.value, v -> v)); // This two lines my dad wrote

    public static VehicleType getById(int num) {
        return map.get(num);
    }
}
