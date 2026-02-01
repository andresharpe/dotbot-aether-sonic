package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.W;
import androidx.constraintlayout.motion.widget.p;
import androidx.constraintlayout.motion.widget.s;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.h;
import androidx.recyclerview.widget.n;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends p {

    /* renamed from: p0, reason: collision with root package name */
    private static final boolean f8320p0 = false;

    /* renamed from: q0, reason: collision with root package name */
    private static final String f8321q0 = "Carousel";

    /* renamed from: r0, reason: collision with root package name */
    public static final int f8322r0 = 1;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f8323s0 = 2;

    /* renamed from: S, reason: collision with root package name */
    private InterfaceC0062b f8324S;

    /* renamed from: T, reason: collision with root package name */
    private final ArrayList<View> f8325T;

    /* renamed from: U, reason: collision with root package name */
    private int f8326U;

    /* renamed from: V, reason: collision with root package name */
    private int f8327V;

    /* renamed from: W, reason: collision with root package name */
    private s f8328W;

    /* renamed from: a0, reason: collision with root package name */
    private int f8329a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f8330b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f8331c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f8332d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f8333e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f8334f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f8335g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f8336h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f8337i0;

    /* renamed from: j0, reason: collision with root package name */
    private int f8338j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f8339k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f8340l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f8341m0;

    /* renamed from: n0, reason: collision with root package name */
    int f8342n0;

    /* renamed from: o0, reason: collision with root package name */
    Runnable f8343o0;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0061a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ float f8345E;

            RunnableC0061a(float f4) {
                this.f8345E = f4;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f8328W.e1(5, 1.0f, this.f8345E);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f8328W.setProgress(0.0f);
            b.this.c0();
            b.this.f8324S.a(b.this.f8327V);
            float velocity = b.this.f8328W.getVelocity();
            if (b.this.f8338j0 == 2 && velocity > b.this.f8339k0 && b.this.f8327V < b.this.f8324S.count() - 1) {
                float f4 = velocity * b.this.f8335g0;
                if (b.this.f8327V == 0 && b.this.f8326U > b.this.f8327V) {
                    return;
                }
                if (b.this.f8327V == b.this.f8324S.count() - 1 && b.this.f8326U < b.this.f8327V) {
                    return;
                }
                b.this.f8328W.post(new RunnableC0061a(f4));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.helper.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0062b {
        void a(int i4);

        void b(View view, int i4);

        int count();
    }

    public b(Context context) {
        super(context);
        this.f8324S = null;
        this.f8325T = new ArrayList<>();
        this.f8326U = 0;
        this.f8327V = 0;
        this.f8329a0 = -1;
        this.f8330b0 = false;
        this.f8331c0 = -1;
        this.f8332d0 = -1;
        this.f8333e0 = -1;
        this.f8334f0 = -1;
        this.f8335g0 = 0.9f;
        this.f8336h0 = 0;
        this.f8337i0 = 4;
        this.f8338j0 = 1;
        this.f8339k0 = 2.0f;
        this.f8340l0 = -1;
        this.f8341m0 = n.f.f18255b;
        this.f8342n0 = -1;
        this.f8343o0 = new a();
    }

    private void V(boolean z3) {
        Iterator<u.b> it = this.f8328W.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().P(z3);
        }
    }

    private boolean W(int i4, boolean z3) {
        s sVar;
        u.b I02;
        if (i4 == -1 || (sVar = this.f8328W) == null || (I02 = sVar.I0(i4)) == null || z3 == I02.K()) {
            return false;
        }
        I02.P(z3);
        return true;
    }

    private void X(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.G3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.J3) {
                    this.f8329a0 = obtainStyledAttributes.getResourceId(index, this.f8329a0);
                } else if (index == h.m.H3) {
                    this.f8331c0 = obtainStyledAttributes.getResourceId(index, this.f8331c0);
                } else if (index == h.m.K3) {
                    this.f8332d0 = obtainStyledAttributes.getResourceId(index, this.f8332d0);
                } else if (index == h.m.I3) {
                    this.f8337i0 = obtainStyledAttributes.getInt(index, this.f8337i0);
                } else if (index == h.m.N3) {
                    this.f8333e0 = obtainStyledAttributes.getResourceId(index, this.f8333e0);
                } else if (index == h.m.M3) {
                    this.f8334f0 = obtainStyledAttributes.getResourceId(index, this.f8334f0);
                } else if (index == h.m.P3) {
                    this.f8335g0 = obtainStyledAttributes.getFloat(index, this.f8335g0);
                } else if (index == h.m.O3) {
                    this.f8338j0 = obtainStyledAttributes.getInt(index, this.f8338j0);
                } else if (index == h.m.Q3) {
                    this.f8339k0 = obtainStyledAttributes.getFloat(index, this.f8339k0);
                } else if (index == h.m.L3) {
                    this.f8330b0 = obtainStyledAttributes.getBoolean(index, this.f8330b0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        this.f8328W.setTransitionDuration(this.f8341m0);
        if (this.f8340l0 < this.f8327V) {
            this.f8328W.k1(this.f8333e0, this.f8341m0);
        } else {
            this.f8328W.k1(this.f8334f0, this.f8341m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        InterfaceC0062b interfaceC0062b = this.f8324S;
        if (interfaceC0062b == null || this.f8328W == null || interfaceC0062b.count() == 0) {
            return;
        }
        int size = this.f8325T.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f8325T.get(i4);
            int i5 = (this.f8327V + i4) - this.f8336h0;
            if (this.f8330b0) {
                if (i5 < 0) {
                    int i6 = this.f8337i0;
                    if (i6 != 4) {
                        e0(view, i6);
                    } else {
                        e0(view, 0);
                    }
                    if (i5 % this.f8324S.count() == 0) {
                        this.f8324S.b(view, 0);
                    } else {
                        InterfaceC0062b interfaceC0062b2 = this.f8324S;
                        interfaceC0062b2.b(view, interfaceC0062b2.count() + (i5 % this.f8324S.count()));
                    }
                } else if (i5 >= this.f8324S.count()) {
                    if (i5 == this.f8324S.count()) {
                        i5 = 0;
                    } else if (i5 > this.f8324S.count()) {
                        i5 %= this.f8324S.count();
                    }
                    int i7 = this.f8337i0;
                    if (i7 != 4) {
                        e0(view, i7);
                    } else {
                        e0(view, 0);
                    }
                    this.f8324S.b(view, i5);
                } else {
                    e0(view, 0);
                    this.f8324S.b(view, i5);
                }
            } else if (i5 < 0) {
                e0(view, this.f8337i0);
            } else if (i5 >= this.f8324S.count()) {
                e0(view, this.f8337i0);
            } else {
                e0(view, 0);
                this.f8324S.b(view, i5);
            }
        }
        int i8 = this.f8340l0;
        if (i8 != -1 && i8 != this.f8327V) {
            this.f8328W.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.Z();
                }
            });
        } else if (i8 == this.f8327V) {
            this.f8340l0 = -1;
        }
        if (this.f8331c0 != -1 && this.f8332d0 != -1) {
            if (this.f8330b0) {
                return;
            }
            int count = this.f8324S.count();
            if (this.f8327V == 0) {
                W(this.f8331c0, false);
            } else {
                W(this.f8331c0, true);
                this.f8328W.setTransition(this.f8331c0);
            }
            if (this.f8327V == count - 1) {
                W(this.f8332d0, false);
                return;
            } else {
                W(this.f8332d0, true);
                this.f8328W.setTransition(this.f8332d0);
                return;
            }
        }
        Log.w(f8321q0, "No backward or forward transitions defined for Carousel!");
    }

    private boolean d0(int i4, View view, int i5) {
        d.a k02;
        androidx.constraintlayout.widget.d E02 = this.f8328W.E0(i4);
        if (E02 == null || (k02 = E02.k0(view.getId())) == null) {
            return false;
        }
        k02.f9838c.f10030c = 1;
        view.setVisibility(i5);
        return true;
    }

    private boolean e0(View view, int i4) {
        s sVar = this.f8328W;
        if (sVar == null) {
            return false;
        }
        boolean z3 = false;
        for (int i5 : sVar.getConstraintSetIds()) {
            z3 |= d0(i5, view, i4);
        }
        return z3;
    }

    public void Y(int i4) {
        this.f8327V = Math.max(0, Math.min(getCount() - 1, i4));
        a0();
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.s.l
    public void a(s sVar, int i4, int i5, float f4) {
        this.f8342n0 = i4;
    }

    public void a0() {
        int size = this.f8325T.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = this.f8325T.get(i4);
            if (this.f8324S.count() == 0) {
                e0(view, this.f8337i0);
            } else {
                e0(view, 0);
            }
        }
        this.f8328W.W0();
        c0();
    }

    public void b0(int i4, int i5) {
        this.f8340l0 = Math.max(0, Math.min(getCount() - 1, i4));
        int max = Math.max(0, i5);
        this.f8341m0 = max;
        this.f8328W.setTransitionDuration(max);
        if (i4 < this.f8327V) {
            this.f8328W.k1(this.f8333e0, this.f8341m0);
        } else {
            this.f8328W.k1(this.f8334f0, this.f8341m0);
        }
    }

    public int getCount() {
        InterfaceC0062b interfaceC0062b = this.f8324S;
        if (interfaceC0062b != null) {
            return interfaceC0062b.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f8327V;
    }

    @Override // androidx.constraintlayout.motion.widget.p, androidx.constraintlayout.motion.widget.s.l
    public void k(s sVar, int i4) {
        int i5 = this.f8327V;
        this.f8326U = i5;
        if (i4 == this.f8334f0) {
            this.f8327V = i5 + 1;
        } else if (i4 == this.f8333e0) {
            this.f8327V = i5 - 1;
        }
        if (this.f8330b0) {
            if (this.f8327V >= this.f8324S.count()) {
                this.f8327V = 0;
            }
            if (this.f8327V < 0) {
                this.f8327V = this.f8324S.count() - 1;
            }
        } else {
            if (this.f8327V >= this.f8324S.count()) {
                this.f8327V = this.f8324S.count() - 1;
            }
            if (this.f8327V < 0) {
                this.f8327V = 0;
            }
        }
        if (this.f8326U != this.f8327V) {
            this.f8328W.post(this.f8343o0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.a, android.view.View
    @W(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof s) {
            s sVar = (s) getParent();
            for (int i4 = 0; i4 < this.f9640F; i4++) {
                int i5 = this.f9639E[i4];
                View q4 = sVar.q(i5);
                if (this.f8329a0 == i5) {
                    this.f8336h0 = i4;
                }
                this.f8325T.add(q4);
            }
            this.f8328W = sVar;
            if (this.f8338j0 == 2) {
                u.b I02 = sVar.I0(this.f8332d0);
                if (I02 != null) {
                    I02.T(5);
                }
                u.b I03 = this.f8328W.I0(this.f8331c0);
                if (I03 != null) {
                    I03.T(5);
                }
            }
            c0();
        }
    }

    public void setAdapter(InterfaceC0062b interfaceC0062b) {
        this.f8324S = interfaceC0062b;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8324S = null;
        this.f8325T = new ArrayList<>();
        this.f8326U = 0;
        this.f8327V = 0;
        this.f8329a0 = -1;
        this.f8330b0 = false;
        this.f8331c0 = -1;
        this.f8332d0 = -1;
        this.f8333e0 = -1;
        this.f8334f0 = -1;
        this.f8335g0 = 0.9f;
        this.f8336h0 = 0;
        this.f8337i0 = 4;
        this.f8338j0 = 1;
        this.f8339k0 = 2.0f;
        this.f8340l0 = -1;
        this.f8341m0 = n.f.f18255b;
        this.f8342n0 = -1;
        this.f8343o0 = new a();
        X(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f8324S = null;
        this.f8325T = new ArrayList<>();
        this.f8326U = 0;
        this.f8327V = 0;
        this.f8329a0 = -1;
        this.f8330b0 = false;
        this.f8331c0 = -1;
        this.f8332d0 = -1;
        this.f8333e0 = -1;
        this.f8334f0 = -1;
        this.f8335g0 = 0.9f;
        this.f8336h0 = 0;
        this.f8337i0 = 4;
        this.f8338j0 = 1;
        this.f8339k0 = 2.0f;
        this.f8340l0 = -1;
        this.f8341m0 = n.f.f18255b;
        this.f8342n0 = -1;
        this.f8343o0 = new a();
        X(context, attributeSet);
    }
}
