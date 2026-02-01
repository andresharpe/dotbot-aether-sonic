package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.P;
import com.airbnb.lottie.animation.keyframe.q;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: F, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f21765F;

    /* renamed from: G, reason: collision with root package name */
    private final List<b> f21766G;

    /* renamed from: H, reason: collision with root package name */
    private final RectF f21767H;

    /* renamed from: I, reason: collision with root package name */
    private final RectF f21768I;

    /* renamed from: J, reason: collision with root package name */
    private final Paint f21769J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private Boolean f21770K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private Boolean f21771L;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21772a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f21772a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21772a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(j jVar, Layer layer, List<Layer> list, com.airbnb.lottie.g gVar) {
        super(jVar, layer);
        int i4;
        b bVar;
        this.f21766G = new ArrayList();
        this.f21767H = new RectF();
        this.f21768I = new RectF();
        this.f21769J = new Paint();
        com.airbnb.lottie.model.animatable.b u3 = layer.u();
        if (u3 != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a4 = u3.a();
            this.f21765F = a4;
            i(a4);
            this.f21765F.a(this);
        } else {
            this.f21765F = null;
        }
        androidx.collection.h hVar = new androidx.collection.h(gVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            b u4 = b.u(this, layer2, jVar, gVar);
            if (u4 != null) {
                hVar.p(u4.y().d(), u4);
                if (bVar2 != null) {
                    bVar2.I(u4);
                    bVar2 = null;
                } else {
                    this.f21766G.add(0, u4);
                    int i5 = a.f21772a[layer2.h().ordinal()];
                    if (i5 == 1 || i5 == 2) {
                        bVar2 = u4;
                    }
                }
            }
            size--;
        }
        for (i4 = 0; i4 < hVar.A(); i4++) {
            b bVar3 = (b) hVar.i(hVar.o(i4));
            if (bVar3 != null && (bVar = (b) hVar.i(bVar3.y().j())) != null) {
                bVar3.K(bVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    protected void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        for (int i5 = 0; i5 < this.f21766G.size(); i5++) {
            this.f21766G.get(i5).c(dVar, i4, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void J(boolean z3) {
        super.J(z3);
        Iterator<b> it = this.f21766G.iterator();
        while (it.hasNext()) {
            it.next().J(z3);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    public void L(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        super.L(f4);
        if (this.f21765F != null) {
            f4 = ((this.f21765F.h().floatValue() * this.f21751o.b().i()) - this.f21751o.b().r()) / (this.f21750n.y().e() + 0.01f);
        }
        if (this.f21765F == null) {
            f4 -= this.f21751o.r();
        }
        if (this.f21751o.v() != 0.0f && !"__container".equals(this.f21751o.i())) {
            f4 /= this.f21751o.v();
        }
        for (int size = this.f21766G.size() - 1; size >= 0; size--) {
            this.f21766G.get(size).L(f4);
        }
    }

    public boolean O() {
        if (this.f21771L == null) {
            for (int size = this.f21766G.size() - 1; size >= 0; size--) {
                b bVar = this.f21766G.get(size);
                if (bVar instanceof f) {
                    if (bVar.z()) {
                        this.f21771L = Boolean.TRUE;
                        return true;
                    }
                } else if ((bVar instanceof c) && ((c) bVar).O()) {
                    this.f21771L = Boolean.TRUE;
                    return true;
                }
            }
            this.f21771L = Boolean.FALSE;
        }
        return this.f21771L.booleanValue();
    }

    public boolean P() {
        if (this.f21770K == null) {
            if (A()) {
                this.f21770K = Boolean.TRUE;
                return true;
            }
            for (int size = this.f21766G.size() - 1; size >= 0; size--) {
                if (this.f21766G.get(size).A()) {
                    this.f21770K = Boolean.TRUE;
                    return true;
                }
            }
            this.f21770K = Boolean.FALSE;
        }
        return this.f21770K.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        for (int size = this.f21766G.size() - 1; size >= 0; size--) {
            this.f21767H.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f21766G.get(size).d(this.f21767H, this.f21749m, true);
            rectF.union(this.f21767H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.e
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        super.h(t3, jVar);
        if (t3 == o.f21817E) {
            if (jVar == null) {
                com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f21765F;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar);
            this.f21765F = qVar;
            qVar.a(this);
            i(this.f21765F);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i4) {
        boolean z3;
        com.airbnb.lottie.e.a("CompositionLayer#draw");
        this.f21768I.set(0.0f, 0.0f, this.f21751o.l(), this.f21751o.k());
        matrix.mapRect(this.f21768I);
        if (this.f21750n.T() && this.f21766G.size() > 1 && i4 != 255) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f21769J.setAlpha(i4);
            com.airbnb.lottie.utils.j.n(canvas, this.f21768I, this.f21769J);
        } else {
            canvas.save();
        }
        if (z3) {
            i4 = 255;
        }
        for (int size = this.f21766G.size() - 1; size >= 0; size--) {
            if (this.f21768I.isEmpty() || canvas.clipRect(this.f21768I)) {
                this.f21766G.get(size).f(canvas, matrix, i4);
            }
        }
        canvas.restore();
        com.airbnb.lottie.e.b("CompositionLayer#draw");
    }
}
