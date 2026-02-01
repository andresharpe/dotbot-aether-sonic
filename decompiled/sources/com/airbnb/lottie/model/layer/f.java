package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.N;
import androidx.annotation.P;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.content.k;
import com.airbnb.lottie.parser.C1018j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: F, reason: collision with root package name */
    private final com.airbnb.lottie.animation.content.d f21778F;

    /* renamed from: G, reason: collision with root package name */
    private final c f21779G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(j jVar, Layer layer, c cVar) {
        super(jVar, layer);
        this.f21779G = cVar;
        com.airbnb.lottie.animation.content.d dVar = new com.airbnb.lottie.animation.content.d(jVar, this, new k("__container", layer.n(), false));
        this.f21778F = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        this.f21778F.c(dVar, i4, list, dVar2);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        this.f21778F.d(rectF, this.f21749m, z3);
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(@N Canvas canvas, Matrix matrix, int i4) {
        this.f21778F.f(canvas, matrix, i4);
    }

    @Override // com.airbnb.lottie.model.layer.b
    @P
    public com.airbnb.lottie.model.content.a v() {
        com.airbnb.lottie.model.content.a v3 = super.v();
        if (v3 != null) {
            return v3;
        }
        return this.f21779G.v();
    }

    @Override // com.airbnb.lottie.model.layer.b
    @P
    public C1018j x() {
        C1018j x3 = super.x();
        if (x3 != null) {
            return x3;
        }
        return this.f21779G.x();
    }
}
