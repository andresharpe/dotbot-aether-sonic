package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: Q, reason: collision with root package name */
    static final String f7043Q = "KeyTimeCycle";

    /* renamed from: R, reason: collision with root package name */
    private static final String f7044R = "KeyTimeCycle";

    /* renamed from: S, reason: collision with root package name */
    public static final int f7045S = 3;

    /* renamed from: y, reason: collision with root package name */
    private String f7062y;

    /* renamed from: z, reason: collision with root package name */
    private int f7063z = -1;

    /* renamed from: A, reason: collision with root package name */
    private float f7046A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    private float f7047B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    private float f7048C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    private float f7049D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    private float f7050E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    private float f7051F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    private float f7052G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    private float f7053H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    private float f7054I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    private float f7055J = Float.NaN;

    /* renamed from: K, reason: collision with root package name */
    private float f7056K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    private float f7057L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    private int f7058M = 0;

    /* renamed from: N, reason: collision with root package name */
    private String f7059N = null;

    /* renamed from: O, reason: collision with root package name */
    private float f7060O = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    private float f7061P = 0.0f;

    public f() {
        this.f6968k = 3;
        this.f6969l = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.c.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 100) {
            if (i4 != 421) {
                return super.b(i4, i5);
            }
            this.f7058M = i5;
            return true;
        }
        this.f6965h = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        if (i4 != 315) {
            if (i4 != 401) {
                if (i4 != 403) {
                    if (i4 != 416) {
                        if (i4 != 423) {
                            if (i4 != 424) {
                                switch (i4) {
                                    case 304:
                                        this.f7054I = t(Float.valueOf(f4));
                                        return true;
                                    case 305:
                                        this.f7055J = t(Float.valueOf(f4));
                                        return true;
                                    case 306:
                                        this.f7056K = t(Float.valueOf(f4));
                                        return true;
                                    case 307:
                                        this.f7047B = t(Float.valueOf(f4));
                                        return true;
                                    case 308:
                                        this.f7049D = t(Float.valueOf(f4));
                                        return true;
                                    case 309:
                                        this.f7050E = t(Float.valueOf(f4));
                                        return true;
                                    case 310:
                                        this.f7048C = t(Float.valueOf(f4));
                                        return true;
                                    case 311:
                                        this.f7052G = t(Float.valueOf(f4));
                                        return true;
                                    case 312:
                                        this.f7053H = t(Float.valueOf(f4));
                                        return true;
                                    default:
                                        return super.c(i4, f4);
                                }
                            }
                            this.f7061P = t(Float.valueOf(f4));
                            return true;
                        }
                        this.f7060O = t(Float.valueOf(f4));
                        return true;
                    }
                    this.f7051F = t(Float.valueOf(f4));
                    return true;
                }
                this.f7046A = f4;
                return true;
            }
            this.f7063z = u(Float.valueOf(f4));
            return true;
        }
        this.f7057L = t(Float.valueOf(f4));
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 420) {
            if (i4 != 421) {
                return super.d(i4, str);
            }
            this.f7058M = 7;
            this.f7059N = str;
            return true;
        }
        this.f7062y = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        return super.e(i4, z3);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f7046A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f7047B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f7048C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f7049D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f7050E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f7052G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f7053H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f7051F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f7054I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f7055J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f7056K)) {
            hashSet.add("translationZ");
        }
        if (this.f6969l.size() > 0) {
            Iterator<String> it = this.f6969l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0089, code lost:
    
        if (r1.equals("scaleX") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.t> r11) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.f.v(java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public f h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f7062y = fVar.f7062y;
        this.f7063z = fVar.f7063z;
        this.f7058M = fVar.f7058M;
        this.f7060O = fVar.f7060O;
        this.f7061P = fVar.f7061P;
        this.f7057L = fVar.f7057L;
        this.f7046A = fVar.f7046A;
        this.f7047B = fVar.f7047B;
        this.f7048C = fVar.f7048C;
        this.f7051F = fVar.f7051F;
        this.f7049D = fVar.f7049D;
        this.f7050E = fVar.f7050E;
        this.f7052G = fVar.f7052G;
        this.f7053H = fVar.f7053H;
        this.f7054I = fVar.f7054I;
        this.f7055J = fVar.f7055J;
        this.f7056K = fVar.f7056K;
        return this;
    }
}
