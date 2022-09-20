package upgrade.vector;

import jdk.incubator.vector.FloatVector;

public class LinearEquation {
    private static final float[] SELF = new float[]{5, 3, 3, 0};
    static final FloatVector SELF_VECTOR =
            FloatVector.fromArray(FloatVector.SPECIES_128, SELF, 0);
    private static final float[] XIAOMING = new float[]{4, 5, 2, 1};
    static final FloatVector XIAOMING_VECTOR =
            FloatVector.fromArray(FloatVector.SPECIES_128, XIAOMING, 0);

    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i < SELF.length; i++) {
            result += Math.pow(SELF[i] - XIAOMING[i], 2);
        }
        result = Math.sqrt(result);
        double resultVector = 0;
        float[] floats = SELF_VECTOR.sub(XIAOMING_VECTOR).pow(2).toArray();
        for (int i = 0; i < floats.length; i++) {
            resultVector += floats[i];
        }
        resultVector = Math.sqrt(resultVector);
    }


}
