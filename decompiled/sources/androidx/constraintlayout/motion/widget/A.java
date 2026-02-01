package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class A {

    /* renamed from: A, reason: collision with root package name */
    public static final String f8447A = "ConstraintOverride";

    /* renamed from: B, reason: collision with root package name */
    public static final String f8448B = "CustomAttribute";

    /* renamed from: C, reason: collision with root package name */
    public static final String f8449C = "CustomMethod";

    /* renamed from: D, reason: collision with root package name */
    private static final int f8450D = -1;

    /* renamed from: E, reason: collision with root package name */
    public static final int f8451E = 1;

    /* renamed from: F, reason: collision with root package name */
    public static final int f8452F = 2;

    /* renamed from: G, reason: collision with root package name */
    public static final int f8453G = 3;

    /* renamed from: H, reason: collision with root package name */
    public static final int f8454H = 4;

    /* renamed from: I, reason: collision with root package name */
    public static final int f8455I = 5;

    /* renamed from: J, reason: collision with root package name */
    static final int f8456J = 0;

    /* renamed from: K, reason: collision with root package name */
    static final int f8457K = 1;

    /* renamed from: L, reason: collision with root package name */
    static final int f8458L = 2;

    /* renamed from: M, reason: collision with root package name */
    private static final int f8459M = -1;

    /* renamed from: N, reason: collision with root package name */
    private static final int f8460N = -2;

    /* renamed from: O, reason: collision with root package name */
    static final int f8461O = 0;

    /* renamed from: P, reason: collision with root package name */
    static final int f8462P = 1;

    /* renamed from: Q, reason: collision with root package name */
    static final int f8463Q = 2;

    /* renamed from: R, reason: collision with root package name */
    static final int f8464R = 3;

    /* renamed from: S, reason: collision with root package name */
    static final int f8465S = 4;

    /* renamed from: T, reason: collision with root package name */
    static final int f8466T = 5;

    /* renamed from: U, reason: collision with root package name */
    static final int f8467U = 6;

    /* renamed from: x, reason: collision with root package name */
    private static String f8468x = "ViewTransition";

    /* renamed from: y, reason: collision with root package name */
    public static final String f8469y = "ViewTransition";

    /* renamed from: z, reason: collision with root package name */
    public static final String f8470z = "KeyFrameSet";

    /* renamed from: a, reason: collision with root package name */
    androidx.constraintlayout.widget.d f8471a;

    /* renamed from: b, reason: collision with root package name */
    private int f8472b;

    /* renamed from: f, reason: collision with root package name */
    int f8476f;

    /* renamed from: g, reason: collision with root package name */
    i f8477g;

    /* renamed from: h, reason: collision with root package name */
    d.a f8478h;

    /* renamed from: k, reason: collision with root package name */
    private int f8481k;

    /* renamed from: l, reason: collision with root package name */
    private String f8482l;

    /* renamed from: p, reason: collision with root package name */
    Context f8486p;

    /* renamed from: c, reason: collision with root package name */
    private int f8473c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8474d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f8475e = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f8479i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f8480j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f8483m = 0;

    /* renamed from: n, reason: collision with root package name */
    private String f8484n = null;

    /* renamed from: o, reason: collision with root package name */
    private int f8485o = -1;

    /* renamed from: q, reason: collision with root package name */
    private int f8487q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f8488r = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f8489s = -1;

    /* renamed from: t, reason: collision with root package name */
    private int f8490t = -1;

    /* renamed from: u, reason: collision with root package name */
    private int f8491u = -1;

    /* renamed from: v, reason: collision with root package name */
    private int f8492v = -1;

    /* renamed from: w, reason: collision with root package name */
    private int f8493w = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.constraintlayout.core.motion.utils.d f8494a;

        a(A a4, androidx.constraintlayout.core.motion.utils.d dVar) {
            this.f8494a = dVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) this.f8494a.a(f4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f8495a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8496b;

        /* renamed from: c, reason: collision with root package name */
        long f8497c;

        /* renamed from: d, reason: collision with root package name */
        o f8498d;

        /* renamed from: e, reason: collision with root package name */
        int f8499e;

        /* renamed from: f, reason: collision with root package name */
        int f8500f;

        /* renamed from: h, reason: collision with root package name */
        B f8502h;

        /* renamed from: i, reason: collision with root package name */
        Interpolator f8503i;

        /* renamed from: k, reason: collision with root package name */
        float f8505k;

        /* renamed from: l, reason: collision with root package name */
        float f8506l;

        /* renamed from: m, reason: collision with root package name */
        long f8507m;

        /* renamed from: o, reason: collision with root package name */
        boolean f8509o;

        /* renamed from: g, reason: collision with root package name */
        androidx.constraintlayout.core.motion.utils.g f8501g = new androidx.constraintlayout.core.motion.utils.g();

        /* renamed from: j, reason: collision with root package name */
        boolean f8504j = false;

        /* renamed from: n, reason: collision with root package name */
        Rect f8508n = new Rect();

        b(B b4, o oVar, int i4, int i5, int i6, Interpolator interpolator, int i7, int i8) {
            float f4;
            this.f8509o = false;
            this.f8502h = b4;
            this.f8498d = oVar;
            this.f8499e = i4;
            this.f8500f = i5;
            long nanoTime = System.nanoTime();
            this.f8497c = nanoTime;
            this.f8507m = nanoTime;
            this.f8502h.c(this);
            this.f8503i = interpolator;
            this.f8495a = i7;
            this.f8496b = i8;
            if (i6 == 3) {
                this.f8509o = true;
            }
            if (i4 == 0) {
                f4 = Float.MAX_VALUE;
            } else {
                f4 = 1.0f / i4;
            }
            this.f8506l = f4;
            a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            if (this.f8504j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            float interpolation;
            long nanoTime = System.nanoTime();
            long j4 = nanoTime - this.f8507m;
            this.f8507m = nanoTime;
            float f4 = this.f8505k + (((float) (j4 * 1.0E-6d)) * this.f8506l);
            this.f8505k = f4;
            if (f4 >= 1.0f) {
                this.f8505k = 1.0f;
            }
            Interpolator interpolator = this.f8503i;
            if (interpolator == null) {
                interpolation = this.f8505k;
            } else {
                interpolation = interpolator.getInterpolation(this.f8505k);
            }
            float f5 = interpolation;
            o oVar = this.f8498d;
            boolean L3 = oVar.L(oVar.f8879b, f5, nanoTime, this.f8501g);
            if (this.f8505k >= 1.0f) {
                if (this.f8495a != -1) {
                    this.f8498d.J().setTag(this.f8495a, Long.valueOf(System.nanoTime()));
                }
                if (this.f8496b != -1) {
                    this.f8498d.J().setTag(this.f8496b, null);
                }
                if (!this.f8509o) {
                    this.f8502h.k(this);
                }
            }
            if (this.f8505k < 1.0f || L3) {
                this.f8502h.g();
            }
        }

        void c() {
            float interpolation;
            long nanoTime = System.nanoTime();
            long j4 = nanoTime - this.f8507m;
            this.f8507m = nanoTime;
            float f4 = this.f8505k - (((float) (j4 * 1.0E-6d)) * this.f8506l);
            this.f8505k = f4;
            if (f4 < 0.0f) {
                this.f8505k = 0.0f;
            }
            Interpolator interpolator = this.f8503i;
            if (interpolator == null) {
                interpolation = this.f8505k;
            } else {
                interpolation = interpolator.getInterpolation(this.f8505k);
            }
            float f5 = interpolation;
            o oVar = this.f8498d;
            boolean L3 = oVar.L(oVar.f8879b, f5, nanoTime, this.f8501g);
            if (this.f8505k <= 0.0f) {
                if (this.f8495a != -1) {
                    this.f8498d.J().setTag(this.f8495a, Long.valueOf(System.nanoTime()));
                }
                if (this.f8496b != -1) {
                    this.f8498d.J().setTag(this.f8496b, null);
                }
                this.f8502h.k(this);
            }
            if (this.f8505k > 0.0f || L3) {
                this.f8502h.g();
            }
        }

        public void d(int i4, float f4, float f5) {
            if (i4 != 1) {
                if (i4 == 2) {
                    this.f8498d.J().getHitRect(this.f8508n);
                    if (!this.f8508n.contains((int) f4, (int) f5) && !this.f8504j) {
                        e(true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f8504j) {
                e(true);
            }
        }

        void e(boolean z3) {
            int i4;
            float f4;
            this.f8504j = z3;
            if (z3 && (i4 = this.f8500f) != -1) {
                if (i4 == 0) {
                    f4 = Float.MAX_VALUE;
                } else {
                    f4 = 1.0f / i4;
                }
                this.f8506l = f4;
            }
            this.f8502h.g();
            this.f8507m = System.nanoTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0051. Please report as an issue. */
    public A(Context context, XmlPullParser xmlPullParser) {
        char c4;
        this.f8486p = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        continue;
                    } else if (f8469y.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(f8447A)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals(f8470z)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 61998586:
                            if (name.equals(f8469y)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 366511058:
                            if (name.equals(f8449C)) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals(f8448B)) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    if (c4 != 0) {
                        if (c4 != 1) {
                            if (c4 != 2) {
                                if (c4 != 3 && c4 != 4) {
                                    Log.e(f8468x, c.f() + " unknown tag " + name);
                                    Log.e(f8468x, ".xml:" + xmlPullParser.getLineNumber());
                                } else {
                                    ConstraintAttribute.q(context, xmlPullParser, this.f8478h.f9842g);
                                }
                            } else {
                                this.f8478h = androidx.constraintlayout.widget.d.w(context, xmlPullParser);
                            }
                        } else {
                            this.f8477g = new i(context, xmlPullParser);
                        }
                    } else {
                        n(context, xmlPullParser);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View[] viewArr) {
        if (this.f8487q != -1) {
            for (View view : viewArr) {
                view.setTag(this.f8487q, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f8488r != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f8488r, null);
            }
        }
    }

    private void n(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Ao);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == h.m.Bo) {
                this.f8472b = obtainStyledAttributes.getResourceId(index, this.f8472b);
            } else if (index == h.m.Jo) {
                if (s.f8919a2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f8481k);
                    this.f8481k = resourceId;
                    if (resourceId == -1) {
                        this.f8482l = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f8482l = obtainStyledAttributes.getString(index);
                } else {
                    this.f8481k = obtainStyledAttributes.getResourceId(index, this.f8481k);
                }
            } else if (index == h.m.Ko) {
                this.f8473c = obtainStyledAttributes.getInt(index, this.f8473c);
            } else if (index == h.m.No) {
                this.f8474d = obtainStyledAttributes.getBoolean(index, this.f8474d);
            } else if (index == h.m.Lo) {
                this.f8475e = obtainStyledAttributes.getInt(index, this.f8475e);
            } else if (index == h.m.Fo) {
                this.f8479i = obtainStyledAttributes.getInt(index, this.f8479i);
            } else if (index == h.m.Oo) {
                this.f8480j = obtainStyledAttributes.getInt(index, this.f8480j);
            } else if (index == h.m.Po) {
                this.f8476f = obtainStyledAttributes.getInt(index, this.f8476f);
            } else if (index == h.m.Io) {
                int i5 = obtainStyledAttributes.peekValue(index).type;
                if (i5 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f8485o = resourceId2;
                    if (resourceId2 != -1) {
                        this.f8483m = -2;
                    }
                } else if (i5 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f8484n = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f8485o = obtainStyledAttributes.getResourceId(index, -1);
                        this.f8483m = -2;
                    } else {
                        this.f8483m = -1;
                    }
                } else {
                    this.f8483m = obtainStyledAttributes.getInteger(index, this.f8483m);
                }
            } else if (index == h.m.Mo) {
                this.f8487q = obtainStyledAttributes.getResourceId(index, this.f8487q);
            } else if (index == h.m.Eo) {
                this.f8488r = obtainStyledAttributes.getResourceId(index, this.f8488r);
            } else if (index == h.m.Ho) {
                this.f8489s = obtainStyledAttributes.getResourceId(index, this.f8489s);
            } else if (index == h.m.Go) {
                this.f8490t = obtainStyledAttributes.getResourceId(index, this.f8490t);
            } else if (index == h.m.Do) {
                this.f8492v = obtainStyledAttributes.getResourceId(index, this.f8492v);
            } else if (index == h.m.Co) {
                this.f8491u = obtainStyledAttributes.getInteger(index, this.f8491u);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void v(u.b bVar, View view) {
        int i4 = this.f8479i;
        if (i4 != -1) {
            bVar.O(i4);
        }
        bVar.U(this.f8475e);
        bVar.Q(this.f8483m, this.f8484n, this.f8485o);
        int id = view.getId();
        i iVar = this.f8477g;
        if (iVar != null) {
            ArrayList<f> d4 = iVar.d(-1);
            i iVar2 = new i();
            Iterator<f> it = d4.iterator();
            while (it.hasNext()) {
                iVar2.c(it.next().clone().k(id));
            }
            bVar.t(iVar2);
        }
    }

    void b(B b4, s sVar, View view) {
        o oVar = new o(view);
        oVar.R(view);
        this.f8477g.a(oVar);
        oVar.a0(sVar.getWidth(), sVar.getHeight(), this.f8479i, System.nanoTime());
        new b(b4, oVar, this.f8479i, this.f8480j, this.f8473c, f(sVar.getContext()), this.f8487q, this.f8488r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(B b4, s sVar, int i4, androidx.constraintlayout.widget.d dVar, final View... viewArr) {
        if (this.f8474d) {
            return;
        }
        int i5 = this.f8476f;
        if (i5 == 2) {
            b(b4, sVar, viewArr[0]);
            return;
        }
        if (i5 == 1) {
            for (int i6 : sVar.getConstraintSetIds()) {
                if (i6 != i4) {
                    androidx.constraintlayout.widget.d E02 = sVar.E0(i6);
                    for (View view : viewArr) {
                        d.a k02 = E02.k0(view.getId());
                        d.a aVar = this.f8478h;
                        if (aVar != null) {
                            aVar.h(k02);
                            k02.f9842g.putAll(this.f8478h.f9842g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        dVar2.I(dVar);
        for (View view2 : viewArr) {
            d.a k03 = dVar2.k0(view2.getId());
            d.a aVar2 = this.f8478h;
            if (aVar2 != null) {
                aVar2.h(k03);
                k03.f9842g.putAll(this.f8478h.f9842g);
            }
        }
        sVar.o1(i4, dVar2);
        sVar.o1(h.g.P3, dVar);
        sVar.I(h.g.P3, -1, -1);
        u.b bVar = new u.b(-1, sVar.f8986p0, h.g.P3, i4);
        for (View view3 : viewArr) {
            v(bVar, view3);
        }
        sVar.setTransition(bVar);
        sVar.h1(new Runnable() { // from class: androidx.constraintlayout.motion.widget.z
            @Override // java.lang.Runnable
            public final void run() {
                A.this.l(viewArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(View view) {
        boolean z3;
        boolean z4;
        int i4 = this.f8489s;
        if (i4 == -1 || view.getTag(i4) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = this.f8490t;
        if (i5 == -1 || view.getTag(i5) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f8472b;
    }

    Interpolator f(Context context) {
        int i4 = this.f8483m;
        if (i4 != -2) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 != 5) {
                                    if (i4 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, androidx.constraintlayout.core.motion.utils.d.c(this.f8484n));
        }
        return AnimationUtils.loadInterpolator(context, this.f8485o);
    }

    public int g() {
        return this.f8491u;
    }

    public int h() {
        return this.f8493w;
    }

    public int i() {
        return this.f8492v;
    }

    public int j() {
        return this.f8473c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return !this.f8474d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f8481k == -1 && this.f8482l == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f8481k) {
            return true;
        }
        if (this.f8482l == null || !(view.getLayoutParams() instanceof ConstraintLayout.b) || (str = ((ConstraintLayout.b) view.getLayoutParams()).f9524c0) == null || !str.matches(this.f8482l)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z3) {
        this.f8474d = !z3;
    }

    void p(int i4) {
        this.f8472b = i4;
    }

    public void q(int i4) {
        this.f8491u = i4;
    }

    public void r(int i4) {
        this.f8493w = i4;
    }

    public void s(int i4) {
        this.f8492v = i4;
    }

    public void t(int i4) {
        this.f8473c = i4;
    }

    public String toString() {
        return "ViewTransition(" + c.i(this.f8486p, this.f8472b) + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i4) {
        int i5 = this.f8473c;
        if (i5 == 1) {
            if (i4 != 0) {
                return false;
            }
            return true;
        }
        if (i5 == 2) {
            if (i4 != 1) {
                return false;
            }
            return true;
        }
        if (i5 != 3 || i4 != 0) {
            return false;
        }
        return true;
    }
}
