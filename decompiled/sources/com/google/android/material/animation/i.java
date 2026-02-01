package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f31223a;

    /* renamed from: b, reason: collision with root package name */
    private long f31224b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private TimeInterpolator f31225c;

    /* renamed from: d, reason: collision with root package name */
    private int f31226d;

    /* renamed from: e, reason: collision with root package name */
    private int f31227e;

    public i(long j4, long j5) {
        this.f31225c = null;
        this.f31226d = 0;
        this.f31227e = 1;
        this.f31223a = j4;
        this.f31224b = j5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static i b(@N ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f31226d = valueAnimator.getRepeatCount();
        iVar.f31227e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(@N ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return a.f31209c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return a.f31210d;
            }
            return interpolator;
        }
        return a.f31208b;
    }

    public void a(@N Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f31223a;
    }

    public long d() {
        return this.f31224b;
    }

    @P
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f31225c;
        if (timeInterpolator == null) {
            return a.f31208b;
        }
        return timeInterpolator;
    }

    public boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() != iVar.c() || d() != iVar.d() || g() != iVar.g() || h() != iVar.h()) {
            return false;
        }
        return e().getClass().equals(iVar.e().getClass());
    }

    public int g() {
        return this.f31226d;
    }

    public int h() {
        return this.f31227e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @N
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }

    public i(long j4, long j5, @N TimeInterpolator timeInterpolator) {
        this.f31226d = 0;
        this.f31227e = 1;
        this.f31223a = j4;
        this.f31224b = j5;
        this.f31225c = timeInterpolator;
    }
}
