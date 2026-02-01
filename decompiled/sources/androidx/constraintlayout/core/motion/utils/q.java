package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class q extends d {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f7292q = false;

    /* renamed from: p, reason: collision with root package name */
    k f7293p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str) {
        this.f7159a = str;
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i4 = 0;
        while (indexOf2 != -1) {
            dArr[i4] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i4++;
        }
        dArr[i4] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f7293p = e(Arrays.copyOf(dArr, i4 + 1));
    }

    private static k d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i4 = 0; i4 < length; i4++) {
            dArr[i4] = Double.parseDouble(split[i4]);
        }
        return e(dArr);
    }

    private static k e(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d4 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            double d5 = dArr[i4];
            int i5 = i4 + length2;
            dArr2[i5][0] = d5;
            double d6 = i4 * d4;
            dArr3[i5] = d6;
            if (i4 > 0) {
                int i6 = (length2 * 2) + i4;
                dArr2[i6][0] = d5 + 1.0d;
                dArr3[i6] = d6 + 1.0d;
                int i7 = i4 - 1;
                dArr2[i7][0] = (d5 - 1.0d) - d4;
                dArr3[i7] = (d6 - 1.0d) - d4;
            }
        }
        k kVar = new k(dArr3, dArr2);
        PrintStream printStream = System.out;
        printStream.println(" 0 " + kVar.c(com.google.firebase.remoteconfig.l.f37524n, 0));
        printStream.println(" 1 " + kVar.c(1.0d, 0));
        return kVar;
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double a(double d4) {
        return this.f7293p.c(d4, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public double b(double d4) {
        return this.f7293p.f(d4, 0);
    }
}
