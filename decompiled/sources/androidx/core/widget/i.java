package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.h0;

/* loaded from: classes.dex */
public class i extends ProgressBar {

    /* renamed from: K, reason: collision with root package name */
    private static final int f13805K = 500;

    /* renamed from: L, reason: collision with root package name */
    private static final int f13806L = 500;

    /* renamed from: E, reason: collision with root package name */
    long f13807E;

    /* renamed from: F, reason: collision with root package name */
    boolean f13808F;

    /* renamed from: G, reason: collision with root package name */
    boolean f13809G;

    /* renamed from: H, reason: collision with root package name */
    boolean f13810H;

    /* renamed from: I, reason: collision with root package name */
    private final Runnable f13811I;

    /* renamed from: J, reason: collision with root package name */
    private final Runnable f13812J;

    public i(@N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public void f() {
        this.f13810H = true;
        removeCallbacks(this.f13812J);
        this.f13809G = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = this.f13807E;
        long j5 = currentTimeMillis - j4;
        if (j5 < 500 && j4 != -1) {
            if (!this.f13808F) {
                postDelayed(this.f13811I, 500 - j5);
                this.f13808F = true;
                return;
            }
            return;
        }
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f13808F = false;
        this.f13807E = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        this.f13809G = false;
        if (!this.f13810H) {
            this.f13807E = System.currentTimeMillis();
            setVisibility(0);
        }
    }

    private void i() {
        removeCallbacks(this.f13811I);
        removeCallbacks(this.f13812J);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @h0
    public void k() {
        this.f13807E = -1L;
        this.f13810H = false;
        removeCallbacks(this.f13811I);
        this.f13808F = false;
        if (!this.f13809G) {
            postDelayed(this.f13812J, 500L);
            this.f13809G = true;
        }
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.f();
            }
        });
    }

    public void j() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                i.this.k();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public i(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f13807E = -1L;
        this.f13808F = false;
        this.f13809G = false;
        this.f13810H = false;
        this.f13811I = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                i.this.g();
            }
        };
        this.f13812J = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                i.this.h();
            }
        };
    }
}
