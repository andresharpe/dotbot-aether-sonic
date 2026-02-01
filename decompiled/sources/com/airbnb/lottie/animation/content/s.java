package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.P;
import com.airbnb.lottie.model.content.ShapeStroke;

/* loaded from: classes.dex */
public class s extends a {

    /* renamed from: r, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f21346r;

    /* renamed from: s, reason: collision with root package name */
    private final String f21347s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f21348t;

    /* renamed from: u, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f21349u;

    /* renamed from: v, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f21350v;

    public s(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, ShapeStroke shapeStroke) {
        super(jVar, bVar, shapeStroke.b().b(), shapeStroke.e().b(), shapeStroke.g(), shapeStroke.i(), shapeStroke.j(), shapeStroke.f(), shapeStroke.d());
        this.f21346r = bVar;
        this.f21347s = shapeStroke.h();
        this.f21348t = shapeStroke.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a4 = shapeStroke.c().a();
        this.f21349u = a4;
        a4.a(this);
        bVar.i(a4);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        if (this.f21348t) {
            return;
        }
        this.f21216i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f21349u).p());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21350v;
        if (aVar != null) {
            this.f21216i.setColorFilter(aVar.h());
        }
        super.f(canvas, matrix, i4);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21347s;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == com.airbnb.lottie.o.f21828b) {
            this.f21349u.n(jVar);
            return;
        }
        if (t3 == com.airbnb.lottie.o.f21823K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f21350v;
            if (aVar != null) {
                this.f21346r.G(aVar);
            }
            if (jVar == null) {
                this.f21350v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f21350v = qVar;
            qVar.a(this);
            this.f21346r.i(this.f21349u);
        }
    }
}
