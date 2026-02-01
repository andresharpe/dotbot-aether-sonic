package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.harman.jbl.partybox.ui.effectlab.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class q implements e, n, j, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f21329a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f21330b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f21331c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f21332d;

    /* renamed from: e, reason: collision with root package name */
    private final String f21333e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21334f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21335g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f21336h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.p f21337i;

    /* renamed from: j, reason: collision with root package name */
    private d f21338j;

    public q(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.h hVar) {
        this.f21331c = jVar;
        this.f21332d = bVar;
        this.f21333e = hVar.c();
        this.f21334f = hVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = hVar.b().a();
        this.f21335g = a4;
        bVar.i(a4);
        a4.a(this);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a5 = hVar.d().a();
        this.f21336h = a5;
        bVar.i(a5);
        a5.a(this);
        com.airbnb.lottie.animation.keyframe.p b4 = hVar.e().b();
        this.f21337i = b4;
        b4.a(bVar);
        b4.b(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f21331c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        this.f21338j.b(list, list2);
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f21338j.d(rectF, matrix, z3);
    }

    @Override // com.airbnb.lottie.animation.content.j
    public void e(ListIterator<c> listIterator) {
        if (this.f21338j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f21338j = new d(this.f21331c, this.f21332d, a.C0375a.f43486g, this.f21334f, arrayList, null);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        float floatValue = this.f21335g.h().floatValue();
        float floatValue2 = this.f21336h.h().floatValue();
        float floatValue3 = this.f21337i.i().h().floatValue() / 100.0f;
        float floatValue4 = this.f21337i.e().h().floatValue() / 100.0f;
        for (int i5 = ((int) floatValue) - 1; i5 >= 0; i5--) {
            this.f21329a.set(matrix);
            float f4 = i5;
            this.f21329a.preConcat(this.f21337i.g(f4 + floatValue2));
            this.f21338j.f(canvas, this.f21329a, (int) (i4 * com.airbnb.lottie.utils.i.k(floatValue3, floatValue4, f4 / floatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        Path g4 = this.f21338j.g();
        this.f21330b.reset();
        float floatValue = this.f21335g.h().floatValue();
        float floatValue2 = this.f21336h.h().floatValue();
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            this.f21329a.set(this.f21337i.g(i4 + floatValue2));
            this.f21330b.addPath(g4, this.f21329a);
        }
        return this.f21330b;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21333e;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        if (this.f21337i.c(t3, jVar)) {
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21847u) {
            this.f21335g.n(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21848v) {
            this.f21336h.n(jVar);
        }
    }
}
