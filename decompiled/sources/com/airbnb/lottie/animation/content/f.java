package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* loaded from: classes.dex */
public class f implements n, a.b, k {

    /* renamed from: i, reason: collision with root package name */
    private static final float f21239i = 0.55228f;

    /* renamed from: b, reason: collision with root package name */
    private final String f21241b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.j f21242c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f21243d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f21244e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f21245f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21247h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21240a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f21246g = new b();

    public f(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f21241b = bVar2.b();
        this.f21242c = jVar;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a4 = bVar2.d().a();
        this.f21243d = a4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> a5 = bVar2.c().a();
        this.f21244e = a5;
        this.f21245f = bVar2;
        bVar.i(a4);
        bVar.i(a5);
        a4.a(this);
        a5.a(this);
    }

    private void e() {
        this.f21247h = false;
        this.f21242c.invalidateSelf();
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
                    this.f21246g.a(tVar);
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
        if (this.f21247h) {
            return this.f21240a;
        }
        this.f21240a.reset();
        if (this.f21245f.e()) {
            this.f21247h = true;
            return this.f21240a;
        }
        PointF h4 = this.f21243d.h();
        float f4 = h4.x / 2.0f;
        float f5 = h4.y / 2.0f;
        float f6 = f4 * f21239i;
        float f7 = f21239i * f5;
        this.f21240a.reset();
        if (this.f21245f.f()) {
            float f8 = -f5;
            this.f21240a.moveTo(0.0f, f8);
            float f9 = 0.0f - f6;
            float f10 = -f4;
            float f11 = 0.0f - f7;
            this.f21240a.cubicTo(f9, f8, f10, f11, f10, 0.0f);
            float f12 = f7 + 0.0f;
            this.f21240a.cubicTo(f10, f12, f9, f5, 0.0f, f5);
            float f13 = f6 + 0.0f;
            this.f21240a.cubicTo(f13, f5, f4, f12, f4, 0.0f);
            this.f21240a.cubicTo(f4, f11, f13, f8, 0.0f, f8);
        } else {
            float f14 = -f5;
            this.f21240a.moveTo(0.0f, f14);
            float f15 = f6 + 0.0f;
            float f16 = 0.0f - f7;
            this.f21240a.cubicTo(f15, f14, f4, f16, f4, 0.0f);
            float f17 = f7 + 0.0f;
            this.f21240a.cubicTo(f4, f17, f15, f5, 0.0f, f5);
            float f18 = 0.0f - f6;
            float f19 = -f4;
            this.f21240a.cubicTo(f18, f5, f19, f17, f19, 0.0f);
            this.f21240a.cubicTo(f19, f16, f18, f14, 0.0f, f14);
        }
        PointF h5 = this.f21244e.h();
        this.f21240a.offset(h5.x, h5.y);
        this.f21240a.close();
        this.f21246g.b(this.f21240a);
        this.f21247h = true;
        return this.f21240a;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21241b;
    }

    @Override // com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        if (t3 == com.airbnb.lottie.o.f21837k) {
            this.f21243d.n(jVar);
        } else if (t3 == com.airbnb.lottie.o.f21840n) {
            this.f21244e.n(jVar);
        }
    }
}
