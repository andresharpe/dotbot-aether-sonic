package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.V;
import androidx.annotation.W;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C0823k0;
import com.airbnb.lottie.t;
import e.C2046a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: d0, reason: collision with root package name */
    private static final String f21168d0 = "LottieAnimationView";

    /* renamed from: e0, reason: collision with root package name */
    private static final l<Throwable> f21169e0 = new a();

    /* renamed from: H, reason: collision with root package name */
    private final l<com.airbnb.lottie.g> f21170H;

    /* renamed from: I, reason: collision with root package name */
    private final l<Throwable> f21171I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private l<Throwable> f21172J;

    /* renamed from: K, reason: collision with root package name */
    @InterfaceC0578v
    private int f21173K;

    /* renamed from: L, reason: collision with root package name */
    private final j f21174L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21175M;

    /* renamed from: N, reason: collision with root package name */
    private String f21176N;

    /* renamed from: O, reason: collision with root package name */
    @V
    private int f21177O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21178P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f21179Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21180R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21181S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21182T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f21183U;

    /* renamed from: V, reason: collision with root package name */
    private RenderMode f21184V;

    /* renamed from: W, reason: collision with root package name */
    private final Set<n> f21185W;

    /* renamed from: a0, reason: collision with root package name */
    private int f21186a0;

    /* renamed from: b0, reason: collision with root package name */
    @P
    private q<com.airbnb.lottie.g> f21187b0;

    /* renamed from: c0, reason: collision with root package name */
    @P
    private com.airbnb.lottie.g f21188c0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements l<Throwable> {
        a() {
        }

        @Override // com.airbnb.lottie.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (com.airbnb.lottie.utils.j.k(th)) {
                com.airbnb.lottie.utils.f.f("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* loaded from: classes.dex */
    class b implements l<com.airbnb.lottie.g> {
        b() {
        }

        @Override // com.airbnb.lottie.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(com.airbnb.lottie.g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    }

    /* loaded from: classes.dex */
    class c implements l<Throwable> {
        c() {
        }

        @Override // com.airbnb.lottie.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.f21173K != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f21173K);
            }
            (LottieAnimationView.this.f21172J == null ? LottieAnimationView.f21169e0 : LottieAnimationView.this.f21172J).onResult(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21191a;

        d(int i4) {
            this.f21191a = i4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            if (LottieAnimationView.this.f21183U) {
                return com.airbnb.lottie.h.u(LottieAnimationView.this.getContext(), this.f21191a);
            }
            return com.airbnb.lottie.h.v(LottieAnimationView.this.getContext(), this.f21191a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Callable<p<com.airbnb.lottie.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21193a;

        e(String str) {
            this.f21193a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<com.airbnb.lottie.g> call() {
            if (LottieAnimationView.this.f21183U) {
                return com.airbnb.lottie.h.g(LottieAnimationView.this.getContext(), this.f21193a);
            }
            return com.airbnb.lottie.h.h(LottieAnimationView.this.getContext(), this.f21193a, null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    class f<T> extends com.airbnb.lottie.value.j<T> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f21195d;

        f(com.airbnb.lottie.value.l lVar) {
            this.f21195d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f21195d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21197a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f21197a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21197a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21197a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        String f21198E;

        /* renamed from: F, reason: collision with root package name */
        int f21199F;

        /* renamed from: G, reason: collision with root package name */
        float f21200G;

        /* renamed from: H, reason: collision with root package name */
        boolean f21201H;

        /* renamed from: I, reason: collision with root package name */
        String f21202I;

        /* renamed from: J, reason: collision with root package name */
        int f21203J;

        /* renamed from: K, reason: collision with root package name */
        int f21204K;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i4) {
                return new h[i4];
            }
        }

        /* synthetic */ h(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f21198E);
            parcel.writeFloat(this.f21200G);
            parcel.writeInt(this.f21201H ? 1 : 0);
            parcel.writeString(this.f21202I);
            parcel.writeInt(this.f21203J);
            parcel.writeInt(this.f21204K);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        private h(Parcel parcel) {
            super(parcel);
            this.f21198E = parcel.readString();
            this.f21200G = parcel.readFloat();
            this.f21201H = parcel.readInt() == 1;
            this.f21202I = parcel.readString();
            this.f21203J = parcel.readInt();
            this.f21204K = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f21170H = new b();
        this.f21171I = new c();
        this.f21173K = 0;
        this.f21174L = new j();
        this.f21178P = false;
        this.f21179Q = false;
        this.f21180R = false;
        this.f21181S = false;
        this.f21182T = false;
        this.f21183U = true;
        this.f21184V = RenderMode.AUTOMATIC;
        this.f21185W = new HashSet();
        this.f21186a0 = 0;
        w(null, t.c.f22239q2);
    }

    private void P() {
        boolean x3 = x();
        setImageDrawable(null);
        setImageDrawable(this.f21174L);
        if (x3) {
            this.f21174L.f0();
        }
    }

    private void n() {
        q<com.airbnb.lottie.g> qVar = this.f21187b0;
        if (qVar != null) {
            qVar.k(this.f21170H);
            this.f21187b0.j(this.f21171I);
        }
    }

    private void o() {
        this.f21188c0 = null;
        this.f21174L.p();
    }

    private void r() {
        com.airbnb.lottie.g gVar;
        com.airbnb.lottie.g gVar2;
        int i4;
        int i5 = g.f21197a[this.f21184V.ordinal()];
        int i6 = 2;
        if (i5 != 1 && (i5 == 2 || i5 != 3 || (((gVar = this.f21188c0) != null && gVar.t() && Build.VERSION.SDK_INT < 28) || (((gVar2 = this.f21188c0) != null && gVar2.n() > 4) || (i4 = Build.VERSION.SDK_INT) == 24 || i4 == 25)))) {
            i6 = 1;
        }
        if (i6 != getLayerType()) {
            setLayerType(i6, null);
        }
    }

    private q<com.airbnb.lottie.g> s(String str) {
        if (isInEditMode()) {
            return new q<>(new e(str), true);
        }
        if (this.f21183U) {
            return com.airbnb.lottie.h.e(getContext(), str);
        }
        return com.airbnb.lottie.h.f(getContext(), str, null);
    }

    private void setCompositionTask(q<com.airbnb.lottie.g> qVar) {
        o();
        n();
        this.f21187b0 = qVar.f(this.f21170H).e(this.f21171I);
    }

    private q<com.airbnb.lottie.g> t(@V int i4) {
        if (isInEditMode()) {
            return new q<>(new d(i4), true);
        }
        if (this.f21183U) {
            return com.airbnb.lottie.h.s(getContext(), i4);
        }
        return com.airbnb.lottie.h.t(getContext(), i4, null);
    }

    private void w(@P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        String string;
        boolean z3 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.n.i5, i4, 0);
        this.f21183U = obtainStyledAttributes.getBoolean(t.n.k5, true);
        boolean hasValue = obtainStyledAttributes.hasValue(t.n.t5);
        boolean hasValue2 = obtainStyledAttributes.hasValue(t.n.o5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(t.n.z5);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(t.n.t5, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(t.n.o5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(t.n.z5)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(t.n.n5, 0));
        if (obtainStyledAttributes.getBoolean(t.n.j5, false)) {
            this.f21180R = true;
            this.f21182T = true;
        }
        if (obtainStyledAttributes.getBoolean(t.n.r5, false)) {
            this.f21174L.B0(-1);
        }
        if (obtainStyledAttributes.hasValue(t.n.w5)) {
            setRepeatMode(obtainStyledAttributes.getInt(t.n.w5, 1));
        }
        if (obtainStyledAttributes.hasValue(t.n.v5)) {
            setRepeatCount(obtainStyledAttributes.getInt(t.n.v5, -1));
        }
        if (obtainStyledAttributes.hasValue(t.n.y5)) {
            setSpeed(obtainStyledAttributes.getFloat(t.n.y5, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(t.n.q5));
        setProgress(obtainStyledAttributes.getFloat(t.n.s5, 0.0f));
        q(obtainStyledAttributes.getBoolean(t.n.m5, false));
        if (obtainStyledAttributes.hasValue(t.n.l5)) {
            k(new com.airbnb.lottie.model.d("**"), o.f21823K, new com.airbnb.lottie.value.j(new u(C2046a.a(getContext(), obtainStyledAttributes.getResourceId(t.n.l5, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(t.n.x5)) {
            this.f21174L.E0(obtainStyledAttributes.getFloat(t.n.x5, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(t.n.u5)) {
            int i5 = t.n.u5;
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i6 = obtainStyledAttributes.getInt(i5, renderMode.ordinal());
            if (i6 >= RenderMode.values().length) {
                i6 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i6]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(t.n.p5, false));
        obtainStyledAttributes.recycle();
        j jVar = this.f21174L;
        if (com.airbnb.lottie.utils.j.f(getContext()) != 0.0f) {
            z3 = true;
        }
        jVar.G0(Boolean.valueOf(z3));
        r();
        this.f21175M = true;
    }

    @K
    public void A() {
        this.f21182T = false;
        this.f21180R = false;
        this.f21179Q = false;
        this.f21178P = false;
        this.f21174L.X();
        r();
    }

    @K
    public void B() {
        if (isShown()) {
            this.f21174L.Y();
            r();
        } else {
            this.f21178P = true;
        }
    }

    public void C() {
        this.f21174L.Z();
    }

    public void D() {
        this.f21185W.clear();
    }

    public void E() {
        this.f21174L.a0();
    }

    public void F(Animator.AnimatorListener animatorListener) {
        this.f21174L.b0(animatorListener);
    }

    @W(api = 19)
    public void G(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f21174L.c0(animatorPauseListener);
    }

    public boolean H(@N n nVar) {
        return this.f21185W.remove(nVar);
    }

    public void I(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21174L.d0(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> J(com.airbnb.lottie.model.d dVar) {
        return this.f21174L.e0(dVar);
    }

    @K
    public void K() {
        if (isShown()) {
            this.f21174L.f0();
            r();
        } else {
            this.f21178P = false;
            this.f21179Q = true;
        }
    }

    public void L() {
        this.f21174L.g0();
    }

    public void M(InputStream inputStream, @P String str) {
        setCompositionTask(com.airbnb.lottie.h.j(inputStream, str));
    }

    public void N(String str, @P String str2) {
        M(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void O(String str, @P String str2) {
        setCompositionTask(com.airbnb.lottie.h.x(getContext(), str, str2));
    }

    public void Q(int i4, int i5) {
        this.f21174L.r0(i4, i5);
    }

    public void R(String str, String str2, boolean z3) {
        this.f21174L.t0(str, str2, z3);
    }

    public void S(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
        this.f21174L.u0(f4, f5);
    }

    @P
    public Bitmap T(String str, @P Bitmap bitmap) {
        return this.f21174L.I0(str, bitmap);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z3) {
        com.airbnb.lottie.e.a("buildDrawingCache");
        this.f21186a0++;
        super.buildDrawingCache(z3);
        if (this.f21186a0 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z3) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f21186a0--;
        com.airbnb.lottie.e.b("buildDrawingCache");
    }

    public void g(Animator.AnimatorListener animatorListener) {
        this.f21174L.f(animatorListener);
    }

    @P
    public com.airbnb.lottie.g getComposition() {
        return this.f21188c0;
    }

    public long getDuration() {
        if (this.f21188c0 != null) {
            return r0.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f21174L.B();
    }

    @P
    public String getImageAssetsFolder() {
        return this.f21174L.E();
    }

    public float getMaxFrame() {
        return this.f21174L.F();
    }

    public float getMinFrame() {
        return this.f21174L.H();
    }

    @P
    public s getPerformanceTracker() {
        return this.f21174L.I();
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float getProgress() {
        return this.f21174L.J();
    }

    public int getRepeatCount() {
        return this.f21174L.K();
    }

    public int getRepeatMode() {
        return this.f21174L.L();
    }

    public float getScale() {
        return this.f21174L.M();
    }

    public float getSpeed() {
        return this.f21174L.N();
    }

    @W(api = 19)
    public void h(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f21174L.g(animatorPauseListener);
    }

    public void i(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21174L.h(animatorUpdateListener);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@N Drawable drawable) {
        Drawable drawable2 = getDrawable();
        j jVar = this.f21174L;
        if (drawable2 == jVar) {
            super.invalidateDrawable(jVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean j(@N n nVar) {
        com.airbnb.lottie.g gVar = this.f21188c0;
        if (gVar != null) {
            nVar.a(gVar);
        }
        return this.f21185W.add(nVar);
    }

    public <T> void k(com.airbnb.lottie.model.d dVar, T t3, com.airbnb.lottie.value.j<T> jVar) {
        this.f21174L.i(dVar, t3, jVar);
    }

    public <T> void l(com.airbnb.lottie.model.d dVar, T t3, com.airbnb.lottie.value.l<T> lVar) {
        this.f21174L.i(dVar, t3, new f(lVar));
    }

    @K
    public void m() {
        this.f21180R = false;
        this.f21179Q = false;
        this.f21178P = false;
        this.f21174L.o();
        r();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            if (this.f21182T || this.f21180R) {
                B();
                this.f21182T = false;
                this.f21180R = false;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (x()) {
            m();
            this.f21180R = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        String str = hVar.f21198E;
        this.f21176N = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f21176N);
        }
        int i4 = hVar.f21199F;
        this.f21177O = i4;
        if (i4 != 0) {
            setAnimation(i4);
        }
        setProgress(hVar.f21200G);
        if (hVar.f21201H) {
            B();
        }
        this.f21174L.n0(hVar.f21202I);
        setRepeatMode(hVar.f21203J);
        setRepeatCount(hVar.f21204K);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z3;
        h hVar = new h(super.onSaveInstanceState());
        hVar.f21198E = this.f21176N;
        hVar.f21199F = this.f21177O;
        hVar.f21200G = this.f21174L.J();
        if (!this.f21174L.S() && (C0823k0.O0(this) || !this.f21180R)) {
            z3 = false;
        } else {
            z3 = true;
        }
        hVar.f21201H = z3;
        hVar.f21202I = this.f21174L.E();
        hVar.f21203J = this.f21174L.L();
        hVar.f21204K = this.f21174L.K();
        return hVar;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@N View view, int i4) {
        if (!this.f21175M) {
            return;
        }
        if (isShown()) {
            if (this.f21179Q) {
                K();
            } else if (this.f21178P) {
                B();
            }
            this.f21179Q = false;
            this.f21178P = false;
            return;
        }
        if (x()) {
            A();
            this.f21179Q = true;
        }
    }

    public void p() {
        this.f21174L.q();
    }

    public void q(boolean z3) {
        this.f21174L.v(z3);
    }

    public void setAnimation(@V int i4) {
        this.f21177O = i4;
        this.f21176N = null;
        setCompositionTask(t(i4));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        N(str, null);
    }

    public void setAnimationFromUrl(String str) {
        q<com.airbnb.lottie.g> x3;
        if (this.f21183U) {
            x3 = com.airbnb.lottie.h.w(getContext(), str);
        } else {
            x3 = com.airbnb.lottie.h.x(getContext(), str, null);
        }
        setCompositionTask(x3);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z3) {
        this.f21174L.h0(z3);
    }

    public void setCacheComposition(boolean z3) {
        this.f21183U = z3;
    }

    public void setComposition(@N com.airbnb.lottie.g gVar) {
        if (com.airbnb.lottie.e.f21417a) {
            Log.v(f21168d0, "Set Composition \n" + gVar);
        }
        this.f21174L.setCallback(this);
        this.f21188c0 = gVar;
        this.f21181S = true;
        boolean i02 = this.f21174L.i0(gVar);
        this.f21181S = false;
        r();
        if (getDrawable() == this.f21174L && !i02) {
            return;
        }
        if (!i02) {
            P();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<n> it = this.f21185W.iterator();
        while (it.hasNext()) {
            it.next().a(gVar);
        }
    }

    public void setFailureListener(@P l<Throwable> lVar) {
        this.f21172J = lVar;
    }

    public void setFallbackResource(@InterfaceC0578v int i4) {
        this.f21173K = i4;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.c cVar) {
        this.f21174L.j0(cVar);
    }

    public void setFrame(int i4) {
        this.f21174L.k0(i4);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z3) {
        this.f21174L.l0(z3);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.d dVar) {
        this.f21174L.m0(dVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f21174L.n0(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        n();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        n();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i4) {
        n();
        super.setImageResource(i4);
    }

    public void setMaxFrame(int i4) {
        this.f21174L.o0(i4);
    }

    public void setMaxProgress(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f21174L.q0(f4);
    }

    public void setMinAndMaxFrame(String str) {
        this.f21174L.s0(str);
    }

    public void setMinFrame(int i4) {
        this.f21174L.v0(i4);
    }

    public void setMinProgress(float f4) {
        this.f21174L.x0(f4);
    }

    public void setOutlineMasksAndMattes(boolean z3) {
        this.f21174L.y0(z3);
    }

    public void setPerformanceTrackingEnabled(boolean z3) {
        this.f21174L.z0(z3);
    }

    public void setProgress(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f21174L.A0(f4);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f21184V = renderMode;
        r();
    }

    public void setRepeatCount(int i4) {
        this.f21174L.B0(i4);
    }

    public void setRepeatMode(int i4) {
        this.f21174L.C0(i4);
    }

    public void setSafeMode(boolean z3) {
        this.f21174L.D0(z3);
    }

    public void setScale(float f4) {
        this.f21174L.E0(f4);
        if (getDrawable() == this.f21174L) {
            P();
        }
    }

    public void setSpeed(float f4) {
        this.f21174L.F0(f4);
    }

    public void setTextDelegate(v vVar) {
        this.f21174L.H0(vVar);
    }

    public boolean u() {
        return this.f21174L.Q();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        j jVar;
        if (!this.f21181S && drawable == (jVar = this.f21174L) && jVar.S()) {
            A();
        } else if (!this.f21181S && (drawable instanceof j)) {
            j jVar2 = (j) drawable;
            if (jVar2.S()) {
                jVar2.X();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public boolean v() {
        return this.f21174L.R();
    }

    public boolean x() {
        return this.f21174L.S();
    }

    public boolean y() {
        return this.f21174L.V();
    }

    @Deprecated
    public void z(boolean z3) {
        int i4;
        j jVar = this.f21174L;
        if (z3) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        jVar.B0(i4);
    }

    public void setMaxFrame(String str) {
        this.f21174L.p0(str);
    }

    public void setMinFrame(String str) {
        this.f21174L.w0(str);
    }

    public void setAnimation(String str) {
        this.f21176N = str;
        this.f21177O = 0;
        setCompositionTask(s(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21170H = new b();
        this.f21171I = new c();
        this.f21173K = 0;
        this.f21174L = new j();
        this.f21178P = false;
        this.f21179Q = false;
        this.f21180R = false;
        this.f21181S = false;
        this.f21182T = false;
        this.f21183U = true;
        this.f21184V = RenderMode.AUTOMATIC;
        this.f21185W = new HashSet();
        this.f21186a0 = 0;
        w(attributeSet, t.c.f22239q2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f21170H = new b();
        this.f21171I = new c();
        this.f21173K = 0;
        this.f21174L = new j();
        this.f21178P = false;
        this.f21179Q = false;
        this.f21180R = false;
        this.f21181S = false;
        this.f21182T = false;
        this.f21183U = true;
        this.f21184V = RenderMode.AUTOMATIC;
        this.f21185W = new HashSet();
        this.f21186a0 = 0;
        w(attributeSet, i4);
    }
}
