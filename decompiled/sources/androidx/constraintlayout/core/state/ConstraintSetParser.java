package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.spotify.sdk.android.auth.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintSetParser {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f7620a = false;

    /* loaded from: classes.dex */
    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f7621a;

        /* renamed from: b, reason: collision with root package name */
        String f7622b;

        /* renamed from: c, reason: collision with root package name */
        HashMap<String, String> f7623c;

        a(String str, String str2, HashMap<String, String> hashMap) {
            this.f7621a = str;
            this.f7622b = str2;
            this.f7623c = hashMap;
        }

        public String a() {
            return this.f7621a;
        }

        public HashMap<String, String> b() {
            return this.f7623c;
        }

        public String c() {
            return this.f7622b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        float f7624a;

        /* renamed from: b, reason: collision with root package name */
        float f7625b;

        /* renamed from: c, reason: collision with root package name */
        float f7626c;

        /* renamed from: e, reason: collision with root package name */
        String f7628e;

        /* renamed from: f, reason: collision with root package name */
        String f7629f;

        /* renamed from: h, reason: collision with root package name */
        float f7631h;

        /* renamed from: i, reason: collision with root package name */
        float f7632i;

        /* renamed from: d, reason: collision with root package name */
        boolean f7627d = false;

        /* renamed from: g, reason: collision with root package name */
        float f7630g = 0.0f;

        b(float f4, float f5, float f6, String str, String str2) {
            this.f7624a = f4;
            this.f7625b = f5;
            this.f7626c = f6;
            this.f7628e = str == null ? "" : str;
            this.f7629f = str2 == null ? "" : str2;
            this.f7632i = f5;
            this.f7631h = f4;
        }

        public ArrayList<String> a() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i4 = (int) this.f7631h;
            int i5 = (int) this.f7632i;
            int i6 = i4;
            while (i4 <= i5) {
                arrayList.add(this.f7628e + i6 + this.f7629f);
                i6 = (int) (((float) i6) + this.f7626c);
                i4++;
            }
            return arrayList;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.c
        public float value() {
            float f4 = this.f7630g;
            if (f4 >= this.f7632i) {
                this.f7627d = true;
            }
            if (!this.f7627d) {
                this.f7630g = f4 + this.f7626c;
            }
            return this.f7630g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        float value();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        float f7633a;

        /* renamed from: b, reason: collision with root package name */
        float f7634b;

        /* renamed from: c, reason: collision with root package name */
        float f7635c;

        /* renamed from: d, reason: collision with root package name */
        boolean f7636d = false;

        d(float f4, float f5) {
            this.f7633a = f4;
            this.f7634b = f5;
            this.f7635c = f4;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.c
        public float value() {
            if (!this.f7636d) {
                this.f7635c += this.f7634b;
            }
            return this.f7635c;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        HashMap<String, Integer> f7637a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        HashMap<String, c> f7638b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        HashMap<String, ArrayList<String>> f7639c = new HashMap<>();

        float a(Object obj) {
            if (obj instanceof androidx.constraintlayout.core.parser.h) {
                String c4 = ((androidx.constraintlayout.core.parser.h) obj).c();
                if (this.f7638b.containsKey(c4)) {
                    return this.f7638b.get(c4).value();
                }
                if (this.f7637a.containsKey(c4)) {
                    return this.f7637a.get(c4).floatValue();
                }
                return 0.0f;
            }
            if (obj instanceof androidx.constraintlayout.core.parser.e) {
                return ((androidx.constraintlayout.core.parser.e) obj).j();
            }
            return 0.0f;
        }

        ArrayList<String> b(String str) {
            if (this.f7639c.containsKey(str)) {
                return this.f7639c.get(str);
            }
            return null;
        }

        void c(String str, float f4, float f5) {
            if (this.f7638b.containsKey(str) && (this.f7638b.get(str) instanceof f)) {
                return;
            }
            this.f7638b.put(str, new d(f4, f5));
        }

        void d(String str, float f4, float f5, float f6, String str2, String str3) {
            if (this.f7638b.containsKey(str) && (this.f7638b.get(str) instanceof f)) {
                return;
            }
            b bVar = new b(f4, f5, f6, str2, str3);
            this.f7638b.put(str, bVar);
            this.f7639c.put(str, bVar.a());
        }

        void e(String str, int i4) {
            this.f7637a.put(str, Integer.valueOf(i4));
        }

        void f(String str, ArrayList<String> arrayList) {
            this.f7639c.put(str, arrayList);
        }

        public void g(String str, float f4) {
            this.f7638b.put(str, new f(f4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        float f7640a;

        f(float f4) {
            this.f7640a = f4;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.c
        public float value() {
            return this.f7640a;
        }
    }

    private static int a(String str, String... strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (strArr[i4].equals(str)) {
                return i4;
            }
        }
        return -1;
    }

    static String b(androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        Iterator<String> it = fVar.Y().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return fVar.U("type");
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        switch(r5) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L34;
            default: goto L33;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r6.b0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r6.b0("width");
        r6.b0("height");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        r6.b0("start");
        r6.b0("end");
        r6.b0("top");
        r6.b0("bottom");
        r6.b0("baseline");
        r6.b0("center");
        r6.b0("centerHorizontally");
        r6.b0("centerVertically");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        r6.b0("visibility");
        r6.b0("alpha");
        r6.b0("pivotX");
        r6.b0("pivotY");
        r6.b0("rotationX");
        r6.b0("rotationY");
        r6.b0("rotationZ");
        r6.b0("scaleX");
        r6.b0("scaleY");
        r6.b0("translationX");
        r6.b0("translationY");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void c(androidx.constraintlayout.core.parser.f r6, java.lang.String r7, androidx.constraintlayout.core.parser.f r8) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            boolean r0 = r6.X(r7)
            if (r0 != 0) goto Lb
            r6.Z(r7, r8)
            goto Le6
        Lb:
            androidx.constraintlayout.core.parser.f r6 = r6.N(r7)
            java.util.ArrayList r7 = r8.Y()
            java.util.Iterator r7 = r7.iterator()
        L17:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "clear"
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L33
            androidx.constraintlayout.core.parser.c r1 = r8.A(r0)
            r6.Z(r0, r1)
            goto L17
        L33:
            androidx.constraintlayout.core.parser.a r0 = r8.C(r1)
            r1 = 0
            r2 = r1
        L39:
            int r3 = r0.size()
            if (r2 >= r3) goto L17
            java.lang.String r3 = r0.V(r2)
            if (r3 != 0) goto L47
            goto Le2
        L47:
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case -1727069561: goto L66;
                case -1606703562: goto L5b;
                case 414334925: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L70
        L50:
            java.lang.String r4 = "dimensions"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L59
            goto L70
        L59:
            r5 = 2
            goto L70
        L5b:
            java.lang.String r4 = "constraints"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L64
            goto L70
        L64:
            r5 = 1
            goto L70
        L66:
            java.lang.String r4 = "transforms"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r5 = r1
        L70:
            switch(r5) {
                case 0: goto Lab;
                case 1: goto L82;
                case 2: goto L77;
                default: goto L73;
            }
        L73:
            r6.b0(r3)
            goto Le2
        L77:
            java.lang.String r3 = "width"
            r6.b0(r3)
            java.lang.String r3 = "height"
            r6.b0(r3)
            goto Le2
        L82:
            java.lang.String r3 = "start"
            r6.b0(r3)
            java.lang.String r3 = "end"
            r6.b0(r3)
            java.lang.String r3 = "top"
            r6.b0(r3)
            java.lang.String r3 = "bottom"
            r6.b0(r3)
            java.lang.String r3 = "baseline"
            r6.b0(r3)
            java.lang.String r3 = "center"
            r6.b0(r3)
            java.lang.String r3 = "centerHorizontally"
            r6.b0(r3)
            java.lang.String r3 = "centerVertically"
            r6.b0(r3)
            goto Le2
        Lab:
            java.lang.String r3 = "visibility"
            r6.b0(r3)
            java.lang.String r3 = "alpha"
            r6.b0(r3)
            java.lang.String r3 = "pivotX"
            r6.b0(r3)
            java.lang.String r3 = "pivotY"
            r6.b0(r3)
            java.lang.String r3 = "rotationX"
            r6.b0(r3)
            java.lang.String r3 = "rotationY"
            r6.b0(r3)
            java.lang.String r3 = "rotationZ"
            r6.b0(r3)
            java.lang.String r3 = "scaleX"
            r6.b0(r3)
            java.lang.String r3 = "scaleY"
            r6.b0(r3)
            java.lang.String r3 = "translationX"
            r6.b0(r3)
            java.lang.String r3 = "translationY"
            r6.b0(r3)
        Le2:
            int r2 = r2 + 1
            goto L39
        Le6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.c(androidx.constraintlayout.core.parser.f, java.lang.String, androidx.constraintlayout.core.parser.f):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00aa, code lost:
    
        if (r1.equals("top") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void d(androidx.constraintlayout.core.state.State r7, java.lang.String r8, androidx.constraintlayout.core.parser.f r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.d(androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.f):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(int r6, androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.e r8, androidx.constraintlayout.core.parser.a r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            if (r6 != 0) goto L7
            androidx.constraintlayout.core.state.helpers.g r6 = r7.p()
            goto Lb
        L7:
            androidx.constraintlayout.core.state.helpers.h r6 = r7.C()
        Lb:
            r0 = 1
            androidx.constraintlayout.core.parser.c r1 = r9.z(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.a
            if (r2 == 0) goto Laf
            androidx.constraintlayout.core.parser.a r1 = (androidx.constraintlayout.core.parser.a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Laf
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L34
            java.lang.String r4 = r1.T(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.M0(r4)
            int r3 = r3 + 1
            goto L20
        L34:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Laf
            androidx.constraintlayout.core.parser.c r9 = r9.z(r3)
            boolean r1 = r9 instanceof androidx.constraintlayout.core.parser.f
            if (r1 != 0) goto L44
            return
        L44:
            androidx.constraintlayout.core.parser.f r9 = (androidx.constraintlayout.core.parser.f) r9
            java.util.ArrayList r1 = r9.Y()
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L69
            h(r7, r8, r9, r6, r3)
            goto L4e
        L69:
            androidx.constraintlayout.core.parser.c r3 = r9.A(r3)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.a
            if (r4 == 0) goto L86
            r4 = r3
            androidx.constraintlayout.core.parser.a r4 = (androidx.constraintlayout.core.parser.a) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L86
            java.lang.String r3 = r4.T(r2)
            float r4 = r4.H(r0)
            r6.n(r4)
            goto L8a
        L86:
            java.lang.String r3 = r3.c()
        L8a:
            r3.hashCode()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La3
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r6.X0(r3)
            goto L4e
        La3:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r6.X0(r3)
            goto L4e
        La9:
            androidx.constraintlayout.core.state.State$Chain r3 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r6.X0(r3)
            goto L4e
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.e(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$e, androidx.constraintlayout.core.parser.a):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0099. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(java.lang.String r17, androidx.constraintlayout.core.state.State r18, java.lang.String r19, androidx.constraintlayout.core.state.ConstraintSetParser.e r20, androidx.constraintlayout.core.parser.f r21) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.f(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$e, androidx.constraintlayout.core.parser.f):void");
    }

    static long g(String str) {
        if (str.startsWith("#")) {
            String substring = str.substring(1);
            if (substring.length() == 6) {
                substring = "FF" + substring;
            }
            return Long.parseLong(substring, 16);
        }
        return -1L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01aa, code lost:
    
        if (r12.equals("bottom") == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void h(androidx.constraintlayout.core.state.State r17, androidx.constraintlayout.core.state.ConstraintSetParser.e r18, androidx.constraintlayout.core.parser.f r19, androidx.constraintlayout.core.state.a r20, java.lang.String r21) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.h(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$e, androidx.constraintlayout.core.parser.f, androidx.constraintlayout.core.state.a, java.lang.String):void");
    }

    static void i(androidx.constraintlayout.core.state.b bVar, androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            androidx.constraintlayout.core.parser.f N3 = fVar.N(next);
            String W3 = N3.W("Extends");
            if (W3 != null && !W3.isEmpty()) {
                String b4 = bVar.b(W3);
                if (b4 != null) {
                    androidx.constraintlayout.core.parser.f d4 = androidx.constraintlayout.core.parser.g.d(b4);
                    ArrayList<String> Y4 = N3.Y();
                    if (Y4 != null) {
                        Iterator<String> it2 = Y4.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            androidx.constraintlayout.core.parser.c A3 = N3.A(next2);
                            if (A3 instanceof androidx.constraintlayout.core.parser.f) {
                                c(d4, next2, (androidx.constraintlayout.core.parser.f) A3);
                            }
                        }
                        bVar.f(next, d4.w());
                    }
                }
            } else {
                bVar.f(next, N3.w());
            }
        }
    }

    static void j(androidx.constraintlayout.core.parser.f fVar, androidx.constraintlayout.core.state.a aVar, String str) throws CLParsingException {
        ArrayList<String> Y3;
        androidx.constraintlayout.core.parser.f O3 = fVar.O(str);
        if (O3 == null || (Y3 = O3.Y()) == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            androidx.constraintlayout.core.parser.c A3 = O3.A(next);
            if (A3 instanceof androidx.constraintlayout.core.parser.e) {
                aVar.g(next, A3.j());
            } else if (A3 instanceof androidx.constraintlayout.core.parser.h) {
                long g4 = g(A3.c());
                if (g4 != -1) {
                    aVar.f(next, (int) g4);
                }
            }
        }
    }

    public static void k(String str, ArrayList<a> arrayList) throws CLParsingException {
        androidx.constraintlayout.core.parser.f d4 = androidx.constraintlayout.core.parser.g.d(str);
        ArrayList<String> Y3 = d4.Y();
        if (Y3 != null && Y3.size() > 0) {
            String str2 = Y3.get(0);
            androidx.constraintlayout.core.parser.c A3 = d4.A(str2);
            str2.hashCode();
            if (!str2.equals("Design") || !(A3 instanceof androidx.constraintlayout.core.parser.f)) {
                return;
            }
            androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) A3;
            ArrayList<String> Y4 = fVar.Y();
            for (int i4 = 0; i4 < Y4.size(); i4++) {
                String str3 = Y4.get(i4);
                androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) fVar.A(str3);
                System.out.printf("element found " + str3, new Object[0]);
                String W3 = fVar2.W("type");
                if (W3 != null) {
                    HashMap hashMap = new HashMap();
                    int size = fVar2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        androidx.constraintlayout.core.parser.d dVar = (androidx.constraintlayout.core.parser.d) fVar2.z(i4);
                        String c4 = dVar.c();
                        String c5 = dVar.e0().c();
                        if (c5 != null) {
                            hashMap.put(c4, c5);
                        }
                    }
                    arrayList.add(new a(str2, W3, hashMap));
                }
            }
        }
    }

    static Dimension l(androidx.constraintlayout.core.parser.f fVar, String str, State state, androidx.constraintlayout.core.state.c cVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.c A3 = fVar.A(str);
        Dimension b4 = Dimension.b(0);
        if (A3 instanceof androidx.constraintlayout.core.parser.h) {
            return m(A3.c());
        }
        if (A3 instanceof androidx.constraintlayout.core.parser.e) {
            return Dimension.b(state.g(Float.valueOf(cVar.a(fVar.I(str)))));
        }
        if (A3 instanceof androidx.constraintlayout.core.parser.f) {
            androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) A3;
            String W3 = fVar2.W("value");
            if (W3 != null) {
                b4 = m(W3);
            }
            androidx.constraintlayout.core.parser.c S3 = fVar2.S("min");
            if (S3 != null) {
                if (S3 instanceof androidx.constraintlayout.core.parser.e) {
                    b4.q(state.g(Float.valueOf(cVar.a(((androidx.constraintlayout.core.parser.e) S3).j()))));
                } else if (S3 instanceof androidx.constraintlayout.core.parser.h) {
                    b4.r(Dimension.f7642j);
                }
            }
            androidx.constraintlayout.core.parser.c S4 = fVar2.S("max");
            if (S4 != null) {
                if (S4 instanceof androidx.constraintlayout.core.parser.e) {
                    b4.o(state.g(Float.valueOf(cVar.a(((androidx.constraintlayout.core.parser.e) S4).j()))));
                    return b4;
                }
                if (S4 instanceof androidx.constraintlayout.core.parser.h) {
                    b4.p(Dimension.f7642j);
                    return b4;
                }
                return b4;
            }
            return b4;
        }
        return b4;
    }

    static Dimension m(String str) {
        Dimension b4 = Dimension.b(0);
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c4 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c4 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c4 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c4 = 3;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return Dimension.i(Dimension.f7642j);
            case 1:
                return Dimension.d();
            case 2:
                return Dimension.i(Dimension.f7643k);
            case 3:
                return Dimension.j();
            default:
                if (str.endsWith("%")) {
                    return Dimension.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).v(0);
                }
                if (str.contains(":")) {
                    return Dimension.f(str).w(Dimension.f7643k);
                }
                return b4;
        }
    }

    static void n(State state, e eVar, androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            androidx.constraintlayout.core.parser.c A3 = fVar.A(next);
            ArrayList<String> b4 = eVar.b(next);
            if (b4 != null && (A3 instanceof androidx.constraintlayout.core.parser.f)) {
                Iterator<String> it2 = b4.iterator();
                while (it2.hasNext()) {
                    y(state, eVar, it2.next(), (androidx.constraintlayout.core.parser.f) A3);
                }
            }
        }
    }

    static void o(int i4, State state, androidx.constraintlayout.core.parser.a aVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.f fVar;
        String W3;
        androidx.constraintlayout.core.parser.c z3 = aVar.z(1);
        if (!(z3 instanceof androidx.constraintlayout.core.parser.f) || (W3 = (fVar = (androidx.constraintlayout.core.parser.f) z3).W(b.c.f48986a)) == null) {
            return;
        }
        p(i4, state, W3, fVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0032. Please report as an issue. */
    static void p(int i4, State state, String str, androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        androidx.constraintlayout.core.state.a f4 = state.f(str);
        if (i4 == 0) {
            state.r(str);
        } else {
            state.E(str);
        }
        androidx.constraintlayout.core.state.helpers.f fVar2 = (androidx.constraintlayout.core.state.helpers.f) f4.e();
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.hashCode();
            char c4 = 65535;
            switch (next.hashCode()) {
                case -678927291:
                    if (next.equals("percent")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 100571:
                    if (next.equals("end")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (next.equals("start")) {
                        c4 = 2;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    fVar2.h(fVar.I(next));
                    break;
                case 1:
                    fVar2.f(Float.valueOf(state.k().a(state.g(Float.valueOf(fVar.I(next))))));
                    break;
                case 2:
                    fVar2.j(Float.valueOf(state.k().a(state.g(Float.valueOf(fVar.I(next))))));
                    break;
            }
        }
    }

    static void q(androidx.constraintlayout.core.state.b bVar, androidx.constraintlayout.core.parser.f fVar) {
        String W3 = fVar.W("export");
        if (W3 != null) {
            bVar.h(W3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0025. Please report as an issue. */
    static void r(State state, e eVar, androidx.constraintlayout.core.parser.a aVar) throws CLParsingException {
        for (int i4 = 0; i4 < aVar.size(); i4++) {
            androidx.constraintlayout.core.parser.c z3 = aVar.z(i4);
            if (z3 instanceof androidx.constraintlayout.core.parser.a) {
                androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) z3;
                if (aVar2.size() > 1) {
                    String T3 = aVar2.T(0);
                    T3.hashCode();
                    char c4 = 65535;
                    switch (T3.hashCode()) {
                        case -1785507558:
                            if (T3.equals("vGuideline")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1252464839:
                            if (T3.equals("hChain")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -851656725:
                            if (T3.equals("vChain")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 965681512:
                            if (T3.equals("hGuideline")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c4) {
                        case 0:
                            o(1, state, aVar2);
                            break;
                        case 1:
                            e(0, state, eVar, aVar2);
                            break;
                        case 2:
                            e(1, state, eVar, aVar2);
                            break;
                        case 3:
                            o(0, state, aVar2);
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(java.lang.String r11, androidx.constraintlayout.core.state.State r12, androidx.constraintlayout.core.state.ConstraintSetParser.e r13) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.s(java.lang.String, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$e):void");
    }

    public static void t(String str, q qVar, int i4) {
        androidx.constraintlayout.core.parser.f O3;
        try {
            androidx.constraintlayout.core.parser.f d4 = androidx.constraintlayout.core.parser.g.d(str);
            ArrayList<String> Y3 = d4.Y();
            if (Y3 == null) {
                return;
            }
            Iterator<String> it = Y3.iterator();
            while (it.hasNext()) {
                String next = it.next();
                androidx.constraintlayout.core.parser.c A3 = d4.A(next);
                if ((A3 instanceof androidx.constraintlayout.core.parser.f) && (O3 = ((androidx.constraintlayout.core.parser.f) A3).O("custom")) != null) {
                    Iterator<String> it2 = O3.Y().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        androidx.constraintlayout.core.parser.c A4 = O3.A(next2);
                        if (A4 instanceof androidx.constraintlayout.core.parser.e) {
                            qVar.o(i4, next, next2, A4.j());
                        } else if (A4 instanceof androidx.constraintlayout.core.parser.h) {
                            long g4 = g(A4.c());
                            if (g4 != -1) {
                                qVar.n(i4, next, next2, (int) g4);
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e4) {
            System.err.println("Error parsing JSON " + e4);
        }
    }

    private static void u(androidx.constraintlayout.core.parser.c cVar, androidx.constraintlayout.core.state.a aVar) throws CLParsingException {
        char c4;
        if (!(cVar instanceof androidx.constraintlayout.core.parser.f)) {
            return;
        }
        androidx.constraintlayout.core.parser.f fVar = (androidx.constraintlayout.core.parser.f) cVar;
        u uVar = new u();
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.hashCode();
            switch (next.hashCode()) {
                case -1897525331:
                    if (next.equals("stagger")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1310311125:
                    if (next.equals("easing")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -1285003983:
                    if (next.equals("quantize")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case -791482387:
                    if (next.equals("pathArc")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case -236944793:
                    if (next.equals("relativeTo")) {
                        c4 = 4;
                        break;
                    }
                    break;
            }
            c4 = 65535;
            switch (c4) {
                case 0:
                    uVar.a(600, fVar.I(next));
                    break;
                case 1:
                    uVar.c(v.e.f7487s, fVar.U(next));
                    break;
                case 2:
                    androidx.constraintlayout.core.parser.c A3 = fVar.A(next);
                    if (A3 instanceof androidx.constraintlayout.core.parser.a) {
                        androidx.constraintlayout.core.parser.a aVar2 = (androidx.constraintlayout.core.parser.a) A3;
                        int size = aVar2.size();
                        if (size <= 0) {
                            break;
                        } else {
                            uVar.b(v.e.f7494z, aVar2.K(0));
                            if (size <= 1) {
                                break;
                            } else {
                                uVar.c(v.e.f7467A, aVar2.T(1));
                                if (size <= 2) {
                                    break;
                                } else {
                                    uVar.a(v.e.f7486r, aVar2.H(2));
                                    break;
                                }
                            }
                        }
                    } else {
                        uVar.b(v.e.f7494z, fVar.L(next));
                        break;
                    }
                case 3:
                    String U3 = fVar.U(next);
                    int a4 = a(U3, "none", "startVertical", "startHorizontal", "flip");
                    if (a4 == -1) {
                        System.err.println(fVar.l() + " pathArc = '" + U3 + "'");
                        break;
                    } else {
                        uVar.b(v.e.f7491w, a4);
                        break;
                    }
                case 4:
                    uVar.c(v.e.f7489u, fVar.U(next));
                    break;
            }
        }
        aVar.f7715j0 = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(androidx.constraintlayout.core.state.b r7, java.lang.String r8) {
        /*
            androidx.constraintlayout.core.parser.f r8 = androidx.constraintlayout.core.parser.g.d(r8)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            java.util.ArrayList r0 = r8.Y()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.Iterator r0 = r0.iterator()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
        Lf:
            boolean r1 = r0.hasNext()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            java.lang.String r1 = (java.lang.String) r1     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            androidx.constraintlayout.core.parser.c r2 = r8.A(r1)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.f     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r3 == 0) goto Lf
            androidx.constraintlayout.core.parser.f r2 = (androidx.constraintlayout.core.parser.f) r2     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            int r3 = r1.hashCode()     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            r4 = -2137403731(0xffffffff8099cead, float:-1.4124972E-38)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L51
            r4 = -241441378(0xfffffffff19be59e, float:-1.5439285E30)
            if (r3 == r4) goto L47
            r4 = 1101852654(0x41acefee, float:21.617153)
            if (r3 == r4) goto L3b
            goto L5b
        L3b:
            java.lang.String r3 = "ConstraintSets"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r1 == 0) goto L5b
            r1 = 0
            goto L5c
        L45:
            r7 = move-exception
            goto L6f
        L47:
            java.lang.String r3 = "Transitions"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r1 == 0) goto L5b
            r1 = r6
            goto L5c
        L51:
            java.lang.String r3 = "Header"
            boolean r1 = r1.equals(r3)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            if (r1 == 0) goto L5b
            r1 = r5
            goto L5c
        L5b:
            r1 = -1
        L5c:
            if (r1 == 0) goto L6b
            if (r1 == r6) goto L67
            if (r1 == r5) goto L63
            goto Lf
        L63:
            q(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            goto Lf
        L67:
            w(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            goto Lf
        L6b:
            i(r7, r2)     // Catch: androidx.constraintlayout.core.parser.CLParsingException -> L45
            goto Lf
        L6f:
            java.io.PrintStream r8 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error parsing JSON "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.println(r7)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.v(androidx.constraintlayout.core.state.b, java.lang.String):void");
    }

    static void w(androidx.constraintlayout.core.state.b bVar, androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            bVar.e(next, fVar.N(next).w());
        }
    }

    private static void x(State state, e eVar, androidx.constraintlayout.core.parser.f fVar) throws CLParsingException {
        ArrayList<String> Y3 = fVar.Y();
        if (Y3 == null) {
            return;
        }
        Iterator<String> it = Y3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            androidx.constraintlayout.core.parser.c A3 = fVar.A(next);
            if (A3 instanceof androidx.constraintlayout.core.parser.e) {
                eVar.e(next, A3.k());
            } else if (A3 instanceof androidx.constraintlayout.core.parser.f) {
                androidx.constraintlayout.core.parser.f fVar2 = (androidx.constraintlayout.core.parser.f) A3;
                if (fVar2.X("from") && fVar2.X(v.h.f7540d)) {
                    eVar.d(next, eVar.a(fVar2.A("from")), eVar.a(fVar2.A(v.h.f7540d)), 1.0f, fVar2.W("prefix"), fVar2.W("postfix"));
                } else if (fVar2.X("from") && fVar2.X("step")) {
                    eVar.c(next, eVar.a(fVar2.A("from")), eVar.a(fVar2.A("step")));
                } else if (fVar2.X("ids")) {
                    androidx.constraintlayout.core.parser.a C3 = fVar2.C("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i4 = 0; i4 < C3.size(); i4++) {
                        arrayList.add(C3.T(i4));
                    }
                    eVar.f(next, arrayList);
                } else if (fVar2.X("tag")) {
                    eVar.f(next, state.l(fVar2.U("tag")));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0190, code lost:
    
        if (r1.equals("visible") == false) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void y(androidx.constraintlayout.core.state.State r10, androidx.constraintlayout.core.state.ConstraintSetParser.e r11, java.lang.String r12, androidx.constraintlayout.core.parser.f r13) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.y(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$e, java.lang.String, androidx.constraintlayout.core.parser.f):void");
    }

    private static float z(State state, float f4) {
        return state.k().a(f4);
    }
}
