package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* loaded from: classes.dex */
public class p implements a.b, k, n {

    /* renamed from: c, reason: collision with root package name */
    private final String f21321c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21322d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.j f21323e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f21324f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f21325g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f21326h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21328j;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21319a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f21320b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f21327i = new b();

    public p(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.g gVar) {
        this.f21321c = gVar.c();
        this.f21322d = gVar.f();
        this.f21323e = jVar;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a4 = gVar.d().a();
        this.f21324f = a4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = gVar.e().a();
        this.f21325g = a5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> a6 = gVar.b().a();
        this.f21326h = a6;
        bVar.i(a4);
        bVar.i(a5);
        bVar.i(a6);
        a4.a(this);
        a5.a(this);
        a6.a(this);
    }

    private void e() {
        this.f21328j = false;
        this.f21323e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        e();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f21327i.a(tVar);
                    tVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        com.airbnb.lottie.utils.i.m(dVar, i4, list, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        float p4;
        if (this.f21328j) {
            return this.f21319a;
        }
        this.f21319a.reset();
        if (this.f21322d) {
            this.f21328j = true;
            return this.f21319a;
        }
        PointF h4 = this.f21325g.h();
        float f4 = h4.x / 2.0f;
        float f5 = h4.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f21326h;
        if (aVar == null) {
            p4 = 0.0f;
        } else {
            p4 = ((com.airbnb.lottie.animation.keyframe.d) aVar).p();
        }
        float min = Math.min(f4, f5);
        if (p4 > min) {
            p4 = min;
        }
        PointF h5 = this.f21324f.h();
        this.f21319a.moveTo(h5.x + f4, (h5.y - f5) + p4);
        this.f21319a.lineTo(h5.x + f4, (h5.y + f5) - p4);
        if (p4 > 0.0f) {
            RectF rectF = this.f21320b;
            float f6 = h5.x;
            float f7 = p4 * 2.0f;
            float f8 = h5.y;
            rectF.set((f6 + f4) - f7, (f8 + f5) - f7, f6 + f4, f8 + f5);
            this.f21319a.arcTo(this.f21320b, 0.0f, 90.0f, false);
        }
        this.f21319a.lineTo((h5.x - f4) + p4, h5.y + f5);
        if (p4 > 0.0f) {
            RectF rectF2 = this.f21320b;
            float f9 = h5.x;
            float f10 = h5.y;
            float f11 = p4 * 2.0f;
            rectF2.set(f9 - f4, (f10 + f5) - f11, (f9 - f4) + f11, f10 + f5);
            this.f21319a.arcTo(this.f21320b, 90.0f, 90.0f, false);
        }
        this.f21319a.lineTo(h5.x - f4, (h5.y - f5) + p4);
        if (p4 > 0.0f) {
            RectF rectF3 = this.f21320b;
            float f12 = h5.x;
            float f13 = h5.y;
            float f14 = p4 * 2.0f;
            rectF3.set(f12 - f4, f13 - f5, (f12 - f4) + f14, (f13 - f5) + f14);
            this.f21319a.arcTo(this.f21320b, 180.0f, 90.0f, false);
        }
        this.f21319a.lineTo((h5.x + f4) - p4, h5.y - f5);
        if (p4 > 0.0f) {
            RectF rectF4 = this.f21320b;
            float f15 = h5.x;
            float f16 = p4 * 2.0f;
            float f17 = h5.y;
            rectF4.set((f15 + f4) - f16, f17 - f5, f15 + f4, (f17 - f5) + f16);
            this.f21319a.arcTo(this.f21320b, 270.0f, 90.0f, false);
        }
        this.f21319a.close();
        this.f21327i.b(this.f21319a);
        this.f21328j = true;
        return this.f21319a;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21321c;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        if (t3 == com.airbnb.lottie.o.f21838l) {
            this.f21325g.n(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21840n) {
            this.f21324f.n(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21839m) {
            this.f21326h.n(jVar);
        }
    }
}
