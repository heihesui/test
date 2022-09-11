package upgrade.vector;

import jdk.incubator.vector.FloatVector;
import upgrade.nullp.Returned;
import upgrade.nullp.Returned.ErrorCode;
import upgrade.nullp.Returned.ReturnValue;

import static upgrade.nullp.Returned.Undefined;

public class LinearEquation {
    private static final float[] a = new float[]{0.6F, 0.7F, 0.8F, 0.9F};
    static final FloatVector va =
            FloatVector.fromArray(FloatVector.SPECIES_128, a, 0);
    private static final float[] x = new float[]{1.0F, 2.0F, 3.0F, 4.0F};
    static final FloatVector vx =
            FloatVector.fromArray(FloatVector.SPECIES_128, x, 0);

    private static Returned<Float> sumInScalar(float[] a, float[] x) {
        if (a == null || x == null || a.length != x.length) {
            return new ErrorCode(-1);
        }

        float[] y = new float[a.length];
        for (int i = 0; i < a.length; i++) {
            y[i] = a[i] * x[i];
        }

        float r = 0F;
        for (int i = 0; i < y.length; i++) {
            r += y[i];
        }

        return new ReturnValue<>(r);
    }

    private static Returned<Float> sumInVector(FloatVector va, FloatVector vx) {
        if (va == null || vx == null || va.length() != vx.length()) {
            return new ErrorCode(-1);
        }

        // FloatVector vy = va.mul(vx);
        float[] y = va.mul(vx).toArray();

        float r = 0F;
        for (int i = 0; i < y.length; i++) {
            r += y[i];
        }
        return new Returned.ReturnValue<>(r);
    }

    public static void main(String[] args) {
        Returned<Float> rt = LinearEquation.sumInScalar(a, x);
        switch (rt) {
            case ReturnValue rv -> {
                // Get the returned value
                if (rv.returnValue() instanceof Float result) {
                    System.out.println("The summary is: " + result);
                } else {  // unlikely
                    System.out.println(
                            "Implementation error: LinearEquation.sumInScalar");
                }
            }
            case ErrorCode ec -> System.out.println("Invalid input parameters");
            case Undefined undefined -> {
                System.out.println("return null result");
            }
        }
    }
}
