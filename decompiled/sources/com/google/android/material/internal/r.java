package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f32688a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    @P
    private b f32689b = null;

    /* renamed from: c, reason: collision with root package name */
    @P
    ValueAnimator f32690c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f32691d = new a();

    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r rVar = r.this;
            if (rVar.f32690c == animator) {
                rVar.f32690c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final int[] f32693a;

        /* renamed from: b, reason: collision with root package name */
        final ValueAnimator f32694b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f32693a = iArr;
            this.f32694b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f32690c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f32690c = null;
        }
    }

    private void e(@N b bVar) {
        ValueAnimator valueAnimator = bVar.f32694b;
        this.f32690c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f32691d);
        this.f32688a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f32690c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f32690c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f32688a.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                bVar = this.f32688a.get(i4);
                if (StateSet.stateSetMatches(bVar.f32693a, iArr)) {
                    break;
                } else {
                    i4++;
                }
            } else {
                bVar = null;
                break;
            }
        }
        b bVar2 = this.f32689b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f32689b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
