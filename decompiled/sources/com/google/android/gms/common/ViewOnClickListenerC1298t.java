package com.google.android.gms.common;

import H0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1267o0;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.gms.common.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1298t extends FrameLayout implements View.OnClickListener {

    /* renamed from: I, reason: collision with root package name */
    public static final int f28965I = 0;

    /* renamed from: J, reason: collision with root package name */
    public static final int f28966J = 1;

    /* renamed from: K, reason: collision with root package name */
    public static final int f28967K = 2;

    /* renamed from: L, reason: collision with root package name */
    public static final int f28968L = 0;

    /* renamed from: M, reason: collision with root package name */
    public static final int f28969M = 1;

    /* renamed from: N, reason: collision with root package name */
    public static final int f28970N = 2;

    /* renamed from: E, reason: collision with root package name */
    private int f28971E;

    /* renamed from: F, reason: collision with root package name */
    private int f28972F;

    /* renamed from: G, reason: collision with root package name */
    private View f28973G;

    /* renamed from: H, reason: collision with root package name */
    @androidx.annotation.P
    private View.OnClickListener f28974H;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.t$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.common.t$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public ViewOnClickListenerC1298t(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private final void c(Context context) {
        View view = this.f28973G;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f28973G = C1267o0.c(context, this.f28971E, this.f28972F);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i4 = this.f28971E;
            int i5 = this.f28972F;
            com.google.android.gms.common.internal.L l4 = new com.google.android.gms.common.internal.L(context, null);
            l4.a(context.getResources(), i4, i5);
            this.f28973G = l4;
        }
        addView(this.f28973G);
        this.f28973G.setEnabled(isEnabled());
        this.f28973G.setOnClickListener(this);
    }

    public void a(int i4, int i5) {
        this.f28971E = i4;
        this.f28972F = i5;
        c(getContext());
    }

    @Deprecated
    public void b(int i4, int i5, @androidx.annotation.N Scope[] scopeArr) {
        a(i4, i5);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@androidx.annotation.N View view) {
        View.OnClickListener onClickListener = this.f28974H;
        if (onClickListener != null && view == this.f28973G) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i4) {
        a(this.f28971E, i4);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.f28973G.setEnabled(z3);
    }

    @Override // android.view.View
    public void setOnClickListener(@androidx.annotation.P View.OnClickListener onClickListener) {
        this.f28974H = onClickListener;
        View view = this.f28973G;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(@androidx.annotation.N Scope[] scopeArr) {
        a(this.f28971E, this.f28972F);
    }

    public void setSize(int i4) {
        a(i4, this.f28972F);
    }

    public ViewOnClickListenerC1298t(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnClickListenerC1298t(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f28974H = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f.f899e, 0, 0);
        try {
            this.f28971E = obtainStyledAttributes.getInt(a.f.f900f, 0);
            this.f28972F = obtainStyledAttributes.getInt(a.f.f901g, 2);
            obtainStyledAttributes.recycle();
            a(this.f28971E, this.f28972F);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
