package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class b implements v {

    /* renamed from: m, reason: collision with root package name */
    public static int f6953m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final String f6954n = "alpha";

    /* renamed from: o, reason: collision with root package name */
    public static final String f6955o = "elevation";

    /* renamed from: p, reason: collision with root package name */
    public static final String f6956p = "rotationZ";

    /* renamed from: q, reason: collision with root package name */
    public static final String f6957q = "rotationX";

    /* renamed from: r, reason: collision with root package name */
    public static final String f6958r = "transitionPathRotate";

    /* renamed from: s, reason: collision with root package name */
    public static final String f6959s = "scaleX";

    /* renamed from: t, reason: collision with root package name */
    public static final String f6960t = "scaleY";

    /* renamed from: u, reason: collision with root package name */
    public static final String f6961u = "translationX";

    /* renamed from: v, reason: collision with root package name */
    public static final String f6962v = "translationY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f6963w = "CUSTOM";

    /* renamed from: x, reason: collision with root package name */
    public static final String f6964x = "visibility";

    /* renamed from: h, reason: collision with root package name */
    public int f6965h;

    /* renamed from: i, reason: collision with root package name */
    int f6966i;

    /* renamed from: j, reason: collision with root package name */
    String f6967j;

    /* renamed from: k, reason: collision with root package name */
    public int f6968k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.core.motion.a> f6969l;

    public b() {
        int i4 = f6953m;
        this.f6965h = i4;
        this.f6966i = i4;
        this.f6967j = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i4, int i5) {
        if (i4 != 100) {
            return false;
        }
        this.f6965h = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i4, float f4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i4, String str) {
        if (i4 != 101) {
            return false;
        }
        this.f6967j = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i4, boolean z3) {
        return false;
    }

    public abstract void f(HashMap<String, o> hashMap);

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract b clone();

    public b h(b bVar) {
        this.f6965h = bVar.f6965h;
        this.f6966i = bVar.f6966i;
        this.f6967j = bVar.f6967j;
        this.f6968k = bVar.f6968k;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.f6965h;
    }

    boolean k(String str) {
        String str2 = this.f6967j;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void l(String str, int i4, float f4) {
        this.f6969l.put(str, new androidx.constraintlayout.core.motion.a(str, i4, f4));
    }

    public void m(String str, int i4, int i5) {
        this.f6969l.put(str, new androidx.constraintlayout.core.motion.a(str, i4, i5));
    }

    public void n(String str, int i4, String str2) {
        this.f6969l.put(str, new androidx.constraintlayout.core.motion.a(str, i4, str2));
    }

    public void o(String str, int i4, boolean z3) {
        this.f6969l.put(str, new androidx.constraintlayout.core.motion.a(str, i4, z3));
    }

    public void p(int i4) {
        this.f6965h = i4;
    }

    public void q(HashMap<String, Integer> hashMap) {
    }

    public b r(int i4) {
        this.f6966i = i4;
        return this;
    }

    boolean s(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }
}
