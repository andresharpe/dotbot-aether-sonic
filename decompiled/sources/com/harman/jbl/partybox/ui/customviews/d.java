package com.harman.jbl.partybox.ui.customviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class d extends ValueAnimator {

    /* renamed from: H, reason: collision with root package name */
    private static final String f42693H = "HMRoundCornerAnimator";

    /* renamed from: E, reason: collision with root package name */
    private Animator.AnimatorListener f42694E;

    /* renamed from: F, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f42695F;

    /* renamed from: G, reason: collision with root package name */
    private c f42696G;

    /* loaded from: classes2.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f42697a;

        a(e eVar) {
            this.f42697a = eVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c cVar = (c) valueAnimator.getAnimatedValue();
            this.f42697a.i(cVar.f42704b, cVar.f42705c, cVar.f42706d, cVar.f42707e, cVar.f42703a);
        }
    }

    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f42699a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42700b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42701c;

        b(e eVar, int i4, int i5) {
            this.f42699a = eVar;
            this.f42700b = i4;
            this.f42701c = i5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f42699a.i(0, 0, this.f42700b, this.f42701c, 0.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f42699a.i(0, 0, this.f42700b, this.f42701c, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        float f42703a;

        /* renamed from: b, reason: collision with root package name */
        int f42704b;

        /* renamed from: c, reason: collision with root package name */
        int f42705c;

        /* renamed from: d, reason: collision with root package name */
        int f42706d;

        /* renamed from: e, reason: collision with root package name */
        int f42707e;

        c(float f4, int i4, int i5, int i6, int i7) {
            this.f42703a = f4;
            this.f42704b = i4;
            this.f42705c = i5;
            this.f42706d = i6;
            this.f42707e = i7;
        }

        public int a() {
            return this.f42707e;
        }

        public float b() {
            return this.f42703a;
        }

        public int c() {
            return this.f42706d;
        }

        public int d() {
            return this.f42704b;
        }

        public int e() {
            return this.f42705c;
        }

        void f(int i4) {
            this.f42707e = i4;
        }

        void g(float f4) {
            this.f42703a = f4;
        }

        void h(int i4) {
            this.f42706d = i4;
        }

        void i(int i4) {
            this.f42704b = i4;
        }

        void j(int i4) {
            this.f42705c = i4;
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.customviews.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private class C0368d implements TypeEvaluator<c> {

        /* renamed from: a, reason: collision with root package name */
        private c f42709a;

        public C0368d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c evaluate(float f4, c cVar, c cVar2) {
            float f5 = cVar.f42703a;
            float f6 = f5 + ((cVar2.f42703a - f5) * f4);
            float f7 = cVar.f42704b + ((cVar2.f42704b - r0) * f4);
            float f8 = cVar.f42705c + ((cVar2.f42705c - r0) * f4);
            float f9 = cVar.f42706d + ((cVar2.f42706d - r0) * f4);
            float f10 = cVar.f42707e + ((cVar2.f42707e - r11) * f4);
            c cVar3 = this.f42709a;
            if (cVar3 == null) {
                return new c(f6, (int) f7, (int) f8, (int) f9, (int) f10);
            }
            cVar3.g(f6);
            this.f42709a.i((int) f7);
            this.f42709a.j((int) f8);
            this.f42709a.h((int) f9);
            this.f42709a.f((int) f10);
            return this.f42709a;
        }

        C0368d(c cVar) {
            this.f42709a = cVar;
        }
    }

    private d(e eVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f4, float f5, boolean z3) {
        this.f42696G = new c(0.0f, 0, 0, i9, i11);
        setObjectValues(new c(f4, i4, i6, i8, i10), new c(f5, i5, i7, i9, i11));
        setEvaluator(new C0368d(this.f42696G));
        this.f42695F = new a(eVar);
        this.f42694E = new b(eVar, i9, i11);
        addUpdateListener(this.f42695F);
        addListener(this.f42694E);
    }

    public static d a(e eVar, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f4, float f5, boolean z3) {
        return new d(eVar, i4, i5, i6, i7, i8, i9, i10, i11, f4, f5, z3);
    }

    @Override // android.animation.Animator
    public ArrayList<Animator.AnimatorListener> getListeners() {
        ArrayList<Animator.AnimatorListener> arrayList = (ArrayList) super.getListeners().clone();
        arrayList.remove(this.f42694E);
        return arrayList;
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        super.removeAllListeners();
        addListener(this.f42694E);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        super.removeAllUpdateListeners();
        addUpdateListener(this.f42695F);
    }
}
