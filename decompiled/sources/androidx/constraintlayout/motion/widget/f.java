package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: A, reason: collision with root package name */
    public static final String f8532A = "motionProgress";

    /* renamed from: B, reason: collision with root package name */
    public static final String f8533B = "transitionEasing";

    /* renamed from: C, reason: collision with root package name */
    public static final String f8534C = "visibility";

    /* renamed from: f, reason: collision with root package name */
    public static int f8535f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final String f8536g = "alpha";

    /* renamed from: h, reason: collision with root package name */
    public static final String f8537h = "elevation";

    /* renamed from: i, reason: collision with root package name */
    public static final String f8538i = "rotation";

    /* renamed from: j, reason: collision with root package name */
    public static final String f8539j = "rotationX";

    /* renamed from: k, reason: collision with root package name */
    public static final String f8540k = "rotationY";

    /* renamed from: l, reason: collision with root package name */
    public static final String f8541l = "transformPivotX";

    /* renamed from: m, reason: collision with root package name */
    public static final String f8542m = "transformPivotY";

    /* renamed from: n, reason: collision with root package name */
    public static final String f8543n = "transitionPathRotate";

    /* renamed from: o, reason: collision with root package name */
    public static final String f8544o = "scaleX";

    /* renamed from: p, reason: collision with root package name */
    public static final String f8545p = "scaleY";

    /* renamed from: q, reason: collision with root package name */
    public static final String f8546q = "wavePeriod";

    /* renamed from: r, reason: collision with root package name */
    public static final String f8547r = "waveOffset";

    /* renamed from: s, reason: collision with root package name */
    public static final String f8548s = "wavePhase";

    /* renamed from: t, reason: collision with root package name */
    public static final String f8549t = "waveVariesBy";

    /* renamed from: u, reason: collision with root package name */
    public static final String f8550u = "translationX";

    /* renamed from: v, reason: collision with root package name */
    public static final String f8551v = "translationY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f8552w = "translationZ";

    /* renamed from: x, reason: collision with root package name */
    public static final String f8553x = "progress";

    /* renamed from: y, reason: collision with root package name */
    public static final String f8554y = "CUSTOM";

    /* renamed from: z, reason: collision with root package name */
    public static final String f8555z = "curveFit";

    /* renamed from: a, reason: collision with root package name */
    int f8556a;

    /* renamed from: b, reason: collision with root package name */
    int f8557b;

    /* renamed from: c, reason: collision with root package name */
    String f8558c;

    /* renamed from: d, reason: collision with root package name */
    protected int f8559d;

    /* renamed from: e, reason: collision with root package name */
    HashMap<String, ConstraintAttribute> f8560e;

    public f() {
        int i4 = f8535f;
        this.f8556a = i4;
        this.f8557b = i4;
        this.f8558c = null;
    }

    public abstract void a(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap);

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f fVar) {
        this.f8556a = fVar.f8556a;
        this.f8557b = fVar.f8557b;
        this.f8558c = fVar.f8558c;
        this.f8559d = fVar.f8559d;
        this.f8560e = fVar.f8560e;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(HashSet<String> hashSet);

    public int e() {
        return this.f8556a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(Context context, AttributeSet attributeSet);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(String str) {
        String str2 = this.f8558c;
        if (str2 != null && str != null) {
            return str.matches(str2);
        }
        return false;
    }

    public void h(int i4) {
        this.f8556a = i4;
    }

    public void i(HashMap<String, Integer> hashMap) {
    }

    public abstract void j(String str, Object obj);

    public f k(int i4) {
        this.f8557b = i4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(Object obj) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        return Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return Integer.parseInt(obj.toString());
    }
}
