package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: P, reason: collision with root package name */
    static final String f6970P = "KeyAttribute";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f6971Q = "KeyAttributes";

    /* renamed from: R, reason: collision with root package name */
    private static final boolean f6972R = false;

    /* renamed from: S, reason: collision with root package name */
    public static final int f6973S = 1;

    /* renamed from: y, reason: collision with root package name */
    private String f6989y;

    /* renamed from: z, reason: collision with root package name */
    private int f6990z = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f6974A = 0;

    /* renamed from: B, reason: collision with root package name */
    private float f6975B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    private float f6976C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    private float f6977D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    private float f6978E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    private float f6979F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private float f6980G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private float f6981H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f6982I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private float f6983J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    private float f6984K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private float f6985L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    private float f6986M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    private float f6987N = Float.NaN;

    /* renamed from: O, reason: collision with root package name */
    private float f6988O = Float.NaN;

    public c() {
        this.f6968k = 1;
        this.f6969l = new HashMap<>();
    }

    private float w(int i4) {
        if (i4 != 100) {
            switch (i4) {
                case 303:
                    return this.f6975B;
                case 304:
                    return this.f6985L;
                case 305:
                    return this.f6986M;
                case 306:
                    return this.f6987N;
                case 307:
                    return this.f6976C;
                case 308:
                    return this.f6978E;
                case 309:
                    return this.f6979F;
                case 310:
                    return this.f6977D;
                case 311:
                    return this.f6983J;
                case 312:
                    return this.f6984K;
                case 313:
                    return this.f6980G;
                case 314:
                    return this.f6981H;
                case 315:
                    return this.f6988O;
                case v.a.f7389q /* 316 */:
                    return this.f6982I;
                default:
                    return Float.NaN;
            }
        }
        return this.f6965h;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.a.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 100) {
            if (i4 != 301) {
                if (i4 != 302) {
                    if (!b(i4, i5)) {
                        return super.b(i4, i5);
                    }
                    return true;
                }
                this.f6974A = i5;
                return true;
            }
            this.f6990z = i5;
            return true;
        }
        this.f6965h = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (i4 != 100) {
            switch (i4) {
                case 303:
                    this.f6975B = f4;
                    return true;
                case 304:
                    this.f6985L = f4;
                    return true;
                case 305:
                    this.f6986M = f4;
                    return true;
                case 306:
                    this.f6987N = f4;
                    return true;
                case 307:
                    this.f6976C = f4;
                    return true;
                case 308:
                    this.f6978E = f4;
                    return true;
                case 309:
                    this.f6979F = f4;
                    return true;
                case 310:
                    this.f6977D = f4;
                    return true;
                case 311:
                    this.f6983J = f4;
                    return true;
                case 312:
                    this.f6984K = f4;
                    return true;
                case 313:
                    this.f6980G = f4;
                    return true;
                case 314:
                    this.f6981H = f4;
                    return true;
                case 315:
                    this.f6988O = f4;
                    return true;
                case v.a.f7389q /* 316 */:
                    this.f6982I = f4;
                    return true;
                default:
                    return super.c(i4, f4);
            }
        }
        this.f6982I = f4;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 101) {
            if (i4 != 317) {
                return super.d(i4, str);
            }
            this.f6989y = str;
            return true;
        }
        this.f6967j = str;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x009a, code lost:
    
        if (r1.equals("pivotX") == false) goto L15;
     */
    @Override // androidx.constraintlayout.core.motion.key.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.o> r7) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.c.f(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f6975B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f6976C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f6977D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f6978E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f6979F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f6980G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.f6981H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.f6985L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f6986M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f6987N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f6982I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f6983J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f6984K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f6988O)) {
            hashSet.add("progress");
        }
        if (this.f6969l.size() > 0) {
            Iterator<String> it = this.f6969l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.f6975B)) {
            hashMap.put("alpha", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6976C)) {
            hashMap.put("elevation", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6977D)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6978E)) {
            hashMap.put("rotationX", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6979F)) {
            hashMap.put("rotationY", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6980G)) {
            hashMap.put("pivotX", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6981H)) {
            hashMap.put("pivotY", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6985L)) {
            hashMap.put("translationX", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6986M)) {
            hashMap.put("translationY", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6987N)) {
            hashMap.put("translationZ", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6982I)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6983J)) {
            hashMap.put("scaleX", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6984K)) {
            hashMap.put("scaleY", Integer.valueOf(this.f6990z));
        }
        if (!Float.isNaN(this.f6988O)) {
            hashMap.put("progress", Integer.valueOf(this.f6990z));
        }
        if (this.f6969l.size() > 0) {
            Iterator<String> it = this.f6969l.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put("CUSTOM," + it.next(), Integer.valueOf(this.f6990z));
            }
        }
    }

    public int v() {
        return this.f6990z;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f6965h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            int a4 = v.a.a(strArr[i4]);
            System.out.println(strArr[i4] + ":" + w(a4));
        }
    }
}
