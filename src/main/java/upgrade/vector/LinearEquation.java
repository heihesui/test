package upgrade.vector;

import jdk.incubator.vector.FloatVector;

public class LinearEquation {
    private static final float[] self = new float[]{5, 3, 3, 0};
    static final FloatVector selfVector =
            FloatVector.fromArray(FloatVector.SPECIES_128, self, 0);
    private static final float[] xiaoming = new float[]{4, 5, 2, 1};
    static final FloatVector xiaomingVector =
            FloatVector.fromArray(FloatVector.SPECIES_128, xiaoming, 0);

    public static void main(String[] args) {
        double result = 0;
        for (int i = 0; i < self.length; i++) {
            result += Math.pow(self[i] - xiaoming[i], 2);
        }
        result = Math.sqrt(result);
        double resultVector = 0;
        float[] floats = selfVector.sub(xiaomingVector).pow(2).toArray();
        for (int i = 0; i < floats.length; i++) {
            resultVector += floats[i];
        }
        resultVector = Math.sqrt(resultVector);
    }


}
