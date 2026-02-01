package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* loaded from: classes.dex */
public class r implements n, a.b {

    /* renamed from: b, reason: collision with root package name */
    private final String f21340b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21341c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.j f21342d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Path> f21343e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21344f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21339a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f21345g = new b();

    public r(com.airbnb.lottie.j jVar, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.l lVar) {
        this.f21340b = lVar.b();
        this.f21341c = lVar.d();
        this.f21342d = jVar;
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> a4 = lVar.c().a();
        this.f21343e = a4;
        bVar.i(a4);
        a4.a(this);
    }

    private void c() {
        this.f21344f = false;
        this.f21342d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        c();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f21345g.a(tVar);
                    tVar.c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path g() {
        if (this.f21344f) {
            return this.f21339a;
        }
        this.f21339a.reset();
        if (this.f21341c) {
            this.f21344f = true;
            return this.f21339a;
        }
        Path h4 = this.f21343e.h();
        if (h4 == null) {
            return this.f21339a;
        }
        this.f21339a.set(h4);
        this.f21339a.setFillType(Path.FillType.EVEN_ODD);
        this.f21345g.b(this.f21339a);
        this.f21344f = true;
        return this.f21339a;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21340b;
    }
}
