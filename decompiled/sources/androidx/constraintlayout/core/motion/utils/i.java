package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final int f7217d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f7218a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        CustomAttribute[] f7219b = new CustomAttribute[101];

        /* renamed from: c, reason: collision with root package name */
        int f7220c;

        public a() {
            b();
        }

        public void a(int i4, CustomAttribute customAttribute) {
            if (this.f7219b[i4] != null) {
                e(i4);
            }
            this.f7219b[i4] = customAttribute;
            int[] iArr = this.f7218a;
            int i5 = this.f7220c;
            this.f7220c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f7218a, f7217d);
            Arrays.fill(this.f7219b, (Object) null);
            this.f7220c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f7218a, this.f7220c)));
            printStream.print("K: [");
            for (int i4 = 0; i4 < this.f7220c; i4++) {
                PrintStream printStream2 = System.out;
                if (i4 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                printStream2.print(str + g(i4));
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f7218a[i4];
        }

        public void e(int i4) {
            this.f7219b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f7220c;
                if (i5 < i7) {
                    int[] iArr = this.f7218a;
                    if (i4 == iArr[i5]) {
                        iArr[i5] = f7217d;
                        i6++;
                    }
                    if (i5 != i6) {
                        iArr[i5] = iArr[i6];
                    }
                    i6++;
                    i5++;
                } else {
                    this.f7220c = i7 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.f7220c;
        }

        public CustomAttribute g(int i4) {
            return this.f7219b[this.f7218a[i4]];
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: d, reason: collision with root package name */
        private static final int f7221d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f7222a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        androidx.constraintlayout.core.motion.a[] f7223b = new androidx.constraintlayout.core.motion.a[101];

        /* renamed from: c, reason: collision with root package name */
        int f7224c;

        public b() {
            b();
        }

        public void a(int i4, androidx.constraintlayout.core.motion.a aVar) {
            if (this.f7223b[i4] != null) {
                e(i4);
            }
            this.f7223b[i4] = aVar;
            int[] iArr = this.f7222a;
            int i5 = this.f7224c;
            this.f7224c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f7222a, f7221d);
            Arrays.fill(this.f7223b, (Object) null);
            this.f7224c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f7222a, this.f7224c)));
            printStream.print("K: [");
            for (int i4 = 0; i4 < this.f7224c; i4++) {
                PrintStream printStream2 = System.out;
                if (i4 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                printStream2.print(str + g(i4));
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f7222a[i4];
        }

        public void e(int i4) {
            this.f7223b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f7224c;
                if (i5 < i7) {
                    int[] iArr = this.f7222a;
                    if (i4 == iArr[i5]) {
                        iArr[i5] = f7221d;
                        i6++;
                    }
                    if (i5 != i6) {
                        iArr[i5] = iArr[i6];
                    }
                    i6++;
                    i5++;
                } else {
                    this.f7224c = i7 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.f7224c;
        }

        public androidx.constraintlayout.core.motion.a g(int i4) {
            return this.f7223b[this.f7222a[i4]];
        }
    }

    /* loaded from: classes.dex */
    static class c {

        /* renamed from: d, reason: collision with root package name */
        private static final int f7225d = 999;

        /* renamed from: a, reason: collision with root package name */
        int[] f7226a = new int[101];

        /* renamed from: b, reason: collision with root package name */
        float[][] f7227b = new float[101];

        /* renamed from: c, reason: collision with root package name */
        int f7228c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
            b();
        }

        public void a(int i4, float[] fArr) {
            if (this.f7227b[i4] != null) {
                e(i4);
            }
            this.f7227b[i4] = fArr;
            int[] iArr = this.f7226a;
            int i5 = this.f7228c;
            this.f7228c = i5 + 1;
            iArr[i5] = i4;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f7226a, f7225d);
            Arrays.fill(this.f7227b, (Object) null);
            this.f7228c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.f7226a, this.f7228c)));
            printStream.print("K: [");
            for (int i4 = 0; i4 < this.f7228c; i4++) {
                PrintStream printStream2 = System.out;
                if (i4 == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                printStream2.print(str + Arrays.toString(g(i4)));
            }
            System.out.println("]");
        }

        public int d(int i4) {
            return this.f7226a[i4];
        }

        public void e(int i4) {
            this.f7227b[i4] = null;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.f7228c;
                if (i5 < i7) {
                    int[] iArr = this.f7226a;
                    if (i4 == iArr[i5]) {
                        iArr[i5] = f7225d;
                        i6++;
                    }
                    if (i5 != i6) {
                        iArr[i5] = iArr[i6];
                    }
                    i6++;
                    i5++;
                } else {
                    this.f7228c = i7 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.f7228c;
        }

        public float[] g(int i4) {
            return this.f7227b[this.f7226a[i4]];
        }
    }
}
