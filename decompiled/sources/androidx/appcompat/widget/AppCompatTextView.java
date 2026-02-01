package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.core.text.z;
import androidx.core.view.InterfaceC0814h0;
import e.C2046a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0814h0, androidx.core.widget.v, androidx.core.widget.b, N {

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f5613E;

    /* renamed from: F, reason: collision with root package name */
    private final A f5614F;

    /* renamed from: G, reason: collision with root package name */
    private final C0612z f5615G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.N
    private C0602o f5616H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f5617I;

    /* renamed from: J, reason: collision with root package name */
    @androidx.annotation.P
    private a f5618J;

    /* renamed from: K, reason: collision with root package name */
    @androidx.annotation.P
    private Future<androidx.core.text.z> f5619K;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        TextClassifier a();

        void b(@androidx.annotation.P TextClassifier textClassifier);

        void c(@androidx.annotation.U int i4);

        void d(@androidx.annotation.U int i4);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4);

        void setAutoSizeTextTypeWithDefaults(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(api = 26)
    /* loaded from: classes.dex */
    public class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier a() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(@androidx.annotation.P TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeWithDefaults(int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(api = 28)
    /* loaded from: classes.dex */
    public class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void c(@androidx.annotation.U int i4) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void d(@androidx.annotation.U int i4) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i4);
        }
    }

    public AppCompatTextView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    @androidx.annotation.N
    private C0602o getEmojiTextViewHelper() {
        if (this.f5616H == null) {
            this.f5616H = new C0602o(this);
        }
        return this.f5616H;
    }

    private void t() {
        Future<androidx.core.text.z> future = this.f5619K;
        if (future != null) {
            try {
                this.f5619K = null;
                androidx.core.widget.r.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // androidx.appcompat.widget.N
    public boolean b() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            c0593f.b();
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (q0.f6311c) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            return a4.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (q0.f6311c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            return a4.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (q0.f6311c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            return a4.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (q0.f6311c) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            return a4.h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (q0.f6311c) {
            if (getSuperCaller().getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        A a4 = this.f5614F;
        if (a4 == null) {
            return 0;
        }
        return a4.i();
    }

    @Override // android.widget.TextView
    @androidx.annotation.P
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.r.G(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.r.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.r.j(this);
    }

    @androidx.annotation.W(api = 26)
    @androidx.annotation.h0
    a getSuperCaller() {
        if (this.f5618J == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                this.f5618J = new c();
            } else if (i4 >= 26) {
                this.f5618J = new b();
            }
        }
        return this.f5618J;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5614F.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5614F.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        t();
        return super.getText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.N
    @androidx.annotation.W(api = 26)
    public TextClassifier getTextClassifier() {
        C0612z c0612z;
        if (Build.VERSION.SDK_INT < 28 && (c0612z = this.f5615G) != null) {
            return c0612z.a();
        }
        return getSuperCaller().a();
    }

    @androidx.annotation.N
    public z.a getTextMetricsParamsCompat() {
        return androidx.core.widget.r.o(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5614F.r(this, onCreateInputConnection, editorInfo);
        return C0603p.a(onCreateInputConnection, editorInfo, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.o(z3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        t();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        A a4 = this.f5614F;
        if (a4 != null && !q0.f6311c && a4.l()) {
            this.f5614F.c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (q0.f6311c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.N int[] iArr, int i4) throws IllegalArgumentException {
        if (q0.f6311c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.u(iArr, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (q0.f6311c) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.P Drawable drawable, @androidx.annotation.P Drawable drawable2, @androidx.annotation.P Drawable drawable3, @androidx.annotation.P Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.P ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.r.H(this, callback));
    }

    @Override // androidx.appcompat.widget.N
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.N InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.U @androidx.annotation.F(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i4);
        } else {
            androidx.core.widget.r.A(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.U @androidx.annotation.F(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i4);
        } else {
            androidx.core.widget.r.B(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.U @androidx.annotation.F(from = 0) int i4) {
        androidx.core.widget.r.C(this, i4);
    }

    public void setPrecomputedText(@androidx.annotation.N androidx.core.text.z zVar) {
        androidx.core.widget.r.D(this, zVar);
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f5613E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.P ColorStateList colorStateList) {
        this.f5614F.w(colorStateList);
        this.f5614F.b();
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        this.f5614F.x(mode);
        this.f5614F.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(api = 26)
    public void setTextClassifier(@androidx.annotation.P TextClassifier textClassifier) {
        C0612z c0612z;
        if (Build.VERSION.SDK_INT < 28 && (c0612z = this.f5615G) != null) {
            c0612z.b(textClassifier);
        } else {
            getSuperCaller().b(textClassifier);
        }
    }

    public void setTextFuture(@androidx.annotation.P Future<androidx.core.text.z> future) {
        this.f5619K = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@androidx.annotation.N z.a aVar) {
        androidx.core.widget.r.F(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (q0.f6311c) {
            super.setTextSize(i4, f4);
            return;
        }
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.A(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.P Typeface typeface, int i4) {
        Typeface typeface2;
        if (this.f5617I) {
            return;
        }
        if (typeface != null && i4 > 0) {
            typeface2 = androidx.core.graphics.T.b(getContext(), typeface, i4);
        } else {
            typeface2 = null;
        }
        this.f5617I = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.f5617I = false;
        }
    }

    public AppCompatTextView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(d0.b(context), attributeSet, i4);
        this.f5617I = false;
        this.f5618J = null;
        b0.a(this, getContext());
        C0593f c0593f = new C0593f(this);
        this.f5613E = c0593f;
        c0593f.e(attributeSet, i4);
        A a4 = new A(this);
        this.f5614F = a4;
        a4.m(attributeSet, i4);
        a4.b();
        this.f5615G = new C0612z(this);
        getEmojiTextViewHelper().c(attributeSet, i4);
    }

    @Override // android.widget.TextView
    @androidx.annotation.W(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? C2046a.b(context, i4) : null, i5 != 0 ? C2046a.b(context, i5) : null, i6 != 0 ? C2046a.b(context, i6) : null, i7 != 0 ? C2046a.b(context, i7) : null);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? C2046a.b(context, i4) : null, i5 != 0 ? C2046a.b(context, i5) : null, i6 != 0 ? C2046a.b(context, i6) : null, i7 != 0 ? C2046a.b(context, i7) : null);
        A a4 = this.f5614F;
        if (a4 != null) {
            a4.p();
        }
    }
}
