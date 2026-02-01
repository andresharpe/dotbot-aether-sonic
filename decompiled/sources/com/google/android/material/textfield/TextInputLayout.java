package com.google.android.material.textfield;

import T0.a;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.i0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0599l;
import androidx.appcompat.widget.L;
import androidx.core.content.C0669d;
import androidx.core.text.C0753a;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.H;
import androidx.core.view.accessibility.M;
import androidx.core.widget.r;
import androidx.transition.C0980n;
import com.google.android.material.color.s;
import com.google.android.material.internal.C1781b;
import com.google.android.material.internal.C1783d;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.E;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A1, reason: collision with root package name */
    public static final int f33585A1 = 3;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f33586m1 = a.n.ke;

    /* renamed from: n1, reason: collision with root package name */
    private static final int f33587n1 = 167;

    /* renamed from: o1, reason: collision with root package name */
    private static final long f33588o1 = 87;

    /* renamed from: p1, reason: collision with root package name */
    private static final long f33589p1 = 67;

    /* renamed from: q1, reason: collision with root package name */
    private static final int f33590q1 = -1;

    /* renamed from: r1, reason: collision with root package name */
    private static final int f33591r1 = -1;

    /* renamed from: s1, reason: collision with root package name */
    private static final String f33592s1 = "TextInputLayout";

    /* renamed from: t1, reason: collision with root package name */
    public static final int f33593t1 = 0;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f33594u1 = 1;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f33595v1 = 2;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f33596w1 = -1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f33597x1 = 0;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f33598y1 = 1;

    /* renamed from: z1, reason: collision with root package name */
    public static final int f33599z1 = 2;

    /* renamed from: A0, reason: collision with root package name */
    private final Rect f33600A0;

    /* renamed from: B0, reason: collision with root package name */
    private final RectF f33601B0;

    /* renamed from: C0, reason: collision with root package name */
    private Typeface f33602C0;

    /* renamed from: D0, reason: collision with root package name */
    @P
    private Drawable f33603D0;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final FrameLayout f33604E;

    /* renamed from: E0, reason: collision with root package name */
    private int f33605E0;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final l f33606F;

    /* renamed from: F0, reason: collision with root package name */
    private final LinkedHashSet<h> f33607F0;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final LinearLayout f33608G;

    /* renamed from: G0, reason: collision with root package name */
    private int f33609G0;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final FrameLayout f33610H;

    /* renamed from: H0, reason: collision with root package name */
    private final SparseArray<com.google.android.material.textfield.f> f33611H0;

    /* renamed from: I, reason: collision with root package name */
    EditText f33612I;

    /* renamed from: I0, reason: collision with root package name */
    @N
    private final CheckableImageButton f33613I0;

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f33614J;

    /* renamed from: J0, reason: collision with root package name */
    private final LinkedHashSet<i> f33615J0;

    /* renamed from: K, reason: collision with root package name */
    private int f33616K;

    /* renamed from: K0, reason: collision with root package name */
    private ColorStateList f33617K0;

    /* renamed from: L, reason: collision with root package name */
    private int f33618L;

    /* renamed from: L0, reason: collision with root package name */
    private PorterDuff.Mode f33619L0;

    /* renamed from: M, reason: collision with root package name */
    private int f33620M;

    /* renamed from: M0, reason: collision with root package name */
    @P
    private Drawable f33621M0;

    /* renamed from: N, reason: collision with root package name */
    private int f33622N;

    /* renamed from: N0, reason: collision with root package name */
    private int f33623N0;

    /* renamed from: O, reason: collision with root package name */
    private final com.google.android.material.textfield.h f33624O;

    /* renamed from: O0, reason: collision with root package name */
    private Drawable f33625O0;

    /* renamed from: P, reason: collision with root package name */
    boolean f33626P;

    /* renamed from: P0, reason: collision with root package name */
    private View.OnLongClickListener f33627P0;

    /* renamed from: Q, reason: collision with root package name */
    private int f33628Q;

    /* renamed from: Q0, reason: collision with root package name */
    private View.OnLongClickListener f33629Q0;

    /* renamed from: R, reason: collision with root package name */
    private boolean f33630R;

    /* renamed from: R0, reason: collision with root package name */
    @N
    private final CheckableImageButton f33631R0;

    /* renamed from: S, reason: collision with root package name */
    @P
    private TextView f33632S;

    /* renamed from: S0, reason: collision with root package name */
    private ColorStateList f33633S0;

    /* renamed from: T, reason: collision with root package name */
    private int f33634T;

    /* renamed from: T0, reason: collision with root package name */
    private PorterDuff.Mode f33635T0;

    /* renamed from: U, reason: collision with root package name */
    private int f33636U;

    /* renamed from: U0, reason: collision with root package name */
    private ColorStateList f33637U0;

    /* renamed from: V, reason: collision with root package name */
    private CharSequence f33638V;

    /* renamed from: V0, reason: collision with root package name */
    private ColorStateList f33639V0;

    /* renamed from: W, reason: collision with root package name */
    private boolean f33640W;

    /* renamed from: W0, reason: collision with root package name */
    @InterfaceC0569l
    private int f33641W0;

    /* renamed from: X0, reason: collision with root package name */
    @InterfaceC0569l
    private int f33642X0;

    /* renamed from: Y0, reason: collision with root package name */
    @InterfaceC0569l
    private int f33643Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private ColorStateList f33644Z0;

    /* renamed from: a0, reason: collision with root package name */
    private TextView f33645a0;

    /* renamed from: a1, reason: collision with root package name */
    @InterfaceC0569l
    private int f33646a1;

    /* renamed from: b0, reason: collision with root package name */
    @P
    private ColorStateList f33647b0;

    /* renamed from: b1, reason: collision with root package name */
    @InterfaceC0569l
    private int f33648b1;

    /* renamed from: c0, reason: collision with root package name */
    private int f33649c0;

    /* renamed from: c1, reason: collision with root package name */
    @InterfaceC0569l
    private int f33650c1;

    /* renamed from: d0, reason: collision with root package name */
    @P
    private C0980n f33651d0;

    /* renamed from: d1, reason: collision with root package name */
    @InterfaceC0569l
    private int f33652d1;

    /* renamed from: e0, reason: collision with root package name */
    @P
    private C0980n f33653e0;

    /* renamed from: e1, reason: collision with root package name */
    @InterfaceC0569l
    private int f33654e1;

    /* renamed from: f0, reason: collision with root package name */
    @P
    private ColorStateList f33655f0;

    /* renamed from: f1, reason: collision with root package name */
    private boolean f33656f1;

    /* renamed from: g0, reason: collision with root package name */
    @P
    private ColorStateList f33657g0;

    /* renamed from: g1, reason: collision with root package name */
    final C1781b f33658g1;

    /* renamed from: h0, reason: collision with root package name */
    @P
    private CharSequence f33659h0;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f33660h1;

    /* renamed from: i0, reason: collision with root package name */
    @N
    private final TextView f33661i0;

    /* renamed from: i1, reason: collision with root package name */
    private boolean f33662i1;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f33663j0;

    /* renamed from: j1, reason: collision with root package name */
    private ValueAnimator f33664j1;

    /* renamed from: k0, reason: collision with root package name */
    private CharSequence f33665k0;

    /* renamed from: k1, reason: collision with root package name */
    private boolean f33666k1;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f33667l0;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f33668l1;

    /* renamed from: m0, reason: collision with root package name */
    @P
    private com.google.android.material.shape.j f33669m0;

    /* renamed from: n0, reason: collision with root package name */
    @P
    private com.google.android.material.shape.j f33670n0;

    /* renamed from: o0, reason: collision with root package name */
    @P
    private com.google.android.material.shape.j f33671o0;

    /* renamed from: p0, reason: collision with root package name */
    @N
    private com.google.android.material.shape.o f33672p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f33673q0;

    /* renamed from: r0, reason: collision with root package name */
    private final int f33674r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f33675s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f33676t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f33677u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f33678v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f33679w0;

    /* renamed from: x0, reason: collision with root package name */
    @InterfaceC0569l
    private int f33680x0;

    /* renamed from: y0, reason: collision with root package name */
    @InterfaceC0569l
    private int f33681y0;

    /* renamed from: z0, reason: collision with root package name */
    private final Rect f33682z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@N Editable editable) {
            TextInputLayout.this.N0(!r0.f33668l1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f33626P) {
                textInputLayout.D0(editable.length());
            }
            if (TextInputLayout.this.f33640W) {
                TextInputLayout.this.R0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f33613I0.performClick();
            TextInputLayout.this.f33613I0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f33612I.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@N ValueAnimator valueAnimator) {
            TextInputLayout.this.f33658g1.z0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f33687d;

        public e(@N TextInputLayout textInputLayout) {
            this.f33687d = textInputLayout;
        }

        @Override // androidx.core.view.C0771a
        public void g(@N View view, @N M m4) {
            CharSequence charSequence;
            String str;
            super.g(view, m4);
            EditText editText = this.f33687d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f33687d.getHint();
            CharSequence error = this.f33687d.getError();
            CharSequence placeholderText = this.f33687d.getPlaceholderText();
            int counterMaxLength = this.f33687d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f33687d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean z3 = !isEmpty;
            boolean z4 = true;
            boolean z5 = !TextUtils.isEmpty(hint);
            boolean z6 = !this.f33687d.X();
            boolean z7 = !TextUtils.isEmpty(error);
            if (!z7 && TextUtils.isEmpty(counterOverflowDescription)) {
                z4 = false;
            }
            if (z5) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f33687d.f33606F.w(m4);
            if (z3) {
                m4.O1(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                m4.O1(str);
                if (z6 && placeholderText != null) {
                    m4.O1(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                m4.O1(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    m4.o1(str);
                } else {
                    if (z3) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    m4.O1(str);
                }
                m4.K1(isEmpty);
            }
            if (charSequence == null || charSequence.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            m4.x1(counterMaxLength);
            if (z4) {
                if (!z7) {
                    error = counterOverflowDescription;
                }
                m4.k1(error);
            }
            View t3 = this.f33687d.f33624O.t();
            if (t3 != null) {
                m4.r1(t3);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface g {
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a(@N TextInputLayout textInputLayout);
    }

    /* loaded from: classes2.dex */
    public interface i {
        void a(@N TextInputLayout textInputLayout, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class j extends androidx.customview.view.a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        @P
        CharSequence f33688G;

        /* renamed from: H, reason: collision with root package name */
        boolean f33689H;

        /* renamed from: I, reason: collision with root package name */
        @P
        CharSequence f33690I;

        /* renamed from: J, reason: collision with root package name */
        @P
        CharSequence f33691J;

        /* renamed from: K, reason: collision with root package name */
        @P
        CharSequence f33692K;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<j> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @P
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(@N Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int i4) {
                return new j[i4];
            }
        }

        j(Parcelable parcelable) {
            super(parcelable);
        }

        @N
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f33688G) + " hint=" + ((Object) this.f33690I) + " helperText=" + ((Object) this.f33691J) + " placeholderText=" + ((Object) this.f33692K) + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            TextUtils.writeToParcel(this.f33688G, parcel, i4);
            parcel.writeInt(this.f33689H ? 1 : 0);
            TextUtils.writeToParcel(this.f33690I, parcel, i4);
            TextUtils.writeToParcel(this.f33691J, parcel, i4);
            TextUtils.writeToParcel(this.f33692K, parcel, i4);
        }

        j(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.f33688G = (CharSequence) creator.createFromParcel(parcel);
            this.f33689H = parcel.readInt() == 1;
            this.f33690I = (CharSequence) creator.createFromParcel(parcel);
            this.f33691J = (CharSequence) creator.createFromParcel(parcel);
            this.f33692K = (CharSequence) creator.createFromParcel(parcel);
        }
    }

    public TextInputLayout(@N Context context) {
        this(context, null);
    }

    private void A(boolean z3) {
        ValueAnimator valueAnimator = this.f33664j1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33664j1.cancel();
        }
        if (z3 && this.f33662i1) {
            k(1.0f);
        } else {
            this.f33658g1.z0(1.0f);
        }
        this.f33656f1 = false;
        if (C()) {
            e0();
        }
        Q0();
        this.f33606F.j(false);
        U0();
    }

    private void A0() {
        if (this.f33675s0 == 1) {
            if (com.google.android.material.resources.c.j(getContext())) {
                this.f33676t0 = getResources().getDimensionPixelSize(a.f.C5);
            } else if (com.google.android.material.resources.c.i(getContext())) {
                this.f33676t0 = getResources().getDimensionPixelSize(a.f.B5);
            }
        }
    }

    private C0980n B() {
        C0980n c0980n = new C0980n();
        c0980n.v0(f33588o1);
        c0980n.x0(com.google.android.material.animation.a.f31207a);
        return c0980n;
    }

    private void B0(@N Rect rect) {
        com.google.android.material.shape.j jVar = this.f33670n0;
        if (jVar != null) {
            int i4 = rect.bottom;
            jVar.setBounds(rect.left, i4 - this.f33678v0, rect.right, i4);
        }
        com.google.android.material.shape.j jVar2 = this.f33671o0;
        if (jVar2 != null) {
            int i5 = rect.bottom;
            jVar2.setBounds(rect.left, i5 - this.f33679w0, rect.right, i5);
        }
    }

    private boolean C() {
        if (this.f33663j0 && !TextUtils.isEmpty(this.f33665k0) && (this.f33669m0 instanceof com.google.android.material.textfield.d)) {
            return true;
        }
        return false;
    }

    private void C0() {
        int length;
        if (this.f33632S != null) {
            EditText editText = this.f33612I;
            if (editText == null) {
                length = 0;
            } else {
                length = editText.getText().length();
            }
            D0(length);
        }
    }

    private void E() {
        Iterator<h> it = this.f33607F0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private static void E0(@N Context context, @N TextView textView, int i4, int i5, boolean z3) {
        int i6;
        if (z3) {
            i6 = a.m.f3047F;
        } else {
            i6 = a.m.f3045E;
        }
        textView.setContentDescription(context.getString(i6, Integer.valueOf(i4), Integer.valueOf(i5)));
    }

    private void F(int i4) {
        Iterator<i> it = this.f33615J0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i4);
        }
    }

    private void F0() {
        int i4;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f33632S;
        if (textView != null) {
            if (this.f33630R) {
                i4 = this.f33634T;
            } else {
                i4 = this.f33636U;
            }
            u0(textView, i4);
            if (!this.f33630R && (colorStateList2 = this.f33655f0) != null) {
                this.f33632S.setTextColor(colorStateList2);
            }
            if (this.f33630R && (colorStateList = this.f33657g0) != null) {
                this.f33632S.setTextColor(colorStateList);
            }
        }
    }

    private void G(Canvas canvas) {
        com.google.android.material.shape.j jVar;
        if (this.f33671o0 != null && (jVar = this.f33670n0) != null) {
            jVar.draw(canvas);
            if (this.f33612I.isFocused()) {
                Rect bounds = this.f33671o0.getBounds();
                Rect bounds2 = this.f33670n0.getBounds();
                float G3 = this.f33658g1.G();
                int centerX = bounds2.centerX();
                bounds.left = com.google.android.material.animation.a.c(centerX, bounds2.left, G3);
                bounds.right = com.google.android.material.animation.a.c(centerX, bounds2.right, G3);
                this.f33671o0.draw(canvas);
            }
        }
    }

    private void G0() {
        if (this.f33609G0 == 3 && this.f33675s0 == 2) {
            ((com.google.android.material.textfield.e) this.f33611H0.get(3)).O((AutoCompleteTextView) this.f33612I);
        }
    }

    private void H(@N Canvas canvas) {
        if (this.f33663j0) {
            this.f33658g1.l(canvas);
        }
    }

    private void I(boolean z3) {
        ValueAnimator valueAnimator = this.f33664j1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f33664j1.cancel();
        }
        if (z3 && this.f33662i1) {
            k(0.0f);
        } else {
            this.f33658g1.z0(0.0f);
        }
        if (C() && ((com.google.android.material.textfield.d) this.f33669m0).P0()) {
            z();
        }
        this.f33656f1 = true;
        M();
        this.f33606F.j(true);
        U0();
    }

    private int J(int i4, boolean z3) {
        int compoundPaddingLeft = i4 + this.f33612I.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z3) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    private boolean J0() {
        int max;
        if (this.f33612I == null || this.f33612I.getMeasuredHeight() >= (max = Math.max(this.f33608G.getMeasuredHeight(), this.f33606F.getMeasuredHeight()))) {
            return false;
        }
        this.f33612I.setMinimumHeight(max);
        return true;
    }

    private int K(int i4, boolean z3) {
        int compoundPaddingRight = i4 - this.f33612I.getCompoundPaddingRight();
        if (getPrefixText() != null && z3) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    private void K0() {
        int i4;
        boolean z3;
        boolean z4;
        FrameLayout frameLayout = this.f33610H;
        int i5 = 8;
        if (this.f33613I0.getVisibility() == 0 && !R()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        frameLayout.setVisibility(i4);
        if (this.f33659h0 != null && !X()) {
            z3 = false;
        } else {
            z3 = 8;
        }
        if (!P() && !R() && z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        LinearLayout linearLayout = this.f33608G;
        if (z4) {
            i5 = 0;
        }
        linearLayout.setVisibility(i5);
    }

    private boolean L() {
        if (this.f33609G0 != 0) {
            return true;
        }
        return false;
    }

    private void L0() {
        boolean z3;
        int i4 = 0;
        if (getErrorIconDrawable() != null && this.f33624O.E() && this.f33624O.m()) {
            z3 = true;
        } else {
            z3 = false;
        }
        CheckableImageButton checkableImageButton = this.f33631R0;
        if (!z3) {
            i4 = 8;
        }
        checkableImageButton.setVisibility(i4);
        K0();
        T0();
        if (!L()) {
            H0();
        }
    }

    private void M() {
        TextView textView = this.f33645a0;
        if (textView != null && this.f33640W) {
            textView.setText((CharSequence) null);
            androidx.transition.M.b(this.f33604E, this.f33653e0);
            this.f33645a0.setVisibility(4);
        }
    }

    private void M0() {
        if (this.f33675s0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33604E.getLayoutParams();
            int u3 = u();
            if (u3 != layoutParams.topMargin) {
                layoutParams.topMargin = u3;
                this.f33604E.requestLayout();
            }
        }
    }

    private void O0(boolean z3, boolean z4) {
        boolean z5;
        ColorStateList colorStateList;
        TextView textView;
        int i4;
        boolean isEnabled = isEnabled();
        EditText editText = this.f33612I;
        boolean z6 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z5 = true;
        } else {
            z5 = false;
        }
        EditText editText2 = this.f33612I;
        if (editText2 != null && editText2.hasFocus()) {
            z6 = true;
        }
        boolean m4 = this.f33624O.m();
        ColorStateList colorStateList2 = this.f33637U0;
        if (colorStateList2 != null) {
            this.f33658g1.j0(colorStateList2);
            this.f33658g1.u0(this.f33637U0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f33637U0;
            if (colorStateList3 != null) {
                i4 = colorStateList3.getColorForState(new int[]{-16842910}, this.f33654e1);
            } else {
                i4 = this.f33654e1;
            }
            this.f33658g1.j0(ColorStateList.valueOf(i4));
            this.f33658g1.u0(ColorStateList.valueOf(i4));
        } else if (m4) {
            this.f33658g1.j0(this.f33624O.r());
        } else if (this.f33630R && (textView = this.f33632S) != null) {
            this.f33658g1.j0(textView.getTextColors());
        } else if (z6 && (colorStateList = this.f33639V0) != null) {
            this.f33658g1.j0(colorStateList);
        }
        if (!z5 && this.f33660h1 && (!isEnabled() || !z6)) {
            if (z4 || !this.f33656f1) {
                I(z3);
                return;
            }
            return;
        }
        if (z4 || this.f33656f1) {
            A(z3);
        }
    }

    private void P0() {
        EditText editText;
        if (this.f33645a0 != null && (editText = this.f33612I) != null) {
            this.f33645a0.setGravity(editText.getGravity());
            this.f33645a0.setPadding(this.f33612I.getCompoundPaddingLeft(), this.f33612I.getCompoundPaddingTop(), this.f33612I.getCompoundPaddingRight(), this.f33612I.getCompoundPaddingBottom());
        }
    }

    private void Q0() {
        int length;
        EditText editText = this.f33612I;
        if (editText == null) {
            length = 0;
        } else {
            length = editText.getText().length();
        }
        R0(length);
    }

    private boolean R() {
        if (this.f33631R0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(int i4) {
        if (i4 == 0 && !this.f33656f1) {
            y0();
        } else {
            M();
        }
    }

    private void S0(boolean z3, boolean z4) {
        int defaultColor = this.f33644Z0.getDefaultColor();
        int colorForState = this.f33644Z0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f33644Z0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f33680x0 = colorForState2;
        } else if (z4) {
            this.f33680x0 = colorForState;
        } else {
            this.f33680x0 = defaultColor;
        }
    }

    private void T0() {
        int i4;
        if (this.f33612I == null) {
            return;
        }
        if (!P() && !R()) {
            i4 = C0823k0.j0(this.f33612I);
        } else {
            i4 = 0;
        }
        C0823k0.d2(this.f33661i0, getContext().getResources().getDimensionPixelSize(a.f.G5), this.f33612I.getPaddingTop(), i4, this.f33612I.getPaddingBottom());
    }

    private void U0() {
        int i4;
        int visibility = this.f33661i0.getVisibility();
        boolean z3 = false;
        if (this.f33659h0 != null && !X()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        if (visibility != i4) {
            com.google.android.material.textfield.f endIconDelegate = getEndIconDelegate();
            if (i4 == 0) {
                z3 = true;
            }
            endIconDelegate.c(z3);
        }
        K0();
        this.f33661i0.setVisibility(i4);
        H0();
    }

    private boolean a0() {
        if (this.f33675s0 == 1 && this.f33612I.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    private void d0() {
        o();
        q0();
        V0();
        A0();
        j();
        if (this.f33675s0 != 0) {
            M0();
        }
    }

    private void e0() {
        if (!C()) {
            return;
        }
        RectF rectF = this.f33601B0;
        this.f33658g1.o(rectF, this.f33612I.getWidth(), this.f33612I.getGravity());
        n(rectF);
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f33677u0);
        ((com.google.android.material.textfield.d) this.f33669m0).S0(rectF);
    }

    private void g0() {
        if (C() && !this.f33656f1) {
            z();
            e0();
        }
    }

    private com.google.android.material.textfield.f getEndIconDelegate() {
        com.google.android.material.textfield.f fVar = this.f33611H0.get(this.f33609G0);
        if (fVar == null) {
            return this.f33611H0.get(0);
        }
        return fVar;
    }

    @P
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f33631R0.getVisibility() == 0) {
            return this.f33631R0;
        }
        if (L() && P()) {
            return this.f33613I0;
        }
        return null;
    }

    private static void h0(@N ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                h0((ViewGroup) childAt, z3);
            }
        }
    }

    private void i() {
        TextView textView = this.f33645a0;
        if (textView != null) {
            this.f33604E.addView(textView);
            this.f33645a0.setVisibility(0);
        }
    }

    private void j() {
        if (this.f33612I != null && this.f33675s0 == 1) {
            if (com.google.android.material.resources.c.j(getContext())) {
                EditText editText = this.f33612I;
                C0823k0.d2(editText, C0823k0.k0(editText), getResources().getDimensionPixelSize(a.f.A5), C0823k0.j0(this.f33612I), getResources().getDimensionPixelSize(a.f.z5));
            } else if (com.google.android.material.resources.c.i(getContext())) {
                EditText editText2 = this.f33612I;
                C0823k0.d2(editText2, C0823k0.k0(editText2), getResources().getDimensionPixelSize(a.f.y5), C0823k0.j0(this.f33612I), getResources().getDimensionPixelSize(a.f.x5));
            }
        }
    }

    private void l() {
        com.google.android.material.shape.j jVar = this.f33669m0;
        if (jVar == null) {
            return;
        }
        com.google.android.material.shape.o shapeAppearanceModel = jVar.getShapeAppearanceModel();
        com.google.android.material.shape.o oVar = this.f33672p0;
        if (shapeAppearanceModel != oVar) {
            this.f33669m0.setShapeAppearanceModel(oVar);
            G0();
        }
        if (v()) {
            this.f33669m0.D0(this.f33677u0, this.f33680x0);
        }
        int p4 = p();
        this.f33681y0 = p4;
        this.f33669m0.o0(ColorStateList.valueOf(p4));
        if (this.f33609G0 == 3) {
            this.f33612I.getBackground().invalidateSelf();
        }
        m();
        invalidate();
    }

    private void m() {
        ColorStateList valueOf;
        if (this.f33670n0 != null && this.f33671o0 != null) {
            if (w()) {
                com.google.android.material.shape.j jVar = this.f33670n0;
                if (this.f33612I.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f33641W0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f33680x0);
                }
                jVar.o0(valueOf);
                this.f33671o0.o0(ColorStateList.valueOf(this.f33680x0));
            }
            invalidate();
        }
    }

    private void n(@N RectF rectF) {
        float f4 = rectF.left;
        int i4 = this.f33674r0;
        rectF.left = f4 - i4;
        rectF.right += i4;
    }

    private void n0() {
        TextView textView = this.f33645a0;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void o() {
        int i4 = this.f33675s0;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    if (this.f33663j0 && !(this.f33669m0 instanceof com.google.android.material.textfield.d)) {
                        this.f33669m0 = new com.google.android.material.textfield.d(this.f33672p0);
                    } else {
                        this.f33669m0 = new com.google.android.material.shape.j(this.f33672p0);
                    }
                    this.f33670n0 = null;
                    this.f33671o0 = null;
                    return;
                }
                throw new IllegalArgumentException(this.f33675s0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f33669m0 = new com.google.android.material.shape.j(this.f33672p0);
            this.f33670n0 = new com.google.android.material.shape.j();
            this.f33671o0 = new com.google.android.material.shape.j();
            return;
        }
        this.f33669m0 = null;
        this.f33670n0 = null;
        this.f33671o0 = null;
    }

    private int p() {
        int i4 = this.f33681y0;
        if (this.f33675s0 == 1) {
            return s.l(s.e(this, a.c.f1979o3, 0), this.f33681y0);
        }
        return i4;
    }

    @N
    private Rect q(@N Rect rect) {
        if (this.f33612I != null) {
            Rect rect2 = this.f33600A0;
            boolean k4 = E.k(this);
            rect2.bottom = rect.bottom;
            int i4 = this.f33675s0;
            if (i4 != 1) {
                if (i4 != 2) {
                    rect2.left = J(rect.left, k4);
                    rect2.top = getPaddingTop();
                    rect2.right = K(rect.right, k4);
                    return rect2;
                }
                rect2.left = rect.left + this.f33612I.getPaddingLeft();
                rect2.top = rect.top - u();
                rect2.right = rect.right - this.f33612I.getPaddingRight();
                return rect2;
            }
            rect2.left = J(rect.left, k4);
            rect2.top = rect.top + this.f33676t0;
            rect2.right = K(rect.right, k4);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private void q0() {
        if (x0()) {
            C0823k0.I1(this.f33612I, this.f33669m0);
        }
    }

    private int r(@N Rect rect, @N Rect rect2, float f4) {
        if (a0()) {
            return (int) (rect2.top + f4);
        }
        return rect.bottom - this.f33612I.getCompoundPaddingBottom();
    }

    private static void r0(@N CheckableImageButton checkableImageButton, @P View.OnLongClickListener onLongClickListener) {
        boolean z3;
        boolean K02 = C0823k0.K0(checkableImageButton);
        boolean z4 = false;
        int i4 = 1;
        if (onLongClickListener != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (K02 || z3) {
            z4 = true;
        }
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(K02);
        checkableImageButton.setPressable(K02);
        checkableImageButton.setLongClickable(z3);
        if (!z4) {
            i4 = 2;
        }
        C0823k0.R1(checkableImageButton, i4);
    }

    private int s(@N Rect rect, float f4) {
        if (a0()) {
            return (int) (rect.centerY() - (f4 / 2.0f));
        }
        return rect.top + this.f33612I.getCompoundPaddingTop();
    }

    private static void s0(@N CheckableImageButton checkableImageButton, @P View.OnClickListener onClickListener, @P View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        r0(checkableImageButton, onLongClickListener);
    }

    private void setEditText(EditText editText) {
        if (this.f33612I == null) {
            if (this.f33609G0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(f33592s1, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f33612I = editText;
            int i4 = this.f33616K;
            if (i4 != -1) {
                setMinEms(i4);
            } else {
                setMinWidth(this.f33620M);
            }
            int i5 = this.f33618L;
            if (i5 != -1) {
                setMaxEms(i5);
            } else {
                setMaxWidth(this.f33622N);
            }
            d0();
            setTextInputAccessibilityDelegate(new e(this));
            this.f33658g1.M0(this.f33612I.getTypeface());
            this.f33658g1.w0(this.f33612I.getTextSize());
            this.f33658g1.r0(this.f33612I.getLetterSpacing());
            int gravity = this.f33612I.getGravity();
            this.f33658g1.k0((gravity & (-113)) | 48);
            this.f33658g1.v0(gravity);
            this.f33612I.addTextChangedListener(new a());
            if (this.f33637U0 == null) {
                this.f33637U0 = this.f33612I.getHintTextColors();
            }
            if (this.f33663j0) {
                if (TextUtils.isEmpty(this.f33665k0)) {
                    CharSequence hint = this.f33612I.getHint();
                    this.f33614J = hint;
                    setHint(hint);
                    this.f33612I.setHint((CharSequence) null);
                }
                this.f33667l0 = true;
            }
            if (this.f33632S != null) {
                D0(this.f33612I.getText().length());
            }
            I0();
            this.f33624O.f();
            this.f33606F.bringToFront();
            this.f33608G.bringToFront();
            this.f33610H.bringToFront();
            this.f33631R0.bringToFront();
            E();
            T0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            O0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f33665k0)) {
            this.f33665k0 = charSequence;
            this.f33658g1.K0(charSequence);
            if (!this.f33656f1) {
                e0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f33640W == z3) {
            return;
        }
        if (z3) {
            i();
        } else {
            n0();
            this.f33645a0 = null;
        }
        this.f33640W = z3;
    }

    @N
    private Rect t(@N Rect rect) {
        if (this.f33612I != null) {
            Rect rect2 = this.f33600A0;
            float D3 = this.f33658g1.D();
            rect2.left = rect.left + this.f33612I.getCompoundPaddingLeft();
            rect2.top = s(rect, D3);
            rect2.right = rect.right - this.f33612I.getCompoundPaddingRight();
            rect2.bottom = r(rect, rect2, D3);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private static void t0(@N CheckableImageButton checkableImageButton, @P View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        r0(checkableImageButton, onLongClickListener);
    }

    private int u() {
        float r4;
        if (!this.f33663j0) {
            return 0;
        }
        int i4 = this.f33675s0;
        if (i4 != 0) {
            if (i4 != 2) {
                return 0;
            }
            r4 = this.f33658g1.r() / 2.0f;
        } else {
            r4 = this.f33658g1.r();
        }
        return (int) r4;
    }

    private boolean v() {
        if (this.f33675s0 == 2 && w()) {
            return true;
        }
        return false;
    }

    private boolean v0() {
        if ((this.f33631R0.getVisibility() == 0 || ((L() && P()) || this.f33659h0 != null)) && this.f33608G.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean w() {
        if (this.f33677u0 > -1 && this.f33680x0 != 0) {
            return true;
        }
        return false;
    }

    private boolean w0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f33606F.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private boolean x0() {
        EditText editText = this.f33612I;
        if (editText != null && this.f33669m0 != null && editText.getBackground() == null && this.f33675s0 != 0) {
            return true;
        }
        return false;
    }

    private void y0() {
        if (this.f33645a0 != null && this.f33640W && !TextUtils.isEmpty(this.f33638V)) {
            this.f33645a0.setText(this.f33638V);
            androidx.transition.M.b(this.f33604E, this.f33651d0);
            this.f33645a0.setVisibility(0);
            this.f33645a0.bringToFront();
            announceForAccessibility(this.f33638V);
        }
    }

    private void z() {
        if (C()) {
            ((com.google.android.material.textfield.d) this.f33669m0).Q0();
        }
    }

    private void z0(boolean z3) {
        if (z3 && getEndIconDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.d.r(getEndIconDrawable()).mutate();
            androidx.core.graphics.drawable.d.n(mutate, this.f33624O.q());
            this.f33613I0.setImageDrawable(mutate);
            return;
        }
        com.google.android.material.textfield.g.a(this, this.f33613I0, this.f33617K0, this.f33619L0);
    }

    @i0
    boolean D() {
        if (C() && ((com.google.android.material.textfield.d) this.f33669m0).P0()) {
            return true;
        }
        return false;
    }

    void D0(int i4) {
        boolean z3;
        boolean z4 = this.f33630R;
        int i5 = this.f33628Q;
        if (i5 == -1) {
            this.f33632S.setText(String.valueOf(i4));
            this.f33632S.setContentDescription(null);
            this.f33630R = false;
        } else {
            if (i4 > i5) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f33630R = z3;
            E0(getContext(), this.f33632S, i4, this.f33628Q, this.f33630R);
            if (z4 != this.f33630R) {
                F0();
            }
            this.f33632S.setText(C0753a.c().q(getContext().getString(a.m.f3049G, Integer.valueOf(i4), Integer.valueOf(this.f33628Q))));
        }
        if (this.f33612I != null && z4 != this.f33630R) {
            N0(false);
            V0();
            I0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean H0() {
        boolean z3;
        if (this.f33612I == null) {
            return false;
        }
        boolean z4 = true;
        if (w0()) {
            int measuredWidth = this.f33606F.getMeasuredWidth() - this.f33612I.getPaddingLeft();
            if (this.f33603D0 == null || this.f33605E0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f33603D0 = colorDrawable;
                this.f33605E0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] h4 = r.h(this.f33612I);
            Drawable drawable = h4[0];
            Drawable drawable2 = this.f33603D0;
            if (drawable != drawable2) {
                r.w(this.f33612I, drawable2, h4[1], h4[2], h4[3]);
                z3 = true;
            }
            z3 = false;
        } else {
            if (this.f33603D0 != null) {
                Drawable[] h5 = r.h(this.f33612I);
                r.w(this.f33612I, null, h5[1], h5[2], h5[3]);
                this.f33603D0 = null;
                z3 = true;
            }
            z3 = false;
        }
        if (v0()) {
            int measuredWidth2 = this.f33661i0.getMeasuredWidth() - this.f33612I.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + H.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] h6 = r.h(this.f33612I);
            Drawable drawable3 = this.f33621M0;
            if (drawable3 != null && this.f33623N0 != measuredWidth2) {
                this.f33623N0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                r.w(this.f33612I, h6[0], h6[1], this.f33621M0, h6[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f33621M0 = colorDrawable2;
                    this.f33623N0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = h6[2];
                Drawable drawable5 = this.f33621M0;
                if (drawable4 != drawable5) {
                    this.f33625O0 = drawable4;
                    r.w(this.f33612I, h6[0], h6[1], drawable5, h6[3]);
                } else {
                    z4 = z3;
                }
            }
        } else if (this.f33621M0 != null) {
            Drawable[] h7 = r.h(this.f33612I);
            if (h7[2] == this.f33621M0) {
                r.w(this.f33612I, h7[0], h7[1], this.f33625O0, h7[3]);
            } else {
                z4 = z3;
            }
            this.f33621M0 = null;
        } else {
            return z3;
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f33612I;
        if (editText == null || this.f33675s0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (L.a(background)) {
            background = background.mutate();
        }
        if (this.f33624O.m()) {
            background.setColorFilter(C0599l.e(this.f33624O.q(), PorterDuff.Mode.SRC_IN));
        } else if (this.f33630R && (textView = this.f33632S) != null) {
            background.setColorFilter(C0599l.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            androidx.core.graphics.drawable.d.c(background);
            this.f33612I.refreshDrawableState();
        }
    }

    public boolean N() {
        return this.f33626P;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N0(boolean z3) {
        O0(z3, false);
    }

    public boolean O() {
        return this.f33613I0.a();
    }

    public boolean P() {
        if (this.f33610H.getVisibility() == 0 && this.f33613I0.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        return this.f33624O.E();
    }

    public boolean S() {
        return this.f33660h1;
    }

    @i0
    final boolean T() {
        return this.f33624O.x();
    }

    public boolean U() {
        return this.f33624O.F();
    }

    public boolean V() {
        return this.f33662i1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V0() {
        boolean z3;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f33669m0 != null && this.f33675s0 != 0) {
            boolean z4 = false;
            if (!isFocused() && ((editText2 = this.f33612I) == null || !editText2.hasFocus())) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (isHovered() || ((editText = this.f33612I) != null && editText.isHovered())) {
                z4 = true;
            }
            if (!isEnabled()) {
                this.f33680x0 = this.f33654e1;
            } else if (this.f33624O.m()) {
                if (this.f33644Z0 != null) {
                    S0(z3, z4);
                } else {
                    this.f33680x0 = this.f33624O.q();
                }
            } else if (this.f33630R && (textView = this.f33632S) != null) {
                if (this.f33644Z0 != null) {
                    S0(z3, z4);
                } else {
                    this.f33680x0 = textView.getCurrentTextColor();
                }
            } else if (z3) {
                this.f33680x0 = this.f33643Y0;
            } else if (z4) {
                this.f33680x0 = this.f33642X0;
            } else {
                this.f33680x0 = this.f33641W0;
            }
            L0();
            j0();
            k0();
            i0();
            if (getEndIconDelegate().d()) {
                z0(this.f33624O.m());
            }
            if (this.f33675s0 == 2) {
                int i4 = this.f33677u0;
                if (z3 && isEnabled()) {
                    this.f33677u0 = this.f33679w0;
                } else {
                    this.f33677u0 = this.f33678v0;
                }
                if (this.f33677u0 != i4) {
                    g0();
                }
            }
            if (this.f33675s0 == 1) {
                if (!isEnabled()) {
                    this.f33681y0 = this.f33648b1;
                } else if (z4 && !z3) {
                    this.f33681y0 = this.f33652d1;
                } else if (z3) {
                    this.f33681y0 = this.f33650c1;
                } else {
                    this.f33681y0 = this.f33646a1;
                }
            }
            l();
        }
    }

    public boolean W() {
        return this.f33663j0;
    }

    final boolean X() {
        return this.f33656f1;
    }

    @Deprecated
    public boolean Y() {
        if (this.f33609G0 == 1) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean Z() {
        return this.f33667l0;
    }

    @Override // android.view.ViewGroup
    public void addView(@N View view, int i4, @N ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f33604E.addView(view, layoutParams2);
            this.f33604E.setLayoutParams(layoutParams);
            M0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i4, layoutParams);
    }

    public boolean b0() {
        return this.f33606F.h();
    }

    public boolean c0() {
        return this.f33606F.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@N ViewStructure viewStructure, int i4) {
        AutofillId autofillId;
        EditText editText = this.f33612I;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        if (this.f33614J == null) {
            autofillId = getAutofillId();
            viewStructure.setAutofillId(autofillId);
            onProvideAutofillStructure(viewStructure, i4);
            onProvideAutofillVirtualStructure(viewStructure, i4);
            viewStructure.setChildCount(this.f33604E.getChildCount());
            for (int i5 = 0; i5 < this.f33604E.getChildCount(); i5++) {
                View childAt = this.f33604E.getChildAt(i5);
                ViewStructure newChild = viewStructure.newChild(i5);
                childAt.dispatchProvideAutofillStructure(newChild, i4);
                if (childAt == this.f33612I) {
                    newChild.setHint(getHint());
                }
            }
            return;
        }
        boolean z3 = this.f33667l0;
        this.f33667l0 = false;
        CharSequence hint = editText.getHint();
        this.f33612I.setHint(this.f33614J);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
        } finally {
            this.f33612I.setHint(hint);
            this.f33667l0 = z3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(@N SparseArray<Parcelable> sparseArray) {
        this.f33668l1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f33668l1 = false;
    }

    @Override // android.view.View
    public void draw(@N Canvas canvas) {
        super.draw(canvas);
        H(canvas);
        G(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z3;
        if (this.f33666k1) {
            return;
        }
        boolean z4 = true;
        this.f33666k1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1781b c1781b = this.f33658g1;
        if (c1781b != null) {
            z3 = c1781b.J0(drawableState);
        } else {
            z3 = false;
        }
        if (this.f33612I != null) {
            if (!C0823k0.U0(this) || !isEnabled()) {
                z4 = false;
            }
            N0(z4);
        }
        I0();
        V0();
        if (z3) {
            invalidate();
        }
        this.f33666k1 = false;
    }

    @Deprecated
    public void f0(boolean z3) {
        if (this.f33609G0 == 1) {
            this.f33613I0.performClick();
            if (z3) {
                this.f33613I0.jumpDrawablesToCurrentState();
            }
        }
    }

    public void g(@N h hVar) {
        this.f33607F0.add(hVar);
        if (this.f33612I != null) {
            hVar.a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f33612I;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public com.google.android.material.shape.j getBoxBackground() {
        int i4 = this.f33675s0;
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException();
        }
        return this.f33669m0;
    }

    public int getBoxBackgroundColor() {
        return this.f33681y0;
    }

    public int getBoxBackgroundMode() {
        return this.f33675s0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f33676t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (E.k(this)) {
            return this.f33672p0.j().a(this.f33601B0);
        }
        return this.f33672p0.l().a(this.f33601B0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (E.k(this)) {
            return this.f33672p0.l().a(this.f33601B0);
        }
        return this.f33672p0.j().a(this.f33601B0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (E.k(this)) {
            return this.f33672p0.r().a(this.f33601B0);
        }
        return this.f33672p0.t().a(this.f33601B0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (E.k(this)) {
            return this.f33672p0.t().a(this.f33601B0);
        }
        return this.f33672p0.r().a(this.f33601B0);
    }

    public int getBoxStrokeColor() {
        return this.f33643Y0;
    }

    @P
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f33644Z0;
    }

    public int getBoxStrokeWidth() {
        return this.f33678v0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f33679w0;
    }

    public int getCounterMaxLength() {
        return this.f33628Q;
    }

    @P
    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f33626P && this.f33630R && (textView = this.f33632S) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @P
    public ColorStateList getCounterOverflowTextColor() {
        return this.f33655f0;
    }

    @P
    public ColorStateList getCounterTextColor() {
        return this.f33655f0;
    }

    @P
    public ColorStateList getDefaultHintTextColor() {
        return this.f33637U0;
    }

    @P
    public EditText getEditText() {
        return this.f33612I;
    }

    @P
    public CharSequence getEndIconContentDescription() {
        return this.f33613I0.getContentDescription();
    }

    @P
    public Drawable getEndIconDrawable() {
        return this.f33613I0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f33609G0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public CheckableImageButton getEndIconView() {
        return this.f33613I0;
    }

    @P
    public CharSequence getError() {
        if (this.f33624O.E()) {
            return this.f33624O.p();
        }
        return null;
    }

    @P
    public CharSequence getErrorContentDescription() {
        return this.f33624O.o();
    }

    @InterfaceC0569l
    public int getErrorCurrentTextColors() {
        return this.f33624O.q();
    }

    @P
    public Drawable getErrorIconDrawable() {
        return this.f33631R0.getDrawable();
    }

    @i0
    final int getErrorTextCurrentColor() {
        return this.f33624O.q();
    }

    @P
    public CharSequence getHelperText() {
        if (this.f33624O.F()) {
            return this.f33624O.s();
        }
        return null;
    }

    @InterfaceC0569l
    public int getHelperTextCurrentTextColor() {
        return this.f33624O.v();
    }

    @P
    public CharSequence getHint() {
        if (this.f33663j0) {
            return this.f33665k0;
        }
        return null;
    }

    @i0
    final float getHintCollapsedTextHeight() {
        return this.f33658g1.r();
    }

    @i0
    final int getHintCurrentCollapsedTextColor() {
        return this.f33658g1.w();
    }

    @P
    public ColorStateList getHintTextColor() {
        return this.f33639V0;
    }

    public int getMaxEms() {
        return this.f33618L;
    }

    @U
    public int getMaxWidth() {
        return this.f33622N;
    }

    public int getMinEms() {
        return this.f33616K;
    }

    @U
    public int getMinWidth() {
        return this.f33620M;
    }

    @P
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f33613I0.getContentDescription();
    }

    @P
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f33613I0.getDrawable();
    }

    @P
    public CharSequence getPlaceholderText() {
        if (this.f33640W) {
            return this.f33638V;
        }
        return null;
    }

    @d0
    public int getPlaceholderTextAppearance() {
        return this.f33649c0;
    }

    @P
    public ColorStateList getPlaceholderTextColor() {
        return this.f33647b0;
    }

    @P
    public CharSequence getPrefixText() {
        return this.f33606F.a();
    }

    @P
    public ColorStateList getPrefixTextColor() {
        return this.f33606F.b();
    }

    @N
    public TextView getPrefixTextView() {
        return this.f33606F.c();
    }

    @P
    public CharSequence getStartIconContentDescription() {
        return this.f33606F.d();
    }

    @P
    public Drawable getStartIconDrawable() {
        return this.f33606F.e();
    }

    @P
    public CharSequence getSuffixText() {
        return this.f33659h0;
    }

    @P
    public ColorStateList getSuffixTextColor() {
        return this.f33661i0.getTextColors();
    }

    @N
    public TextView getSuffixTextView() {
        return this.f33661i0;
    }

    @P
    public Typeface getTypeface() {
        return this.f33602C0;
    }

    public void h(@N i iVar) {
        this.f33615J0.add(iVar);
    }

    public void i0() {
        com.google.android.material.textfield.g.c(this, this.f33613I0, this.f33617K0);
    }

    public void j0() {
        com.google.android.material.textfield.g.c(this, this.f33631R0, this.f33633S0);
    }

    @i0
    void k(float f4) {
        if (this.f33658g1.G() == f4) {
            return;
        }
        if (this.f33664j1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f33664j1 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.animation.a.f31208b);
            this.f33664j1.setDuration(167L);
            this.f33664j1.addUpdateListener(new d());
        }
        this.f33664j1.setFloatValues(this.f33658g1.G(), f4);
        this.f33664j1.start();
    }

    public void k0() {
        this.f33606F.k();
    }

    public void l0(@N h hVar) {
        this.f33607F0.remove(hVar);
    }

    public void m0(@N i iVar) {
        this.f33615J0.remove(iVar);
    }

    public void o0(float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        boolean k4 = E.k(this);
        this.f33673q0 = k4;
        if (k4) {
            f8 = f5;
        } else {
            f8 = f4;
        }
        if (!k4) {
            f4 = f5;
        }
        if (k4) {
            f9 = f7;
        } else {
            f9 = f6;
        }
        if (!k4) {
            f6 = f7;
        }
        com.google.android.material.shape.j jVar = this.f33669m0;
        if (jVar == null || jVar.S() != f8 || this.f33669m0.T() != f4 || this.f33669m0.t() != f9 || this.f33669m0.u() != f6) {
            this.f33672p0 = this.f33672p0.v().K(f8).P(f4).x(f9).C(f6).m();
            l();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f33658g1.Z(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        EditText editText = this.f33612I;
        if (editText != null) {
            Rect rect = this.f33682z0;
            C1783d.a(this, editText, rect);
            B0(rect);
            if (this.f33663j0) {
                this.f33658g1.w0(this.f33612I.getTextSize());
                int gravity = this.f33612I.getGravity();
                this.f33658g1.k0((gravity & (-113)) | 48);
                this.f33658g1.v0(gravity);
                this.f33658g1.g0(q(rect));
                this.f33658g1.q0(t(rect));
                this.f33658g1.c0();
                if (C() && !this.f33656f1) {
                    e0();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        boolean J02 = J0();
        boolean H02 = H0();
        if (J02 || H02) {
            this.f33612I.post(new c());
        }
        P0();
        T0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.a());
        setError(jVar.f33688G);
        if (jVar.f33689H) {
            this.f33613I0.post(new b());
        }
        setHint(jVar.f33690I);
        setHelperText(jVar.f33691J);
        setPlaceholderText(jVar.f33692K);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i4) {
        boolean z3;
        float f4;
        float f5;
        super.onRtlPropertiesChanged(i4);
        boolean z4 = false;
        if (i4 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = this.f33673q0;
        if (z3 != z5) {
            if (z3 && !z5) {
                z4 = true;
            }
            float a4 = this.f33672p0.r().a(this.f33601B0);
            float a5 = this.f33672p0.t().a(this.f33601B0);
            float a6 = this.f33672p0.j().a(this.f33601B0);
            float a7 = this.f33672p0.l().a(this.f33601B0);
            if (z4) {
                f4 = a4;
            } else {
                f4 = a5;
            }
            if (z4) {
                a4 = a5;
            }
            if (z4) {
                f5 = a6;
            } else {
                f5 = a7;
            }
            if (z4) {
                a6 = a7;
            }
            o0(f4, a4, f5, a6);
        }
    }

    @Override // android.view.View
    @P
    public Parcelable onSaveInstanceState() {
        boolean z3;
        j jVar = new j(super.onSaveInstanceState());
        if (this.f33624O.m()) {
            jVar.f33688G = getError();
        }
        if (L() && this.f33613I0.isChecked()) {
            z3 = true;
        } else {
            z3 = false;
        }
        jVar.f33689H = z3;
        jVar.f33690I = getHint();
        jVar.f33691J = getHelperText();
        jVar.f33692K = getPlaceholderText();
        return jVar;
    }

    public void p0(@InterfaceC0574q int i4, @InterfaceC0574q int i5, @InterfaceC0574q int i6, @InterfaceC0574q int i7) {
        o0(getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i7), getContext().getResources().getDimension(i6));
    }

    public void setBoxBackgroundColor(@InterfaceC0569l int i4) {
        if (this.f33681y0 != i4) {
            this.f33681y0 = i4;
            this.f33646a1 = i4;
            this.f33650c1 = i4;
            this.f33652d1 = i4;
            l();
        }
    }

    public void setBoxBackgroundColorResource(@InterfaceC0571n int i4) {
        setBoxBackgroundColor(C0669d.f(getContext(), i4));
    }

    public void setBoxBackgroundColorStateList(@N ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f33646a1 = defaultColor;
        this.f33681y0 = defaultColor;
        this.f33648b1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f33650c1 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f33652d1 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        l();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.f33675s0) {
            return;
        }
        this.f33675s0 = i4;
        if (this.f33612I != null) {
            d0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i4) {
        this.f33676t0 = i4;
    }

    public void setBoxStrokeColor(@InterfaceC0569l int i4) {
        if (this.f33643Y0 != i4) {
            this.f33643Y0 = i4;
            V0();
        }
    }

    public void setBoxStrokeColorStateList(@N ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f33641W0 = colorStateList.getDefaultColor();
            this.f33654e1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f33642X0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f33643Y0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f33643Y0 != colorStateList.getDefaultColor()) {
            this.f33643Y0 = colorStateList.getDefaultColor();
        }
        V0();
    }

    public void setBoxStrokeErrorColor(@P ColorStateList colorStateList) {
        if (this.f33644Z0 != colorStateList) {
            this.f33644Z0 = colorStateList;
            V0();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f33678v0 = i4;
        V0();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f33679w0 = i4;
        V0();
    }

    public void setBoxStrokeWidthFocusedResource(@InterfaceC0574q int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(@InterfaceC0574q int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f33626P != z3) {
            if (z3) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f33632S = appCompatTextView;
                appCompatTextView.setId(a.h.L5);
                Typeface typeface = this.f33602C0;
                if (typeface != null) {
                    this.f33632S.setTypeface(typeface);
                }
                this.f33632S.setMaxLines(1);
                this.f33624O.e(this.f33632S, 2);
                H.h((ViewGroup.MarginLayoutParams) this.f33632S.getLayoutParams(), getResources().getDimensionPixelOffset(a.f.s9));
                F0();
                C0();
            } else {
                this.f33624O.G(this.f33632S, 2);
                this.f33632S = null;
            }
            this.f33626P = z3;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f33628Q != i4) {
            if (i4 > 0) {
                this.f33628Q = i4;
            } else {
                this.f33628Q = -1;
            }
            if (this.f33626P) {
                C0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f33634T != i4) {
            this.f33634T = i4;
            F0();
        }
    }

    public void setCounterOverflowTextColor(@P ColorStateList colorStateList) {
        if (this.f33657g0 != colorStateList) {
            this.f33657g0 = colorStateList;
            F0();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f33636U != i4) {
            this.f33636U = i4;
            F0();
        }
    }

    public void setCounterTextColor(@P ColorStateList colorStateList) {
        if (this.f33655f0 != colorStateList) {
            this.f33655f0 = colorStateList;
            F0();
        }
    }

    public void setDefaultHintTextColor(@P ColorStateList colorStateList) {
        this.f33637U0 = colorStateList;
        this.f33639V0 = colorStateList;
        if (this.f33612I != null) {
            N0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        h0(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f33613I0.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f33613I0.setCheckable(z3);
    }

    public void setEndIconContentDescription(@c0 int i4) {
        setEndIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setEndIconDrawable(@InterfaceC0578v int i4) {
        setEndIconDrawable(i4 != 0 ? C2046a.b(getContext(), i4) : null);
    }

    public void setEndIconMode(int i4) {
        boolean z3;
        int i5 = this.f33609G0;
        if (i5 == i4) {
            return;
        }
        this.f33609G0 = i4;
        F(i5);
        if (i4 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        setEndIconVisible(z3);
        if (getEndIconDelegate().b(this.f33675s0)) {
            getEndIconDelegate().a();
            com.google.android.material.textfield.g.a(this, this.f33613I0, this.f33617K0, this.f33619L0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f33675s0 + " is not supported by the end icon mode " + i4);
    }

    public void setEndIconOnClickListener(@P View.OnClickListener onClickListener) {
        s0(this.f33613I0, onClickListener, this.f33627P0);
    }

    public void setEndIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        this.f33627P0 = onLongClickListener;
        t0(this.f33613I0, onLongClickListener);
    }

    public void setEndIconTintList(@P ColorStateList colorStateList) {
        if (this.f33617K0 != colorStateList) {
            this.f33617K0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f33613I0, colorStateList, this.f33619L0);
        }
    }

    public void setEndIconTintMode(@P PorterDuff.Mode mode) {
        if (this.f33619L0 != mode) {
            this.f33619L0 = mode;
            com.google.android.material.textfield.g.a(this, this.f33613I0, this.f33617K0, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        int i4;
        if (P() != z3) {
            CheckableImageButton checkableImageButton = this.f33613I0;
            if (z3) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            checkableImageButton.setVisibility(i4);
            K0();
            T0();
            H0();
        }
    }

    public void setError(@P CharSequence charSequence) {
        if (!this.f33624O.E()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f33624O.T(charSequence);
        } else {
            this.f33624O.z();
        }
    }

    public void setErrorContentDescription(@P CharSequence charSequence) {
        this.f33624O.I(charSequence);
    }

    public void setErrorEnabled(boolean z3) {
        this.f33624O.J(z3);
    }

    public void setErrorIconDrawable(@InterfaceC0578v int i4) {
        setErrorIconDrawable(i4 != 0 ? C2046a.b(getContext(), i4) : null);
        j0();
    }

    public void setErrorIconOnClickListener(@P View.OnClickListener onClickListener) {
        s0(this.f33631R0, onClickListener, this.f33629Q0);
    }

    public void setErrorIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        this.f33629Q0 = onLongClickListener;
        t0(this.f33631R0, onLongClickListener);
    }

    public void setErrorIconTintList(@P ColorStateList colorStateList) {
        if (this.f33633S0 != colorStateList) {
            this.f33633S0 = colorStateList;
            com.google.android.material.textfield.g.a(this, this.f33631R0, colorStateList, this.f33635T0);
        }
    }

    public void setErrorIconTintMode(@P PorterDuff.Mode mode) {
        if (this.f33635T0 != mode) {
            this.f33635T0 = mode;
            com.google.android.material.textfield.g.a(this, this.f33631R0, this.f33633S0, mode);
        }
    }

    public void setErrorTextAppearance(@d0 int i4) {
        this.f33624O.K(i4);
    }

    public void setErrorTextColor(@P ColorStateList colorStateList) {
        this.f33624O.L(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f33660h1 != z3) {
            this.f33660h1 = z3;
            N0(false);
        }
    }

    public void setHelperText(@P CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (U()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!U()) {
                setHelperTextEnabled(true);
            }
            this.f33624O.U(charSequence);
        }
    }

    public void setHelperTextColor(@P ColorStateList colorStateList) {
        this.f33624O.O(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        this.f33624O.N(z3);
    }

    public void setHelperTextTextAppearance(@d0 int i4) {
        this.f33624O.M(i4);
    }

    public void setHint(@P CharSequence charSequence) {
        if (this.f33663j0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f33662i1 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f33663j0) {
            this.f33663j0 = z3;
            if (!z3) {
                this.f33667l0 = false;
                if (!TextUtils.isEmpty(this.f33665k0) && TextUtils.isEmpty(this.f33612I.getHint())) {
                    this.f33612I.setHint(this.f33665k0);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f33612I.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f33665k0)) {
                        setHint(hint);
                    }
                    this.f33612I.setHint((CharSequence) null);
                }
                this.f33667l0 = true;
            }
            if (this.f33612I != null) {
                M0();
            }
        }
    }

    public void setHintTextAppearance(@d0 int i4) {
        this.f33658g1.h0(i4);
        this.f33639V0 = this.f33658g1.p();
        if (this.f33612I != null) {
            N0(false);
            M0();
        }
    }

    public void setHintTextColor(@P ColorStateList colorStateList) {
        if (this.f33639V0 != colorStateList) {
            if (this.f33637U0 == null) {
                this.f33658g1.j0(colorStateList);
            }
            this.f33639V0 = colorStateList;
            if (this.f33612I != null) {
                N0(false);
            }
        }
    }

    public void setMaxEms(int i4) {
        this.f33618L = i4;
        EditText editText = this.f33612I;
        if (editText != null && i4 != -1) {
            editText.setMaxEms(i4);
        }
    }

    public void setMaxWidth(@U int i4) {
        this.f33622N = i4;
        EditText editText = this.f33612I;
        if (editText != null && i4 != -1) {
            editText.setMaxWidth(i4);
        }
    }

    public void setMaxWidthResource(@InterfaceC0574q int i4) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    public void setMinEms(int i4) {
        this.f33616K = i4;
        EditText editText = this.f33612I;
        if (editText != null && i4 != -1) {
            editText.setMinEms(i4);
        }
    }

    public void setMinWidth(@U int i4) {
        this.f33620M = i4;
        EditText editText = this.f33612I;
        if (editText != null && i4 != -1) {
            editText.setMinWidth(i4);
        }
    }

    public void setMinWidthResource(@InterfaceC0574q int i4) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i4));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@c0 int i4) {
        setPasswordVisibilityToggleContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@InterfaceC0578v int i4) {
        setPasswordVisibilityToggleDrawable(i4 != 0 ? C2046a.b(getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        if (z3 && this.f33609G0 != 1) {
            setEndIconMode(1);
        } else if (!z3) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@P ColorStateList colorStateList) {
        this.f33617K0 = colorStateList;
        com.google.android.material.textfield.g.a(this, this.f33613I0, colorStateList, this.f33619L0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@P PorterDuff.Mode mode) {
        this.f33619L0 = mode;
        com.google.android.material.textfield.g.a(this, this.f33613I0, this.f33617K0, mode);
    }

    public void setPlaceholderText(@P CharSequence charSequence) {
        if (this.f33645a0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f33645a0 = appCompatTextView;
            appCompatTextView.setId(a.h.O5);
            C0823k0.R1(this.f33645a0, 2);
            C0980n B3 = B();
            this.f33651d0 = B3;
            B3.B0(f33589p1);
            this.f33653e0 = B();
            setPlaceholderTextAppearance(this.f33649c0);
            setPlaceholderTextColor(this.f33647b0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f33640W) {
                setPlaceholderTextEnabled(true);
            }
            this.f33638V = charSequence;
        }
        Q0();
    }

    public void setPlaceholderTextAppearance(@d0 int i4) {
        this.f33649c0 = i4;
        TextView textView = this.f33645a0;
        if (textView != null) {
            r.E(textView, i4);
        }
    }

    public void setPlaceholderTextColor(@P ColorStateList colorStateList) {
        if (this.f33647b0 != colorStateList) {
            this.f33647b0 = colorStateList;
            TextView textView = this.f33645a0;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@P CharSequence charSequence) {
        this.f33606F.l(charSequence);
    }

    public void setPrefixTextAppearance(@d0 int i4) {
        this.f33606F.m(i4);
    }

    public void setPrefixTextColor(@N ColorStateList colorStateList) {
        this.f33606F.n(colorStateList);
    }

    public void setStartIconCheckable(boolean z3) {
        this.f33606F.o(z3);
    }

    public void setStartIconContentDescription(@c0 int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconDrawable(@InterfaceC0578v int i4) {
        setStartIconDrawable(i4 != 0 ? C2046a.b(getContext(), i4) : null);
    }

    public void setStartIconOnClickListener(@P View.OnClickListener onClickListener) {
        this.f33606F.r(onClickListener);
    }

    public void setStartIconOnLongClickListener(@P View.OnLongClickListener onLongClickListener) {
        this.f33606F.s(onLongClickListener);
    }

    public void setStartIconTintList(@P ColorStateList colorStateList) {
        this.f33606F.t(colorStateList);
    }

    public void setStartIconTintMode(@P PorterDuff.Mode mode) {
        this.f33606F.u(mode);
    }

    public void setStartIconVisible(boolean z3) {
        this.f33606F.v(z3);
    }

    public void setSuffixText(@P CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f33659h0 = charSequence2;
        this.f33661i0.setText(charSequence);
        U0();
    }

    public void setSuffixTextAppearance(@d0 int i4) {
        r.E(this.f33661i0, i4);
    }

    public void setSuffixTextColor(@N ColorStateList colorStateList) {
        this.f33661i0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@P e eVar) {
        EditText editText = this.f33612I;
        if (editText != null) {
            C0823k0.B1(editText, eVar);
        }
    }

    public void setTypeface(@P Typeface typeface) {
        if (typeface != this.f33602C0) {
            this.f33602C0 = typeface;
            this.f33658g1.M0(typeface);
            this.f33624O.Q(typeface);
            TextView textView = this.f33632S;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u0(@N TextView textView, @d0 int i4) {
        try {
            r.E(textView, i4);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        r.E(textView, a.n.y6);
        textView.setTextColor(C0669d.f(getContext(), a.e.f2243w0));
    }

    public void x() {
        this.f33607F0.clear();
    }

    public void y() {
        this.f33615J0.clear();
    }

    public TextInputLayout(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Fg);
    }

    public void setEndIconContentDescription(@P CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f33613I0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@P Drawable drawable) {
        this.f33613I0.setImageDrawable(drawable);
        if (drawable != null) {
            com.google.android.material.textfield.g.a(this, this.f33613I0, this.f33617K0, this.f33619L0);
            i0();
        }
    }

    public void setStartIconContentDescription(@P CharSequence charSequence) {
        this.f33606F.p(charSequence);
    }

    public void setStartIconDrawable(@P Drawable drawable) {
        this.f33606F.q(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.N android.content.Context r27, @androidx.annotation.P android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(@P Drawable drawable) {
        this.f33631R0.setImageDrawable(drawable);
        L0();
        com.google.android.material.textfield.g.a(this, this.f33631R0, this.f33633S0, this.f33635T0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@P CharSequence charSequence) {
        this.f33613I0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@P Drawable drawable) {
        this.f33613I0.setImageDrawable(drawable);
    }

    public void setHint(@c0 int i4) {
        setHint(i4 != 0 ? getResources().getText(i4) : null);
    }
}
