package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f13822a;

    q(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f13822a = overScroller;
    }

    @Deprecated
    public static q c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static q d(Context context, Interpolator interpolator) {
        return new q(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.f13822a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.f13822a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f13822a.fling(i4, i5, i6, i7, i8, i9, i10, i11);
    }

    @Deprecated
    public void f(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f13822a.fling(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
    }

    @Deprecated
    public float g() {
        return this.f13822a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.f13822a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.f13822a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.f13822a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.f13822a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.f13822a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.f13822a.isOverScrolled();
    }

    @Deprecated
    public void n(int i4, int i5, int i6) {
        this.f13822a.notifyHorizontalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public void o(int i4, int i5, int i6) {
        this.f13822a.notifyVerticalEdgeReached(i4, i5, i6);
    }

    @Deprecated
    public boolean p(int i4, int i5, int i6, int i7, int i8, int i9) {
        return this.f13822a.springBack(i4, i5, i6, i7, i8, i9);
    }

    @Deprecated
    public void q(int i4, int i5, int i6, int i7) {
        this.f13822a.startScroll(i4, i5, i6, i7);
    }

    @Deprecated
    public void r(int i4, int i5, int i6, int i7, int i8) {
        this.f13822a.startScroll(i4, i5, i6, i7, i8);
    }
}
