package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class j extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: b0, reason: collision with root package name */
    public static final int f21482b0 = 1;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f21483c0 = 2;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f21484d0 = -1;

    /* renamed from: E, reason: collision with root package name */
    private final Matrix f21485E = new Matrix();

    /* renamed from: F, reason: collision with root package name */
    private com.airbnb.lottie.g f21486F;

    /* renamed from: G, reason: collision with root package name */
    private final com.airbnb.lottie.utils.g f21487G;

    /* renamed from: H, reason: collision with root package name */
    private float f21488H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21489I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f21490J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f21491K;

    /* renamed from: L, reason: collision with root package name */
    private final ArrayList<r> f21492L;

    /* renamed from: M, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f21493M;

    /* renamed from: N, reason: collision with root package name */
    @P
    private com.airbnb.lottie.manager.b f21494N;

    /* renamed from: O, reason: collision with root package name */
    @P
    private String f21495O;

    /* renamed from: P, reason: collision with root package name */
    @P
    private com.airbnb.lottie.d f21496P;

    /* renamed from: Q, reason: collision with root package name */
    @P
    private com.airbnb.lottie.manager.a f21497Q;

    /* renamed from: R, reason: collision with root package name */
    @P
    com.airbnb.lottie.c f21498R;

    /* renamed from: S, reason: collision with root package name */
    @P
    v f21499S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21500T;

    /* renamed from: U, reason: collision with root package name */
    @P
    private com.airbnb.lottie.model.layer.c f21501U;

    /* renamed from: V, reason: collision with root package name */
    private int f21502V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f21503W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f21504X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f21505Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f21506Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f21507a0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21508a;

        a(String str) {
            this.f21508a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.s0(this.f21508a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f21512c;

        b(String str, String str2, boolean z3) {
            this.f21510a = str;
            this.f21511b = str2;
            this.f21512c = z3;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.t0(this.f21510a, this.f21511b, this.f21512c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21514a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21515b;

        c(int i4, int i5) {
            this.f21514a = i4;
            this.f21515b = i5;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.r0(this.f21514a, this.f21515b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f21517a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f21518b;

        d(float f4, float f5) {
            this.f21517a = f4;
            this.f21518b = f5;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.u0(this.f21517a, this.f21518b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21520a;

        e(int i4) {
            this.f21520a = i4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.k0(this.f21520a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f21522a;

        f(float f4) {
            this.f21522a = f4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.A0(this.f21522a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.model.d f21524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f21525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f21526c;

        g(com.airbnb.lottie.model.d dVar, Object obj, com.airbnb.lottie.value.j jVar) {
            this.f21524a = dVar;
            this.f21525b = obj;
            this.f21526c = jVar;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.i(this.f21524a, this.f21525b, this.f21526c);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    class h<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f21528d;

        h(com.airbnb.lottie.value.l lVar) {
            this.f21528d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f21528d.a(bVar);
        }
    }

    /* loaded from: classes.dex */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (j.this.f21501U != null) {
                j.this.f21501U.L(j.this.f21487G.i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0199j implements r {
        C0199j() {
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements r {
        k() {
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21533a;

        l(int i4) {
            this.f21533a = i4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.v0(this.f21533a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f21535a;

        m(float f4) {
            this.f21535a = f4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.x0(this.f21535a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class n implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21537a;

        n(int i4) {
            this.f21537a = i4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.o0(this.f21537a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f21539a;

        o(float f4) {
            this.f21539a = f4;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.q0(this.f21539a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class p implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21541a;

        p(String str) {
            this.f21541a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.w0(this.f21541a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class q implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21543a;

        q(String str) {
            this.f21543a = str;
        }

        @Override // com.airbnb.lottie.j.r
        public void a(com.airbnb.lottie.g gVar) {
            j.this.p0(this.f21543a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface r {
        void a(com.airbnb.lottie.g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface s {
    }

    public j() {
        com.airbnb.lottie.utils.g gVar = new com.airbnb.lottie.utils.g();
        this.f21487G = gVar;
        this.f21488H = 1.0f;
        this.f21489I = true;
        this.f21490J = false;
        this.f21491K = false;
        this.f21492L = new ArrayList<>();
        i iVar = new i();
        this.f21493M = iVar;
        this.f21502V = 255;
        this.f21506Z = true;
        this.f21507a0 = false;
        gVar.addUpdateListener(iVar);
    }

    private com.airbnb.lottie.manager.a A() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f21497Q == null) {
            this.f21497Q = new com.airbnb.lottie.manager.a(getCallback(), this.f21498R);
        }
        return this.f21497Q;
    }

    private com.airbnb.lottie.manager.b D() {
        if (getCallback() == null) {
            return null;
        }
        com.airbnb.lottie.manager.b bVar = this.f21494N;
        if (bVar != null && !bVar.b(z())) {
            this.f21494N = null;
        }
        if (this.f21494N == null) {
            this.f21494N = new com.airbnb.lottie.manager.b(getCallback(), this.f21495O, this.f21496P, this.f21486F.j());
        }
        return this.f21494N;
    }

    private float G(@N Canvas canvas, com.airbnb.lottie.g gVar) {
        return Math.min(canvas.getWidth() / gVar.b().width(), canvas.getHeight() / gVar.b().height());
    }

    private boolean k() {
        if (!this.f21489I && !this.f21490J) {
            return false;
        }
        return true;
    }

    private float l(Rect rect) {
        return rect.width() / rect.height();
    }

    private boolean m() {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null || getBounds().isEmpty() || l(getBounds()) == l(gVar.b())) {
            return true;
        }
        return false;
    }

    private void n() {
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(this.f21486F), this.f21486F.k(), this.f21486F);
        this.f21501U = cVar;
        if (this.f21504X) {
            cVar.J(true);
        }
    }

    private void s(@N Canvas canvas) {
        if (!m()) {
            t(canvas);
        } else {
            u(canvas);
        }
    }

    private void t(Canvas canvas) {
        float f4;
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        com.airbnb.lottie.g gVar = this.f21486F;
        if (cVar != null && gVar != null) {
            Rect bounds = getBounds();
            float width = bounds.width() / gVar.b().width();
            float height = bounds.height() / gVar.b().height();
            int i4 = -1;
            if (this.f21506Z) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f4 = 1.0f / min;
                    width /= f4;
                    height /= f4;
                } else {
                    f4 = 1.0f;
                }
                if (f4 > 1.0f) {
                    i4 = canvas.save();
                    float width2 = bounds.width() / 2.0f;
                    float height2 = bounds.height() / 2.0f;
                    float f5 = width2 * min;
                    float f6 = min * height2;
                    canvas.translate(width2 - f5, height2 - f6);
                    canvas.scale(f4, f4, f5, f6);
                }
            }
            this.f21485E.reset();
            this.f21485E.preScale(width, height);
            cVar.f(canvas, this.f21485E, this.f21502V);
            if (i4 > 0) {
                canvas.restoreToCount(i4);
            }
        }
    }

    private void u(Canvas canvas) {
        float f4;
        int i4;
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        com.airbnb.lottie.g gVar = this.f21486F;
        if (cVar != null && gVar != null) {
            float f5 = this.f21488H;
            float G3 = G(canvas, gVar);
            if (f5 > G3) {
                f4 = this.f21488H / G3;
            } else {
                G3 = f5;
                f4 = 1.0f;
            }
            if (f4 > 1.0f) {
                i4 = canvas.save();
                float width = gVar.b().width() / 2.0f;
                float height = gVar.b().height() / 2.0f;
                float f6 = width * G3;
                float f7 = height * G3;
                canvas.translate((M() * width) - f6, (M() * height) - f7);
                canvas.scale(f4, f4, f6, f7);
            } else {
                i4 = -1;
            }
            this.f21485E.reset();
            this.f21485E.preScale(G3, G3);
            cVar.f(canvas, this.f21485E, this.f21502V);
            if (i4 > 0) {
                canvas.restoreToCount(i4);
            }
        }
    }

    @P
    private Context z() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    public void A0(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f21486F == null) {
            this.f21492L.add(new f(f4));
            return;
        }
        com.airbnb.lottie.e.a("Drawable#setProgress");
        this.f21487G.A(this.f21486F.h(f4));
        com.airbnb.lottie.e.b("Drawable#setProgress");
    }

    public int B() {
        return (int) this.f21487G.j();
    }

    public void B0(int i4) {
        this.f21487G.setRepeatCount(i4);
    }

    @P
    public Bitmap C(String str) {
        com.airbnb.lottie.k kVar;
        com.airbnb.lottie.manager.b D3 = D();
        if (D3 != null) {
            return D3.a(str);
        }
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            kVar = null;
        } else {
            kVar = gVar.j().get(str);
        }
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    public void C0(int i4) {
        this.f21487G.setRepeatMode(i4);
    }

    public void D0(boolean z3) {
        this.f21491K = z3;
    }

    @P
    public String E() {
        return this.f21495O;
    }

    public void E0(float f4) {
        this.f21488H = f4;
    }

    public float F() {
        return this.f21487G.l();
    }

    public void F0(float f4) {
        this.f21487G.E(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G0(Boolean bool) {
        this.f21489I = bool.booleanValue();
    }

    public float H() {
        return this.f21487G.n();
    }

    public void H0(v vVar) {
        this.f21499S = vVar;
    }

    @P
    public com.airbnb.lottie.s I() {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar != null) {
            return gVar.o();
        }
        return null;
    }

    @P
    public Bitmap I0(String str, @P Bitmap bitmap) {
        com.airbnb.lottie.manager.b D3 = D();
        if (D3 == null) {
            com.airbnb.lottie.utils.f.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap e4 = D3.e(str, bitmap);
        invalidateSelf();
        return e4;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float J() {
        return this.f21487G.i();
    }

    public boolean J0() {
        if (this.f21499S == null && this.f21486F.c().B() > 0) {
            return true;
        }
        return false;
    }

    public int K() {
        return this.f21487G.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int L() {
        return this.f21487G.getRepeatMode();
    }

    public float M() {
        return this.f21488H;
    }

    public float N() {
        return this.f21487G.o();
    }

    @P
    public v O() {
        return this.f21499S;
    }

    @P
    public Typeface P(String str, String str2) {
        com.airbnb.lottie.manager.a A3 = A();
        if (A3 != null) {
            return A3.b(str, str2);
        }
        return null;
    }

    public boolean Q() {
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        if (cVar != null && cVar.O()) {
            return true;
        }
        return false;
    }

    public boolean R() {
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        if (cVar != null && cVar.P()) {
            return true;
        }
        return false;
    }

    public boolean S() {
        com.airbnb.lottie.utils.g gVar = this.f21487G;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public boolean T() {
        return this.f21505Y;
    }

    public boolean U() {
        if (this.f21487G.getRepeatCount() == -1) {
            return true;
        }
        return false;
    }

    public boolean V() {
        return this.f21500T;
    }

    @Deprecated
    public void W(boolean z3) {
        int i4;
        com.airbnb.lottie.utils.g gVar = this.f21487G;
        if (z3) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        gVar.setRepeatCount(i4);
    }

    public void X() {
        this.f21492L.clear();
        this.f21487G.q();
    }

    @K
    public void Y() {
        float F3;
        if (this.f21501U == null) {
            this.f21492L.add(new C0199j());
            return;
        }
        if (k() || K() == 0) {
            this.f21487G.r();
        }
        if (!k()) {
            if (N() < 0.0f) {
                F3 = H();
            } else {
                F3 = F();
            }
            k0((int) F3);
            this.f21487G.h();
        }
    }

    public void Z() {
        this.f21487G.removeAllListeners();
    }

    public void a0() {
        this.f21487G.removeAllUpdateListeners();
        this.f21487G.addUpdateListener(this.f21493M);
    }

    public void b0(Animator.AnimatorListener animatorListener) {
        this.f21487G.removeListener(animatorListener);
    }

    @W(api = 19)
    public void c0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f21487G.removePauseListener(animatorPauseListener);
    }

    public void d0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21487G.removeUpdateListener(animatorUpdateListener);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        this.f21507a0 = false;
        com.airbnb.lottie.e.a("Drawable#draw");
        if (this.f21491K) {
            try {
                s(canvas);
            } catch (Throwable th) {
                com.airbnb.lottie.utils.f.c("Lottie crashed in draw!", th);
            }
        } else {
            s(canvas);
        }
        com.airbnb.lottie.e.b("Drawable#draw");
    }

    public List<com.airbnb.lottie.model.d> e0(com.airbnb.lottie.model.d dVar) {
        if (this.f21501U == null) {
            com.airbnb.lottie.utils.f.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f21501U.c(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    public void f(Animator.AnimatorListener animatorListener) {
        this.f21487G.addListener(animatorListener);
    }

    @K
    public void f0() {
        float F3;
        if (this.f21501U == null) {
            this.f21492L.add(new k());
            return;
        }
        if (k() || K() == 0) {
            this.f21487G.w();
        }
        if (!k()) {
            if (N() < 0.0f) {
                F3 = H();
            } else {
                F3 = F();
            }
            k0((int) F3);
            this.f21487G.h();
        }
    }

    @W(api = 19)
    public void g(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f21487G.addPauseListener(animatorPauseListener);
    }

    public void g0() {
        this.f21487G.x();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f21502V;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f21486F == null) {
            return -1;
        }
        return (int) (r0.b().height() * M());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f21486F == null) {
            return -1;
        }
        return (int) (r0.b().width() * M());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21487G.addUpdateListener(animatorUpdateListener);
    }

    public void h0(boolean z3) {
        this.f21505Y = z3;
    }

    public <T> void i(com.airbnb.lottie.model.d dVar, T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        if (cVar == null) {
            this.f21492L.add(new g(dVar, t3, jVar));
            return;
        }
        if (dVar == com.airbnb.lottie.model.d.f21696c) {
            cVar.h(t3, jVar);
        } else if (dVar.d() != null) {
            dVar.d().h(t3, jVar);
        } else {
            List<com.airbnb.lottie.model.d> e02 = e0(dVar);
            for (int i4 = 0; i4 < e02.size(); i4++) {
                e02.get(i4).d().h(t3, jVar);
            }
            if (!(!e02.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t3 == com.airbnb.lottie.o.f21817E) {
            A0(J());
        }
    }

    public boolean i0(com.airbnb.lottie.g gVar) {
        if (this.f21486F == gVar) {
            return false;
        }
        this.f21507a0 = false;
        p();
        this.f21486F = gVar;
        n();
        this.f21487G.y(gVar);
        A0(this.f21487G.getAnimatedFraction());
        E0(this.f21488H);
        Iterator it = new ArrayList(this.f21492L).iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(gVar);
            }
            it.remove();
        }
        this.f21492L.clear();
        gVar.z(this.f21503W);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@N Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f21507a0) {
            return;
        }
        this.f21507a0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return S();
    }

    public <T> void j(com.airbnb.lottie.model.d dVar, T t3, com.airbnb.lottie.value.l<T> lVar) {
        i(dVar, t3, new h(lVar));
    }

    public void j0(com.airbnb.lottie.c cVar) {
        this.f21498R = cVar;
        com.airbnb.lottie.manager.a aVar = this.f21497Q;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    public void k0(int i4) {
        if (this.f21486F == null) {
            this.f21492L.add(new e(i4));
        } else {
            this.f21487G.A(i4);
        }
    }

    public void l0(boolean z3) {
        this.f21490J = z3;
    }

    public void m0(com.airbnb.lottie.d dVar) {
        this.f21496P = dVar;
        com.airbnb.lottie.manager.b bVar = this.f21494N;
        if (bVar != null) {
            bVar.d(dVar);
        }
    }

    public void n0(@P String str) {
        this.f21495O = str;
    }

    public void o() {
        this.f21492L.clear();
        this.f21487G.cancel();
    }

    public void o0(int i4) {
        if (this.f21486F == null) {
            this.f21492L.add(new n(i4));
        } else {
            this.f21487G.B(i4 + 0.99f);
        }
    }

    public void p() {
        if (this.f21487G.isRunning()) {
            this.f21487G.cancel();
        }
        this.f21486F = null;
        this.f21501U = null;
        this.f21494N = null;
        this.f21487G.g();
        invalidateSelf();
    }

    public void p0(String str) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new q(str));
            return;
        }
        com.airbnb.lottie.model.g l4 = gVar.l(str);
        if (l4 != null) {
            o0((int) (l4.f21703b + l4.f21704c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void q() {
        this.f21506Z = false;
    }

    public void q0(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new o(f4));
        } else {
            o0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f21486F.f(), f4));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void r(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        if (cVar == null) {
            return;
        }
        cVar.f(canvas, matrix, this.f21502V);
    }

    public void r0(int i4, int i5) {
        if (this.f21486F == null) {
            this.f21492L.add(new c(i4, i5));
        } else {
            this.f21487G.C(i4, i5 + 0.99f);
        }
    }

    public void s0(String str) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new a(str));
            return;
        }
        com.airbnb.lottie.model.g l4 = gVar.l(str);
        if (l4 != null) {
            int i4 = (int) l4.f21703b;
            r0(i4, ((int) l4.f21704c) + i4);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@F(from = 0, to = 255) int i4) {
        this.f21502V = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        com.airbnb.lottie.utils.f.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @K
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            Y();
        }
    }

    @Override // android.graphics.drawable.Animatable
    @K
    public void stop() {
        x();
    }

    public void t0(String str, String str2, boolean z3) {
        float f4;
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new b(str, str2, z3));
            return;
        }
        com.airbnb.lottie.model.g l4 = gVar.l(str);
        if (l4 != null) {
            int i4 = (int) l4.f21703b;
            com.airbnb.lottie.model.g l5 = this.f21486F.l(str2);
            if (l5 != null) {
                float f5 = l5.f21703b;
                if (z3) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                r0(i4, (int) (f5 + f4));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void u0(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new d(f4, f5));
        } else {
            r0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f21486F.f(), f4), (int) com.airbnb.lottie.utils.i.k(this.f21486F.r(), this.f21486F.f(), f5));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void v(boolean z3) {
        if (this.f21500T == z3) {
            return;
        }
        this.f21500T = z3;
        if (this.f21486F != null) {
            n();
        }
    }

    public void v0(int i4) {
        if (this.f21486F == null) {
            this.f21492L.add(new l(i4));
        } else {
            this.f21487G.D(i4);
        }
    }

    public boolean w() {
        return this.f21500T;
    }

    public void w0(String str) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new p(str));
            return;
        }
        com.airbnb.lottie.model.g l4 = gVar.l(str);
        if (l4 != null) {
            v0((int) l4.f21703b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @K
    public void x() {
        this.f21492L.clear();
        this.f21487G.h();
    }

    public void x0(float f4) {
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar == null) {
            this.f21492L.add(new m(f4));
        } else {
            v0((int) com.airbnb.lottie.utils.i.k(gVar.r(), this.f21486F.f(), f4));
        }
    }

    public com.airbnb.lottie.g y() {
        return this.f21486F;
    }

    public void y0(boolean z3) {
        if (this.f21504X == z3) {
            return;
        }
        this.f21504X = z3;
        com.airbnb.lottie.model.layer.c cVar = this.f21501U;
        if (cVar != null) {
            cVar.J(z3);
        }
    }

    public void z0(boolean z3) {
        this.f21503W = z3;
        com.airbnb.lottie.g gVar = this.f21486F;
        if (gVar != null) {
            gVar.z(z3);
        }
    }
}
