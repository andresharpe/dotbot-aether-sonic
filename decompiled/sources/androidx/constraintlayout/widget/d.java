package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import androidx.core.os.C0745h;
import com.spotify.sdk.android.auth.b;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public static final int f9683A = 0;

    /* renamed from: A0, reason: collision with root package name */
    private static final int f9684A0 = 28;

    /* renamed from: A1, reason: collision with root package name */
    private static final int f9685A1 = 80;

    /* renamed from: B, reason: collision with root package name */
    public static final int f9686B = 1;

    /* renamed from: B0, reason: collision with root package name */
    private static final int f9687B0 = 29;

    /* renamed from: B1, reason: collision with root package name */
    private static final int f9688B1 = 81;

    /* renamed from: C, reason: collision with root package name */
    public static final int f9689C = 0;

    /* renamed from: C0, reason: collision with root package name */
    private static final int f9690C0 = 30;

    /* renamed from: C1, reason: collision with root package name */
    private static final int f9691C1 = 82;

    /* renamed from: D, reason: collision with root package name */
    public static final int f9692D = 1;

    /* renamed from: D0, reason: collision with root package name */
    private static final int f9693D0 = 31;

    /* renamed from: D1, reason: collision with root package name */
    private static final int f9694D1 = 83;

    /* renamed from: E, reason: collision with root package name */
    public static final int f9695E = 0;

    /* renamed from: E0, reason: collision with root package name */
    private static final int f9696E0 = 32;

    /* renamed from: E1, reason: collision with root package name */
    private static final int f9697E1 = 84;

    /* renamed from: F, reason: collision with root package name */
    public static final int f9698F = 4;

    /* renamed from: F0, reason: collision with root package name */
    private static final int f9699F0 = 33;

    /* renamed from: F1, reason: collision with root package name */
    private static final int f9700F1 = 85;

    /* renamed from: G, reason: collision with root package name */
    public static final int f9701G = 8;

    /* renamed from: G0, reason: collision with root package name */
    private static final int f9702G0 = 34;

    /* renamed from: G1, reason: collision with root package name */
    private static final int f9703G1 = 86;

    /* renamed from: H, reason: collision with root package name */
    public static final int f9704H = 1;

    /* renamed from: H0, reason: collision with root package name */
    private static final int f9705H0 = 35;

    /* renamed from: H1, reason: collision with root package name */
    private static final int f9706H1 = 87;

    /* renamed from: I, reason: collision with root package name */
    public static final int f9707I = 2;

    /* renamed from: I0, reason: collision with root package name */
    private static final int f9708I0 = 36;

    /* renamed from: I1, reason: collision with root package name */
    private static final int f9709I1 = 88;

    /* renamed from: J, reason: collision with root package name */
    public static final int f9710J = 3;

    /* renamed from: J0, reason: collision with root package name */
    private static final int f9711J0 = 37;

    /* renamed from: J1, reason: collision with root package name */
    private static final int f9712J1 = 89;

    /* renamed from: K, reason: collision with root package name */
    public static final int f9713K = 4;

    /* renamed from: K0, reason: collision with root package name */
    private static final int f9714K0 = 38;

    /* renamed from: K1, reason: collision with root package name */
    private static final int f9715K1 = 90;

    /* renamed from: L, reason: collision with root package name */
    public static final int f9716L = 5;

    /* renamed from: L0, reason: collision with root package name */
    private static final int f9717L0 = 39;

    /* renamed from: L1, reason: collision with root package name */
    private static final int f9718L1 = 91;

    /* renamed from: M, reason: collision with root package name */
    public static final int f9719M = 6;

    /* renamed from: M0, reason: collision with root package name */
    private static final int f9720M0 = 40;

    /* renamed from: M1, reason: collision with root package name */
    private static final int f9721M1 = 92;

    /* renamed from: N, reason: collision with root package name */
    public static final int f9722N = 7;

    /* renamed from: N0, reason: collision with root package name */
    private static final int f9723N0 = 41;

    /* renamed from: N1, reason: collision with root package name */
    private static final int f9724N1 = 93;

    /* renamed from: O, reason: collision with root package name */
    public static final int f9725O = 8;

    /* renamed from: O0, reason: collision with root package name */
    private static final int f9726O0 = 42;

    /* renamed from: O1, reason: collision with root package name */
    private static final int f9727O1 = 94;

    /* renamed from: P, reason: collision with root package name */
    public static final int f9728P = 0;

    /* renamed from: P0, reason: collision with root package name */
    private static final int f9729P0 = 43;

    /* renamed from: P1, reason: collision with root package name */
    private static final int f9730P1 = 95;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f9731Q = 1;

    /* renamed from: Q0, reason: collision with root package name */
    private static final int f9732Q0 = 44;

    /* renamed from: Q1, reason: collision with root package name */
    private static final int f9733Q1 = 96;

    /* renamed from: R, reason: collision with root package name */
    public static final int f9734R = 0;

    /* renamed from: R0, reason: collision with root package name */
    private static final int f9735R0 = 45;

    /* renamed from: R1, reason: collision with root package name */
    private static final int f9736R1 = 97;

    /* renamed from: S, reason: collision with root package name */
    public static final int f9737S = 1;

    /* renamed from: S0, reason: collision with root package name */
    private static final int f9738S0 = 46;

    /* renamed from: S1, reason: collision with root package name */
    private static final int f9739S1 = 98;

    /* renamed from: T, reason: collision with root package name */
    public static final int f9740T = 2;

    /* renamed from: T0, reason: collision with root package name */
    private static final int f9741T0 = 47;

    /* renamed from: T1, reason: collision with root package name */
    private static final int f9742T1 = 99;

    /* renamed from: U, reason: collision with root package name */
    private static final boolean f9743U = false;

    /* renamed from: U0, reason: collision with root package name */
    private static final int f9744U0 = 48;

    /* renamed from: U1, reason: collision with root package name */
    private static final String f9745U1 = "weight";

    /* renamed from: V0, reason: collision with root package name */
    private static final int f9747V0 = 49;

    /* renamed from: V1, reason: collision with root package name */
    private static final String f9748V1 = "ratio";

    /* renamed from: W, reason: collision with root package name */
    private static final int f9749W = 1;

    /* renamed from: W0, reason: collision with root package name */
    private static final int f9750W0 = 50;

    /* renamed from: W1, reason: collision with root package name */
    private static final String f9751W1 = "parent";

    /* renamed from: X0, reason: collision with root package name */
    private static final int f9753X0 = 51;

    /* renamed from: Y0, reason: collision with root package name */
    private static final int f9755Y0 = 52;

    /* renamed from: Z, reason: collision with root package name */
    private static final int f9756Z = 1;

    /* renamed from: Z0, reason: collision with root package name */
    private static final int f9757Z0 = 53;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f9758a0 = 2;

    /* renamed from: a1, reason: collision with root package name */
    private static final int f9759a1 = 54;

    /* renamed from: b0, reason: collision with root package name */
    private static final int f9760b0 = 3;

    /* renamed from: b1, reason: collision with root package name */
    private static final int f9761b1 = 55;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f9762c0 = 4;

    /* renamed from: c1, reason: collision with root package name */
    private static final int f9763c1 = 56;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f9764d0 = 5;

    /* renamed from: d1, reason: collision with root package name */
    private static final int f9765d1 = 57;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f9766e0 = 6;

    /* renamed from: e1, reason: collision with root package name */
    private static final int f9767e1 = 58;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f9768f0 = 7;

    /* renamed from: f1, reason: collision with root package name */
    private static final int f9769f1 = 59;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f9770g0 = 8;

    /* renamed from: g1, reason: collision with root package name */
    private static final int f9771g1 = 60;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f9772h0 = 9;

    /* renamed from: h1, reason: collision with root package name */
    private static final int f9773h1 = 61;

    /* renamed from: i, reason: collision with root package name */
    private static final String f9774i = "ConstraintSet";

    /* renamed from: i0, reason: collision with root package name */
    private static final int f9775i0 = 10;

    /* renamed from: i1, reason: collision with root package name */
    private static final int f9776i1 = 62;

    /* renamed from: j, reason: collision with root package name */
    private static final String f9777j = "XML parser error must be within a Constraint ";

    /* renamed from: j0, reason: collision with root package name */
    private static final int f9778j0 = 11;

    /* renamed from: j1, reason: collision with root package name */
    private static final int f9779j1 = 63;

    /* renamed from: k, reason: collision with root package name */
    private static final int f9780k = -1;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f9781k0 = 12;

    /* renamed from: k1, reason: collision with root package name */
    private static final int f9782k1 = 64;

    /* renamed from: l, reason: collision with root package name */
    private static final int f9783l = -2;

    /* renamed from: l0, reason: collision with root package name */
    private static final int f9784l0 = 13;

    /* renamed from: l1, reason: collision with root package name */
    private static final int f9785l1 = 65;

    /* renamed from: m, reason: collision with root package name */
    private static final int f9786m = -3;

    /* renamed from: m0, reason: collision with root package name */
    private static final int f9787m0 = 14;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f9788m1 = 66;

    /* renamed from: n, reason: collision with root package name */
    private static final int f9789n = -4;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f9790n0 = 15;

    /* renamed from: n1, reason: collision with root package name */
    private static final int f9791n1 = 67;

    /* renamed from: o, reason: collision with root package name */
    public static final int f9792o = 0;

    /* renamed from: o0, reason: collision with root package name */
    private static final int f9793o0 = 16;

    /* renamed from: o1, reason: collision with root package name */
    private static final int f9794o1 = 68;

    /* renamed from: p, reason: collision with root package name */
    public static final int f9795p = 1;

    /* renamed from: p0, reason: collision with root package name */
    private static final int f9796p0 = 17;

    /* renamed from: p1, reason: collision with root package name */
    private static final int f9797p1 = 69;

    /* renamed from: q, reason: collision with root package name */
    public static final int f9798q = 2;

    /* renamed from: q0, reason: collision with root package name */
    private static final int f9799q0 = 18;

    /* renamed from: q1, reason: collision with root package name */
    private static final int f9800q1 = 70;

    /* renamed from: r, reason: collision with root package name */
    public static final int f9801r = 3;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f9802r0 = 19;

    /* renamed from: r1, reason: collision with root package name */
    private static final int f9803r1 = 71;

    /* renamed from: s, reason: collision with root package name */
    public static final int f9804s = 4;

    /* renamed from: s0, reason: collision with root package name */
    private static final int f9805s0 = 20;

    /* renamed from: s1, reason: collision with root package name */
    private static final int f9806s1 = 72;

    /* renamed from: t, reason: collision with root package name */
    public static final int f9807t = -1;

    /* renamed from: t0, reason: collision with root package name */
    private static final int f9808t0 = 21;

    /* renamed from: t1, reason: collision with root package name */
    private static final int f9809t1 = 73;

    /* renamed from: u, reason: collision with root package name */
    public static final int f9810u = 0;

    /* renamed from: u0, reason: collision with root package name */
    private static final int f9811u0 = 22;

    /* renamed from: u1, reason: collision with root package name */
    private static final int f9812u1 = 74;

    /* renamed from: v, reason: collision with root package name */
    public static final int f9813v = -2;

    /* renamed from: v0, reason: collision with root package name */
    private static final int f9814v0 = 23;

    /* renamed from: v1, reason: collision with root package name */
    private static final int f9815v1 = 75;

    /* renamed from: w, reason: collision with root package name */
    public static final int f9816w = 1;

    /* renamed from: w0, reason: collision with root package name */
    private static final int f9817w0 = 24;

    /* renamed from: w1, reason: collision with root package name */
    private static final int f9818w1 = 76;

    /* renamed from: x, reason: collision with root package name */
    public static final int f9819x = 0;

    /* renamed from: x0, reason: collision with root package name */
    private static final int f9820x0 = 25;

    /* renamed from: x1, reason: collision with root package name */
    private static final int f9821x1 = 77;

    /* renamed from: y, reason: collision with root package name */
    public static final int f9822y = 2;

    /* renamed from: y0, reason: collision with root package name */
    private static final int f9823y0 = 26;

    /* renamed from: y1, reason: collision with root package name */
    private static final int f9824y1 = 78;

    /* renamed from: z, reason: collision with root package name */
    public static final int f9825z = 0;

    /* renamed from: z0, reason: collision with root package name */
    private static final int f9826z0 = 27;

    /* renamed from: z1, reason: collision with root package name */
    private static final int f9827z1 = 79;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9828a;

    /* renamed from: b, reason: collision with root package name */
    public String f9829b;

    /* renamed from: c, reason: collision with root package name */
    public String f9830c = "";

    /* renamed from: d, reason: collision with root package name */
    private String[] f9831d = new String[0];

    /* renamed from: e, reason: collision with root package name */
    public int f9832e = 0;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, ConstraintAttribute> f9833f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private boolean f9834g = true;

    /* renamed from: h, reason: collision with root package name */
    private HashMap<Integer, a> f9835h = new HashMap<>();

    /* renamed from: V, reason: collision with root package name */
    private static final int[] f9746V = {0, 4, 8};

    /* renamed from: X, reason: collision with root package name */
    private static SparseIntArray f9752X = new SparseIntArray();

    /* renamed from: Y, reason: collision with root package name */
    private static SparseIntArray f9754Y = new SparseIntArray();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f9836a;

        /* renamed from: b, reason: collision with root package name */
        String f9837b;

        /* renamed from: c, reason: collision with root package name */
        public final C0071d f9838c = new C0071d();

        /* renamed from: d, reason: collision with root package name */
        public final c f9839d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f9840e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final e f9841f = new e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f9842g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        C0070a f9843h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0070a {

            /* renamed from: m, reason: collision with root package name */
            private static final int f9844m = 4;

            /* renamed from: n, reason: collision with root package name */
            private static final int f9845n = 10;

            /* renamed from: o, reason: collision with root package name */
            private static final int f9846o = 10;

            /* renamed from: p, reason: collision with root package name */
            private static final int f9847p = 5;

            /* renamed from: a, reason: collision with root package name */
            int[] f9848a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f9849b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f9850c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f9851d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f9852e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f9853f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f9854g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f9855h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f9856i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f9857j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f9858k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f9859l = 0;

            C0070a() {
            }

            void a(int i4, float f4) {
                int i5 = this.f9853f;
                int[] iArr = this.f9851d;
                if (i5 >= iArr.length) {
                    this.f9851d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f9852e;
                    this.f9852e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f9851d;
                int i6 = this.f9853f;
                iArr2[i6] = i4;
                float[] fArr2 = this.f9852e;
                this.f9853f = i6 + 1;
                fArr2[i6] = f4;
            }

            void b(int i4, int i5) {
                int i6 = this.f9850c;
                int[] iArr = this.f9848a;
                if (i6 >= iArr.length) {
                    this.f9848a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f9849b;
                    this.f9849b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f9848a;
                int i7 = this.f9850c;
                iArr3[i7] = i4;
                int[] iArr4 = this.f9849b;
                this.f9850c = i7 + 1;
                iArr4[i7] = i5;
            }

            void c(int i4, String str) {
                int i5 = this.f9856i;
                int[] iArr = this.f9854g;
                if (i5 >= iArr.length) {
                    this.f9854g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f9855h;
                    this.f9855h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f9854g;
                int i6 = this.f9856i;
                iArr2[i6] = i4;
                String[] strArr2 = this.f9855h;
                this.f9856i = i6 + 1;
                strArr2[i6] = str;
            }

            void d(int i4, boolean z3) {
                int i5 = this.f9859l;
                int[] iArr = this.f9857j;
                if (i5 >= iArr.length) {
                    this.f9857j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f9858k;
                    this.f9858k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f9857j;
                int i6 = this.f9859l;
                iArr2[i6] = i4;
                boolean[] zArr2 = this.f9858k;
                this.f9859l = i6 + 1;
                zArr2[i6] = z3;
            }

            void e(a aVar) {
                for (int i4 = 0; i4 < this.f9850c; i4++) {
                    d.V0(aVar, this.f9848a[i4], this.f9849b[i4]);
                }
                for (int i5 = 0; i5 < this.f9853f; i5++) {
                    d.U0(aVar, this.f9851d[i5], this.f9852e[i5]);
                }
                for (int i6 = 0; i6 < this.f9856i; i6++) {
                    d.W0(aVar, this.f9854g[i6], this.f9855h[i6]);
                }
                for (int i7 = 0; i7 < this.f9859l; i7++) {
                    d.X0(aVar, this.f9857j[i7], this.f9858k[i7]);
                }
            }

            @SuppressLint({"LogConditional"})
            void f(String str) {
                Log.v(str, "int");
                for (int i4 = 0; i4 < this.f9850c; i4++) {
                    Log.v(str, this.f9848a[i4] + " = " + this.f9849b[i4]);
                }
                Log.v(str, v.b.f7401c);
                for (int i5 = 0; i5 < this.f9853f; i5++) {
                    Log.v(str, this.f9851d[i5] + " = " + this.f9852e[i5]);
                }
                Log.v(str, "strings");
                for (int i6 = 0; i6 < this.f9856i; i6++) {
                    Log.v(str, this.f9854g[i6] + " = " + this.f9855h[i6]);
                }
                Log.v(str, v.b.f7404f);
                for (int i7 = 0; i7 < this.f9859l; i7++) {
                    Log.v(str, this.f9857j[i7] + " = " + this.f9858k[i7]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int i4, ConstraintLayout.b bVar) {
            this.f9836a = i4;
            b bVar2 = this.f9840e;
            bVar2.f9975j = bVar.f9527e;
            bVar2.f9977k = bVar.f9529f;
            bVar2.f9979l = bVar.f9531g;
            bVar2.f9981m = bVar.f9533h;
            bVar2.f9983n = bVar.f9535i;
            bVar2.f9985o = bVar.f9537j;
            bVar2.f9987p = bVar.f9539k;
            bVar2.f9989q = bVar.f9541l;
            bVar2.f9991r = bVar.f9543m;
            bVar2.f9992s = bVar.f9545n;
            bVar2.f9993t = bVar.f9547o;
            bVar2.f9994u = bVar.f9555s;
            bVar2.f9995v = bVar.f9557t;
            bVar2.f9996w = bVar.f9559u;
            bVar2.f9997x = bVar.f9561v;
            bVar2.f9998y = bVar.f9499G;
            bVar2.f9999z = bVar.f9500H;
            bVar2.f9931A = bVar.f9501I;
            bVar2.f9932B = bVar.f9549p;
            bVar2.f9933C = bVar.f9551q;
            bVar2.f9934D = bVar.f9553r;
            bVar2.f9935E = bVar.f9516X;
            bVar2.f9936F = bVar.f9517Y;
            bVar2.f9937G = bVar.f9518Z;
            bVar2.f9971h = bVar.f9523c;
            bVar2.f9967f = bVar.f9519a;
            bVar2.f9969g = bVar.f9521b;
            bVar2.f9963d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f9965e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f9938H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f9939I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f9940J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f9941K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f9944N = bVar.f9496D;
            bVar2.f9952V = bVar.f9505M;
            bVar2.f9953W = bVar.f9504L;
            bVar2.f9955Y = bVar.f9507O;
            bVar2.f9954X = bVar.f9506N;
            bVar2.f9984n0 = bVar.f9520a0;
            bVar2.f9986o0 = bVar.f9522b0;
            bVar2.f9956Z = bVar.f9508P;
            bVar2.f9958a0 = bVar.f9509Q;
            bVar2.f9960b0 = bVar.f9512T;
            bVar2.f9962c0 = bVar.f9513U;
            bVar2.f9964d0 = bVar.f9510R;
            bVar2.f9966e0 = bVar.f9511S;
            bVar2.f9968f0 = bVar.f9514V;
            bVar2.f9970g0 = bVar.f9515W;
            bVar2.f9982m0 = bVar.f9524c0;
            bVar2.f9946P = bVar.f9565x;
            bVar2.f9948R = bVar.f9567z;
            bVar2.f9945O = bVar.f9563w;
            bVar2.f9947Q = bVar.f9566y;
            bVar2.f9950T = bVar.f9493A;
            bVar2.f9949S = bVar.f9494B;
            bVar2.f9951U = bVar.f9495C;
            bVar2.f9990q0 = bVar.f9526d0;
            bVar2.f9942L = bVar.getMarginEnd();
            this.f9840e.f9943M = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int i4, e.a aVar) {
            k(i4, aVar);
            this.f9838c.f10031d = aVar.f10092V0;
            e eVar = this.f9841f;
            eVar.f10047b = aVar.f10095Y0;
            eVar.f10048c = aVar.f10096Z0;
            eVar.f10049d = aVar.f10097a1;
            eVar.f10050e = aVar.f10098b1;
            eVar.f10051f = aVar.f10099c1;
            eVar.f10052g = aVar.f10100d1;
            eVar.f10053h = aVar.f10101e1;
            eVar.f10055j = aVar.f10102f1;
            eVar.f10056k = aVar.f10103g1;
            eVar.f10057l = aVar.f10104h1;
            eVar.f10059n = aVar.f10094X0;
            eVar.f10058m = aVar.f10093W0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(androidx.constraintlayout.widget.a aVar, int i4, e.a aVar2) {
            l(i4, aVar2);
            if (aVar instanceof Barrier) {
                b bVar = this.f9840e;
                bVar.f9976j0 = 1;
                Barrier barrier = (Barrier) aVar;
                bVar.f9972h0 = barrier.getType();
                this.f9840e.f9978k0 = barrier.getReferencedIds();
                this.f9840e.f9974i0 = barrier.getMargin();
            }
        }

        private ConstraintAttribute n(String str, ConstraintAttribute.AttributeType attributeType) {
            if (this.f9842g.containsKey(str)) {
                ConstraintAttribute constraintAttribute = this.f9842g.get(str);
                if (constraintAttribute.j() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.j().name());
                }
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = new ConstraintAttribute(str, attributeType);
            this.f9842g.put(str, constraintAttribute2);
            return constraintAttribute2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String str, int i4) {
            n(str, ConstraintAttribute.AttributeType.COLOR_TYPE).s(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String str, float f4) {
            n(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).t(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(String str, int i4) {
            n(str, ConstraintAttribute.AttributeType.INT_TYPE).u(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(String str, String str2) {
            n(str, ConstraintAttribute.AttributeType.STRING_TYPE).v(str2);
        }

        public void h(a aVar) {
            C0070a c0070a = this.f9843h;
            if (c0070a != null) {
                c0070a.e(aVar);
            }
        }

        public void i(ConstraintLayout.b bVar) {
            b bVar2 = this.f9840e;
            bVar.f9527e = bVar2.f9975j;
            bVar.f9529f = bVar2.f9977k;
            bVar.f9531g = bVar2.f9979l;
            bVar.f9533h = bVar2.f9981m;
            bVar.f9535i = bVar2.f9983n;
            bVar.f9537j = bVar2.f9985o;
            bVar.f9539k = bVar2.f9987p;
            bVar.f9541l = bVar2.f9989q;
            bVar.f9543m = bVar2.f9991r;
            bVar.f9545n = bVar2.f9992s;
            bVar.f9547o = bVar2.f9993t;
            bVar.f9555s = bVar2.f9994u;
            bVar.f9557t = bVar2.f9995v;
            bVar.f9559u = bVar2.f9996w;
            bVar.f9561v = bVar2.f9997x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f9938H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f9939I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f9940J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f9941K;
            bVar.f9493A = bVar2.f9950T;
            bVar.f9494B = bVar2.f9949S;
            bVar.f9565x = bVar2.f9946P;
            bVar.f9567z = bVar2.f9948R;
            bVar.f9499G = bVar2.f9998y;
            bVar.f9500H = bVar2.f9999z;
            bVar.f9549p = bVar2.f9932B;
            bVar.f9551q = bVar2.f9933C;
            bVar.f9553r = bVar2.f9934D;
            bVar.f9501I = bVar2.f9931A;
            bVar.f9516X = bVar2.f9935E;
            bVar.f9517Y = bVar2.f9936F;
            bVar.f9505M = bVar2.f9952V;
            bVar.f9504L = bVar2.f9953W;
            bVar.f9507O = bVar2.f9955Y;
            bVar.f9506N = bVar2.f9954X;
            bVar.f9520a0 = bVar2.f9984n0;
            bVar.f9522b0 = bVar2.f9986o0;
            bVar.f9508P = bVar2.f9956Z;
            bVar.f9509Q = bVar2.f9958a0;
            bVar.f9512T = bVar2.f9960b0;
            bVar.f9513U = bVar2.f9962c0;
            bVar.f9510R = bVar2.f9964d0;
            bVar.f9511S = bVar2.f9966e0;
            bVar.f9514V = bVar2.f9968f0;
            bVar.f9515W = bVar2.f9970g0;
            bVar.f9518Z = bVar2.f9937G;
            bVar.f9523c = bVar2.f9971h;
            bVar.f9519a = bVar2.f9967f;
            bVar.f9521b = bVar2.f9969g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f9963d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f9965e;
            String str = bVar2.f9982m0;
            if (str != null) {
                bVar.f9524c0 = str;
            }
            bVar.f9526d0 = bVar2.f9990q0;
            bVar.setMarginStart(bVar2.f9943M);
            bVar.setMarginEnd(this.f9840e.f9942L);
            bVar.e();
        }

        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f9840e.a(this.f9840e);
            aVar.f9839d.a(this.f9839d);
            aVar.f9838c.a(this.f9838c);
            aVar.f9841f.a(this.f9841f);
            aVar.f9836a = this.f9836a;
            aVar.f9843h = this.f9843h;
            return aVar;
        }

        public void o(String str) {
            C0070a c0070a = this.f9843h;
            if (c0070a != null) {
                c0070a.f(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: A0, reason: collision with root package name */
        private static final int f9860A0 = 7;

        /* renamed from: A1, reason: collision with root package name */
        private static final int f9861A1 = 82;

        /* renamed from: B0, reason: collision with root package name */
        private static final int f9862B0 = 8;

        /* renamed from: B1, reason: collision with root package name */
        private static final int f9863B1 = 83;

        /* renamed from: C0, reason: collision with root package name */
        private static final int f9864C0 = 9;

        /* renamed from: C1, reason: collision with root package name */
        private static final int f9865C1 = 84;

        /* renamed from: D0, reason: collision with root package name */
        private static final int f9866D0 = 10;

        /* renamed from: D1, reason: collision with root package name */
        private static final int f9867D1 = 85;

        /* renamed from: E0, reason: collision with root package name */
        private static final int f9868E0 = 11;

        /* renamed from: E1, reason: collision with root package name */
        private static final int f9869E1 = 86;

        /* renamed from: F0, reason: collision with root package name */
        private static final int f9870F0 = 12;

        /* renamed from: F1, reason: collision with root package name */
        private static final int f9871F1 = 87;

        /* renamed from: G0, reason: collision with root package name */
        private static final int f9872G0 = 13;

        /* renamed from: G1, reason: collision with root package name */
        private static final int f9873G1 = 88;

        /* renamed from: H0, reason: collision with root package name */
        private static final int f9874H0 = 14;

        /* renamed from: H1, reason: collision with root package name */
        private static final int f9875H1 = 89;

        /* renamed from: I0, reason: collision with root package name */
        private static final int f9876I0 = 15;

        /* renamed from: I1, reason: collision with root package name */
        private static final int f9877I1 = 90;

        /* renamed from: J0, reason: collision with root package name */
        private static final int f9878J0 = 16;

        /* renamed from: J1, reason: collision with root package name */
        private static final int f9879J1 = 91;

        /* renamed from: K0, reason: collision with root package name */
        private static final int f9880K0 = 17;

        /* renamed from: L0, reason: collision with root package name */
        private static final int f9881L0 = 18;

        /* renamed from: M0, reason: collision with root package name */
        private static final int f9882M0 = 19;

        /* renamed from: N0, reason: collision with root package name */
        private static final int f9883N0 = 20;

        /* renamed from: O0, reason: collision with root package name */
        private static final int f9884O0 = 21;

        /* renamed from: P0, reason: collision with root package name */
        private static final int f9885P0 = 22;

        /* renamed from: Q0, reason: collision with root package name */
        private static final int f9886Q0 = 23;

        /* renamed from: R0, reason: collision with root package name */
        private static final int f9887R0 = 24;

        /* renamed from: S0, reason: collision with root package name */
        private static final int f9888S0 = 25;

        /* renamed from: T0, reason: collision with root package name */
        private static final int f9889T0 = 26;

        /* renamed from: U0, reason: collision with root package name */
        private static final int f9890U0 = 27;

        /* renamed from: V0, reason: collision with root package name */
        private static final int f9891V0 = 28;

        /* renamed from: W0, reason: collision with root package name */
        private static final int f9892W0 = 29;

        /* renamed from: X0, reason: collision with root package name */
        private static final int f9893X0 = 30;

        /* renamed from: Y0, reason: collision with root package name */
        private static final int f9894Y0 = 31;

        /* renamed from: Z0, reason: collision with root package name */
        private static final int f9895Z0 = 32;

        /* renamed from: a1, reason: collision with root package name */
        private static final int f9896a1 = 33;

        /* renamed from: b1, reason: collision with root package name */
        private static final int f9897b1 = 34;

        /* renamed from: c1, reason: collision with root package name */
        private static final int f9898c1 = 35;

        /* renamed from: d1, reason: collision with root package name */
        private static final int f9899d1 = 36;

        /* renamed from: e1, reason: collision with root package name */
        private static final int f9900e1 = 37;

        /* renamed from: f1, reason: collision with root package name */
        private static final int f9901f1 = 38;

        /* renamed from: g1, reason: collision with root package name */
        private static final int f9902g1 = 39;

        /* renamed from: h1, reason: collision with root package name */
        private static final int f9903h1 = 40;

        /* renamed from: i1, reason: collision with root package name */
        private static final int f9904i1 = 41;

        /* renamed from: j1, reason: collision with root package name */
        private static final int f9905j1 = 42;

        /* renamed from: k1, reason: collision with root package name */
        private static final int f9906k1 = 61;

        /* renamed from: l1, reason: collision with root package name */
        private static final int f9907l1 = 62;

        /* renamed from: m1, reason: collision with root package name */
        private static final int f9908m1 = 63;

        /* renamed from: n1, reason: collision with root package name */
        private static final int f9909n1 = 69;

        /* renamed from: o1, reason: collision with root package name */
        private static final int f9910o1 = 70;

        /* renamed from: p1, reason: collision with root package name */
        private static final int f9911p1 = 71;

        /* renamed from: q1, reason: collision with root package name */
        private static final int f9912q1 = 72;

        /* renamed from: r0, reason: collision with root package name */
        public static final int f9913r0 = -1;

        /* renamed from: r1, reason: collision with root package name */
        private static final int f9914r1 = 73;

        /* renamed from: s0, reason: collision with root package name */
        public static final int f9915s0 = Integer.MIN_VALUE;

        /* renamed from: s1, reason: collision with root package name */
        private static final int f9916s1 = 74;

        /* renamed from: t0, reason: collision with root package name */
        private static SparseIntArray f9917t0 = null;

        /* renamed from: t1, reason: collision with root package name */
        private static final int f9918t1 = 75;

        /* renamed from: u0, reason: collision with root package name */
        private static final int f9919u0 = 1;

        /* renamed from: u1, reason: collision with root package name */
        private static final int f9920u1 = 76;

        /* renamed from: v0, reason: collision with root package name */
        private static final int f9921v0 = 2;

        /* renamed from: v1, reason: collision with root package name */
        private static final int f9922v1 = 77;

        /* renamed from: w0, reason: collision with root package name */
        private static final int f9923w0 = 3;

        /* renamed from: w1, reason: collision with root package name */
        private static final int f9924w1 = 78;

        /* renamed from: x0, reason: collision with root package name */
        private static final int f9925x0 = 4;

        /* renamed from: x1, reason: collision with root package name */
        private static final int f9926x1 = 79;

        /* renamed from: y0, reason: collision with root package name */
        private static final int f9927y0 = 5;

        /* renamed from: y1, reason: collision with root package name */
        private static final int f9928y1 = 80;

        /* renamed from: z0, reason: collision with root package name */
        private static final int f9929z0 = 6;

        /* renamed from: z1, reason: collision with root package name */
        private static final int f9930z1 = 81;

        /* renamed from: d, reason: collision with root package name */
        public int f9963d;

        /* renamed from: e, reason: collision with root package name */
        public int f9965e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f9978k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f9980l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f9982m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f9957a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9959b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9961c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f9967f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f9969g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f9971h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9973i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f9975j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f9977k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f9979l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f9981m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f9983n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f9985o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f9987p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f9989q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f9991r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f9992s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f9993t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f9994u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f9995v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f9996w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f9997x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f9998y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f9999z = 0.5f;

        /* renamed from: A, reason: collision with root package name */
        public String f9931A = null;

        /* renamed from: B, reason: collision with root package name */
        public int f9932B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f9933C = 0;

        /* renamed from: D, reason: collision with root package name */
        public float f9934D = 0.0f;

        /* renamed from: E, reason: collision with root package name */
        public int f9935E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f9936F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f9937G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f9938H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f9939I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f9940J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f9941K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f9942L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f9943M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f9944N = 0;

        /* renamed from: O, reason: collision with root package name */
        public int f9945O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f9946P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f9947Q = Integer.MIN_VALUE;

        /* renamed from: R, reason: collision with root package name */
        public int f9948R = Integer.MIN_VALUE;

        /* renamed from: S, reason: collision with root package name */
        public int f9949S = Integer.MIN_VALUE;

        /* renamed from: T, reason: collision with root package name */
        public int f9950T = Integer.MIN_VALUE;

        /* renamed from: U, reason: collision with root package name */
        public int f9951U = Integer.MIN_VALUE;

        /* renamed from: V, reason: collision with root package name */
        public float f9952V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public float f9953W = -1.0f;

        /* renamed from: X, reason: collision with root package name */
        public int f9954X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f9955Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f9956Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f9958a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f9960b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f9962c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f9964d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f9966e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f9968f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f9970g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f9972h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f9974i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f9976j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f9984n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f9986o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f9988p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f9990q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f9917t0 = sparseIntArray;
            sparseIntArray.append(h.m.Dh, 24);
            f9917t0.append(h.m.Eh, 25);
            f9917t0.append(h.m.Gh, 28);
            f9917t0.append(h.m.Hh, 29);
            f9917t0.append(h.m.Mh, 35);
            f9917t0.append(h.m.Lh, 34);
            f9917t0.append(h.m.kh, 4);
            f9917t0.append(h.m.jh, 3);
            f9917t0.append(h.m.fh, 1);
            f9917t0.append(h.m.Vh, 6);
            f9917t0.append(h.m.Wh, 7);
            f9917t0.append(h.m.rh, 17);
            f9917t0.append(h.m.sh, 18);
            f9917t0.append(h.m.th, 19);
            f9917t0.append(h.m.bh, f9877I1);
            f9917t0.append(h.m.Mg, 26);
            f9917t0.append(h.m.Ih, 31);
            f9917t0.append(h.m.Jh, 32);
            f9917t0.append(h.m.qh, 10);
            f9917t0.append(h.m.ph, 9);
            f9917t0.append(h.m.ai, 13);
            f9917t0.append(h.m.di, 16);
            f9917t0.append(h.m.bi, 14);
            f9917t0.append(h.m.Yh, 11);
            f9917t0.append(h.m.ci, 15);
            f9917t0.append(h.m.Zh, 12);
            f9917t0.append(h.m.Ph, 38);
            f9917t0.append(h.m.Bh, 37);
            f9917t0.append(h.m.Ah, 39);
            f9917t0.append(h.m.Oh, 40);
            f9917t0.append(h.m.zh, 20);
            f9917t0.append(h.m.Nh, 36);
            f9917t0.append(h.m.oh, 5);
            f9917t0.append(h.m.Ch, f9879J1);
            f9917t0.append(h.m.Kh, f9879J1);
            f9917t0.append(h.m.Fh, f9879J1);
            f9917t0.append(h.m.ih, f9879J1);
            f9917t0.append(h.m.eh, f9879J1);
            f9917t0.append(h.m.Pg, 23);
            f9917t0.append(h.m.Rg, 27);
            f9917t0.append(h.m.Tg, 30);
            f9917t0.append(h.m.Ug, 8);
            f9917t0.append(h.m.Qg, 33);
            f9917t0.append(h.m.Sg, 2);
            f9917t0.append(h.m.Ng, 22);
            f9917t0.append(h.m.Og, 21);
            f9917t0.append(h.m.Qh, 41);
            f9917t0.append(h.m.uh, 42);
            f9917t0.append(h.m.dh, 41);
            f9917t0.append(h.m.ch, 42);
            f9917t0.append(h.m.fi, 76);
            f9917t0.append(h.m.lh, 61);
            f9917t0.append(h.m.nh, f9907l1);
            f9917t0.append(h.m.mh, 63);
            f9917t0.append(h.m.Uh, f9909n1);
            f9917t0.append(h.m.yh, f9910o1);
            f9917t0.append(h.m.Yg, f9911p1);
            f9917t0.append(h.m.Wg, f9912q1);
            f9917t0.append(h.m.Xg, f9914r1);
            f9917t0.append(h.m.Zg, f9916s1);
            f9917t0.append(h.m.Vg, f9918t1);
        }

        public void a(b bVar) {
            this.f9957a = bVar.f9957a;
            this.f9963d = bVar.f9963d;
            this.f9959b = bVar.f9959b;
            this.f9965e = bVar.f9965e;
            this.f9967f = bVar.f9967f;
            this.f9969g = bVar.f9969g;
            this.f9971h = bVar.f9971h;
            this.f9973i = bVar.f9973i;
            this.f9975j = bVar.f9975j;
            this.f9977k = bVar.f9977k;
            this.f9979l = bVar.f9979l;
            this.f9981m = bVar.f9981m;
            this.f9983n = bVar.f9983n;
            this.f9985o = bVar.f9985o;
            this.f9987p = bVar.f9987p;
            this.f9989q = bVar.f9989q;
            this.f9991r = bVar.f9991r;
            this.f9992s = bVar.f9992s;
            this.f9993t = bVar.f9993t;
            this.f9994u = bVar.f9994u;
            this.f9995v = bVar.f9995v;
            this.f9996w = bVar.f9996w;
            this.f9997x = bVar.f9997x;
            this.f9998y = bVar.f9998y;
            this.f9999z = bVar.f9999z;
            this.f9931A = bVar.f9931A;
            this.f9932B = bVar.f9932B;
            this.f9933C = bVar.f9933C;
            this.f9934D = bVar.f9934D;
            this.f9935E = bVar.f9935E;
            this.f9936F = bVar.f9936F;
            this.f9937G = bVar.f9937G;
            this.f9938H = bVar.f9938H;
            this.f9939I = bVar.f9939I;
            this.f9940J = bVar.f9940J;
            this.f9941K = bVar.f9941K;
            this.f9942L = bVar.f9942L;
            this.f9943M = bVar.f9943M;
            this.f9944N = bVar.f9944N;
            this.f9945O = bVar.f9945O;
            this.f9946P = bVar.f9946P;
            this.f9947Q = bVar.f9947Q;
            this.f9948R = bVar.f9948R;
            this.f9949S = bVar.f9949S;
            this.f9950T = bVar.f9950T;
            this.f9951U = bVar.f9951U;
            this.f9952V = bVar.f9952V;
            this.f9953W = bVar.f9953W;
            this.f9954X = bVar.f9954X;
            this.f9955Y = bVar.f9955Y;
            this.f9956Z = bVar.f9956Z;
            this.f9958a0 = bVar.f9958a0;
            this.f9960b0 = bVar.f9960b0;
            this.f9962c0 = bVar.f9962c0;
            this.f9964d0 = bVar.f9964d0;
            this.f9966e0 = bVar.f9966e0;
            this.f9968f0 = bVar.f9968f0;
            this.f9970g0 = bVar.f9970g0;
            this.f9972h0 = bVar.f9972h0;
            this.f9974i0 = bVar.f9974i0;
            this.f9976j0 = bVar.f9976j0;
            this.f9982m0 = bVar.f9982m0;
            int[] iArr = bVar.f9978k0;
            if (iArr != null && bVar.f9980l0 == null) {
                this.f9978k0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f9978k0 = null;
            }
            this.f9980l0 = bVar.f9980l0;
            this.f9984n0 = bVar.f9984n0;
            this.f9986o0 = bVar.f9986o0;
            this.f9988p0 = bVar.f9988p0;
            this.f9990q0 = bVar.f9990q0;
        }

        public void b(u uVar, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object Y3 = uVar.Y(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(Y3 == null ? num : Y3);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f4 = (Float) obj;
                            if (f4.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f4);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        }

        void c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Lg);
            this.f9959b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = f9917t0.get(index);
                switch (i5) {
                    case 1:
                        this.f9991r = d.A0(obtainStyledAttributes, index, this.f9991r);
                        break;
                    case 2:
                        this.f9941K = obtainStyledAttributes.getDimensionPixelSize(index, this.f9941K);
                        break;
                    case 3:
                        this.f9989q = d.A0(obtainStyledAttributes, index, this.f9989q);
                        break;
                    case 4:
                        this.f9987p = d.A0(obtainStyledAttributes, index, this.f9987p);
                        break;
                    case 5:
                        this.f9931A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f9935E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9935E);
                        break;
                    case 7:
                        this.f9936F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9936F);
                        break;
                    case 8:
                        this.f9942L = obtainStyledAttributes.getDimensionPixelSize(index, this.f9942L);
                        break;
                    case 9:
                        this.f9997x = d.A0(obtainStyledAttributes, index, this.f9997x);
                        break;
                    case 10:
                        this.f9996w = d.A0(obtainStyledAttributes, index, this.f9996w);
                        break;
                    case 11:
                        this.f9948R = obtainStyledAttributes.getDimensionPixelSize(index, this.f9948R);
                        break;
                    case 12:
                        this.f9949S = obtainStyledAttributes.getDimensionPixelSize(index, this.f9949S);
                        break;
                    case 13:
                        this.f9945O = obtainStyledAttributes.getDimensionPixelSize(index, this.f9945O);
                        break;
                    case 14:
                        this.f9947Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f9947Q);
                        break;
                    case 15:
                        this.f9950T = obtainStyledAttributes.getDimensionPixelSize(index, this.f9950T);
                        break;
                    case 16:
                        this.f9946P = obtainStyledAttributes.getDimensionPixelSize(index, this.f9946P);
                        break;
                    case 17:
                        this.f9967f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9967f);
                        break;
                    case 18:
                        this.f9969g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f9969g);
                        break;
                    case 19:
                        this.f9971h = obtainStyledAttributes.getFloat(index, this.f9971h);
                        break;
                    case 20:
                        this.f9998y = obtainStyledAttributes.getFloat(index, this.f9998y);
                        break;
                    case 21:
                        this.f9965e = obtainStyledAttributes.getLayoutDimension(index, this.f9965e);
                        break;
                    case 22:
                        this.f9963d = obtainStyledAttributes.getLayoutDimension(index, this.f9963d);
                        break;
                    case 23:
                        this.f9938H = obtainStyledAttributes.getDimensionPixelSize(index, this.f9938H);
                        break;
                    case 24:
                        this.f9975j = d.A0(obtainStyledAttributes, index, this.f9975j);
                        break;
                    case 25:
                        this.f9977k = d.A0(obtainStyledAttributes, index, this.f9977k);
                        break;
                    case 26:
                        this.f9937G = obtainStyledAttributes.getInt(index, this.f9937G);
                        break;
                    case 27:
                        this.f9939I = obtainStyledAttributes.getDimensionPixelSize(index, this.f9939I);
                        break;
                    case 28:
                        this.f9979l = d.A0(obtainStyledAttributes, index, this.f9979l);
                        break;
                    case 29:
                        this.f9981m = d.A0(obtainStyledAttributes, index, this.f9981m);
                        break;
                    case 30:
                        this.f9943M = obtainStyledAttributes.getDimensionPixelSize(index, this.f9943M);
                        break;
                    case 31:
                        this.f9994u = d.A0(obtainStyledAttributes, index, this.f9994u);
                        break;
                    case 32:
                        this.f9995v = d.A0(obtainStyledAttributes, index, this.f9995v);
                        break;
                    case 33:
                        this.f9940J = obtainStyledAttributes.getDimensionPixelSize(index, this.f9940J);
                        break;
                    case 34:
                        this.f9985o = d.A0(obtainStyledAttributes, index, this.f9985o);
                        break;
                    case 35:
                        this.f9983n = d.A0(obtainStyledAttributes, index, this.f9983n);
                        break;
                    case 36:
                        this.f9999z = obtainStyledAttributes.getFloat(index, this.f9999z);
                        break;
                    case 37:
                        this.f9953W = obtainStyledAttributes.getFloat(index, this.f9953W);
                        break;
                    case 38:
                        this.f9952V = obtainStyledAttributes.getFloat(index, this.f9952V);
                        break;
                    case 39:
                        this.f9954X = obtainStyledAttributes.getInt(index, this.f9954X);
                        break;
                    case 40:
                        this.f9955Y = obtainStyledAttributes.getInt(index, this.f9955Y);
                        break;
                    case 41:
                        d.D0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.D0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i5) {
                            case 61:
                                this.f9932B = d.A0(obtainStyledAttributes, index, this.f9932B);
                                break;
                            case f9907l1 /* 62 */:
                                this.f9933C = obtainStyledAttributes.getDimensionPixelSize(index, this.f9933C);
                                break;
                            case 63:
                                this.f9934D = obtainStyledAttributes.getFloat(index, this.f9934D);
                                break;
                            default:
                                switch (i5) {
                                    case f9909n1 /* 69 */:
                                        this.f9968f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case f9910o1 /* 70 */:
                                        this.f9970g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case f9911p1 /* 71 */:
                                        Log.e(d.f9774i, "CURRENTLY UNSUPPORTED");
                                        break;
                                    case f9912q1 /* 72 */:
                                        this.f9972h0 = obtainStyledAttributes.getInt(index, this.f9972h0);
                                        break;
                                    case f9914r1 /* 73 */:
                                        this.f9974i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9974i0);
                                        break;
                                    case f9916s1 /* 74 */:
                                        this.f9980l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case f9918t1 /* 75 */:
                                        this.f9988p0 = obtainStyledAttributes.getBoolean(index, this.f9988p0);
                                        break;
                                    case 76:
                                        this.f9990q0 = obtainStyledAttributes.getInt(index, this.f9990q0);
                                        break;
                                    case f9922v1 /* 77 */:
                                        this.f9992s = d.A0(obtainStyledAttributes, index, this.f9992s);
                                        break;
                                    case f9924w1 /* 78 */:
                                        this.f9993t = d.A0(obtainStyledAttributes, index, this.f9993t);
                                        break;
                                    case f9926x1 /* 79 */:
                                        this.f9951U = obtainStyledAttributes.getDimensionPixelSize(index, this.f9951U);
                                        break;
                                    case f9928y1 /* 80 */:
                                        this.f9944N = obtainStyledAttributes.getDimensionPixelSize(index, this.f9944N);
                                        break;
                                    case 81:
                                        this.f9956Z = obtainStyledAttributes.getInt(index, this.f9956Z);
                                        break;
                                    case 82:
                                        this.f9958a0 = obtainStyledAttributes.getInt(index, this.f9958a0);
                                        break;
                                    case 83:
                                        this.f9962c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9962c0);
                                        break;
                                    case f9865C1 /* 84 */:
                                        this.f9960b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9960b0);
                                        break;
                                    case f9867D1 /* 85 */:
                                        this.f9966e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9966e0);
                                        break;
                                    case f9869E1 /* 86 */:
                                        this.f9964d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f9964d0);
                                        break;
                                    case 87:
                                        this.f9984n0 = obtainStyledAttributes.getBoolean(index, this.f9984n0);
                                        break;
                                    case f9873G1 /* 88 */:
                                        this.f9986o0 = obtainStyledAttributes.getBoolean(index, this.f9986o0);
                                        break;
                                    case f9875H1 /* 89 */:
                                        this.f9982m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case f9877I1 /* 90 */:
                                        this.f9973i = obtainStyledAttributes.getBoolean(index, this.f9973i);
                                        break;
                                    case f9879J1 /* 91 */:
                                        Log.w(d.f9774i, "unused attribute 0x" + Integer.toHexString(index) + "   " + f9917t0.get(index));
                                        break;
                                    default:
                                        Log.w(d.f9774i, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f9917t0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: A, reason: collision with root package name */
        private static final int f10000A = 9;

        /* renamed from: B, reason: collision with root package name */
        private static final int f10001B = 10;

        /* renamed from: o, reason: collision with root package name */
        private static final int f10002o = -2;

        /* renamed from: p, reason: collision with root package name */
        private static final int f10003p = -1;

        /* renamed from: q, reason: collision with root package name */
        private static final int f10004q = -3;

        /* renamed from: r, reason: collision with root package name */
        private static SparseIntArray f10005r = null;

        /* renamed from: s, reason: collision with root package name */
        private static final int f10006s = 1;

        /* renamed from: t, reason: collision with root package name */
        private static final int f10007t = 2;

        /* renamed from: u, reason: collision with root package name */
        private static final int f10008u = 3;

        /* renamed from: v, reason: collision with root package name */
        private static final int f10009v = 4;

        /* renamed from: w, reason: collision with root package name */
        private static final int f10010w = 5;

        /* renamed from: x, reason: collision with root package name */
        private static final int f10011x = 6;

        /* renamed from: y, reason: collision with root package name */
        private static final int f10012y = 7;

        /* renamed from: z, reason: collision with root package name */
        private static final int f10013z = 8;

        /* renamed from: a, reason: collision with root package name */
        public boolean f10014a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f10015b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f10016c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f10017d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f10018e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f10019f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f10020g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f10021h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f10022i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f10023j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f10024k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f10025l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f10026m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f10027n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10005r = sparseIntArray;
            sparseIntArray.append(h.m.Cj, 1);
            f10005r.append(h.m.Ej, 2);
            f10005r.append(h.m.Ij, 3);
            f10005r.append(h.m.Bj, 4);
            f10005r.append(h.m.Aj, 5);
            f10005r.append(h.m.zj, 6);
            f10005r.append(h.m.Dj, 7);
            f10005r.append(h.m.Hj, 8);
            f10005r.append(h.m.Gj, 9);
            f10005r.append(h.m.Fj, 10);
        }

        public void a(c cVar) {
            this.f10014a = cVar.f10014a;
            this.f10015b = cVar.f10015b;
            this.f10017d = cVar.f10017d;
            this.f10018e = cVar.f10018e;
            this.f10019f = cVar.f10019f;
            this.f10022i = cVar.f10022i;
            this.f10020g = cVar.f10020g;
            this.f10021h = cVar.f10021h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.yj);
            this.f10014a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f10005r.get(index)) {
                    case 1:
                        this.f10022i = obtainStyledAttributes.getFloat(index, this.f10022i);
                        break;
                    case 2:
                        this.f10018e = obtainStyledAttributes.getInt(index, this.f10018e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f10017d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f10017d = androidx.constraintlayout.core.motion.utils.d.f7158o[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f10019f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f10015b = d.A0(obtainStyledAttributes, index, this.f10015b);
                        break;
                    case 6:
                        this.f10016c = obtainStyledAttributes.getInteger(index, this.f10016c);
                        break;
                    case 7:
                        this.f10020g = obtainStyledAttributes.getFloat(index, this.f10020g);
                        break;
                    case 8:
                        this.f10024k = obtainStyledAttributes.getInteger(index, this.f10024k);
                        break;
                    case 9:
                        this.f10023j = obtainStyledAttributes.getFloat(index, this.f10023j);
                        break;
                    case 10:
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f10027n = resourceId;
                            if (resourceId != -1) {
                                this.f10026m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f10025l = string;
                            if (string.indexOf("/") > 0) {
                                this.f10027n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f10026m = -2;
                                break;
                            } else {
                                this.f10026m = -1;
                                break;
                            }
                        } else {
                            this.f10026m = obtainStyledAttributes.getInteger(index, this.f10027n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10028a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f10029b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f10030c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f10031d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f10032e = Float.NaN;

        public void a(C0071d c0071d) {
            this.f10028a = c0071d.f10028a;
            this.f10029b = c0071d.f10029b;
            this.f10031d = c0071d.f10031d;
            this.f10032e = c0071d.f10032e;
            this.f10030c = c0071d.f10030c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.ml);
            this.f10028a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.ol) {
                    this.f10031d = obtainStyledAttributes.getFloat(index, this.f10031d);
                } else if (index == h.m.nl) {
                    this.f10029b = obtainStyledAttributes.getInt(index, this.f10029b);
                    this.f10029b = d.f9746V[this.f10029b];
                } else if (index == h.m.rl) {
                    this.f10030c = obtainStyledAttributes.getInt(index, this.f10030c);
                } else if (index == h.m.ql) {
                    this.f10032e = obtainStyledAttributes.getFloat(index, this.f10032e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: A, reason: collision with root package name */
        private static final int f10033A = 12;

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f10034o = null;

        /* renamed from: p, reason: collision with root package name */
        private static final int f10035p = 1;

        /* renamed from: q, reason: collision with root package name */
        private static final int f10036q = 2;

        /* renamed from: r, reason: collision with root package name */
        private static final int f10037r = 3;

        /* renamed from: s, reason: collision with root package name */
        private static final int f10038s = 4;

        /* renamed from: t, reason: collision with root package name */
        private static final int f10039t = 5;

        /* renamed from: u, reason: collision with root package name */
        private static final int f10040u = 6;

        /* renamed from: v, reason: collision with root package name */
        private static final int f10041v = 7;

        /* renamed from: w, reason: collision with root package name */
        private static final int f10042w = 8;

        /* renamed from: x, reason: collision with root package name */
        private static final int f10043x = 9;

        /* renamed from: y, reason: collision with root package name */
        private static final int f10044y = 10;

        /* renamed from: z, reason: collision with root package name */
        private static final int f10045z = 11;

        /* renamed from: a, reason: collision with root package name */
        public boolean f10046a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f10047b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f10048c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f10049d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f10050e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f10051f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f10052g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f10053h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f10054i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f10055j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f10056k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f10057l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f10058m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f10059n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f10034o = sparseIntArray;
            sparseIntArray.append(h.m.On, 1);
            f10034o.append(h.m.Pn, 2);
            f10034o.append(h.m.Qn, 3);
            f10034o.append(h.m.Mn, 4);
            f10034o.append(h.m.Nn, 5);
            f10034o.append(h.m.In, 6);
            f10034o.append(h.m.Jn, 7);
            f10034o.append(h.m.Kn, 8);
            f10034o.append(h.m.Ln, 9);
            f10034o.append(h.m.Rn, 10);
            f10034o.append(h.m.Sn, 11);
            f10034o.append(h.m.Tn, 12);
        }

        public void a(e eVar) {
            this.f10046a = eVar.f10046a;
            this.f10047b = eVar.f10047b;
            this.f10048c = eVar.f10048c;
            this.f10049d = eVar.f10049d;
            this.f10050e = eVar.f10050e;
            this.f10051f = eVar.f10051f;
            this.f10052g = eVar.f10052g;
            this.f10053h = eVar.f10053h;
            this.f10054i = eVar.f10054i;
            this.f10055j = eVar.f10055j;
            this.f10056k = eVar.f10056k;
            this.f10057l = eVar.f10057l;
            this.f10058m = eVar.f10058m;
            this.f10059n = eVar.f10059n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.Hn);
            this.f10046a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                switch (f10034o.get(index)) {
                    case 1:
                        this.f10047b = obtainStyledAttributes.getFloat(index, this.f10047b);
                        break;
                    case 2:
                        this.f10048c = obtainStyledAttributes.getFloat(index, this.f10048c);
                        break;
                    case 3:
                        this.f10049d = obtainStyledAttributes.getFloat(index, this.f10049d);
                        break;
                    case 4:
                        this.f10050e = obtainStyledAttributes.getFloat(index, this.f10050e);
                        break;
                    case 5:
                        this.f10051f = obtainStyledAttributes.getFloat(index, this.f10051f);
                        break;
                    case 6:
                        this.f10052g = obtainStyledAttributes.getDimension(index, this.f10052g);
                        break;
                    case 7:
                        this.f10053h = obtainStyledAttributes.getDimension(index, this.f10053h);
                        break;
                    case 8:
                        this.f10055j = obtainStyledAttributes.getDimension(index, this.f10055j);
                        break;
                    case 9:
                        this.f10056k = obtainStyledAttributes.getDimension(index, this.f10056k);
                        break;
                    case 10:
                        this.f10057l = obtainStyledAttributes.getDimension(index, this.f10057l);
                        break;
                    case 11:
                        this.f10058m = true;
                        this.f10059n = obtainStyledAttributes.getDimension(index, this.f10059n);
                        break;
                    case 12:
                        this.f10054i = d.A0(obtainStyledAttributes, index, this.f10054i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    class f {

        /* renamed from: o, reason: collision with root package name */
        private static final String f10060o = "       ";

        /* renamed from: a, reason: collision with root package name */
        Writer f10061a;

        /* renamed from: b, reason: collision with root package name */
        ConstraintLayout f10062b;

        /* renamed from: c, reason: collision with root package name */
        Context f10063c;

        /* renamed from: d, reason: collision with root package name */
        int f10064d;

        /* renamed from: e, reason: collision with root package name */
        int f10065e = 0;

        /* renamed from: f, reason: collision with root package name */
        final String f10066f = "'left'";

        /* renamed from: g, reason: collision with root package name */
        final String f10067g = "'right'";

        /* renamed from: h, reason: collision with root package name */
        final String f10068h = "'baseline'";

        /* renamed from: i, reason: collision with root package name */
        final String f10069i = "'bottom'";

        /* renamed from: j, reason: collision with root package name */
        final String f10070j = "'top'";

        /* renamed from: k, reason: collision with root package name */
        final String f10071k = "'start'";

        /* renamed from: l, reason: collision with root package name */
        final String f10072l = "'end'";

        /* renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f10073m = new HashMap<>();

        f(Writer writer, ConstraintLayout constraintLayout, int i4) throws IOException {
            this.f10061a = writer;
            this.f10062b = constraintLayout;
            this.f10063c = constraintLayout.getContext();
            this.f10064d = i4;
        }

        private void e(String str, int i4, int i5, float f4, int i6, int i7, boolean z3) throws IOException {
            if (i4 == 0) {
                if (i7 == -1 && i6 == -1) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            this.f10061a.write(f10060o + str + ": '" + f4 + "%',\n");
                            return;
                        }
                        return;
                    }
                    this.f10061a.write(f10060o + str + ": '???????????',\n");
                    return;
                }
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            this.f10061a.write(f10060o + str + ": {'" + f4 + "'% ," + i6 + ", " + i7 + "}\n");
                            return;
                        }
                        return;
                    }
                    this.f10061a.write(f10060o + str + ": {'wrap' ," + i6 + ", " + i7 + "}\n");
                    return;
                }
                this.f10061a.write(f10060o + str + ": {'spread' ," + i6 + ", " + i7 + "}\n");
                return;
            }
            if (i4 == -2) {
                this.f10061a.write(f10060o + str + ": 'wrap'\n");
                return;
            }
            if (i4 == -1) {
                this.f10061a.write(f10060o + str + ": 'parent'\n");
                return;
            }
            this.f10061a.write(f10060o + str + ": " + i4 + ",\n");
        }

        private void f(int i4, int i5, int i6, float f4) throws IOException {
            j("'orientation'", i4);
            j("'guideBegin'", i5);
            j("'guideEnd'", i6);
            h("'guidePercent'", f4);
        }

        String a(int i4) {
            if (this.f10073m.containsKey(Integer.valueOf(i4))) {
                return "'" + this.f10073m.get(Integer.valueOf(i4)) + "'";
            }
            if (i4 == 0) {
                return "'parent'";
            }
            String b4 = b(i4);
            this.f10073m.put(Integer.valueOf(i4), b4);
            return "'" + b4 + "'";
        }

        String b(int i4) {
            try {
                if (i4 != -1) {
                    return this.f10063c.getResources().getResourceEntryName(i4);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C0745h.f12738b);
                int i5 = this.f10065e + 1;
                this.f10065e = i5;
                sb.append(i5);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0745h.f12738b);
                int i6 = this.f10065e + 1;
                this.f10065e = i6;
                sb2.append(i6);
                return sb2.toString();
            }
        }

        void c(int i4, float f4, int i5) throws IOException {
            if (i4 == -1) {
                return;
            }
            this.f10061a.write("       circle");
            this.f10061a.write(":[");
            this.f10061a.write(a(i4));
            this.f10061a.write(", " + f4);
            this.f10061a.write(i5 + "]");
        }

        void d(String str, int i4, String str2, int i5, int i6) throws IOException {
            if (i4 == -1) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(":[");
            this.f10061a.write(a(i4));
            this.f10061a.write(" , ");
            this.f10061a.write(str2);
            if (i5 != 0) {
                this.f10061a.write(" , " + i5);
            }
            this.f10061a.write("],\n");
        }

        void g() throws IOException {
            this.f10061a.write("\n'ConstraintSet':{\n");
            for (Integer num : d.this.f9835h.keySet()) {
                a aVar = (a) d.this.f9835h.get(num);
                String a4 = a(num.intValue());
                this.f10061a.write(a4 + ":{\n");
                b bVar = aVar.f9840e;
                e("height", bVar.f9965e, bVar.f9958a0, bVar.f9970g0, bVar.f9966e0, bVar.f9962c0, bVar.f9986o0);
                e("width", bVar.f9963d, bVar.f9956Z, bVar.f9968f0, bVar.f9964d0, bVar.f9960b0, bVar.f9984n0);
                d("'left'", bVar.f9975j, "'left'", bVar.f9938H, bVar.f9945O);
                d("'left'", bVar.f9977k, "'right'", bVar.f9938H, bVar.f9945O);
                d("'right'", bVar.f9979l, "'left'", bVar.f9939I, bVar.f9947Q);
                d("'right'", bVar.f9981m, "'right'", bVar.f9939I, bVar.f9947Q);
                d("'baseline'", bVar.f9991r, "'baseline'", -1, bVar.f9951U);
                d("'baseline'", bVar.f9992s, "'top'", -1, bVar.f9951U);
                d("'baseline'", bVar.f9993t, "'bottom'", -1, bVar.f9951U);
                d("'top'", bVar.f9985o, "'bottom'", bVar.f9940J, bVar.f9946P);
                d("'top'", bVar.f9983n, "'top'", bVar.f9940J, bVar.f9946P);
                d("'bottom'", bVar.f9989q, "'bottom'", bVar.f9941K, bVar.f9948R);
                d("'bottom'", bVar.f9987p, "'top'", bVar.f9941K, bVar.f9948R);
                d("'start'", bVar.f9995v, "'start'", bVar.f9943M, bVar.f9950T);
                d("'start'", bVar.f9994u, "'end'", bVar.f9943M, bVar.f9950T);
                d("'end'", bVar.f9996w, "'start'", bVar.f9942L, bVar.f9949S);
                d("'end'", bVar.f9997x, "'end'", bVar.f9942L, bVar.f9949S);
                i("'horizontalBias'", bVar.f9998y, 0.5f);
                i("'verticalBias'", bVar.f9999z, 0.5f);
                c(bVar.f9932B, bVar.f9934D, bVar.f9933C);
                f(bVar.f9937G, bVar.f9967f, bVar.f9969g, bVar.f9971h);
                k("'dimensionRatio'", bVar.f9931A);
                j("'barrierMargin'", bVar.f9974i0);
                j("'type'", bVar.f9976j0);
                k("'ReferenceId'", bVar.f9980l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f9988p0, true);
                j("'WrapBehavior'", bVar.f9990q0);
                h("'verticalWeight'", bVar.f9952V);
                h("'horizontalWeight'", bVar.f9953W);
                j("'horizontalChainStyle'", bVar.f9954X);
                j("'verticalChainStyle'", bVar.f9955Y);
                j("'barrierDirection'", bVar.f9972h0);
                int[] iArr = bVar.f9978k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f10061a.write("}\n");
            }
            this.f10061a.write("}\n");
        }

        void h(String str, float f4) throws IOException {
            if (f4 == -1.0f) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(": " + f4);
            this.f10061a.write(",\n");
        }

        void i(String str, float f4, float f5) throws IOException {
            if (f4 == f5) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(": " + f4);
            this.f10061a.write(",\n");
        }

        void j(String str, int i4) throws IOException {
            if (i4 != 0 && i4 != -1) {
                this.f10061a.write(f10060o + str);
                this.f10061a.write(":");
                this.f10061a.write(", " + i4);
                this.f10061a.write("\n");
            }
        }

        void k(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(":");
            this.f10061a.write(", " + str2);
            this.f10061a.write("\n");
        }

        void l(String str, boolean z3) throws IOException {
            if (!z3) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(": " + z3);
            this.f10061a.write(",\n");
        }

        void m(String str, boolean z3, boolean z4) throws IOException {
            if (z3 == z4) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(": " + z3);
            this.f10061a.write(",\n");
        }

        void n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr == null) {
                return;
            }
            this.f10061a.write(f10060o + str);
            this.f10061a.write(": ");
            for (int i4 = 0; i4 < iArr.length; i4++) {
                Writer writer = this.f10061a;
                StringBuilder sb = new StringBuilder();
                if (i4 == 0) {
                    str2 = "[";
                } else {
                    str2 = ", ";
                }
                sb.append(str2);
                sb.append(a(iArr[i4]));
                writer.write(sb.toString());
            }
            this.f10061a.write("],\n");
        }
    }

    /* loaded from: classes.dex */
    class g {

        /* renamed from: o, reason: collision with root package name */
        private static final String f10075o = "\n       ";

        /* renamed from: a, reason: collision with root package name */
        Writer f10076a;

        /* renamed from: b, reason: collision with root package name */
        ConstraintLayout f10077b;

        /* renamed from: c, reason: collision with root package name */
        Context f10078c;

        /* renamed from: d, reason: collision with root package name */
        int f10079d;

        /* renamed from: e, reason: collision with root package name */
        int f10080e = 0;

        /* renamed from: f, reason: collision with root package name */
        final String f10081f = "'left'";

        /* renamed from: g, reason: collision with root package name */
        final String f10082g = "'right'";

        /* renamed from: h, reason: collision with root package name */
        final String f10083h = "'baseline'";

        /* renamed from: i, reason: collision with root package name */
        final String f10084i = "'bottom'";

        /* renamed from: j, reason: collision with root package name */
        final String f10085j = "'top'";

        /* renamed from: k, reason: collision with root package name */
        final String f10086k = "'start'";

        /* renamed from: l, reason: collision with root package name */
        final String f10087l = "'end'";

        /* renamed from: m, reason: collision with root package name */
        HashMap<Integer, String> f10088m = new HashMap<>();

        g(Writer writer, ConstraintLayout constraintLayout, int i4) throws IOException {
            this.f10076a = writer;
            this.f10077b = constraintLayout;
            this.f10078c = constraintLayout.getContext();
            this.f10079d = i4;
        }

        private void c(String str, int i4, int i5) throws IOException {
            if (i4 != i5) {
                if (i4 == -2) {
                    this.f10076a.write(f10075o + str + "=\"wrap_content\"");
                    return;
                }
                if (i4 == -1) {
                    this.f10076a.write(f10075o + str + "=\"match_parent\"");
                    return;
                }
                this.f10076a.write(f10075o + str + "=\"" + i4 + "dp\"");
            }
        }

        private void d(String str, boolean z3, boolean z4) throws IOException {
            if (z3 != z4) {
                this.f10076a.write(f10075o + str + "=\"" + z3 + "dp\"");
            }
        }

        private void g(String str, int i4, int i5) throws IOException {
            if (i4 != i5) {
                this.f10076a.write(f10075o + str + "=\"" + i4 + "dp\"");
            }
        }

        private void h(String str, int i4, String[] strArr, int i5) throws IOException {
            if (i4 != i5) {
                this.f10076a.write(f10075o + str + "=\"" + strArr[i4] + "\"");
            }
        }

        String a(int i4) {
            if (this.f10088m.containsKey(Integer.valueOf(i4))) {
                return "@+id/" + this.f10088m.get(Integer.valueOf(i4)) + "";
            }
            if (i4 == 0) {
                return d.f9751W1;
            }
            String b4 = b(i4);
            this.f10088m.put(Integer.valueOf(i4), b4);
            return "@+id/" + b4 + "";
        }

        String b(int i4) {
            try {
                if (i4 != -1) {
                    return this.f10078c.getResources().getResourceEntryName(i4);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C0745h.f12738b);
                int i5 = this.f10080e + 1;
                this.f10080e = i5;
                sb.append(i5);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0745h.f12738b);
                int i6 = this.f10080e + 1;
                this.f10080e = i6;
                sb2.append(i6);
                return sb2.toString();
            }
        }

        void e(int i4, float f4, int i5) throws IOException {
            if (i4 == -1) {
                return;
            }
            this.f10076a.write("circle");
            this.f10076a.write(":[");
            this.f10076a.write(a(i4));
            this.f10076a.write(", " + f4);
            this.f10076a.write(i5 + "]");
        }

        void f(String str, int i4, String str2, int i5, int i6) throws IOException {
            if (i4 == -1) {
                return;
            }
            this.f10076a.write(f10075o + str);
            this.f10076a.write(":[");
            this.f10076a.write(a(i4));
            this.f10076a.write(" , ");
            this.f10076a.write(str2);
            if (i5 != 0) {
                this.f10076a.write(" , " + i5);
            }
            this.f10076a.write("],\n");
        }

        void i() throws IOException {
            this.f10076a.write("\n<ConstraintSet>\n");
            for (Integer num : d.this.f9835h.keySet()) {
                a aVar = (a) d.this.f9835h.get(num);
                String a4 = a(num.intValue());
                this.f10076a.write("  <Constraint");
                this.f10076a.write("\n       android:id=\"" + a4 + "\"");
                b bVar = aVar.f9840e;
                c("android:layout_width", bVar.f9963d, -5);
                c("android:layout_height", bVar.f9965e, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.f9967f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f9969g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f9971h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f9998y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f9999z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.f9931A, null);
                o("app:layout_constraintCircle", bVar.f9932B);
                j("app:layout_constraintCircleRadius", bVar.f9933C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.f9934D, 0.0f);
                j("android:orientation", bVar.f9937G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.f9952V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.f9953W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.f9954X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.f9955Y, 0.0f);
                j("app:barrierDirection", bVar.f9972h0, -1.0f);
                j("app:barrierMargin", bVar.f9974i0, 0.0f);
                g("app:layout_marginLeft", bVar.f9938H, 0);
                g("app:layout_goneMarginLeft", bVar.f9945O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.f9939I, 0);
                g("app:layout_goneMarginRight", bVar.f9947Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.f9943M, 0);
                g("app:layout_goneMarginStart", bVar.f9950T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.f9942L, 0);
                g("app:layout_goneMarginEnd", bVar.f9949S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.f9940J, 0);
                g("app:layout_goneMarginTop", bVar.f9946P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.f9941K, 0);
                g("app:layout_goneMarginBottom", bVar.f9948R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.f9951U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.f9944N, 0);
                d("app:layout_constrainedWidth", bVar.f9984n0, false);
                d("app:layout_constrainedHeight", bVar.f9986o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f9988p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f9990q0, 0.0f);
                o("app:baselineToBaseline", bVar.f9991r);
                o("app:baselineToBottom", bVar.f9993t);
                o("app:baselineToTop", bVar.f9992s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f9989q);
                o("app:layout_constraintBottom_toTopOf", bVar.f9987p);
                o("app:layout_constraintEnd_toEndOf", bVar.f9997x);
                o("app:layout_constraintEnd_toStartOf", bVar.f9996w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f9975j);
                o("app:layout_constraintLeft_toRightOf", bVar.f9977k);
                o("app:layout_constraintRight_toLeftOf", bVar.f9979l);
                o("app:layout_constraintRight_toRightOf", bVar.f9981m);
                o("app:layout_constraintStart_toEndOf", bVar.f9994u);
                o("app:layout_constraintStart_toStartOf", bVar.f9995v);
                o("app:layout_constraintTop_toBottomOf", bVar.f9985o);
                o("app:layout_constraintTop_toTopOf", bVar.f9983n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.f9958a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f9970g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f9966e0, 0);
                g("app:layout_constraintHeight_max", bVar.f9962c0, 0);
                d("android:layout_constrainedHeight", bVar.f9986o0, false);
                h("app:layout_constraintWidth_default", bVar.f9956Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f9968f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f9964d0, 0);
                g("app:layout_constraintWidth_max", bVar.f9960b0, 0);
                d("android:layout_constrainedWidth", bVar.f9984n0, false);
                j("app:layout_constraintVertical_weight", bVar.f9952V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.f9953W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.f9954X);
                k("app:layout_constraintVertical_chainStyle", bVar.f9955Y);
                h("app:barrierDirection", bVar.f9972h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f9982m0, null);
                int[] iArr = bVar.f9978k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f10076a.write(" />\n");
            }
            this.f10076a.write("</ConstraintSet>\n");
        }

        void j(String str, float f4, float f5) throws IOException {
            if (f4 == f5) {
                return;
            }
            this.f10076a.write(f10075o + str);
            this.f10076a.write("=\"" + f4 + "\"");
        }

        void k(String str, int i4) throws IOException {
            if (i4 != 0 && i4 != -1) {
                this.f10076a.write(f10075o + str + "=\"" + i4 + "\"\n");
            }
        }

        void l(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.f10076a.write(str);
            this.f10076a.write(":");
            this.f10076a.write(", " + str2);
            this.f10076a.write("\n");
        }

        void m(String str, String str2, String str3) throws IOException {
            if (str2 != null && !str2.equals(str3)) {
                this.f10076a.write(f10075o + str);
                this.f10076a.write("=\"" + str2 + "\"");
            }
        }

        void n(String str, int[] iArr) throws IOException {
            String str2;
            if (iArr == null) {
                return;
            }
            this.f10076a.write(f10075o + str);
            this.f10076a.write(":");
            for (int i4 = 0; i4 < iArr.length; i4++) {
                Writer writer = this.f10076a;
                StringBuilder sb = new StringBuilder();
                if (i4 == 0) {
                    str2 = "[";
                } else {
                    str2 = ", ";
                }
                sb.append(str2);
                sb.append(a(iArr[i4]));
                writer.write(sb.toString());
            }
            this.f10076a.write("],\n");
        }

        void o(String str, int i4) throws IOException {
            if (i4 == -1) {
                return;
            }
            this.f10076a.write(f10075o + str);
            this.f10076a.write("=\"" + a(i4) + "\"");
        }
    }

    static {
        f9752X.append(h.m.H5, 25);
        f9752X.append(h.m.I5, 26);
        f9752X.append(h.m.K5, 29);
        f9752X.append(h.m.L5, 30);
        f9752X.append(h.m.R5, 36);
        f9752X.append(h.m.Q5, 35);
        f9752X.append(h.m.o5, 4);
        f9752X.append(h.m.n5, 3);
        f9752X.append(h.m.j5, 1);
        f9752X.append(h.m.l5, f9718L1);
        f9752X.append(h.m.k5, f9721M1);
        f9752X.append(h.m.a6, 6);
        f9752X.append(h.m.b6, 7);
        f9752X.append(h.m.v5, 17);
        f9752X.append(h.m.w5, 18);
        f9752X.append(h.m.x5, 19);
        f9752X.append(h.m.f5, f9742T1);
        f9752X.append(h.m.d4, 27);
        f9752X.append(h.m.M5, 32);
        f9752X.append(h.m.N5, 33);
        f9752X.append(h.m.u5, 10);
        f9752X.append(h.m.t5, 9);
        f9752X.append(h.m.f6, 13);
        f9752X.append(h.m.i6, 16);
        f9752X.append(h.m.g6, 14);
        f9752X.append(h.m.d6, 11);
        f9752X.append(h.m.h6, 15);
        f9752X.append(h.m.e6, 12);
        f9752X.append(h.m.U5, 40);
        f9752X.append(h.m.F5, 39);
        f9752X.append(h.m.E5, 41);
        f9752X.append(h.m.T5, 42);
        f9752X.append(h.m.D5, 20);
        f9752X.append(h.m.S5, 37);
        f9752X.append(h.m.s5, 5);
        f9752X.append(h.m.G5, 87);
        f9752X.append(h.m.P5, 87);
        f9752X.append(h.m.J5, 87);
        f9752X.append(h.m.m5, 87);
        f9752X.append(h.m.i5, 87);
        f9752X.append(h.m.i4, 24);
        f9752X.append(h.m.k4, 28);
        f9752X.append(h.m.A4, 31);
        f9752X.append(h.m.B4, 8);
        f9752X.append(h.m.j4, 34);
        f9752X.append(h.m.l4, 2);
        f9752X.append(h.m.g4, 23);
        f9752X.append(h.m.h4, 21);
        f9752X.append(h.m.V5, f9730P1);
        f9752X.append(h.m.y5, f9733Q1);
        f9752X.append(h.m.f4, 22);
        f9752X.append(h.m.q4, 43);
        f9752X.append(h.m.D4, 44);
        f9752X.append(h.m.y4, 45);
        f9752X.append(h.m.z4, 46);
        f9752X.append(h.m.x4, 60);
        f9752X.append(h.m.v4, 47);
        f9752X.append(h.m.w4, 48);
        f9752X.append(h.m.r4, 49);
        f9752X.append(h.m.s4, 50);
        f9752X.append(h.m.t4, 51);
        f9752X.append(h.m.u4, 52);
        f9752X.append(h.m.C4, 53);
        f9752X.append(h.m.W5, 54);
        f9752X.append(h.m.z5, 55);
        f9752X.append(h.m.X5, f9763c1);
        f9752X.append(h.m.A5, f9765d1);
        f9752X.append(h.m.Y5, f9767e1);
        f9752X.append(h.m.B5, f9769f1);
        f9752X.append(h.m.p5, 61);
        f9752X.append(h.m.r5, f9776i1);
        f9752X.append(h.m.q5, 63);
        f9752X.append(h.m.F4, 64);
        f9752X.append(h.m.u6, 65);
        f9752X.append(h.m.M4, 66);
        f9752X.append(h.m.v6, 67);
        f9752X.append(h.m.m6, f9827z1);
        f9752X.append(h.m.e4, 38);
        f9752X.append(h.m.l6, f9794o1);
        f9752X.append(h.m.Z5, f9797p1);
        f9752X.append(h.m.C5, f9800q1);
        f9752X.append(h.m.k6, 97);
        f9752X.append(h.m.J4, f9803r1);
        f9752X.append(h.m.H4, f9806s1);
        f9752X.append(h.m.I4, f9809t1);
        f9752X.append(h.m.K4, f9812u1);
        f9752X.append(h.m.G4, f9815v1);
        f9752X.append(h.m.n6, 76);
        f9752X.append(h.m.O5, f9821x1);
        f9752X.append(h.m.w6, f9824y1);
        f9752X.append(h.m.h5, f9685A1);
        f9752X.append(h.m.g5, 81);
        f9752X.append(h.m.p6, 82);
        f9752X.append(h.m.t6, 83);
        f9752X.append(h.m.s6, f9697E1);
        f9752X.append(h.m.r6, f9700F1);
        f9752X.append(h.m.q6, f9703G1);
        f9754Y.append(h.m.za, 6);
        f9754Y.append(h.m.za, 7);
        f9754Y.append(h.m.S8, 27);
        f9754Y.append(h.m.Da, 13);
        f9754Y.append(h.m.Ga, 16);
        f9754Y.append(h.m.Ea, 14);
        f9754Y.append(h.m.Ba, 11);
        f9754Y.append(h.m.Fa, 15);
        f9754Y.append(h.m.Ca, 12);
        f9754Y.append(h.m.sa, 40);
        f9754Y.append(h.m.la, 39);
        f9754Y.append(h.m.ka, 41);
        f9754Y.append(h.m.ra, 42);
        f9754Y.append(h.m.ja, 20);
        f9754Y.append(h.m.qa, 37);
        f9754Y.append(h.m.aa, 5);
        f9754Y.append(h.m.ma, 87);
        f9754Y.append(h.m.pa, 87);
        f9754Y.append(h.m.na, 87);
        f9754Y.append(h.m.X9, 87);
        f9754Y.append(h.m.W9, 87);
        f9754Y.append(h.m.X8, 24);
        f9754Y.append(h.m.Z8, 28);
        f9754Y.append(h.m.p9, 31);
        f9754Y.append(h.m.q9, 8);
        f9754Y.append(h.m.Y8, 34);
        f9754Y.append(h.m.a9, 2);
        f9754Y.append(h.m.V8, 23);
        f9754Y.append(h.m.W8, 21);
        f9754Y.append(h.m.ta, f9730P1);
        f9754Y.append(h.m.ea, f9733Q1);
        f9754Y.append(h.m.U8, 22);
        f9754Y.append(h.m.f9, 43);
        f9754Y.append(h.m.s9, 44);
        f9754Y.append(h.m.n9, 45);
        f9754Y.append(h.m.o9, 46);
        f9754Y.append(h.m.m9, 60);
        f9754Y.append(h.m.k9, 47);
        f9754Y.append(h.m.l9, 48);
        f9754Y.append(h.m.g9, 49);
        f9754Y.append(h.m.h9, 50);
        f9754Y.append(h.m.i9, 51);
        f9754Y.append(h.m.j9, 52);
        f9754Y.append(h.m.r9, 53);
        f9754Y.append(h.m.ua, 54);
        f9754Y.append(h.m.fa, 55);
        f9754Y.append(h.m.va, f9763c1);
        f9754Y.append(h.m.ga, f9765d1);
        f9754Y.append(h.m.wa, f9767e1);
        f9754Y.append(h.m.ha, f9769f1);
        f9754Y.append(h.m.Z9, f9776i1);
        f9754Y.append(h.m.Y9, 63);
        f9754Y.append(h.m.u9, 64);
        f9754Y.append(h.m.Ta, 65);
        f9754Y.append(h.m.A9, 66);
        f9754Y.append(h.m.Ua, 67);
        f9754Y.append(h.m.Ka, f9827z1);
        f9754Y.append(h.m.T8, 38);
        f9754Y.append(h.m.La, 98);
        f9754Y.append(h.m.Ja, f9794o1);
        f9754Y.append(h.m.xa, f9797p1);
        f9754Y.append(h.m.ia, f9800q1);
        f9754Y.append(h.m.y9, f9803r1);
        f9754Y.append(h.m.w9, f9806s1);
        f9754Y.append(h.m.x9, f9809t1);
        f9754Y.append(h.m.z9, f9812u1);
        f9754Y.append(h.m.v9, f9815v1);
        f9754Y.append(h.m.Ma, 76);
        f9754Y.append(h.m.oa, f9821x1);
        f9754Y.append(h.m.Va, f9824y1);
        f9754Y.append(h.m.V9, f9685A1);
        f9754Y.append(h.m.U9, 81);
        f9754Y.append(h.m.Oa, 82);
        f9754Y.append(h.m.Sa, 83);
        f9754Y.append(h.m.Ra, f9697E1);
        f9754Y.append(h.m.Qa, f9700F1);
        f9754Y.append(h.m.Pa, f9703G1);
        f9754Y.append(h.m.Ia, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int A0(TypedArray typedArray, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i4, i5);
        if (resourceId == -1) {
            return typedArray.getInt(i4, -1);
        }
        return resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.f9520a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.f9522b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4e
            r4.f9963d = r2
            r4.f9984n0 = r5
            goto L70
        L4e:
            r4.f9965e = r2
            r4.f9986o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0070a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0070a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            E0(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.D0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void E0(Object obj, String str, int i4) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if (f9748V1.equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                        if (i4 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                        }
                        F0(bVar, trim2);
                        return;
                    }
                    if (obj instanceof b) {
                        ((b) obj).f9931A = trim2;
                        return;
                    } else {
                        if (obj instanceof a.C0070a) {
                            ((a.C0070a) obj).c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (f9745U1.equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                bVar2.f9504L = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.f9505M = parseFloat;
                            }
                        } else if (obj instanceof b) {
                            b bVar3 = (b) obj;
                            if (i4 == 0) {
                                bVar3.f9963d = 0;
                                bVar3.f9953W = parseFloat;
                            } else {
                                bVar3.f9965e = 0;
                                bVar3.f9952V = parseFloat;
                            }
                        } else if (obj instanceof a.C0070a) {
                            a.C0070a c0070a = (a.C0070a) obj;
                            if (i4 == 0) {
                                c0070a.b(23, 0);
                                c0070a.a(39, parseFloat);
                            } else {
                                c0070a.b(21, 0);
                                c0070a.a(40, parseFloat);
                            }
                        }
                    } else if (f9751W1.equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i4 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                                bVar4.f9514V = max;
                                bVar4.f9508P = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                                bVar4.f9515W = max;
                                bVar4.f9509Q = 2;
                            }
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i4 == 0) {
                                bVar5.f9963d = 0;
                                bVar5.f9968f0 = max;
                                bVar5.f9956Z = 2;
                            } else {
                                bVar5.f9965e = 0;
                                bVar5.f9970g0 = max;
                                bVar5.f9958a0 = 2;
                            }
                        } else if (obj instanceof a.C0070a) {
                            a.C0070a c0070a2 = (a.C0070a) obj;
                            if (i4 == 0) {
                                c0070a2.b(23, 0);
                                c0070a2.b(54, 2);
                            } else {
                                c0070a2.b(21, 0);
                                c0070a2.b(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F0(ConstraintLayout.b bVar, String str) {
        float f4 = Float.NaN;
        int i4 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i5 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(androidx.exifinterface.media.a.V4)) {
                    i4 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i4 = 1;
                }
                i5 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(f9767e1);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i5, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f4 = i4 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i5);
                    if (substring4.length() > 0) {
                        f4 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f9501I = str;
        bVar.f9502J = f4;
        bVar.f9503K = i4;
    }

    private void J0(Context context, a aVar, TypedArray typedArray, boolean z3) {
        if (z3) {
            K0(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index != h.m.e4 && h.m.A4 != index && h.m.B4 != index) {
                aVar.f9839d.f10014a = true;
                aVar.f9840e.f9959b = true;
                aVar.f9838c.f10028a = true;
                aVar.f9841f.f10046a = true;
            }
            switch (f9752X.get(index)) {
                case 1:
                    b bVar = aVar.f9840e;
                    bVar.f9991r = A0(typedArray, index, bVar.f9991r);
                    break;
                case 2:
                    b bVar2 = aVar.f9840e;
                    bVar2.f9941K = typedArray.getDimensionPixelSize(index, bVar2.f9941K);
                    break;
                case 3:
                    b bVar3 = aVar.f9840e;
                    bVar3.f9989q = A0(typedArray, index, bVar3.f9989q);
                    break;
                case 4:
                    b bVar4 = aVar.f9840e;
                    bVar4.f9987p = A0(typedArray, index, bVar4.f9987p);
                    break;
                case 5:
                    aVar.f9840e.f9931A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f9840e;
                    bVar5.f9935E = typedArray.getDimensionPixelOffset(index, bVar5.f9935E);
                    break;
                case 7:
                    b bVar6 = aVar.f9840e;
                    bVar6.f9936F = typedArray.getDimensionPixelOffset(index, bVar6.f9936F);
                    break;
                case 8:
                    b bVar7 = aVar.f9840e;
                    bVar7.f9942L = typedArray.getDimensionPixelSize(index, bVar7.f9942L);
                    break;
                case 9:
                    b bVar8 = aVar.f9840e;
                    bVar8.f9997x = A0(typedArray, index, bVar8.f9997x);
                    break;
                case 10:
                    b bVar9 = aVar.f9840e;
                    bVar9.f9996w = A0(typedArray, index, bVar9.f9996w);
                    break;
                case 11:
                    b bVar10 = aVar.f9840e;
                    bVar10.f9948R = typedArray.getDimensionPixelSize(index, bVar10.f9948R);
                    break;
                case 12:
                    b bVar11 = aVar.f9840e;
                    bVar11.f9949S = typedArray.getDimensionPixelSize(index, bVar11.f9949S);
                    break;
                case 13:
                    b bVar12 = aVar.f9840e;
                    bVar12.f9945O = typedArray.getDimensionPixelSize(index, bVar12.f9945O);
                    break;
                case 14:
                    b bVar13 = aVar.f9840e;
                    bVar13.f9947Q = typedArray.getDimensionPixelSize(index, bVar13.f9947Q);
                    break;
                case 15:
                    b bVar14 = aVar.f9840e;
                    bVar14.f9950T = typedArray.getDimensionPixelSize(index, bVar14.f9950T);
                    break;
                case 16:
                    b bVar15 = aVar.f9840e;
                    bVar15.f9946P = typedArray.getDimensionPixelSize(index, bVar15.f9946P);
                    break;
                case 17:
                    b bVar16 = aVar.f9840e;
                    bVar16.f9967f = typedArray.getDimensionPixelOffset(index, bVar16.f9967f);
                    break;
                case 18:
                    b bVar17 = aVar.f9840e;
                    bVar17.f9969g = typedArray.getDimensionPixelOffset(index, bVar17.f9969g);
                    break;
                case 19:
                    b bVar18 = aVar.f9840e;
                    bVar18.f9971h = typedArray.getFloat(index, bVar18.f9971h);
                    break;
                case 20:
                    b bVar19 = aVar.f9840e;
                    bVar19.f9998y = typedArray.getFloat(index, bVar19.f9998y);
                    break;
                case 21:
                    b bVar20 = aVar.f9840e;
                    bVar20.f9965e = typedArray.getLayoutDimension(index, bVar20.f9965e);
                    break;
                case 22:
                    C0071d c0071d = aVar.f9838c;
                    c0071d.f10029b = typedArray.getInt(index, c0071d.f10029b);
                    C0071d c0071d2 = aVar.f9838c;
                    c0071d2.f10029b = f9746V[c0071d2.f10029b];
                    break;
                case 23:
                    b bVar21 = aVar.f9840e;
                    bVar21.f9963d = typedArray.getLayoutDimension(index, bVar21.f9963d);
                    break;
                case 24:
                    b bVar22 = aVar.f9840e;
                    bVar22.f9938H = typedArray.getDimensionPixelSize(index, bVar22.f9938H);
                    break;
                case 25:
                    b bVar23 = aVar.f9840e;
                    bVar23.f9975j = A0(typedArray, index, bVar23.f9975j);
                    break;
                case 26:
                    b bVar24 = aVar.f9840e;
                    bVar24.f9977k = A0(typedArray, index, bVar24.f9977k);
                    break;
                case 27:
                    b bVar25 = aVar.f9840e;
                    bVar25.f9937G = typedArray.getInt(index, bVar25.f9937G);
                    break;
                case 28:
                    b bVar26 = aVar.f9840e;
                    bVar26.f9939I = typedArray.getDimensionPixelSize(index, bVar26.f9939I);
                    break;
                case 29:
                    b bVar27 = aVar.f9840e;
                    bVar27.f9979l = A0(typedArray, index, bVar27.f9979l);
                    break;
                case 30:
                    b bVar28 = aVar.f9840e;
                    bVar28.f9981m = A0(typedArray, index, bVar28.f9981m);
                    break;
                case 31:
                    b bVar29 = aVar.f9840e;
                    bVar29.f9943M = typedArray.getDimensionPixelSize(index, bVar29.f9943M);
                    break;
                case 32:
                    b bVar30 = aVar.f9840e;
                    bVar30.f9994u = A0(typedArray, index, bVar30.f9994u);
                    break;
                case 33:
                    b bVar31 = aVar.f9840e;
                    bVar31.f9995v = A0(typedArray, index, bVar31.f9995v);
                    break;
                case 34:
                    b bVar32 = aVar.f9840e;
                    bVar32.f9940J = typedArray.getDimensionPixelSize(index, bVar32.f9940J);
                    break;
                case 35:
                    b bVar33 = aVar.f9840e;
                    bVar33.f9985o = A0(typedArray, index, bVar33.f9985o);
                    break;
                case 36:
                    b bVar34 = aVar.f9840e;
                    bVar34.f9983n = A0(typedArray, index, bVar34.f9983n);
                    break;
                case 37:
                    b bVar35 = aVar.f9840e;
                    bVar35.f9999z = typedArray.getFloat(index, bVar35.f9999z);
                    break;
                case 38:
                    aVar.f9836a = typedArray.getResourceId(index, aVar.f9836a);
                    break;
                case 39:
                    b bVar36 = aVar.f9840e;
                    bVar36.f9953W = typedArray.getFloat(index, bVar36.f9953W);
                    break;
                case 40:
                    b bVar37 = aVar.f9840e;
                    bVar37.f9952V = typedArray.getFloat(index, bVar37.f9952V);
                    break;
                case 41:
                    b bVar38 = aVar.f9840e;
                    bVar38.f9954X = typedArray.getInt(index, bVar38.f9954X);
                    break;
                case 42:
                    b bVar39 = aVar.f9840e;
                    bVar39.f9955Y = typedArray.getInt(index, bVar39.f9955Y);
                    break;
                case 43:
                    C0071d c0071d3 = aVar.f9838c;
                    c0071d3.f10031d = typedArray.getFloat(index, c0071d3.f10031d);
                    break;
                case 44:
                    e eVar = aVar.f9841f;
                    eVar.f10058m = true;
                    eVar.f10059n = typedArray.getDimension(index, eVar.f10059n);
                    break;
                case 45:
                    e eVar2 = aVar.f9841f;
                    eVar2.f10048c = typedArray.getFloat(index, eVar2.f10048c);
                    break;
                case 46:
                    e eVar3 = aVar.f9841f;
                    eVar3.f10049d = typedArray.getFloat(index, eVar3.f10049d);
                    break;
                case 47:
                    e eVar4 = aVar.f9841f;
                    eVar4.f10050e = typedArray.getFloat(index, eVar4.f10050e);
                    break;
                case 48:
                    e eVar5 = aVar.f9841f;
                    eVar5.f10051f = typedArray.getFloat(index, eVar5.f10051f);
                    break;
                case 49:
                    e eVar6 = aVar.f9841f;
                    eVar6.f10052g = typedArray.getDimension(index, eVar6.f10052g);
                    break;
                case 50:
                    e eVar7 = aVar.f9841f;
                    eVar7.f10053h = typedArray.getDimension(index, eVar7.f10053h);
                    break;
                case 51:
                    e eVar8 = aVar.f9841f;
                    eVar8.f10055j = typedArray.getDimension(index, eVar8.f10055j);
                    break;
                case 52:
                    e eVar9 = aVar.f9841f;
                    eVar9.f10056k = typedArray.getDimension(index, eVar9.f10056k);
                    break;
                case 53:
                    e eVar10 = aVar.f9841f;
                    eVar10.f10057l = typedArray.getDimension(index, eVar10.f10057l);
                    break;
                case 54:
                    b bVar40 = aVar.f9840e;
                    bVar40.f9956Z = typedArray.getInt(index, bVar40.f9956Z);
                    break;
                case 55:
                    b bVar41 = aVar.f9840e;
                    bVar41.f9958a0 = typedArray.getInt(index, bVar41.f9958a0);
                    break;
                case f9763c1 /* 56 */:
                    b bVar42 = aVar.f9840e;
                    bVar42.f9960b0 = typedArray.getDimensionPixelSize(index, bVar42.f9960b0);
                    break;
                case f9765d1 /* 57 */:
                    b bVar43 = aVar.f9840e;
                    bVar43.f9962c0 = typedArray.getDimensionPixelSize(index, bVar43.f9962c0);
                    break;
                case f9767e1 /* 58 */:
                    b bVar44 = aVar.f9840e;
                    bVar44.f9964d0 = typedArray.getDimensionPixelSize(index, bVar44.f9964d0);
                    break;
                case f9769f1 /* 59 */:
                    b bVar45 = aVar.f9840e;
                    bVar45.f9966e0 = typedArray.getDimensionPixelSize(index, bVar45.f9966e0);
                    break;
                case 60:
                    e eVar11 = aVar.f9841f;
                    eVar11.f10047b = typedArray.getFloat(index, eVar11.f10047b);
                    break;
                case 61:
                    b bVar46 = aVar.f9840e;
                    bVar46.f9932B = A0(typedArray, index, bVar46.f9932B);
                    break;
                case f9776i1 /* 62 */:
                    b bVar47 = aVar.f9840e;
                    bVar47.f9933C = typedArray.getDimensionPixelSize(index, bVar47.f9933C);
                    break;
                case 63:
                    b bVar48 = aVar.f9840e;
                    bVar48.f9934D = typedArray.getFloat(index, bVar48.f9934D);
                    break;
                case 64:
                    c cVar = aVar.f9839d;
                    cVar.f10015b = A0(typedArray, index, cVar.f10015b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f9839d.f10017d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f9839d.f10017d = androidx.constraintlayout.core.motion.utils.d.f7158o[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f9839d.f10019f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f9839d;
                    cVar2.f10022i = typedArray.getFloat(index, cVar2.f10022i);
                    break;
                case f9794o1 /* 68 */:
                    C0071d c0071d4 = aVar.f9838c;
                    c0071d4.f10032e = typedArray.getFloat(index, c0071d4.f10032e);
                    break;
                case f9797p1 /* 69 */:
                    aVar.f9840e.f9968f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case f9800q1 /* 70 */:
                    aVar.f9840e.f9970g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case f9803r1 /* 71 */:
                    Log.e(f9774i, "CURRENTLY UNSUPPORTED");
                    break;
                case f9806s1 /* 72 */:
                    b bVar49 = aVar.f9840e;
                    bVar49.f9972h0 = typedArray.getInt(index, bVar49.f9972h0);
                    break;
                case f9809t1 /* 73 */:
                    b bVar50 = aVar.f9840e;
                    bVar50.f9974i0 = typedArray.getDimensionPixelSize(index, bVar50.f9974i0);
                    break;
                case f9812u1 /* 74 */:
                    aVar.f9840e.f9980l0 = typedArray.getString(index);
                    break;
                case f9815v1 /* 75 */:
                    b bVar51 = aVar.f9840e;
                    bVar51.f9988p0 = typedArray.getBoolean(index, bVar51.f9988p0);
                    break;
                case 76:
                    c cVar3 = aVar.f9839d;
                    cVar3.f10018e = typedArray.getInt(index, cVar3.f10018e);
                    break;
                case f9821x1 /* 77 */:
                    aVar.f9840e.f9982m0 = typedArray.getString(index);
                    break;
                case f9824y1 /* 78 */:
                    C0071d c0071d5 = aVar.f9838c;
                    c0071d5.f10030c = typedArray.getInt(index, c0071d5.f10030c);
                    break;
                case f9827z1 /* 79 */:
                    c cVar4 = aVar.f9839d;
                    cVar4.f10020g = typedArray.getFloat(index, cVar4.f10020g);
                    break;
                case f9685A1 /* 80 */:
                    b bVar52 = aVar.f9840e;
                    bVar52.f9984n0 = typedArray.getBoolean(index, bVar52.f9984n0);
                    break;
                case 81:
                    b bVar53 = aVar.f9840e;
                    bVar53.f9986o0 = typedArray.getBoolean(index, bVar53.f9986o0);
                    break;
                case 82:
                    c cVar5 = aVar.f9839d;
                    cVar5.f10016c = typedArray.getInteger(index, cVar5.f10016c);
                    break;
                case 83:
                    e eVar12 = aVar.f9841f;
                    eVar12.f10054i = A0(typedArray, index, eVar12.f10054i);
                    break;
                case f9697E1 /* 84 */:
                    c cVar6 = aVar.f9839d;
                    cVar6.f10024k = typedArray.getInteger(index, cVar6.f10024k);
                    break;
                case f9700F1 /* 85 */:
                    c cVar7 = aVar.f9839d;
                    cVar7.f10023j = typedArray.getFloat(index, cVar7.f10023j);
                    break;
                case f9703G1 /* 86 */:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 == 1) {
                        aVar.f9839d.f10027n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f9839d;
                        if (cVar8.f10027n != -1) {
                            cVar8.f10026m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i5 == 3) {
                        aVar.f9839d.f10025l = typedArray.getString(index);
                        if (aVar.f9839d.f10025l.indexOf("/") > 0) {
                            aVar.f9839d.f10027n = typedArray.getResourceId(index, -1);
                            aVar.f9839d.f10026m = -2;
                            break;
                        } else {
                            aVar.f9839d.f10026m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f9839d;
                        cVar9.f10026m = typedArray.getInteger(index, cVar9.f10027n);
                        break;
                    }
                case 87:
                    Log.w(f9774i, "unused attribute 0x" + Integer.toHexString(index) + "   " + f9752X.get(index));
                    break;
                case f9709I1 /* 88 */:
                case f9712J1 /* 89 */:
                case f9715K1 /* 90 */:
                default:
                    Log.w(f9774i, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f9752X.get(index));
                    break;
                case f9718L1 /* 91 */:
                    b bVar54 = aVar.f9840e;
                    bVar54.f9992s = A0(typedArray, index, bVar54.f9992s);
                    break;
                case f9721M1 /* 92 */:
                    b bVar55 = aVar.f9840e;
                    bVar55.f9993t = A0(typedArray, index, bVar55.f9993t);
                    break;
                case f9724N1 /* 93 */:
                    b bVar56 = aVar.f9840e;
                    bVar56.f9944N = typedArray.getDimensionPixelSize(index, bVar56.f9944N);
                    break;
                case f9727O1 /* 94 */:
                    b bVar57 = aVar.f9840e;
                    bVar57.f9951U = typedArray.getDimensionPixelSize(index, bVar57.f9951U);
                    break;
                case f9730P1 /* 95 */:
                    D0(aVar.f9840e, typedArray, index, 0);
                    break;
                case f9733Q1 /* 96 */:
                    D0(aVar.f9840e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f9840e;
                    bVar58.f9990q0 = typedArray.getInt(index, bVar58.f9990q0);
                    break;
            }
        }
        b bVar59 = aVar.f9840e;
        if (bVar59.f9980l0 != null) {
            bVar59.f9978k0 = null;
        }
    }

    private static void K0(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0070a c0070a = new a.C0070a();
        aVar.f9843h = c0070a;
        aVar.f9839d.f10014a = false;
        aVar.f9840e.f9959b = false;
        aVar.f9838c.f10028a = false;
        aVar.f9841f.f10046a = false;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            switch (f9754Y.get(index)) {
                case 2:
                    c0070a.b(2, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9941K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case f9709I1 /* 88 */:
                case f9712J1 /* 89 */:
                case f9715K1 /* 90 */:
                case f9718L1 /* 91 */:
                case f9721M1 /* 92 */:
                default:
                    Log.w(f9774i, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f9752X.get(index));
                    break;
                case 5:
                    c0070a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0070a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f9840e.f9935E));
                    break;
                case 7:
                    c0070a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f9840e.f9936F));
                    break;
                case 8:
                    c0070a.b(8, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9942L));
                    break;
                case 11:
                    c0070a.b(11, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9948R));
                    break;
                case 12:
                    c0070a.b(12, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9949S));
                    break;
                case 13:
                    c0070a.b(13, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9945O));
                    break;
                case 14:
                    c0070a.b(14, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9947Q));
                    break;
                case 15:
                    c0070a.b(15, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9950T));
                    break;
                case 16:
                    c0070a.b(16, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9946P));
                    break;
                case 17:
                    c0070a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f9840e.f9967f));
                    break;
                case 18:
                    c0070a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f9840e.f9969g));
                    break;
                case 19:
                    c0070a.a(19, typedArray.getFloat(index, aVar.f9840e.f9971h));
                    break;
                case 20:
                    c0070a.a(20, typedArray.getFloat(index, aVar.f9840e.f9998y));
                    break;
                case 21:
                    c0070a.b(21, typedArray.getLayoutDimension(index, aVar.f9840e.f9965e));
                    break;
                case 22:
                    c0070a.b(22, f9746V[typedArray.getInt(index, aVar.f9838c.f10029b)]);
                    break;
                case 23:
                    c0070a.b(23, typedArray.getLayoutDimension(index, aVar.f9840e.f9963d));
                    break;
                case 24:
                    c0070a.b(24, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9938H));
                    break;
                case 27:
                    c0070a.b(27, typedArray.getInt(index, aVar.f9840e.f9937G));
                    break;
                case 28:
                    c0070a.b(28, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9939I));
                    break;
                case 31:
                    c0070a.b(31, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9943M));
                    break;
                case 34:
                    c0070a.b(34, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9940J));
                    break;
                case 37:
                    c0070a.a(37, typedArray.getFloat(index, aVar.f9840e.f9999z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f9836a);
                    aVar.f9836a = resourceId;
                    c0070a.b(38, resourceId);
                    break;
                case 39:
                    c0070a.a(39, typedArray.getFloat(index, aVar.f9840e.f9953W));
                    break;
                case 40:
                    c0070a.a(40, typedArray.getFloat(index, aVar.f9840e.f9952V));
                    break;
                case 41:
                    c0070a.b(41, typedArray.getInt(index, aVar.f9840e.f9954X));
                    break;
                case 42:
                    c0070a.b(42, typedArray.getInt(index, aVar.f9840e.f9955Y));
                    break;
                case 43:
                    c0070a.a(43, typedArray.getFloat(index, aVar.f9838c.f10031d));
                    break;
                case 44:
                    c0070a.d(44, true);
                    c0070a.a(44, typedArray.getDimension(index, aVar.f9841f.f10059n));
                    break;
                case 45:
                    c0070a.a(45, typedArray.getFloat(index, aVar.f9841f.f10048c));
                    break;
                case 46:
                    c0070a.a(46, typedArray.getFloat(index, aVar.f9841f.f10049d));
                    break;
                case 47:
                    c0070a.a(47, typedArray.getFloat(index, aVar.f9841f.f10050e));
                    break;
                case 48:
                    c0070a.a(48, typedArray.getFloat(index, aVar.f9841f.f10051f));
                    break;
                case 49:
                    c0070a.a(49, typedArray.getDimension(index, aVar.f9841f.f10052g));
                    break;
                case 50:
                    c0070a.a(50, typedArray.getDimension(index, aVar.f9841f.f10053h));
                    break;
                case 51:
                    c0070a.a(51, typedArray.getDimension(index, aVar.f9841f.f10055j));
                    break;
                case 52:
                    c0070a.a(52, typedArray.getDimension(index, aVar.f9841f.f10056k));
                    break;
                case 53:
                    c0070a.a(53, typedArray.getDimension(index, aVar.f9841f.f10057l));
                    break;
                case 54:
                    c0070a.b(54, typedArray.getInt(index, aVar.f9840e.f9956Z));
                    break;
                case 55:
                    c0070a.b(55, typedArray.getInt(index, aVar.f9840e.f9958a0));
                    break;
                case f9763c1 /* 56 */:
                    c0070a.b(f9763c1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9960b0));
                    break;
                case f9765d1 /* 57 */:
                    c0070a.b(f9765d1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9962c0));
                    break;
                case f9767e1 /* 58 */:
                    c0070a.b(f9767e1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9964d0));
                    break;
                case f9769f1 /* 59 */:
                    c0070a.b(f9769f1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9966e0));
                    break;
                case 60:
                    c0070a.a(60, typedArray.getFloat(index, aVar.f9841f.f10047b));
                    break;
                case f9776i1 /* 62 */:
                    c0070a.b(f9776i1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9933C));
                    break;
                case 63:
                    c0070a.a(63, typedArray.getFloat(index, aVar.f9840e.f9934D));
                    break;
                case 64:
                    c0070a.b(64, A0(typedArray, index, aVar.f9839d.f10015b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0070a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0070a.c(65, androidx.constraintlayout.core.motion.utils.d.f7158o[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0070a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0070a.a(67, typedArray.getFloat(index, aVar.f9839d.f10022i));
                    break;
                case f9794o1 /* 68 */:
                    c0070a.a(f9794o1, typedArray.getFloat(index, aVar.f9838c.f10032e));
                    break;
                case f9797p1 /* 69 */:
                    c0070a.a(f9797p1, typedArray.getFloat(index, 1.0f));
                    break;
                case f9800q1 /* 70 */:
                    c0070a.a(f9800q1, typedArray.getFloat(index, 1.0f));
                    break;
                case f9803r1 /* 71 */:
                    Log.e(f9774i, "CURRENTLY UNSUPPORTED");
                    break;
                case f9806s1 /* 72 */:
                    c0070a.b(f9806s1, typedArray.getInt(index, aVar.f9840e.f9972h0));
                    break;
                case f9809t1 /* 73 */:
                    c0070a.b(f9809t1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9974i0));
                    break;
                case f9812u1 /* 74 */:
                    c0070a.c(f9812u1, typedArray.getString(index));
                    break;
                case f9815v1 /* 75 */:
                    c0070a.d(f9815v1, typedArray.getBoolean(index, aVar.f9840e.f9988p0));
                    break;
                case 76:
                    c0070a.b(76, typedArray.getInt(index, aVar.f9839d.f10018e));
                    break;
                case f9821x1 /* 77 */:
                    c0070a.c(f9821x1, typedArray.getString(index));
                    break;
                case f9824y1 /* 78 */:
                    c0070a.b(f9824y1, typedArray.getInt(index, aVar.f9838c.f10030c));
                    break;
                case f9827z1 /* 79 */:
                    c0070a.a(f9827z1, typedArray.getFloat(index, aVar.f9839d.f10020g));
                    break;
                case f9685A1 /* 80 */:
                    c0070a.d(f9685A1, typedArray.getBoolean(index, aVar.f9840e.f9984n0));
                    break;
                case 81:
                    c0070a.d(81, typedArray.getBoolean(index, aVar.f9840e.f9986o0));
                    break;
                case 82:
                    c0070a.b(82, typedArray.getInteger(index, aVar.f9839d.f10016c));
                    break;
                case 83:
                    c0070a.b(83, A0(typedArray, index, aVar.f9841f.f10054i));
                    break;
                case f9697E1 /* 84 */:
                    c0070a.b(f9697E1, typedArray.getInteger(index, aVar.f9839d.f10024k));
                    break;
                case f9700F1 /* 85 */:
                    c0070a.a(f9700F1, typedArray.getFloat(index, aVar.f9839d.f10023j));
                    break;
                case f9703G1 /* 86 */:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 == 1) {
                        aVar.f9839d.f10027n = typedArray.getResourceId(index, -1);
                        c0070a.b(f9712J1, aVar.f9839d.f10027n);
                        c cVar = aVar.f9839d;
                        if (cVar.f10027n != -1) {
                            cVar.f10026m = -2;
                            c0070a.b(f9709I1, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i5 == 3) {
                        aVar.f9839d.f10025l = typedArray.getString(index);
                        c0070a.c(f9715K1, aVar.f9839d.f10025l);
                        if (aVar.f9839d.f10025l.indexOf("/") > 0) {
                            aVar.f9839d.f10027n = typedArray.getResourceId(index, -1);
                            c0070a.b(f9712J1, aVar.f9839d.f10027n);
                            aVar.f9839d.f10026m = -2;
                            c0070a.b(f9709I1, -2);
                            break;
                        } else {
                            aVar.f9839d.f10026m = -1;
                            c0070a.b(f9709I1, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f9839d;
                        cVar2.f10026m = typedArray.getInteger(index, cVar2.f10027n);
                        c0070a.b(f9709I1, aVar.f9839d.f10026m);
                        break;
                    }
                case 87:
                    Log.w(f9774i, "unused attribute 0x" + Integer.toHexString(index) + "   " + f9752X.get(index));
                    break;
                case f9724N1 /* 93 */:
                    c0070a.b(f9724N1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9944N));
                    break;
                case f9727O1 /* 94 */:
                    c0070a.b(f9727O1, typedArray.getDimensionPixelSize(index, aVar.f9840e.f9951U));
                    break;
                case f9730P1 /* 95 */:
                    D0(c0070a, typedArray, index, 0);
                    break;
                case f9733Q1 /* 96 */:
                    D0(c0070a, typedArray, index, 1);
                    break;
                case 97:
                    c0070a.b(97, typedArray.getInt(index, aVar.f9840e.f9990q0));
                    break;
                case 98:
                    if (s.f8919a2) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f9836a);
                        aVar.f9836a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f9837b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f9837b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f9836a = typedArray.getResourceId(index, aVar.f9836a);
                        break;
                    }
                case f9742T1 /* 99 */:
                    c0070a.d(f9742T1, typedArray.getBoolean(index, aVar.f9840e.f9973i));
                    break;
            }
        }
    }

    private String K1(int i4) {
        switch (i4) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static String[] L1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z3 = false;
        for (int i5 = 0; i5 < charArray.length; i5++) {
            char c4 = charArray[i5];
            if (c4 == ',' && !z3) {
                arrayList.add(new String(charArray, i4, i5 - i4));
                i4 = i5 + 1;
            } else if (c4 == '\"') {
                z3 = !z3;
            }
        }
        arrayList.add(new String(charArray, i4, charArray.length - i4));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U0(a aVar, int i4, float f4) {
        if (i4 != 19) {
            if (i4 != 20) {
                if (i4 != 37) {
                    if (i4 != 60) {
                        if (i4 != 63) {
                            if (i4 != f9827z1) {
                                if (i4 != f9700F1) {
                                    if (i4 != 87) {
                                        if (i4 != 39) {
                                            if (i4 != 40) {
                                                switch (i4) {
                                                    case 43:
                                                        aVar.f9838c.f10031d = f4;
                                                        return;
                                                    case 44:
                                                        e eVar = aVar.f9841f;
                                                        eVar.f10059n = f4;
                                                        eVar.f10058m = true;
                                                        return;
                                                    case 45:
                                                        aVar.f9841f.f10048c = f4;
                                                        return;
                                                    case 46:
                                                        aVar.f9841f.f10049d = f4;
                                                        return;
                                                    case 47:
                                                        aVar.f9841f.f10050e = f4;
                                                        return;
                                                    case 48:
                                                        aVar.f9841f.f10051f = f4;
                                                        return;
                                                    case 49:
                                                        aVar.f9841f.f10052g = f4;
                                                        return;
                                                    case 50:
                                                        aVar.f9841f.f10053h = f4;
                                                        return;
                                                    case 51:
                                                        aVar.f9841f.f10055j = f4;
                                                        return;
                                                    case 52:
                                                        aVar.f9841f.f10056k = f4;
                                                        return;
                                                    case 53:
                                                        aVar.f9841f.f10057l = f4;
                                                        return;
                                                    default:
                                                        switch (i4) {
                                                            case 67:
                                                                aVar.f9839d.f10022i = f4;
                                                                return;
                                                            case f9794o1 /* 68 */:
                                                                aVar.f9838c.f10032e = f4;
                                                                return;
                                                            case f9797p1 /* 69 */:
                                                                aVar.f9840e.f9968f0 = f4;
                                                                return;
                                                            case f9800q1 /* 70 */:
                                                                aVar.f9840e.f9970g0 = f4;
                                                                return;
                                                            default:
                                                                Log.w(f9774i, "Unknown attribute 0x");
                                                                return;
                                                        }
                                                }
                                            }
                                            aVar.f9840e.f9952V = f4;
                                            return;
                                        }
                                        aVar.f9840e.f9953W = f4;
                                        return;
                                    }
                                    return;
                                }
                                aVar.f9839d.f10023j = f4;
                                return;
                            }
                            aVar.f9839d.f10020g = f4;
                            return;
                        }
                        aVar.f9840e.f9934D = f4;
                        return;
                    }
                    aVar.f9841f.f10047b = f4;
                    return;
                }
                aVar.f9840e.f9999z = f4;
                return;
            }
            aVar.f9840e.f9998y = f4;
            return;
        }
        aVar.f9840e.f9971h = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void V0(a aVar, int i4, int i5) {
        if (i4 != 6) {
            if (i4 != 7) {
                if (i4 != 8) {
                    if (i4 != 27) {
                        if (i4 != 28) {
                            if (i4 != 41) {
                                if (i4 != 42) {
                                    if (i4 != 61) {
                                        if (i4 != f9776i1) {
                                            if (i4 != f9806s1) {
                                                if (i4 != f9809t1) {
                                                    switch (i4) {
                                                        case 2:
                                                            aVar.f9840e.f9941K = i5;
                                                            return;
                                                        case 11:
                                                            aVar.f9840e.f9948R = i5;
                                                            return;
                                                        case 12:
                                                            aVar.f9840e.f9949S = i5;
                                                            return;
                                                        case 13:
                                                            aVar.f9840e.f9945O = i5;
                                                            return;
                                                        case 14:
                                                            aVar.f9840e.f9947Q = i5;
                                                            return;
                                                        case 15:
                                                            aVar.f9840e.f9950T = i5;
                                                            return;
                                                        case 16:
                                                            aVar.f9840e.f9946P = i5;
                                                            return;
                                                        case 17:
                                                            aVar.f9840e.f9967f = i5;
                                                            return;
                                                        case 18:
                                                            aVar.f9840e.f9969g = i5;
                                                            return;
                                                        case 31:
                                                            aVar.f9840e.f9943M = i5;
                                                            return;
                                                        case 34:
                                                            aVar.f9840e.f9940J = i5;
                                                            return;
                                                        case 38:
                                                            aVar.f9836a = i5;
                                                            return;
                                                        case 64:
                                                            aVar.f9839d.f10015b = i5;
                                                            return;
                                                        case 66:
                                                            aVar.f9839d.f10019f = i5;
                                                            return;
                                                        case 76:
                                                            aVar.f9839d.f10018e = i5;
                                                            return;
                                                        case f9824y1 /* 78 */:
                                                            aVar.f9838c.f10030c = i5;
                                                            return;
                                                        case f9724N1 /* 93 */:
                                                            aVar.f9840e.f9944N = i5;
                                                            return;
                                                        case f9727O1 /* 94 */:
                                                            aVar.f9840e.f9951U = i5;
                                                            return;
                                                        case 97:
                                                            aVar.f9840e.f9990q0 = i5;
                                                            return;
                                                        default:
                                                            switch (i4) {
                                                                case 21:
                                                                    aVar.f9840e.f9965e = i5;
                                                                    return;
                                                                case 22:
                                                                    aVar.f9838c.f10029b = i5;
                                                                    return;
                                                                case 23:
                                                                    aVar.f9840e.f9963d = i5;
                                                                    return;
                                                                case 24:
                                                                    aVar.f9840e.f9938H = i5;
                                                                    return;
                                                                default:
                                                                    switch (i4) {
                                                                        case 54:
                                                                            aVar.f9840e.f9956Z = i5;
                                                                            return;
                                                                        case 55:
                                                                            aVar.f9840e.f9958a0 = i5;
                                                                            return;
                                                                        case f9763c1 /* 56 */:
                                                                            aVar.f9840e.f9960b0 = i5;
                                                                            return;
                                                                        case f9765d1 /* 57 */:
                                                                            aVar.f9840e.f9962c0 = i5;
                                                                            return;
                                                                        case f9767e1 /* 58 */:
                                                                            aVar.f9840e.f9964d0 = i5;
                                                                            return;
                                                                        case f9769f1 /* 59 */:
                                                                            aVar.f9840e.f9966e0 = i5;
                                                                            return;
                                                                        default:
                                                                            switch (i4) {
                                                                                case 82:
                                                                                    aVar.f9839d.f10016c = i5;
                                                                                    return;
                                                                                case 83:
                                                                                    aVar.f9841f.f10054i = i5;
                                                                                    return;
                                                                                case f9697E1 /* 84 */:
                                                                                    aVar.f9839d.f10024k = i5;
                                                                                    return;
                                                                                default:
                                                                                    switch (i4) {
                                                                                        case 87:
                                                                                            return;
                                                                                        case f9709I1 /* 88 */:
                                                                                            aVar.f9839d.f10026m = i5;
                                                                                            return;
                                                                                        case f9712J1 /* 89 */:
                                                                                            aVar.f9839d.f10027n = i5;
                                                                                            return;
                                                                                        default:
                                                                                            Log.w(f9774i, "Unknown attribute 0x");
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                aVar.f9840e.f9974i0 = i5;
                                                return;
                                            }
                                            aVar.f9840e.f9972h0 = i5;
                                            return;
                                        }
                                        aVar.f9840e.f9933C = i5;
                                        return;
                                    }
                                    aVar.f9840e.f9932B = i5;
                                    return;
                                }
                                aVar.f9840e.f9955Y = i5;
                                return;
                            }
                            aVar.f9840e.f9954X = i5;
                            return;
                        }
                        aVar.f9840e.f9939I = i5;
                        return;
                    }
                    aVar.f9840e.f9937G = i5;
                    return;
                }
                aVar.f9840e.f9942L = i5;
                return;
            }
            aVar.f9840e.f9936F = i5;
            return;
        }
        aVar.f9840e.f9935E = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W0(a aVar, int i4, String str) {
        if (i4 != 5) {
            if (i4 != 65) {
                if (i4 != f9812u1) {
                    if (i4 != f9821x1) {
                        if (i4 != 87) {
                            if (i4 != f9715K1) {
                                Log.w(f9774i, "Unknown attribute 0x");
                                return;
                            } else {
                                aVar.f9839d.f10025l = str;
                                return;
                            }
                        }
                        return;
                    }
                    aVar.f9840e.f9982m0 = str;
                    return;
                }
                b bVar = aVar.f9840e;
                bVar.f9980l0 = str;
                bVar.f9978k0 = null;
                return;
            }
            aVar.f9839d.f10017d = str;
            return;
        }
        aVar.f9840e.f9931A = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void X0(a aVar, int i4, boolean z3) {
        if (i4 != 44) {
            if (i4 != f9815v1) {
                if (i4 != 87) {
                    if (i4 != f9685A1) {
                        if (i4 != 81) {
                            Log.w(f9774i, "Unknown attribute 0x");
                            return;
                        } else {
                            aVar.f9840e.f9986o0 = z3;
                            return;
                        }
                    }
                    aVar.f9840e.f9984n0 = z3;
                    return;
                }
                return;
            }
            aVar.f9840e.f9988p0 = z3;
            return;
        }
        aVar.f9841f.f10058m = z3;
    }

    private int[] Z(View view, String str) {
        int i4;
        Object o4;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i5 = 0;
        int i6 = 0;
        while (i5 < split.length) {
            String trim = split[i5].trim();
            try {
                i4 = h.g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i4 = 0;
            }
            if (i4 == 0) {
                i4 = context.getResources().getIdentifier(trim, b.c.f48986a, context.getPackageName());
            }
            if (i4 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (o4 = ((ConstraintLayout) view.getParent()).o(0, trim)) != null && (o4 instanceof Integer)) {
                i4 = ((Integer) o4).intValue();
            }
            iArr[i6] = i4;
            i5++;
            i6++;
        }
        if (i6 != split.length) {
            return Arrays.copyOf(iArr, i6);
        }
        return iArr;
    }

    private void d0(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8, int i9, int i10) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                i0(iArr[0]).f9840e.f9953W = fArr[0];
            }
            i0(iArr[0]).f9840e.f9954X = i8;
            L(iArr[0], i9, i4, i5, -1);
            for (int i11 = 1; i11 < iArr.length; i11++) {
                int i12 = i11 - 1;
                L(iArr[i11], i9, iArr[i12], i10, -1);
                L(iArr[i12], i10, iArr[i11], i9, -1);
                if (fArr != null) {
                    i0(iArr[i11]).f9840e.f9953W = fArr[i11];
                }
            }
            L(iArr[iArr.length - 1], i10, i6, i7, -1);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    private void h(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (this.f9833f.containsKey(strArr[i4])) {
                ConstraintAttribute constraintAttribute = this.f9833f.get(strArr[i4]);
                if (constraintAttribute != null && constraintAttribute.j() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.j().name());
                }
            } else {
                this.f9833f.put(strArr[i4], new ConstraintAttribute(strArr[i4], attributeType));
            }
        }
    }

    private a h0(Context context, AttributeSet attributeSet, boolean z3) {
        int[] iArr;
        a aVar = new a();
        if (z3) {
            iArr = h.m.R8;
        } else {
            iArr = h.m.c4;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        J0(context, aVar, obtainStyledAttributes, z3);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a i0(int i4) {
        if (!this.f9835h.containsKey(Integer.valueOf(i4))) {
            this.f9835h.put(Integer.valueOf(i4), new a());
        }
        return this.f9835h.get(Integer.valueOf(i4));
    }

    static String m0(int i4) {
        for (Field field : d.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i4) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    static String p0(Context context, int i4, XmlPullParser xmlPullParser) {
        return ".(" + androidx.constraintlayout.motion.widget.c.i(context, i4) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, h.m.R8);
        K0(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void A(int i4, int i5) {
        if (i5 == 0) {
            x(i4, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(i4, i5, 7, 0, i5, 6, 0, 0.5f);
        }
    }

    public void A1(int i4, float f4, float f5) {
        e eVar = i0(i4).f9841f;
        eVar.f10055j = f4;
        eVar.f10056k = f5;
    }

    public void B(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        L(i4, 6, i5, i6, i7);
        L(i4, 7, i8, i9, i10);
        a aVar = this.f9835h.get(Integer.valueOf(i4));
        if (aVar != null) {
            aVar.f9840e.f9998y = f4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean B0(java.lang.String... r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1c
            r3 = r9[r2]
            java.lang.String[] r4 = r8.f9831d
            int r5 = r4.length
            r6 = r1
        Lb:
            if (r6 >= r5) goto L1b
            r7 = r4[r6]
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L18
            int r2 = r2 + 1
            goto L3
        L18:
            int r6 = r6 + 1
            goto Lb
        L1b:
            return r1
        L1c:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.B0(java.lang.String[]):boolean");
    }

    public void B1(int i4, float f4) {
        i0(i4).f9841f.f10055j = f4;
    }

    public void C(int i4, int i5) {
        if (i5 == 0) {
            x(i4, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(i4, i5, 4, 0, i5, 3, 0, 0.5f);
        }
    }

    public void C0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length == 2) {
                aVar.p(split2[0], Color.parseColor(split2[1]));
            } else {
                Log.w(f9774i, " Unable to parse " + split[i4]);
            }
        }
    }

    public void C1(int i4, float f4) {
        i0(i4).f9841f.f10056k = f4;
    }

    public void D(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        L(i4, 3, i5, i6, i7);
        L(i4, 4, i8, i9, i10);
        a aVar = this.f9835h.get(Integer.valueOf(i4));
        if (aVar != null) {
            aVar.f9840e.f9999z = f4;
        }
    }

    public void D1(int i4, float f4) {
        i0(i4).f9841f.f10057l = f4;
    }

    public void E(int i4) {
        this.f9835h.remove(Integer.valueOf(i4));
    }

    public void E1(boolean z3) {
        this.f9828a = z3;
    }

    public void F(int i4, int i5) {
        a aVar;
        if (!this.f9835h.containsKey(Integer.valueOf(i4)) || (aVar = this.f9835h.get(Integer.valueOf(i4))) == null) {
            return;
        }
        switch (i5) {
            case 1:
                b bVar = aVar.f9840e;
                bVar.f9977k = -1;
                bVar.f9975j = -1;
                bVar.f9938H = -1;
                bVar.f9945O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f9840e;
                bVar2.f9981m = -1;
                bVar2.f9979l = -1;
                bVar2.f9939I = -1;
                bVar2.f9947Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f9840e;
                bVar3.f9985o = -1;
                bVar3.f9983n = -1;
                bVar3.f9940J = 0;
                bVar3.f9946P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f9840e;
                bVar4.f9987p = -1;
                bVar4.f9989q = -1;
                bVar4.f9941K = 0;
                bVar4.f9948R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f9840e;
                bVar5.f9991r = -1;
                bVar5.f9992s = -1;
                bVar5.f9993t = -1;
                bVar5.f9944N = 0;
                bVar5.f9951U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f9840e;
                bVar6.f9994u = -1;
                bVar6.f9995v = -1;
                bVar6.f9943M = 0;
                bVar6.f9950T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f9840e;
                bVar7.f9996w = -1;
                bVar7.f9997x = -1;
                bVar7.f9942L = 0;
                bVar7.f9949S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f9840e;
                bVar8.f9934D = -1.0f;
                bVar8.f9933C = -1;
                bVar8.f9932B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F1(int i4, float f4) {
        i0(i4).f9840e.f9999z = f4;
    }

    public void G(Context context, int i4) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(i4, (ViewGroup) null));
    }

    public void G0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length == 2) {
                aVar.q(split2[0], Float.parseFloat(split2[1]));
            } else {
                Log.w(f9774i, " Unable to parse " + split[i4]);
            }
        }
    }

    public void G1(int i4, int i5) {
        i0(i4).f9840e.f9955Y = i5;
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f9835h.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f9834g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f9835h.containsKey(Integer.valueOf(id))) {
                this.f9835h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f9835h.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f9842g = ConstraintAttribute.d(this.f9833f, childAt);
                aVar.k(id, bVar);
                aVar.f9838c.f10029b = childAt.getVisibility();
                aVar.f9838c.f10031d = childAt.getAlpha();
                aVar.f9841f.f10047b = childAt.getRotation();
                aVar.f9841f.f10048c = childAt.getRotationX();
                aVar.f9841f.f10049d = childAt.getRotationY();
                aVar.f9841f.f10050e = childAt.getScaleX();
                aVar.f9841f.f10051f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != com.google.firebase.remoteconfig.l.f37524n || pivotY != com.google.firebase.remoteconfig.l.f37524n) {
                    e eVar = aVar.f9841f;
                    eVar.f10052g = pivotX;
                    eVar.f10053h = pivotY;
                }
                aVar.f9841f.f10055j = childAt.getTranslationX();
                aVar.f9841f.f10056k = childAt.getTranslationY();
                aVar.f9841f.f10057l = childAt.getTranslationZ();
                e eVar2 = aVar.f9841f;
                if (eVar2.f10058m) {
                    eVar2.f10059n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f9840e.f9988p0 = barrier.getAllowsGoneWidget();
                    aVar.f9840e.f9978k0 = barrier.getReferencedIds();
                    aVar.f9840e.f9972h0 = barrier.getType();
                    aVar.f9840e.f9974i0 = barrier.getMargin();
                }
            }
        }
    }

    public void H0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i4 = 0; i4 < split.length; i4++) {
            String[] split2 = split[i4].split("=");
            if (split2.length == 2) {
                aVar.q(split2[0], Integer.decode(split2[1]).intValue());
            } else {
                Log.w(f9774i, " Unable to parse " + split[i4]);
            }
        }
    }

    public void H1(int i4, float f4) {
        i0(i4).f9840e.f9952V = f4;
    }

    public void I(d dVar) {
        this.f9835h.clear();
        for (Integer num : dVar.f9835h.keySet()) {
            a aVar = dVar.f9835h.get(num);
            if (aVar != null) {
                this.f9835h.put(num, aVar.clone());
            }
        }
    }

    public void I0(a aVar, String str) {
        String[] L12 = L1(str);
        for (int i4 = 0; i4 < L12.length; i4++) {
            String[] split = L12[i4].split("=");
            Log.w(f9774i, " Unable to parse " + L12[i4]);
            aVar.s(split[0], split[1]);
        }
    }

    public void I1(int i4, int i5) {
        i0(i4).f9838c.f10029b = i5;
    }

    public void J(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f9835h.clear();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = eVar.getChildAt(i4);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f9834g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f9835h.containsKey(Integer.valueOf(id))) {
                this.f9835h.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f9835h.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    aVar2.m((androidx.constraintlayout.widget.a) childAt, id, aVar);
                }
                aVar2.l(id, aVar);
            }
        }
    }

    public void J1(int i4, int i5) {
        i0(i4).f9838c.f10030c = i5;
    }

    public void K(int i4, int i5, int i6, int i7) {
        if (!this.f9835h.containsKey(Integer.valueOf(i4))) {
            this.f9835h.put(Integer.valueOf(i4), new a());
        }
        a aVar = this.f9835h.get(Integer.valueOf(i4));
        if (aVar == null) {
            return;
        }
        switch (i5) {
            case 1:
                if (i7 == 1) {
                    b bVar = aVar.f9840e;
                    bVar.f9975j = i6;
                    bVar.f9977k = -1;
                    return;
                } else if (i7 == 2) {
                    b bVar2 = aVar.f9840e;
                    bVar2.f9977k = i6;
                    bVar2.f9975j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + K1(i7) + " undefined");
                }
            case 2:
                if (i7 == 1) {
                    b bVar3 = aVar.f9840e;
                    bVar3.f9979l = i6;
                    bVar3.f9981m = -1;
                    return;
                } else if (i7 == 2) {
                    b bVar4 = aVar.f9840e;
                    bVar4.f9981m = i6;
                    bVar4.f9979l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                }
            case 3:
                if (i7 == 3) {
                    b bVar5 = aVar.f9840e;
                    bVar5.f9983n = i6;
                    bVar5.f9985o = -1;
                    bVar5.f9991r = -1;
                    bVar5.f9992s = -1;
                    bVar5.f9993t = -1;
                    return;
                }
                if (i7 == 4) {
                    b bVar6 = aVar.f9840e;
                    bVar6.f9985o = i6;
                    bVar6.f9983n = -1;
                    bVar6.f9991r = -1;
                    bVar6.f9992s = -1;
                    bVar6.f9993t = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
            case 4:
                if (i7 == 4) {
                    b bVar7 = aVar.f9840e;
                    bVar7.f9989q = i6;
                    bVar7.f9987p = -1;
                    bVar7.f9991r = -1;
                    bVar7.f9992s = -1;
                    bVar7.f9993t = -1;
                    return;
                }
                if (i7 == 3) {
                    b bVar8 = aVar.f9840e;
                    bVar8.f9987p = i6;
                    bVar8.f9989q = -1;
                    bVar8.f9991r = -1;
                    bVar8.f9992s = -1;
                    bVar8.f9993t = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
            case 5:
                if (i7 == 5) {
                    b bVar9 = aVar.f9840e;
                    bVar9.f9991r = i6;
                    bVar9.f9989q = -1;
                    bVar9.f9987p = -1;
                    bVar9.f9983n = -1;
                    bVar9.f9985o = -1;
                    return;
                }
                if (i7 == 3) {
                    b bVar10 = aVar.f9840e;
                    bVar10.f9992s = i6;
                    bVar10.f9989q = -1;
                    bVar10.f9987p = -1;
                    bVar10.f9983n = -1;
                    bVar10.f9985o = -1;
                    return;
                }
                if (i7 == 4) {
                    b bVar11 = aVar.f9840e;
                    bVar11.f9993t = i6;
                    bVar11.f9989q = -1;
                    bVar11.f9987p = -1;
                    bVar11.f9983n = -1;
                    bVar11.f9985o = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
            case 6:
                if (i7 == 6) {
                    b bVar12 = aVar.f9840e;
                    bVar12.f9995v = i6;
                    bVar12.f9994u = -1;
                    return;
                } else if (i7 == 7) {
                    b bVar13 = aVar.f9840e;
                    bVar13.f9994u = i6;
                    bVar13.f9995v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                }
            case 7:
                if (i7 == 7) {
                    b bVar14 = aVar.f9840e;
                    bVar14.f9997x = i6;
                    bVar14.f9996w = -1;
                    return;
                } else if (i7 == 6) {
                    b bVar15 = aVar.f9840e;
                    bVar15.f9996w = i6;
                    bVar15.f9997x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                }
            default:
                throw new IllegalArgumentException(K1(i5) + " to " + K1(i7) + " unknown");
        }
    }

    public void L(int i4, int i5, int i6, int i7, int i8) {
        if (!this.f9835h.containsKey(Integer.valueOf(i4))) {
            this.f9835h.put(Integer.valueOf(i4), new a());
        }
        a aVar = this.f9835h.get(Integer.valueOf(i4));
        if (aVar == null) {
            return;
        }
        switch (i5) {
            case 1:
                if (i7 == 1) {
                    b bVar = aVar.f9840e;
                    bVar.f9975j = i6;
                    bVar.f9977k = -1;
                } else if (i7 == 2) {
                    b bVar2 = aVar.f9840e;
                    bVar2.f9977k = i6;
                    bVar2.f9975j = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + K1(i7) + " undefined");
                }
                aVar.f9840e.f9938H = i8;
                return;
            case 2:
                if (i7 == 1) {
                    b bVar3 = aVar.f9840e;
                    bVar3.f9979l = i6;
                    bVar3.f9981m = -1;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                    }
                    b bVar4 = aVar.f9840e;
                    bVar4.f9981m = i6;
                    bVar4.f9979l = -1;
                }
                aVar.f9840e.f9939I = i8;
                return;
            case 3:
                if (i7 == 3) {
                    b bVar5 = aVar.f9840e;
                    bVar5.f9983n = i6;
                    bVar5.f9985o = -1;
                    bVar5.f9991r = -1;
                    bVar5.f9992s = -1;
                    bVar5.f9993t = -1;
                } else {
                    if (i7 != 4) {
                        throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                    }
                    b bVar6 = aVar.f9840e;
                    bVar6.f9985o = i6;
                    bVar6.f9983n = -1;
                    bVar6.f9991r = -1;
                    bVar6.f9992s = -1;
                    bVar6.f9993t = -1;
                }
                aVar.f9840e.f9940J = i8;
                return;
            case 4:
                if (i7 == 4) {
                    b bVar7 = aVar.f9840e;
                    bVar7.f9989q = i6;
                    bVar7.f9987p = -1;
                    bVar7.f9991r = -1;
                    bVar7.f9992s = -1;
                    bVar7.f9993t = -1;
                } else {
                    if (i7 != 3) {
                        throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                    }
                    b bVar8 = aVar.f9840e;
                    bVar8.f9987p = i6;
                    bVar8.f9989q = -1;
                    bVar8.f9991r = -1;
                    bVar8.f9992s = -1;
                    bVar8.f9993t = -1;
                }
                aVar.f9840e.f9941K = i8;
                return;
            case 5:
                if (i7 == 5) {
                    b bVar9 = aVar.f9840e;
                    bVar9.f9991r = i6;
                    bVar9.f9989q = -1;
                    bVar9.f9987p = -1;
                    bVar9.f9983n = -1;
                    bVar9.f9985o = -1;
                    return;
                }
                if (i7 == 3) {
                    b bVar10 = aVar.f9840e;
                    bVar10.f9992s = i6;
                    bVar10.f9989q = -1;
                    bVar10.f9987p = -1;
                    bVar10.f9983n = -1;
                    bVar10.f9985o = -1;
                    return;
                }
                if (i7 != 4) {
                    throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                }
                b bVar11 = aVar.f9840e;
                bVar11.f9993t = i6;
                bVar11.f9989q = -1;
                bVar11.f9987p = -1;
                bVar11.f9983n = -1;
                bVar11.f9985o = -1;
                return;
            case 6:
                if (i7 == 6) {
                    b bVar12 = aVar.f9840e;
                    bVar12.f9995v = i6;
                    bVar12.f9994u = -1;
                } else {
                    if (i7 != 7) {
                        throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                    }
                    b bVar13 = aVar.f9840e;
                    bVar13.f9994u = i6;
                    bVar13.f9995v = -1;
                }
                aVar.f9840e.f9943M = i8;
                return;
            case 7:
                if (i7 == 7) {
                    b bVar14 = aVar.f9840e;
                    bVar14.f9997x = i6;
                    bVar14.f9996w = -1;
                } else {
                    if (i7 != 6) {
                        throw new IllegalArgumentException("right to " + K1(i7) + " undefined");
                    }
                    b bVar15 = aVar.f9840e;
                    bVar15.f9996w = i6;
                    bVar15.f9997x = -1;
                }
                aVar.f9840e.f9942L = i8;
                return;
            default:
                throw new IllegalArgumentException(K1(i5) + " to " + K1(i7) + " unknown");
        }
    }

    public void L0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f9834g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f9835h.containsKey(Integer.valueOf(id))) {
                this.f9835h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f9835h.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.f9840e.f9959b) {
                    aVar.k(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.a) {
                        aVar.f9840e.f9978k0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f9840e.f9988p0 = barrier.getAllowsGoneWidget();
                            aVar.f9840e.f9972h0 = barrier.getType();
                            aVar.f9840e.f9974i0 = barrier.getMargin();
                        }
                    }
                    aVar.f9840e.f9959b = true;
                }
                C0071d c0071d = aVar.f9838c;
                if (!c0071d.f10028a) {
                    c0071d.f10029b = childAt.getVisibility();
                    aVar.f9838c.f10031d = childAt.getAlpha();
                    aVar.f9838c.f10028a = true;
                }
                e eVar = aVar.f9841f;
                if (!eVar.f10046a) {
                    eVar.f10046a = true;
                    eVar.f10047b = childAt.getRotation();
                    aVar.f9841f.f10048c = childAt.getRotationX();
                    aVar.f9841f.f10049d = childAt.getRotationY();
                    aVar.f9841f.f10050e = childAt.getScaleX();
                    aVar.f9841f.f10051f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != com.google.firebase.remoteconfig.l.f37524n || pivotY != com.google.firebase.remoteconfig.l.f37524n) {
                        e eVar2 = aVar.f9841f;
                        eVar2.f10052g = pivotX;
                        eVar2.f10053h = pivotY;
                    }
                    aVar.f9841f.f10055j = childAt.getTranslationX();
                    aVar.f9841f.f10056k = childAt.getTranslationY();
                    aVar.f9841f.f10057l = childAt.getTranslationZ();
                    e eVar3 = aVar.f9841f;
                    if (eVar3.f10058m) {
                        eVar3.f10059n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void M(int i4, int i5, int i6, float f4) {
        b bVar = i0(i4).f9840e;
        bVar.f9932B = i5;
        bVar.f9933C = i6;
        bVar.f9934D = f4;
    }

    public void M0(d dVar) {
        for (Integer num : dVar.f9835h.keySet()) {
            int intValue = num.intValue();
            a aVar = dVar.f9835h.get(num);
            if (!this.f9835h.containsKey(Integer.valueOf(intValue))) {
                this.f9835h.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f9835h.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.f9840e;
                if (!bVar.f9959b) {
                    bVar.a(aVar.f9840e);
                }
                C0071d c0071d = aVar2.f9838c;
                if (!c0071d.f10028a) {
                    c0071d.a(aVar.f9838c);
                }
                e eVar = aVar2.f9841f;
                if (!eVar.f10046a) {
                    eVar.a(aVar.f9841f);
                }
                c cVar = aVar2.f9839d;
                if (!cVar.f10014a) {
                    cVar.a(aVar.f9839d);
                }
                for (String str : aVar.f9842g.keySet()) {
                    if (!aVar2.f9842g.containsKey(str)) {
                        aVar2.f9842g.put(str, aVar.f9842g.get(str));
                    }
                }
            }
        }
    }

    public void M1(Writer writer, ConstraintLayout constraintLayout, int i4) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i4 & 1) == 1) {
            new g(writer, constraintLayout, i4).i();
        } else {
            new f(writer, constraintLayout, i4).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void N(int i4, int i5) {
        i0(i4).f9840e.f9958a0 = i5;
    }

    public void N0(String str) {
        this.f9833f.remove(str);
    }

    public void O(int i4, int i5) {
        i0(i4).f9840e.f9956Z = i5;
    }

    public void O0(int i4) {
        a aVar;
        if (!this.f9835h.containsKey(Integer.valueOf(i4)) || (aVar = this.f9835h.get(Integer.valueOf(i4))) == null) {
            return;
        }
        b bVar = aVar.f9840e;
        int i5 = bVar.f9977k;
        int i6 = bVar.f9979l;
        if (i5 == -1 && i6 == -1) {
            int i7 = bVar.f9994u;
            int i8 = bVar.f9996w;
            if (i7 != -1 || i8 != -1) {
                if (i7 != -1 && i8 != -1) {
                    L(i7, 7, i8, 6, 0);
                    L(i8, 6, i5, 7, 0);
                } else if (i8 != -1) {
                    int i9 = bVar.f9981m;
                    if (i9 != -1) {
                        L(i5, 7, i9, 7, 0);
                    } else {
                        int i10 = bVar.f9975j;
                        if (i10 != -1) {
                            L(i8, 6, i10, 6, 0);
                        }
                    }
                }
            }
            F(i4, 6);
            F(i4, 7);
            return;
        }
        if (i5 != -1 && i6 != -1) {
            L(i5, 2, i6, 1, 0);
            L(i6, 1, i5, 2, 0);
        } else {
            int i11 = bVar.f9981m;
            if (i11 != -1) {
                L(i5, 2, i11, 2, 0);
            } else {
                int i12 = bVar.f9975j;
                if (i12 != -1) {
                    L(i6, 1, i12, 1, 0);
                }
            }
        }
        F(i4, 1);
        F(i4, 2);
    }

    public void P(int i4, int i5) {
        i0(i4).f9840e.f9965e = i5;
    }

    public void P0(int i4) {
        if (this.f9835h.containsKey(Integer.valueOf(i4))) {
            a aVar = this.f9835h.get(Integer.valueOf(i4));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.f9840e;
            int i5 = bVar.f9985o;
            int i6 = bVar.f9987p;
            if (i5 != -1 || i6 != -1) {
                if (i5 != -1 && i6 != -1) {
                    L(i5, 4, i6, 3, 0);
                    L(i6, 3, i5, 4, 0);
                } else {
                    int i7 = bVar.f9989q;
                    if (i7 != -1) {
                        L(i5, 4, i7, 4, 0);
                    } else {
                        int i8 = bVar.f9983n;
                        if (i8 != -1) {
                            L(i6, 3, i8, 3, 0);
                        }
                    }
                }
            }
        }
        F(i4, 3);
        F(i4, 4);
    }

    public void Q(int i4, int i5) {
        i0(i4).f9840e.f9962c0 = i5;
    }

    public void Q0(int i4, float f4) {
        i0(i4).f9838c.f10031d = f4;
    }

    public void R(int i4, int i5) {
        i0(i4).f9840e.f9960b0 = i5;
    }

    public void R0(int i4, boolean z3) {
        i0(i4).f9841f.f10058m = z3;
    }

    public void S(int i4, int i5) {
        i0(i4).f9840e.f9966e0 = i5;
    }

    public void S0(int i4, int i5) {
        i0(i4).f9840e.f9976j0 = i5;
    }

    public void T(int i4, int i5) {
        i0(i4).f9840e.f9964d0 = i5;
    }

    public void T0(int i4, String str, int i5) {
        i0(i4).p(str, i5);
    }

    public void U(int i4, float f4) {
        i0(i4).f9840e.f9970g0 = f4;
    }

    public void V(int i4, float f4) {
        i0(i4).f9840e.f9968f0 = f4;
    }

    public void W(int i4, int i5) {
        i0(i4).f9840e.f9963d = i5;
    }

    public void X(int i4, boolean z3) {
        i0(i4).f9840e.f9986o0 = z3;
    }

    public void Y(int i4, boolean z3) {
        i0(i4).f9840e.f9984n0 = z3;
    }

    public void Y0(int i4, String str) {
        i0(i4).f9840e.f9931A = str;
    }

    public void Z0(int i4, int i5) {
        i0(i4).f9840e.f9935E = i5;
    }

    public void a0(int i4, int i5) {
        b bVar = i0(i4).f9840e;
        bVar.f9957a = true;
        bVar.f9937G = i5;
    }

    public void a1(int i4, int i5) {
        i0(i4).f9840e.f9936F = i5;
    }

    public void b0(int i4, int i5, int i6, int... iArr) {
        b bVar = i0(i4).f9840e;
        bVar.f9976j0 = 1;
        bVar.f9972h0 = i5;
        bVar.f9974i0 = i6;
        bVar.f9957a = false;
        bVar.f9978k0 = iArr;
    }

    public void b1(int i4, float f4) {
        i0(i4).f9841f.f10059n = f4;
        i0(i4).f9841f.f10058m = true;
    }

    public void c0(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        d0(i4, i5, i6, i7, iArr, fArr, i8, 1, 2);
    }

    public void c1(int i4, String str, float f4) {
        i0(i4).q(str, f4);
    }

    public void d1(boolean z3) {
        this.f9834g = z3;
    }

    public void e0(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        d0(i4, i5, i6, i7, iArr, fArr, i8, 6, 7);
    }

    public void e1(int i4, int i5, int i6) {
        a i02 = i0(i4);
        switch (i5) {
            case 1:
                i02.f9840e.f9945O = i6;
                return;
            case 2:
                i02.f9840e.f9947Q = i6;
                return;
            case 3:
                i02.f9840e.f9946P = i6;
                return;
            case 4:
                i02.f9840e.f9948R = i6;
                return;
            case 5:
                i02.f9840e.f9951U = i6;
                return;
            case 6:
                i02.f9840e.f9950T = i6;
                return;
            case 7:
                i02.f9840e.f9949S = i6;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f0(int i4, int i5, int i6, int i7, int[] iArr, float[] fArr, int i8) {
        if (iArr.length >= 2) {
            if (fArr != null && fArr.length != iArr.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (fArr != null) {
                i0(iArr[0]).f9840e.f9952V = fArr[0];
            }
            i0(iArr[0]).f9840e.f9955Y = i8;
            L(iArr[0], 3, i4, i5, 0);
            for (int i9 = 1; i9 < iArr.length; i9++) {
                int i10 = i9 - 1;
                L(iArr[i9], 3, iArr[i10], 4, 0);
                L(iArr[i10], 4, iArr[i9], 3, 0);
                if (fArr != null) {
                    i0(iArr[i9]).f9840e.f9952V = fArr[i9];
                }
            }
            L(iArr[iArr.length - 1], 4, i6, i7, 0);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void f1(int i4, int i5) {
        i0(i4).f9840e.f9967f = i5;
        i0(i4).f9840e.f9969g = -1;
        i0(i4).f9840e.f9971h = -1.0f;
    }

    public void g0(u uVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.f9835h.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i4 : iArr) {
                hashSet.add(Integer.valueOf(i4));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f9835h.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.f9840e.b(uVar, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void g1(int i4, int i5) {
        i0(i4).f9840e.f9969g = i5;
        i0(i4).f9840e.f9967f = -1;
        i0(i4).f9840e.f9971h = -1.0f;
    }

    public void h1(int i4, float f4) {
        i0(i4).f9840e.f9971h = f4;
        i0(i4).f9840e.f9969g = -1;
        i0(i4).f9840e.f9967f = -1;
    }

    public void i(String... strArr) {
        h(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void i1(int i4, float f4) {
        i0(i4).f9840e.f9998y = f4;
    }

    public void j(String... strArr) {
        h(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public boolean j0(int i4) {
        return i0(i4).f9841f.f10058m;
    }

    public void j1(int i4, int i5) {
        i0(i4).f9840e.f9954X = i5;
    }

    public void k(String... strArr) {
        h(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public a k0(int i4) {
        if (this.f9835h.containsKey(Integer.valueOf(i4))) {
            return this.f9835h.get(Integer.valueOf(i4));
        }
        return null;
    }

    public void k1(int i4, float f4) {
        i0(i4).f9840e.f9953W = f4;
    }

    public void l(String... strArr) {
        h(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public HashMap<String, ConstraintAttribute> l0() {
        return this.f9833f;
    }

    public void l1(int i4, String str, int i5) {
        i0(i4).r(str, i5);
    }

    public void m(int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i5 == 0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        L(i4, 1, i5, i7, 0);
        if (i6 == 0) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        L(i4, 2, i6, i8, 0);
        if (i5 != 0) {
            L(i5, 2, i4, 1, 0);
        }
        if (i6 != 0) {
            L(i6, 1, i4, 2, 0);
        }
    }

    public void m1(int i4, int i5) {
        if (i5 >= 0 && i5 <= 3) {
            i0(i4).f9840e.f9990q0 = i5;
        }
    }

    public void n(int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i5 == 0) {
            i7 = 6;
        } else {
            i7 = 7;
        }
        L(i4, 6, i5, i7, 0);
        if (i6 == 0) {
            i8 = 7;
        } else {
            i8 = 6;
        }
        L(i4, 7, i6, i8, 0);
        if (i5 != 0) {
            L(i5, 7, i4, 6, 0);
        }
        if (i6 != 0) {
            L(i6, 6, i4, 7, 0);
        }
    }

    public int n0(int i4) {
        return i0(i4).f9840e.f9965e;
    }

    public void n1(int i4, int i5, int i6) {
        a i02 = i0(i4);
        switch (i5) {
            case 1:
                i02.f9840e.f9938H = i6;
                return;
            case 2:
                i02.f9840e.f9939I = i6;
                return;
            case 3:
                i02.f9840e.f9940J = i6;
                return;
            case 4:
                i02.f9840e.f9941K = i6;
                return;
            case 5:
                i02.f9840e.f9944N = i6;
                return;
            case 6:
                i02.f9840e.f9943M = i6;
                return;
            case 7:
                i02.f9840e.f9942L = i6;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o(int i4, int i5, int i6) {
        int i7;
        int i8;
        if (i5 == 0) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        L(i4, 3, i5, i7, 0);
        if (i6 == 0) {
            i8 = 4;
        } else {
            i8 = 3;
        }
        L(i4, 4, i6, i8, 0);
        if (i5 != 0) {
            L(i5, 4, i4, 3, 0);
        }
        if (i6 != 0) {
            L(i6, 3, i4, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f9835h.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    public void o1(int i4, int... iArr) {
        i0(i4).f9840e.f9978k0 = iArr;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f9835h.containsKey(Integer.valueOf(id))) {
                Log.w(f9774i, "id unknown " + androidx.constraintlayout.motion.widget.c.k(childAt));
            } else {
                if (this.f9834g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f9835h.containsKey(Integer.valueOf(id)) && (aVar = this.f9835h.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.r(childAt, aVar.f9842g);
                }
            }
        }
    }

    public void p1(int i4, float f4) {
        i0(i4).f9841f.f10047b = f4;
    }

    public void q(d dVar) {
        for (a aVar : dVar.f9835h.values()) {
            if (aVar.f9843h != null) {
                if (aVar.f9837b == null) {
                    aVar.f9843h.e(k0(aVar.f9836a));
                } else {
                    Iterator<Integer> it = this.f9835h.keySet().iterator();
                    while (it.hasNext()) {
                        a k02 = k0(it.next().intValue());
                        String str = k02.f9840e.f9982m0;
                        if (str != null && aVar.f9837b.matches(str)) {
                            aVar.f9843h.e(k02);
                            k02.f9842g.putAll((HashMap) aVar.f9842g.clone());
                        }
                    }
                }
            }
        }
    }

    public a q0(int i4) {
        return i0(i4);
    }

    public void q1(int i4, float f4) {
        i0(i4).f9841f.f10048c = f4;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int i4) {
        int[] iArr = i0(i4).f9840e.f9978k0;
        if (iArr == null) {
            return new int[0];
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int i4, float f4) {
        i0(i4).f9841f.f10049d = f4;
    }

    public void s(androidx.constraintlayout.widget.a aVar, ConstraintWidget constraintWidget, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        a aVar2;
        int id = aVar.getId();
        if (this.f9835h.containsKey(Integer.valueOf(id)) && (aVar2 = this.f9835h.get(Integer.valueOf(id))) != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.h)) {
            aVar.B(aVar2, (androidx.constraintlayout.core.widgets.h) constraintWidget, bVar, sparseArray);
        }
    }

    public String[] s0() {
        String[] strArr = this.f9831d;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void s1(int i4, float f4) {
        i0(i4).f9841f.f10050e = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(ConstraintLayout constraintLayout, boolean z3) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f9835h.keySet());
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!this.f9835h.containsKey(Integer.valueOf(id))) {
                Log.w(f9774i, "id unknown " + androidx.constraintlayout.motion.widget.c.k(childAt));
            } else {
                if (this.f9834g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f9835h.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f9835h.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f9840e.f9976j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f9840e.f9972h0);
                                barrier.setMargin(aVar.f9840e.f9974i0);
                                barrier.setAllowsGoneWidget(aVar.f9840e.f9988p0);
                                b bVar = aVar.f9840e;
                                int[] iArr = bVar.f9978k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f9980l0;
                                    if (str != null) {
                                        bVar.f9978k0 = Z(barrier, str);
                                        barrier.setReferencedIds(aVar.f9840e.f9978k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.e();
                            aVar.i(bVar2);
                            if (z3) {
                                ConstraintAttribute.r(childAt, aVar.f9842g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0071d c0071d = aVar.f9838c;
                            if (c0071d.f10030c == 0) {
                                childAt.setVisibility(c0071d.f10029b);
                            }
                            childAt.setAlpha(aVar.f9838c.f10031d);
                            childAt.setRotation(aVar.f9841f.f10047b);
                            childAt.setRotationX(aVar.f9841f.f10048c);
                            childAt.setRotationY(aVar.f9841f.f10049d);
                            childAt.setScaleX(aVar.f9841f.f10050e);
                            childAt.setScaleY(aVar.f9841f.f10051f);
                            e eVar = aVar.f9841f;
                            if (eVar.f10054i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f9841f.f10054i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f10052g)) {
                                    childAt.setPivotX(aVar.f9841f.f10052g);
                                }
                                if (!Float.isNaN(aVar.f9841f.f10053h)) {
                                    childAt.setPivotY(aVar.f9841f.f10053h);
                                }
                            }
                            childAt.setTranslationX(aVar.f9841f.f10055j);
                            childAt.setTranslationY(aVar.f9841f.f10056k);
                            childAt.setTranslationZ(aVar.f9841f.f10057l);
                            e eVar2 = aVar.f9841f;
                            if (eVar2.f10058m) {
                                childAt.setElevation(eVar2.f10059n);
                            }
                        }
                    } else {
                        Log.v(f9774i, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f9835h.get(num);
            if (aVar2 != null) {
                if (aVar2.f9840e.f9976j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f9840e;
                    int[] iArr2 = bVar3.f9978k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f9980l0;
                        if (str2 != null) {
                            bVar3.f9978k0 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f9840e.f9978k0);
                        }
                    }
                    barrier2.setType(aVar2.f9840e.f9972h0);
                    barrier2.setMargin(aVar2.f9840e.f9974i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.K();
                    aVar2.i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f9840e.f9957a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = constraintLayout.getChildAt(i5);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).s(constraintLayout);
            }
        }
    }

    public int t0(int i4) {
        return i0(i4).f9838c.f10029b;
    }

    public void t1(int i4, float f4) {
        i0(i4).f9841f.f10051f = f4;
    }

    public void u(int i4, ConstraintLayout.b bVar) {
        a aVar;
        if (this.f9835h.containsKey(Integer.valueOf(i4)) && (aVar = this.f9835h.get(Integer.valueOf(i4))) != null) {
            aVar.i(bVar);
        }
    }

    public int u0(int i4) {
        return i0(i4).f9838c.f10030c;
    }

    public void u1(String str) {
        this.f9831d = str.split(",");
        int i4 = 0;
        while (true) {
            String[] strArr = this.f9831d;
            if (i4 < strArr.length) {
                strArr[i4] = strArr[i4].trim();
                i4++;
            } else {
                return;
            }
        }
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public int v0(int i4) {
        return i0(i4).f9840e.f9963d;
    }

    public void v1(String... strArr) {
        this.f9831d = strArr;
        int i4 = 0;
        while (true) {
            String[] strArr2 = this.f9831d;
            if (i4 < strArr2.length) {
                strArr2[i4] = strArr2[i4].trim();
                i4++;
            } else {
                return;
            }
        }
    }

    public boolean w0() {
        return this.f9834g;
    }

    public void w1(int i4, String str, String str2) {
        i0(i4).s(str, str2);
    }

    public void x(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        if (i7 >= 0) {
            if (i10 >= 0) {
                if (f4 > 0.0f && f4 <= 1.0f) {
                    if (i6 != 1 && i6 != 2) {
                        if (i6 != 6 && i6 != 7) {
                            L(i4, 3, i5, i6, i7);
                            L(i4, 4, i8, i9, i10);
                            a aVar = this.f9835h.get(Integer.valueOf(i4));
                            if (aVar != null) {
                                aVar.f9840e.f9999z = f4;
                                return;
                            }
                            return;
                        }
                        L(i4, 6, i5, i6, i7);
                        L(i4, 7, i8, i9, i10);
                        a aVar2 = this.f9835h.get(Integer.valueOf(i4));
                        if (aVar2 != null) {
                            aVar2.f9840e.f9998y = f4;
                            return;
                        }
                        return;
                    }
                    L(i4, 1, i5, i6, i7);
                    L(i4, 2, i8, i9, i10);
                    a aVar3 = this.f9835h.get(Integer.valueOf(i4));
                    if (aVar3 != null) {
                        aVar3.f9840e.f9998y = f4;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public boolean x0() {
        return this.f9828a;
    }

    public void x1(int i4, float f4, float f5) {
        e eVar = i0(i4).f9841f;
        eVar.f10053h = f5;
        eVar.f10052g = f4;
    }

    public void y(int i4, int i5) {
        if (i5 == 0) {
            x(i4, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(i4, i5, 2, 0, i5, 1, 0, 0.5f);
        }
    }

    public void y0(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        a h02 = h0(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            h02.f9840e.f9957a = true;
                        }
                        this.f9835h.put(Integer.valueOf(h02.f9836a), h02);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public void y1(int i4, float f4) {
        i0(i4).f9841f.f10052g = f4;
    }

    public void z(int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f4) {
        L(i4, 1, i5, i6, i7);
        L(i4, 2, i8, i9, i10);
        a aVar = this.f9835h.get(Integer.valueOf(i4));
        if (aVar != null) {
            aVar.f9840e.f9998y = f4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.z0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void z1(int i4, float f4) {
        i0(i4).f9841f.f10053h = f4;
    }
}
