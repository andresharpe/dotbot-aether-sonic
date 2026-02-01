package com.google.android.material.textfield;

import T0.a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.C0776c;
import androidx.core.view.accessibility.M;
import com.google.android.material.color.s;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e extends com.google.android.material.textfield.f {

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f33715t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final int f33716u = 50;

    /* renamed from: v, reason: collision with root package name */
    private static final int f33717v = 67;

    /* renamed from: e, reason: collision with root package name */
    private final TextWatcher f33718e;

    /* renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f33719f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.e f33720g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout.h f33721h;

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.i f33722i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f33723j;

    /* renamed from: k, reason: collision with root package name */
    private final C0776c.e f33724k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33725l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33726m;

    /* renamed from: n, reason: collision with root package name */
    private long f33727n;

    /* renamed from: o, reason: collision with root package name */
    private StateListDrawable f33728o;

    /* renamed from: p, reason: collision with root package name */
    private com.google.android.material.shape.j f33729p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private AccessibilityManager f33730q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f33731r;

    /* renamed from: s, reason: collision with root package name */
    private ValueAnimator f33732s;

    /* loaded from: classes2.dex */
    class a extends v {

        /* renamed from: com.google.android.material.textfield.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0302a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f33734E;

            RunnableC0302a(AutoCompleteTextView autoCompleteTextView) {
                this.f33734E = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f33734E.isPopupShowing();
                e.this.J(isPopupShowing);
                e.this.f33725l = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.v, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView C3 = e.C(e.this.f33750a.getEditText());
            if (e.this.f33730q.isTouchExplorationEnabled() && e.H(C3) && !e.this.f33752c.hasFocus()) {
                C3.dismissDropDown();
            }
            C3.post(new RunnableC0302a(C3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements AutoCompleteTextView.OnDismissListener {
        b() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            e.this.N();
            e.this.J(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            eVar.f33752c.setChecked(eVar.f33726m);
            e.this.f33732s.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            e.this.f33752c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnFocusChangeListenerC0303e implements View.OnFocusChangeListener {
        ViewOnFocusChangeListenerC0303e() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            e.this.f33750a.setEndIconActivated(z3);
            if (!z3) {
                e.this.J(false);
                e.this.f33725l = false;
            }
        }
    }

    /* loaded from: classes2.dex */
    class f extends TextInputLayout.e {
        f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            if (!e.H(e.this.f33750a.getEditText())) {
                m4.Z0(Spinner.class.getName());
            }
            if (m4.B0()) {
                m4.o1(null);
            }
        }

        @Override // androidx.core.view.C0771a
        public void h(View view, @N AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView C3 = e.C(e.this.f33750a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && e.this.f33730q.isEnabled() && !e.H(e.this.f33750a.getEditText())) {
                e.this.M(C3);
                e.this.N();
            }
        }
    }

    /* loaded from: classes2.dex */
    class g implements TextInputLayout.h {
        g() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@N TextInputLayout textInputLayout) {
            AutoCompleteTextView C3 = e.C(textInputLayout.getEditText());
            e.this.K(C3);
            e.this.y(C3);
            e.this.L(C3);
            C3.setThreshold(0);
            C3.removeTextChangedListener(e.this.f33718e);
            C3.addTextChangedListener(e.this.f33718e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!e.H(C3) && e.this.f33730q.isTouchExplorationEnabled()) {
                C0823k0.R1(e.this.f33752c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(e.this.f33720g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes2.dex */
    class h implements TextInputLayout.i {

        /* loaded from: classes2.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f33743E;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f33743E = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33743E.removeTextChangedListener(e.this.f33718e);
            }
        }

        h() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@N TextInputLayout textInputLayout, int i4) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i4 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == e.this.f33719f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (e.f33715t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i4 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(e.this.f33723j);
                e.this.I();
            }
        }
    }

    /* loaded from: classes2.dex */
    class i implements View.OnAttachStateChangeListener {
        i() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e.this.B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            e.this.I();
        }
    }

    /* loaded from: classes2.dex */
    class j implements C0776c.e {
        j() {
        }

        @Override // androidx.core.view.accessibility.C0776c.e
        public void onTouchExplorationStateChanged(boolean z3) {
            AutoCompleteTextView autoCompleteTextView;
            int i4;
            TextInputLayout textInputLayout = e.this.f33750a;
            if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null && !e.H(autoCompleteTextView)) {
                CheckableImageButton checkableImageButton = e.this.f33752c;
                if (z3) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                C0823k0.R1(checkableImageButton, i4);
            }
        }
    }

    /* loaded from: classes2.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.M((AutoCompleteTextView) e.this.f33750a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l implements View.OnTouchListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f33748E;

        l(AutoCompleteTextView autoCompleteTextView) {
            this.f33748E = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@N View view, @N MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (e.this.G()) {
                    e.this.f33725l = false;
                }
                e.this.M(this.f33748E);
                e.this.N();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(@N TextInputLayout textInputLayout, @InterfaceC0578v int i4) {
        super(textInputLayout, i4);
        this.f33718e = new a();
        this.f33719f = new ViewOnFocusChangeListenerC0303e();
        this.f33720g = new f(this.f33750a);
        this.f33721h = new g();
        this.f33722i = new h();
        this.f33723j = new i();
        this.f33724k = new j();
        this.f33725l = false;
        this.f33726m = false;
        this.f33727n = Long.MAX_VALUE;
    }

    private void A(@N AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, @N com.google.android.material.shape.j jVar) {
        LayerDrawable layerDrawable;
        int d4 = s.d(autoCompleteTextView, a.c.f1979o3);
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.getShapeAppearanceModel());
        int m4 = s.m(i4, d4, 0.1f);
        jVar2.o0(new ColorStateList(iArr, new int[]{m4, 0}));
        if (f33715t) {
            jVar2.setTint(d4);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m4, d4});
            com.google.android.material.shape.j jVar3 = new com.google.android.material.shape.j(jVar.getShapeAppearanceModel());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        C0823k0.I1(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        TextInputLayout textInputLayout;
        if (this.f33730q != null && (textInputLayout = this.f33750a) != null && C0823k0.O0(textInputLayout)) {
            C0776c.b(this.f33730q, this.f33724k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public static AutoCompleteTextView C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator D(int i4, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f31207a);
        ofFloat.setDuration(i4);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    private com.google.android.material.shape.j E(float f4, float f5, float f6, int i4) {
        com.google.android.material.shape.o m4 = com.google.android.material.shape.o.a().K(f4).P(f4).x(f5).C(f5).m();
        com.google.android.material.shape.j n4 = com.google.android.material.shape.j.n(this.f33751b, f6);
        n4.setShapeAppearanceModel(m4);
        n4.q0(0, i4, 0, i4);
        return n4;
    }

    private void F() {
        this.f33732s = D(67, 0.0f, 1.0f);
        ValueAnimator D3 = D(50, 1.0f, 0.0f);
        this.f33731r = D3;
        D3.addListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f33727n;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(@N EditText editText) {
        if (editText.getKeyListener() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        AccessibilityManager accessibilityManager = this.f33730q;
        if (accessibilityManager != null) {
            C0776c.g(accessibilityManager, this.f33724k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(boolean z3) {
        if (this.f33726m != z3) {
            this.f33726m = z3;
            this.f33732s.cancel();
            this.f33731r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(@N AutoCompleteTextView autoCompleteTextView) {
        if (f33715t) {
            int boxBackgroundMode = this.f33750a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f33729p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f33728o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void L(@N AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f33719f);
        if (f33715t) {
            autoCompleteTextView.setOnDismissListener(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(@P AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (G()) {
            this.f33725l = false;
        }
        if (!this.f33725l) {
            if (f33715t) {
                J(!this.f33726m);
            } else {
                this.f33726m = !this.f33726m;
                this.f33752c.toggle();
            }
            if (this.f33726m) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f33725l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        this.f33725l = true;
        this.f33727n = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(@N AutoCompleteTextView autoCompleteTextView) {
        if (H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f33750a.getBoxBackgroundMode();
        com.google.android.material.shape.j boxBackground = this.f33750a.getBoxBackground();
        int d4 = s.d(autoCompleteTextView, a.c.f1852M2);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            A(autoCompleteTextView, d4, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            z(autoCompleteTextView, d4, iArr, boxBackground);
        }
    }

    private void z(@N AutoCompleteTextView autoCompleteTextView, int i4, int[][] iArr, @N com.google.android.material.shape.j jVar) {
        int boxBackgroundColor = this.f33750a.getBoxBackgroundColor();
        int[] iArr2 = {s.m(i4, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f33715t) {
            C0823k0.I1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j(jVar.getShapeAppearanceModel());
        jVar2.o0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int k02 = C0823k0.k0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int j02 = C0823k0.j0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C0823k0.I1(autoCompleteTextView, layerDrawable);
        C0823k0.d2(autoCompleteTextView, k02, paddingTop, j02, paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(@N AutoCompleteTextView autoCompleteTextView) {
        if (!H(autoCompleteTextView) && this.f33750a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            y(autoCompleteTextView);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.f
    public void a() {
        float dimensionPixelOffset = this.f33751b.getResources().getDimensionPixelOffset(a.f.V8);
        float dimensionPixelOffset2 = this.f33751b.getResources().getDimensionPixelOffset(a.f.G7);
        int dimensionPixelOffset3 = this.f33751b.getResources().getDimensionPixelOffset(a.f.I7);
        com.google.android.material.shape.j E3 = E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        com.google.android.material.shape.j E4 = E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f33729p = E3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f33728o = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, E3);
        this.f33728o.addState(new int[0], E4);
        int i4 = this.f33753d;
        if (i4 == 0) {
            if (f33715t) {
                i4 = a.g.f2590n1;
            } else {
                i4 = a.g.f2593o1;
            }
        }
        this.f33750a.setEndIconDrawable(i4);
        TextInputLayout textInputLayout = this.f33750a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(a.m.f3057K));
        this.f33750a.setEndIconOnClickListener(new k());
        this.f33750a.g(this.f33721h);
        this.f33750a.h(this.f33722i);
        F();
        this.f33730q = (AccessibilityManager) this.f33751b.getSystemService("accessibility");
        this.f33750a.addOnAttachStateChangeListener(this.f33723j);
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.f
    public boolean b(int i4) {
        return i4 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.f
    public boolean d() {
        return true;
    }
}
