package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12406a = "PathParser";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f12407a;

        /* renamed from: b, reason: collision with root package name */
        boolean f12408b;

        a() {
        }
    }

    private J() {
    }

    private static void a(ArrayList<b> arrayList, char c4, float[] fArr) {
        arrayList.add(new b(c4, fArr));
    }

    public static boolean b(@androidx.annotation.P b[] bVarArr, @androidx.annotation.P b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            b bVar = bVarArr[i4];
            char c4 = bVar.f12409a;
            b bVar2 = bVarArr2[i4];
            if (c4 != bVar2.f12409a || bVar.f12410b.length != bVar2.f12410b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i4, int i5) {
        if (i4 <= i5) {
            int length = fArr.length;
            if (i4 >= 0 && i4 <= length) {
                int i6 = i5 - i4;
                int min = Math.min(i6, length - i4);
                float[] fArr2 = new float[i6];
                System.arraycopy(fArr, i4, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            int j4 = j(str, i4);
            String trim = str.substring(i5, j4).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i5 = j4;
            i4 = j4 + 1;
        }
        if (i4 - i5 == 1 && i5 < str.length()) {
            a(arrayList, str.charAt(i5), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d4 = d(str);
        if (d4 != null) {
            try {
                b.e(d4, path);
                return path;
            } catch (RuntimeException e4) {
                throw new RuntimeException("Error in parsing " + str, e4);
            }
        }
        return null;
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            bVarArr2[i4] = new b(bVarArr[i4]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x001e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.J.a r10) {
        /*
            r0 = 0
            r10.f12408b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f12408b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f12408b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f12407a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.J.g(java.lang.String, int, androidx.core.graphics.J$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                a aVar = new a();
                int length = str.length();
                int i4 = 1;
                int i5 = 0;
                while (i4 < length) {
                    g(str, i4, aVar);
                    int i6 = aVar.f12407a;
                    if (i4 < i6) {
                        fArr[i5] = Float.parseFloat(str.substring(i4, i6));
                        i5++;
                    }
                    if (aVar.f12408b) {
                        i4 = i6;
                    } else {
                        i4 = i6 + 1;
                    }
                }
                return c(fArr, 0, i5);
            } catch (NumberFormatException e4) {
                throw new RuntimeException("error in parsing \"" + str + "\"", e4);
            }
        }
        return new float[0];
    }

    public static boolean i(b[] bVarArr, b[] bVarArr2, b[] bVarArr3, float f4) {
        if (bVarArr != null && bVarArr2 != null && bVarArr3 != null) {
            if (bVarArr.length == bVarArr2.length && bVarArr2.length == bVarArr3.length) {
                if (!b(bVarArr2, bVarArr3)) {
                    return false;
                }
                for (int i4 = 0; i4 < bVarArr.length; i4++) {
                    bVarArr[i4].d(bVarArr2[i4], bVarArr3[i4], f4);
                }
                return true;
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
    }

    private static int j(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i4 = 0; i4 < bVarArr2.length; i4++) {
            bVarArr[i4].f12409a = bVarArr2[i4].f12409a;
            int i5 = 0;
            while (true) {
                float[] fArr = bVarArr2[i4].f12410b;
                if (i5 < fArr.length) {
                    bVarArr[i4].f12410b[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f12409a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f12410b;

        b(char c4, float[] fArr) {
            this.f12409a = c4;
            this.f12410b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void a(Path path, float[] fArr, char c4, char c5, float[] fArr2) {
            int i4;
            int i5;
            int i6;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c6 = c5;
            boolean z3 = false;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c6) {
                case 'A':
                case com.clj.fastble.data.c.f27055F /* 97 */:
                    i4 = 7;
                    i5 = i4;
                    break;
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                case 'c':
                    i4 = 6;
                    i5 = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case kotlin.io.encoding.a.f52115i /* 76 */:
                case 'M':
                case 'T':
                case 'l':
                case androidx.appcompat.app.i.f4871X /* 109 */:
                case 't':
                default:
                    i5 = 2;
                    break;
                case com.clj.fastble.data.c.f27051B /* 81 */:
                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    i5 = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i7 = 0;
            char c7 = c4;
            while (i7 < fArr2.length) {
                if (c6 != 'A') {
                    if (c6 == 'C') {
                        i6 = i7;
                        int i8 = i6 + 2;
                        int i9 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        f18 = fArr2[i10];
                        float f22 = fArr2[i11];
                        float f23 = fArr2[i8];
                        float f24 = fArr2[i9];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c6 == 'H') {
                        i6 = i7;
                        path.lineTo(fArr2[i6], f19);
                        f18 = fArr2[i6];
                    } else if (c6 == 'Q') {
                        i6 = i7;
                        int i12 = i6 + 1;
                        int i13 = i6 + 2;
                        int i14 = i6 + 3;
                        path.quadTo(fArr2[i6], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f25 = fArr2[i6];
                        float f26 = fArr2[i12];
                        f18 = fArr2[i13];
                        f19 = fArr2[i14];
                        f14 = f25;
                        f15 = f26;
                    } else if (c6 == 'V') {
                        i6 = i7;
                        path.lineTo(f18, fArr2[i6]);
                        f19 = fArr2[i6];
                    } else if (c6 != 'a') {
                        if (c6 != 'c') {
                            if (c6 == 'h') {
                                path.rLineTo(fArr2[i7], 0.0f);
                                f18 += fArr2[i7];
                            } else if (c6 != 'q') {
                                if (c6 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i7]);
                                    f7 = fArr2[i7];
                                } else if (c6 == 'L') {
                                    int i15 = i7 + 1;
                                    path.lineTo(fArr2[i7], fArr2[i15]);
                                    f18 = fArr2[i7];
                                    f19 = fArr2[i15];
                                } else if (c6 == 'M') {
                                    f18 = fArr2[i7];
                                    f19 = fArr2[i7 + 1];
                                    if (i7 > 0) {
                                        path.lineTo(f18, f19);
                                    } else {
                                        path.moveTo(f18, f19);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 'S') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    float f27 = f19;
                                    float f28 = f18;
                                    int i16 = i7 + 1;
                                    int i17 = i7 + 2;
                                    int i18 = i7 + 3;
                                    path.cubicTo(f28, f27, fArr2[i7], fArr2[i16], fArr2[i17], fArr2[i18]);
                                    f4 = fArr2[i7];
                                    f5 = fArr2[i16];
                                    f18 = fArr2[i17];
                                    f19 = fArr2[i18];
                                    f14 = f4;
                                    f15 = f5;
                                } else if (c6 == 'T') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    int i19 = i7 + 1;
                                    path.quadTo(f18, f19, fArr2[i7], fArr2[i19]);
                                    i6 = i7;
                                    f15 = f19;
                                    f14 = f18;
                                    f18 = fArr2[i7];
                                    f19 = fArr2[i19];
                                } else if (c6 == 'l') {
                                    int i20 = i7 + 1;
                                    path.rLineTo(fArr2[i7], fArr2[i20]);
                                    f18 += fArr2[i7];
                                    f7 = fArr2[i20];
                                } else if (c6 == 'm') {
                                    float f29 = fArr2[i7];
                                    f18 += f29;
                                    float f30 = fArr2[i7 + 1];
                                    f19 += f30;
                                    if (i7 > 0) {
                                        path.rLineTo(f29, f30);
                                    } else {
                                        path.rMoveTo(f29, f30);
                                        i6 = i7;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c6 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        float f31 = f18 - f14;
                                        f8 = f19 - f15;
                                        f9 = f31;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i21 = i7 + 1;
                                    int i22 = i7 + 2;
                                    int i23 = i7 + 3;
                                    path.rCubicTo(f9, f8, fArr2[i7], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f4 = fArr2[i7] + f18;
                                    f5 = fArr2[i21] + f19;
                                    f18 += fArr2[i22];
                                    f6 = fArr2[i23];
                                } else if (c6 == 't') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f10 = f18 - f14;
                                        f11 = f19 - f15;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i24 = i7 + 1;
                                    path.rQuadTo(f10, f11, fArr2[i7], fArr2[i24]);
                                    float f32 = f10 + f18;
                                    float f33 = f11 + f19;
                                    f18 += fArr2[i7];
                                    f19 += fArr2[i24];
                                    f15 = f33;
                                    f14 = f32;
                                }
                                f19 += f7;
                            } else {
                                int i25 = i7 + 1;
                                int i26 = i7 + 2;
                                int i27 = i7 + 3;
                                path.rQuadTo(fArr2[i7], fArr2[i25], fArr2[i26], fArr2[i27]);
                                f4 = fArr2[i7] + f18;
                                f5 = fArr2[i25] + f19;
                                f18 += fArr2[i26];
                                f6 = fArr2[i27];
                            }
                            i6 = i7;
                        } else {
                            int i28 = i7 + 2;
                            int i29 = i7 + 3;
                            int i30 = i7 + 4;
                            int i31 = i7 + 5;
                            path.rCubicTo(fArr2[i7], fArr2[i7 + 1], fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                            f4 = fArr2[i28] + f18;
                            f5 = fArr2[i29] + f19;
                            f18 += fArr2[i30];
                            f6 = fArr2[i31];
                        }
                        f19 += f6;
                        f14 = f4;
                        f15 = f5;
                        i6 = i7;
                    } else {
                        int i32 = i7 + 5;
                        int i33 = i7 + 6;
                        i6 = i7;
                        c(path, f18, f19, fArr2[i32] + f18, fArr2[i33] + f19, fArr2[i7], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f18 += fArr2[i32];
                        f19 += fArr2[i33];
                    }
                    i7 = i6 + i5;
                    c7 = c5;
                    c6 = c7;
                    z3 = false;
                } else {
                    i6 = i7;
                    int i34 = i6 + 5;
                    int i35 = i6 + 6;
                    c(path, f18, f19, fArr2[i34], fArr2[i35], fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f18 = fArr2[i34];
                    f19 = fArr2[i35];
                }
                f15 = f19;
                f14 = f18;
                i7 = i6 + i5;
                c7 = c5;
                c6 = c7;
                z3 = false;
            }
            fArr[z3 ? 1 : 0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        private static void b(Path path, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
            double d13 = d6;
            int ceil = (int) Math.ceil(Math.abs((d12 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d10);
            double sin = Math.sin(d10);
            double cos2 = Math.cos(d11);
            double sin2 = Math.sin(d11);
            double d14 = -d13;
            double d15 = d14 * cos;
            double d16 = d7 * sin;
            double d17 = (d15 * sin2) - (d16 * cos2);
            double d18 = d14 * sin;
            double d19 = d7 * cos;
            double d20 = (sin2 * d18) + (cos2 * d19);
            double d21 = d12 / ceil;
            double d22 = d20;
            double d23 = d17;
            int i4 = 0;
            double d24 = d8;
            double d25 = d9;
            double d26 = d11;
            while (i4 < ceil) {
                double d27 = d26 + d21;
                double sin3 = Math.sin(d27);
                double cos3 = Math.cos(d27);
                double d28 = (d4 + ((d13 * cos) * cos3)) - (d16 * sin3);
                double d29 = d5 + (d13 * sin * cos3) + (d19 * sin3);
                double d30 = (d15 * sin3) - (d16 * cos3);
                double d31 = (sin3 * d18) + (cos3 * d19);
                double d32 = d27 - d26;
                double tan = Math.tan(d32 / 2.0d);
                double sin4 = (Math.sin(d32) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d33 = d24 + (d23 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d33, (float) (d25 + (d22 * sin4)), (float) (d28 - (sin4 * d30)), (float) (d29 - (sin4 * d31)), (float) d28, (float) d29);
                i4++;
                d21 = d21;
                sin = sin;
                d24 = d28;
                d18 = d18;
                cos = cos;
                d26 = d27;
                d22 = d31;
                d23 = d30;
                ceil = ceil;
                d25 = d29;
                d13 = d6;
            }
        }

        private static void c(Path path, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z3, boolean z4) {
            double d4;
            double d5;
            boolean z5;
            double radians = Math.toRadians(f10);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d6 = f4;
            double d7 = d6 * cos;
            double d8 = f5;
            double d9 = f8;
            double d10 = (d7 + (d8 * sin)) / d9;
            double d11 = ((-f4) * sin) + (d8 * cos);
            double d12 = f9;
            double d13 = d11 / d12;
            double d14 = f7;
            double d15 = ((f6 * cos) + (d14 * sin)) / d9;
            double d16 = (((-f6) * sin) + (d14 * cos)) / d12;
            double d17 = d10 - d15;
            double d18 = d13 - d16;
            double d19 = (d10 + d15) / 2.0d;
            double d20 = (d13 + d16) / 2.0d;
            double d21 = (d17 * d17) + (d18 * d18);
            if (d21 == com.google.firebase.remoteconfig.l.f37524n) {
                Log.w(J.f12406a, " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < com.google.firebase.remoteconfig.l.f37524n) {
                Log.w(J.f12406a, "Points are too far apart " + d21);
                float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
                c(path, f4, f5, f6, f7, f8 * sqrt, f9 * sqrt, f10, z3, z4);
                return;
            }
            double sqrt2 = Math.sqrt(d22);
            double d23 = d17 * sqrt2;
            double d24 = sqrt2 * d18;
            if (z3 == z4) {
                d4 = d19 - d24;
                d5 = d20 + d23;
            } else {
                d4 = d19 + d24;
                d5 = d20 - d23;
            }
            double atan2 = Math.atan2(d13 - d5, d10 - d4);
            double atan22 = Math.atan2(d16 - d5, d15 - d4) - atan2;
            if (atan22 >= com.google.firebase.remoteconfig.l.f37524n) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z4 != z5) {
                if (atan22 > com.google.firebase.remoteconfig.l.f37524n) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d25 = d4 * d9;
            double d26 = d5 * d12;
            b(path, (d25 * cos) - (d26 * sin), (d25 * sin) + (d26 * cos), d9, d12, d6, d8, radians, atan2, atan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c4 = 'm';
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                b bVar = bVarArr[i4];
                a(path, fArr, c4, bVar.f12409a, bVar.f12410b);
                c4 = bVarArr[i4].f12409a;
            }
        }

        public void d(b bVar, b bVar2, float f4) {
            this.f12409a = bVar.f12409a;
            int i4 = 0;
            while (true) {
                float[] fArr = bVar.f12410b;
                if (i4 < fArr.length) {
                    this.f12410b[i4] = (fArr[i4] * (1.0f - f4)) + (bVar2.f12410b[i4] * f4);
                    i4++;
                } else {
                    return;
                }
            }
        }

        b(b bVar) {
            this.f12409a = bVar.f12409a;
            float[] fArr = bVar.f12410b;
            this.f12410b = J.c(fArr, 0, fArr.length);
        }
    }
}
