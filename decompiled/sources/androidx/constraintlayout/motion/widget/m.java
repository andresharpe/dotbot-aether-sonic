package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.h;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public class m extends f {

    /* renamed from: Y, reason: collision with root package name */
    public static final String f8754Y = "viewTransitionOnCross";

    /* renamed from: Z, reason: collision with root package name */
    public static final String f8755Z = "viewTransitionOnPositiveCross";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f8756a0 = "viewTransitionOnNegativeCross";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f8757b0 = "postLayout";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f8758c0 = "triggerSlack";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f8759d0 = "triggerCollisionView";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f8760e0 = "triggerCollisionId";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f8761f0 = "triggerID";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f8762g0 = "positiveCross";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f8763h0 = "negativeCross";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f8764i0 = "triggerReceiver";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f8765j0 = "CROSS";

    /* renamed from: k0, reason: collision with root package name */
    public static final int f8766k0 = 5;

    /* renamed from: l0, reason: collision with root package name */
    static final String f8767l0 = "KeyTrigger";

    /* renamed from: m0, reason: collision with root package name */
    private static final String f8768m0 = "KeyTrigger";

    /* renamed from: D, reason: collision with root package name */
    float f8769D = 0.1f;

    /* renamed from: E, reason: collision with root package name */
    int f8770E;

    /* renamed from: F, reason: collision with root package name */
    int f8771F;

    /* renamed from: G, reason: collision with root package name */
    int f8772G;

    /* renamed from: H, reason: collision with root package name */
    RectF f8773H;

    /* renamed from: I, reason: collision with root package name */
    RectF f8774I;

    /* renamed from: J, reason: collision with root package name */
    HashMap<String, Method> f8775J;

    /* renamed from: K, reason: collision with root package name */
    private int f8776K;

    /* renamed from: L, reason: collision with root package name */
    private String f8777L;

    /* renamed from: M, reason: collision with root package name */
    private int f8778M;

    /* renamed from: N, reason: collision with root package name */
    private String f8779N;

    /* renamed from: O, reason: collision with root package name */
    private String f8780O;

    /* renamed from: P, reason: collision with root package name */
    private int f8781P;

    /* renamed from: Q, reason: collision with root package name */
    private int f8782Q;

    /* renamed from: R, reason: collision with root package name */
    private View f8783R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f8784S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f8785T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f8786U;

    /* renamed from: V, reason: collision with root package name */
    private float f8787V;

    /* renamed from: W, reason: collision with root package name */
    private float f8788W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f8789X;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f8790a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f8791b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f8792c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f8793d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f8794e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f8795f = 7;

        /* renamed from: g, reason: collision with root package name */
        private static final int f8796g = 8;

        /* renamed from: h, reason: collision with root package name */
        private static final int f8797h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f8798i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f8799j = 11;

        /* renamed from: k, reason: collision with root package name */
        private static final int f8800k = 12;

        /* renamed from: l, reason: collision with root package name */
        private static final int f8801l = 13;

        /* renamed from: m, reason: collision with root package name */
        private static final int f8802m = 14;

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f8803n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8803n = sparseIntArray;
            sparseIntArray.append(h.m.yg, 8);
            f8803n.append(h.m.Cg, 4);
            f8803n.append(h.m.Dg, 1);
            f8803n.append(h.m.Eg, 2);
            f8803n.append(h.m.zg, 7);
            f8803n.append(h.m.Fg, 6);
            f8803n.append(h.m.Hg, 5);
            f8803n.append(h.m.Bg, 9);
            f8803n.append(h.m.Ag, 10);
            f8803n.append(h.m.Gg, 11);
            f8803n.append(h.m.Ig, 12);
            f8803n.append(h.m.Jg, 13);
            f8803n.append(h.m.Kg, 14);
        }

        private a() {
        }

        public static void a(m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArray.getIndex(i4);
                switch (f8803n.get(index)) {
                    case 1:
                        mVar.f8779N = typedArray.getString(index);
                        break;
                    case 2:
                        mVar.f8780O = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e(v.i.f7555a, "unused attribute 0x" + Integer.toHexString(index) + "   " + f8803n.get(index));
                        break;
                    case 4:
                        mVar.f8777L = typedArray.getString(index);
                        break;
                    case 5:
                        mVar.f8769D = typedArray.getFloat(index, mVar.f8769D);
                        break;
                    case 6:
                        mVar.f8781P = typedArray.getResourceId(index, mVar.f8781P);
                        break;
                    case 7:
                        if (s.f8919a2) {
                            int resourceId = typedArray.getResourceId(index, mVar.f8557b);
                            mVar.f8557b = resourceId;
                            if (resourceId == -1) {
                                mVar.f8558c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            mVar.f8558c = typedArray.getString(index);
                            break;
                        } else {
                            mVar.f8557b = typedArray.getResourceId(index, mVar.f8557b);
                            break;
                        }
                    case 8:
                        int integer = typedArray.getInteger(index, mVar.f8556a);
                        mVar.f8556a = integer;
                        mVar.f8787V = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        mVar.f8782Q = typedArray.getResourceId(index, mVar.f8782Q);
                        break;
                    case 10:
                        mVar.f8789X = typedArray.getBoolean(index, mVar.f8789X);
                        break;
                    case 11:
                        mVar.f8778M = typedArray.getResourceId(index, mVar.f8778M);
                        break;
                    case 12:
                        mVar.f8772G = typedArray.getResourceId(index, mVar.f8772G);
                        break;
                    case 13:
                        mVar.f8770E = typedArray.getResourceId(index, mVar.f8770E);
                        break;
                    case 14:
                        mVar.f8771F = typedArray.getResourceId(index, mVar.f8771F);
                        break;
                }
            }
        }
    }

    public m() {
        int i4 = f.f8535f;
        this.f8770E = i4;
        this.f8771F = i4;
        this.f8772G = i4;
        this.f8773H = new RectF();
        this.f8774I = new RectF();
        this.f8775J = new HashMap<>();
        this.f8776K = -1;
        this.f8777L = null;
        int i5 = f.f8535f;
        this.f8778M = i5;
        this.f8779N = null;
        this.f8780O = null;
        this.f8781P = i5;
        this.f8782Q = i5;
        this.f8783R = null;
        this.f8784S = true;
        this.f8785T = true;
        this.f8786U = true;
        this.f8787V = Float.NaN;
        this.f8789X = false;
        this.f8559d = 5;
        this.f8560e = new HashMap<>();
    }

    private void B(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            C(str, view);
            return;
        }
        if (this.f8775J.containsKey(str)) {
            method = this.f8775J.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, new Class[0]);
                this.f8775J.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f8775J.put(str, null);
                Log.e(v.i.f7555a, "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + c.k(view));
                return;
            }
        }
        try {
            method.invoke(view, new Object[0]);
        } catch (Exception unused2) {
            Log.e(v.i.f7555a, "Exception in call \"" + this.f8777L + "\"on class " + view.getClass().getSimpleName() + " " + c.k(view));
        }
    }

    private void C(String str, View view) {
        boolean z3;
        if (str.length() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f8560e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z3 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f8560e.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.a(view);
                }
            }
        }
    }

    private void E(RectF rectF, View view, boolean z3) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z3) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.A(float, android.view.View):void");
    }

    int D() {
        return this.f8776K;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> hashMap) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new m().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        m mVar = (m) fVar;
        this.f8776K = mVar.f8776K;
        this.f8777L = mVar.f8777L;
        this.f8778M = mVar.f8778M;
        this.f8779N = mVar.f8779N;
        this.f8780O = mVar.f8780O;
        this.f8781P = mVar.f8781P;
        this.f8782Q = mVar.f8782Q;
        this.f8783R = mVar.f8783R;
        this.f8769D = mVar.f8769D;
        this.f8784S = mVar.f8784S;
        this.f8785T = mVar.f8785T;
        this.f8786U = mVar.f8786U;
        this.f8787V = mVar.f8787V;
        this.f8788W = mVar.f8788W;
        this.f8789X = mVar.f8789X;
        this.f8773H = mVar.f8773H;
        this.f8774I = mVar.f8774I;
        this.f8775J = mVar.f8775J;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, h.m.xg), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c4 = 0;
                    break;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c4 = 1;
                    break;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c4 = 2;
                    break;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c4 = 3;
                    break;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c4 = 4;
                    break;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c4 = 5;
                    break;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c4 = 6;
                    break;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    c4 = 7;
                    break;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c4 = 11;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                this.f8780O = obj.toString();
                return;
            case 1:
                this.f8771F = n(obj);
                return;
            case 2:
                this.f8782Q = n(obj);
                return;
            case 3:
                this.f8781P = n(obj);
                return;
            case 4:
                this.f8779N = obj.toString();
                return;
            case 5:
                this.f8783R = (View) obj;
                return;
            case 6:
                this.f8770E = n(obj);
                return;
            case 7:
                this.f8777L = obj.toString();
                return;
            case '\b':
                this.f8769D = m(obj);
                return;
            case '\t':
                this.f8772G = n(obj);
                return;
            case '\n':
                this.f8789X = l(obj);
                return;
            case 11:
                this.f8778M = n(obj);
                return;
            default:
                return;
        }
    }
}
