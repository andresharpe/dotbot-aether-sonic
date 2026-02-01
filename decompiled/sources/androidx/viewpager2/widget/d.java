package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.h0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ViewPager2 f20690a;

    /* renamed from: b, reason: collision with root package name */
    private final g f20691b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f20692c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f20693d;

    /* renamed from: e, reason: collision with root package name */
    private int f20694e;

    /* renamed from: f, reason: collision with root package name */
    private float f20695f;

    /* renamed from: g, reason: collision with root package name */
    private int f20696g;

    /* renamed from: h, reason: collision with root package name */
    private long f20697h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f20690a = viewPager2;
        this.f20691b = gVar;
        this.f20692c = recyclerView;
    }

    private void a(long j4, int i4, float f4, float f5) {
        MotionEvent obtain = MotionEvent.obtain(this.f20697h, j4, i4, f4, f5, 0);
        this.f20693d.addMovement(obtain);
        obtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.f20693d;
        if (velocityTracker == null) {
            this.f20693d = VelocityTracker.obtain();
            this.f20694e = ViewConfiguration.get(this.f20690a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @h0
    public boolean b() {
        if (this.f20691b.i()) {
            return false;
        }
        this.f20696g = 0;
        this.f20695f = 0;
        this.f20697h = SystemClock.uptimeMillis();
        c();
        this.f20691b.m();
        if (!this.f20691b.k()) {
            this.f20692c.R1();
        }
        a(this.f20697h, 0, 0.0f, 0.0f);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @h0
    public boolean d() {
        if (!this.f20691b.j()) {
            return false;
        }
        this.f20691b.o();
        VelocityTracker velocityTracker = this.f20693d;
        velocityTracker.computeCurrentVelocity(1000, this.f20694e);
        if (!this.f20692c.m0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.f20690a.v();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @h0
    public boolean e(float f4) {
        boolean z3;
        int i4;
        float f5;
        int i5 = 0;
        if (!this.f20691b.j()) {
            return false;
        }
        float f6 = this.f20695f - f4;
        this.f20695f = f6;
        int round = Math.round(f6 - this.f20696g);
        this.f20696g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f20690a.getOrientation() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i4 = round;
        } else {
            i4 = 0;
        }
        if (!z3) {
            i5 = round;
        }
        float f7 = 0.0f;
        if (z3) {
            f5 = this.f20695f;
        } else {
            f5 = 0.0f;
        }
        if (!z3) {
            f7 = this.f20695f;
        }
        float f8 = f7;
        this.f20692c.scrollBy(i4, i5);
        a(uptimeMillis, 2, f5, f8);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.f20691b.j();
    }
}
