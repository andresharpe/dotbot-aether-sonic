package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.q;

/* loaded from: classes.dex */
public class r {
    private static int a(String str, String... strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4].equals(str)) {
                return i4;
            }
        }
        return 0;
    }

    private static void b(u uVar, int i4, String str, String... strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (strArr[i5].equals(str)) {
                uVar.b(i4, i5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r9 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.constraintlayout.core.parser.f r7, androidx.constraintlayout.core.state.q r8, androidx.constraintlayout.core.state.c r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            java.lang.String r0 = "pathMotionArc"
            java.lang.String r0 = r7.W(r0)
            androidx.constraintlayout.core.motion.utils.u r1 = new androidx.constraintlayout.core.motion.utils.u
            r1.<init>()
            r8.f7784r = r9
            r9 = 1
            r2 = 0
            if (r0 == 0) goto L5d
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            r6 = -1
            switch(r3) {
                case -1857024520: goto L3d;
                case -1007052250: goto L32;
                case 3145837: goto L27;
                case 3387192: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L47
        L1c:
            java.lang.String r3 = "none"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L25
            goto L47
        L25:
            r6 = r4
            goto L47
        L27:
            java.lang.String r3 = "flip"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L30
            goto L47
        L30:
            r6 = r5
            goto L47
        L32:
            java.lang.String r3 = "startHorizontal"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3b
            goto L47
        L3b:
            r6 = r9
            goto L47
        L3d:
            java.lang.String r3 = "startVertical"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L46
            goto L47
        L46:
            r6 = r2
        L47:
            r0 = 509(0x1fd, float:7.13E-43)
            switch(r6) {
                case 0: goto L59;
                case 1: goto L55;
                case 2: goto L51;
                case 3: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L5c
        L4d:
            r1.b(r0, r2)
            goto L5c
        L51:
            r1.b(r0, r4)
            goto L5c
        L55:
            r1.b(r0, r5)
            goto L5c
        L59:
            r1.b(r0, r9)
        L5c:
            r2 = r9
        L5d:
            java.lang.String r0 = "interpolator"
            java.lang.String r0 = r7.W(r0)
            if (r0 == 0) goto L6b
            r2 = 705(0x2c1, float:9.88E-43)
            r1.c(r2, r0)
            goto L6c
        L6b:
            r9 = r2
        L6c:
            java.lang.String r0 = "staggered"
            float r0 = r7.J(r0)
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L7e
            r9 = 706(0x2c2, float:9.9E-43)
            r1.a(r9, r0)
            goto L80
        L7e:
            if (r9 == 0) goto L83
        L80:
            r8.f0(r1)
        L83:
            java.lang.String r9 = "onSwipe"
            androidx.constraintlayout.core.parser.f r9 = r7.O(r9)
            if (r9 == 0) goto L8e
            h(r9, r8)
        L8e:
            f(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.r.c(androidx.constraintlayout.core.parser.f, androidx.constraintlayout.core.state.q, androidx.constraintlayout.core.state.c):void");
    }

    private static void d(androidx.constraintlayout.core.parser.f fVar, q qVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.a D3;
        androidx.constraintlayout.core.parser.a D4 = fVar.D(v.a.f7370M);
        if (D4 == null || (D3 = fVar.D("frames")) == null) {
            return;
        }
        String W3 = fVar.W("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = D3.size();
        u[] uVarArr = new u[size];
        for (int i4 = 0; i4 < D3.size(); i4++) {
            uVarArr[i4] = new u();
        }
        int i5 = 0;
        for (int i6 = 9; i5 < i6; i6 = 9) {
            String str = strArr[i5];
            int i7 = iArr[i5];
            boolean z3 = zArr[i5];
            androidx.constraintlayout.core.parser.a D5 = fVar.D(str);
            if (D5 != null && D5.size() != size) {
                throw new CLParsingException("incorrect size for " + str + " array, not matching targets array!", fVar);
            }
            if (D5 != null) {
                int i8 = 0;
                while (i8 < size) {
                    float H3 = D5.H(i8);
                    androidx.constraintlayout.core.parser.a aVar = D5;
                    if (z3) {
                        H3 = qVar.f7784r.a(H3);
                    }
                    uVarArr[i8].a(i7, H3);
                    i8++;
                    D5 = aVar;
                }
            } else {
                float J3 = fVar.J(str);
                if (!Float.isNaN(J3)) {
                    if (z3) {
                        J3 = qVar.f7784r.a(J3);
                    }
                    for (int i9 = 0; i9 < size; i9++) {
                        uVarArr[i9].a(i7, J3);
                    }
                }
            }
            i5++;
        }
        String W4 = fVar.W("curveFit");
        for (int i10 = 0; i10 < D4.size(); i10++) {
            for (int i11 = 0; i11 < size; i11++) {
                String T3 = D4.T(i10);
                u uVar = uVarArr[i11];
                if (W4 != null) {
                    uVar.b(v.g.f7533p, a(W4, "spline", "linear"));
                }
                uVar.e(v.g.f7526i, W3);
                uVar.b(100, D3.K(i11));
                qVar.p(T3, uVar);
            }
        }
    }

    private static void e(androidx.constraintlayout.core.parser.f fVar, q qVar) throws CLParsingException {
        int[] iArr;
        int i4;
        androidx.constraintlayout.core.parser.a C3 = fVar.C(v.a.f7370M);
        androidx.constraintlayout.core.parser.a C4 = fVar.C("frames");
        String W3 = fVar.W("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", v.c.f7431Q, v.c.f7432R, v.c.f7433S};
        int[] iArr2 = {311, 312, 304, 305, 306, 308, 309, 310, v.c.f7438d, v.c.f7455u, v.c.f7456v, v.c.f7457w};
        int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1};
        int size = C4.size();
        u[] uVarArr = new u[size];
        for (int i5 = 0; i5 < size; i5++) {
            uVarArr[i5] = new u();
        }
        boolean z3 = false;
        for (int i6 = 0; i6 < 12; i6++) {
            if (fVar.X(strArr[i6]) && iArr3[i6] == 1) {
                z3 = true;
            }
        }
        int i7 = 0;
        for (int i8 = 12; i7 < i8; i8 = 12) {
            String str = strArr[i7];
            int i9 = iArr2[i7];
            int i10 = iArr3[i7];
            androidx.constraintlayout.core.parser.a D3 = fVar.D(str);
            String[] strArr2 = strArr;
            if (D3 != null && D3.size() != size) {
                throw new CLParsingException("incorrect size for $attrName array, not matching targets array!", fVar);
            }
            if (D3 != null) {
                int i11 = 0;
                while (i11 < size) {
                    float H3 = D3.H(i11);
                    int[] iArr4 = iArr2;
                    if (i10 == 1) {
                        H3 = qVar.f7784r.a(H3);
                    } else if (i10 == 2 && z3) {
                        H3 = qVar.f7784r.a(H3);
                    }
                    uVarArr[i11].a(i9, H3);
                    i11++;
                    iArr2 = iArr4;
                }
                iArr = iArr2;
            } else {
                iArr = iArr2;
                float J3 = fVar.J(str);
                if (!Float.isNaN(J3)) {
                    if (i10 == 1) {
                        J3 = qVar.f7784r.a(J3);
                    } else if (i10 == 2 && z3) {
                        J3 = qVar.f7784r.a(J3);
                    }
                    for (int i12 = 0; i12 < size; i12++) {
                        uVarArr[i12].a(i9, J3);
                    }
                } else {
                    i4 = 1;
                    i7 += i4;
                    strArr = strArr2;
                    iArr2 = iArr;
                }
            }
            i4 = 1;
            i7 += i4;
            strArr = strArr2;
            iArr2 = iArr;
        }
        String W4 = fVar.W("curveFit");
        String W5 = fVar.W("easing");
        String W6 = fVar.W("waveShape");
        String W7 = fVar.W(v.c.f7430P);
        for (int i13 = 0; i13 < C3.size(); i13++) {
            for (int i14 = 0; i14 < size; i14++) {
                String T3 = C3.T(i13);
                u uVar = uVarArr[i14];
                if (W4 != null) {
                    if (!W4.equals("linear")) {
                        if (W4.equals("spline")) {
                            uVar.b(v.c.f7436b, 0);
                        }
                    } else {
                        uVar.b(v.c.f7436b, 1);
                    }
                }
                uVar.e(v.g.f7526i, W3);
                if (W5 != null) {
                    uVar.c(v.c.f7452r, W5);
                }
                if (W6 != null) {
                    uVar.c(v.c.f7453s, W6);
                }
                if (W7 != null) {
                    uVar.c(v.c.f7454t, W7);
                }
                uVar.b(100, C4.K(i14));
                qVar.q(T3, uVar);
            }
        }
    }

    public static void f(androidx.constraintlayout.core.parser.f fVar, q qVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.f O3 = fVar.O("KeyFrames");
        if (O3 == null) {
            return;
        }
        androidx.constraintlayout.core.parser.a D3 = O3.D("KeyPositions");
        if (D3 != null) {
            for (int i4 = 0; i4 < D3.size(); i4++) {
                androidx.constraintlayout.core.parser.c z3 = D3.z(i4);
                if (z3 instanceof androidx.constraintlayout.core.parser.f) {
                    g((androidx.constraintlayout.core.parser.f) z3, qVar);
                }
            }
        }
        androidx.constraintlayout.core.parser.a D4 = O3.D(v.a.f7373a);
        if (D4 != null) {
            for (int i5 = 0; i5 < D4.size(); i5++) {
                androidx.constraintlayout.core.parser.c z4 = D4.z(i5);
                if (z4 instanceof androidx.constraintlayout.core.parser.f) {
                    d((androidx.constraintlayout.core.parser.f) z4, qVar);
                }
            }
        }
        androidx.constraintlayout.core.parser.a D5 = O3.D("KeyCycles");
        if (D5 != null) {
            for (int i6 = 0; i6 < D5.size(); i6++) {
                androidx.constraintlayout.core.parser.c z5 = D5.z(i6);
                if (z5 instanceof androidx.constraintlayout.core.parser.f) {
                    e((androidx.constraintlayout.core.parser.f) z5, qVar);
                }
            }
        }
    }

    private static void g(androidx.constraintlayout.core.parser.f fVar, q qVar) throws CLParsingException {
        String str;
        androidx.constraintlayout.core.parser.a aVar;
        u uVar = new u();
        androidx.constraintlayout.core.parser.a C3 = fVar.C(v.a.f7370M);
        androidx.constraintlayout.core.parser.a C4 = fVar.C("frames");
        androidx.constraintlayout.core.parser.a D3 = fVar.D("percentX");
        androidx.constraintlayout.core.parser.a D4 = fVar.D("percentY");
        androidx.constraintlayout.core.parser.a D5 = fVar.D("percentWidth");
        androidx.constraintlayout.core.parser.a D6 = fVar.D("percentHeight");
        String W3 = fVar.W(v.h.f7541e);
        String W4 = fVar.W("transitionEasing");
        String W5 = fVar.W("curveFit");
        String W6 = fVar.W("type");
        if (W6 == null) {
            W6 = "parentRelative";
        }
        if (D3 != null && C4.size() != D3.size()) {
            return;
        }
        if (D4 != null && C4.size() != D4.size()) {
            return;
        }
        int i4 = 0;
        while (i4 < C3.size()) {
            String T3 = C3.T(i4);
            int a4 = a(W6, "deltaRelative", "pathRelative", "parentRelative");
            uVar.h();
            uVar.b(v.g.f7535r, a4);
            if (W5 != null) {
                b(uVar, v.g.f7533p, W5, "spline", "linear");
            }
            uVar.e(v.g.f7526i, W4);
            if (W3 != null) {
                str = W6;
                aVar = C3;
                b(uVar, 509, W3, "none", "startVertical", "startHorizontal", "flip");
            } else {
                str = W6;
                aVar = C3;
            }
            for (int i5 = 0; i5 < C4.size(); i5++) {
                uVar.b(100, C4.K(i5));
                i(uVar, v.g.f7531n, D3, i5);
                i(uVar, v.g.f7532o, D4, i5);
                i(uVar, v.g.f7528k, D5, i5);
                i(uVar, v.g.f7529l, D6, i5);
                qVar.s(T3, uVar);
            }
            i4++;
            W6 = str;
            C3 = aVar;
        }
    }

    private static void h(androidx.constraintlayout.core.parser.b bVar, q qVar) {
        String W3 = bVar.W("anchor");
        int a4 = a(bVar.W("side"), q.b.f7790A);
        int a5 = a(bVar.W("direction"), q.b.f7800K);
        float J3 = bVar.J("scale");
        float J4 = bVar.J("threshold");
        float J5 = bVar.J("maxVelocity");
        float J6 = bVar.J("maxAccel");
        String W4 = bVar.W("limitBounds");
        int a6 = a(bVar.W("mode"), q.b.f7803N);
        int a7 = a(bVar.W("touchUp"), q.b.f7812W);
        float J7 = bVar.J("springMass");
        float J8 = bVar.J("springStiffness");
        float J9 = bVar.J("springDamping");
        float J10 = bVar.J("stopThreshold");
        int a8 = a(bVar.W("springBoundary"), q.b.f7817b0);
        String W5 = bVar.W("around");
        q.b w3 = qVar.w();
        w3.i(W3);
        w3.j(a4);
        w3.l(a5);
        w3.m(J3);
        w3.n(J4);
        w3.q(J5);
        w3.p(J6);
        w3.o(W4);
        w3.k(a6);
        w3.r(a7);
        w3.v(J7);
        w3.w(J8);
        w3.u(J9);
        w3.x(J10);
        w3.t(a8);
        w3.s(W5);
    }

    private static void i(u uVar, int i4, androidx.constraintlayout.core.parser.a aVar, int i5) throws CLParsingException {
        if (aVar != null) {
            uVar.a(i4, aVar.H(i5));
        }
    }
}
