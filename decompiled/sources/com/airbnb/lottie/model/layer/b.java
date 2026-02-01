package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.P;
import androidx.core.view.C0823k0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.j;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.C1018j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.animation.content.e, a.b, com.airbnb.lottie.model.e {

    /* renamed from: B, reason: collision with root package name */
    private static final int f21732B = 2;

    /* renamed from: C, reason: collision with root package name */
    private static final int f21733C = 16;

    /* renamed from: D, reason: collision with root package name */
    private static final int f21734D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f21735E = 19;

    /* renamed from: A, reason: collision with root package name */
    @P
    BlurMaskFilter f21736A;

    /* renamed from: a, reason: collision with root package name */
    private final Path f21737a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f21738b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Paint f21739c = new com.airbnb.lottie.animation.a(1);

    /* renamed from: d, reason: collision with root package name */
    private final Paint f21740d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f21741e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f21742f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f21743g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f21744h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f21745i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f21746j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f21747k;

    /* renamed from: l, reason: collision with root package name */
    private final String f21748l;

    /* renamed from: m, reason: collision with root package name */
    final Matrix f21749m;

    /* renamed from: n, reason: collision with root package name */
    final j f21750n;

    /* renamed from: o, reason: collision with root package name */
    final Layer f21751o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.h f21752p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.d f21753q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private b f21754r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private b f21755s;

    /* renamed from: t, reason: collision with root package name */
    private List<b> f21756t;

    /* renamed from: u, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, ?>> f21757u;

    /* renamed from: v, reason: collision with root package name */
    final p f21758v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21759w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21760x;

    /* renamed from: y, reason: collision with root package name */
    @P
    private Paint f21761y;

    /* renamed from: z, reason: collision with root package name */
    float f21762z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21763a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21764b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f21764b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21764b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21764b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21764b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f21763a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21763a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21763a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21763a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21763a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21763a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21763a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(j jVar, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f21740d = new com.airbnb.lottie.animation.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f21741e = new com.airbnb.lottie.animation.a(1, mode2);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f21742f = aVar;
        this.f21743g = new com.airbnb.lottie.animation.a(PorterDuff.Mode.CLEAR);
        this.f21744h = new RectF();
        this.f21745i = new RectF();
        this.f21746j = new RectF();
        this.f21747k = new RectF();
        this.f21749m = new Matrix();
        this.f21757u = new ArrayList();
        this.f21759w = true;
        this.f21762z = 0.0f;
        this.f21750n = jVar;
        this.f21751o = layer;
        this.f21748l = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b4 = layer.w().b();
        this.f21758v = b4;
        b4.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.h hVar = new com.airbnb.lottie.animation.keyframe.h(layer.g());
            this.f21752p = hVar;
            Iterator<com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 : this.f21752p.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        N();
    }

    private void B(RectF rectF, Matrix matrix) {
        this.f21745i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!z()) {
            return;
        }
        int size = this.f21752p.b().size();
        for (int i4 = 0; i4 < size; i4++) {
            Mask mask = this.f21752p.b().get(i4);
            Path h4 = this.f21752p.a().get(i4).h();
            if (h4 != null) {
                this.f21737a.set(h4);
                this.f21737a.transform(matrix);
                int i5 = a.f21764b[mask.a().ordinal()];
                if (i5 != 1 && i5 != 2) {
                    if ((i5 == 3 || i5 == 4) && mask.d()) {
                        return;
                    }
                    this.f21737a.computeBounds(this.f21747k, false);
                    if (i4 == 0) {
                        this.f21745i.set(this.f21747k);
                    } else {
                        RectF rectF2 = this.f21745i;
                        rectF2.set(Math.min(rectF2.left, this.f21747k.left), Math.min(this.f21745i.top, this.f21747k.top), Math.max(this.f21745i.right, this.f21747k.right), Math.max(this.f21745i.bottom, this.f21747k.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.f21745i)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void C(RectF rectF, Matrix matrix) {
        if (!A() || this.f21751o.h() == Layer.MatteType.INVERT) {
            return;
        }
        this.f21746j.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f21754r.d(this.f21746j, matrix, true);
        if (!rectF.intersect(this.f21746j)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void D() {
        this.f21750n.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        boolean z3;
        if (this.f21753q.p() == 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        M(z3);
    }

    private void F(float f4) {
        this.f21750n.y().o().e(this.f21751o.i(), f4);
    }

    private void M(boolean z3) {
        if (z3 != this.f21759w) {
            this.f21759w = z3;
            D();
        }
    }

    private void N() {
        boolean z3 = true;
        if (!this.f21751o.e().isEmpty()) {
            com.airbnb.lottie.animation.keyframe.d dVar = new com.airbnb.lottie.animation.keyframe.d(this.f21751o.e());
            this.f21753q = dVar;
            dVar.l();
            this.f21753q.a(new a.b() { // from class: com.airbnb.lottie.model.layer.a
                @Override // com.airbnb.lottie.animation.keyframe.a.b
                public final void a() {
                    b.this.E();
                }
            });
            if (this.f21753q.h().floatValue() != 1.0f) {
                z3 = false;
            }
            M(z3);
            i(this.f21753q);
            return;
        }
        M(true);
    }

    private void j(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        this.f21739c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f21737a, this.f21739c);
    }

    private void k(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f21744h, this.f21740d);
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        this.f21739c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f21737a, this.f21739c);
        canvas.restore();
    }

    private void l(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f21744h, this.f21739c);
        canvas.drawRect(this.f21744h, this.f21739c);
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        this.f21739c.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f21737a, this.f21741e);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f21744h, this.f21740d);
        canvas.drawRect(this.f21744h, this.f21739c);
        this.f21741e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        canvas.drawPath(this.f21737a, this.f21741e);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar, com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2) {
        com.airbnb.lottie.utils.j.n(canvas, this.f21744h, this.f21741e);
        canvas.drawRect(this.f21744h, this.f21739c);
        this.f21741e.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        canvas.drawPath(this.f21737a, this.f21741e);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.e.a("Layer#saveLayer");
        com.airbnb.lottie.utils.j.o(canvas, this.f21744h, this.f21740d, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.e.b("Layer#saveLayer");
        for (int i4 = 0; i4 < this.f21752p.b().size(); i4++) {
            Mask mask = this.f21752p.b().get(i4);
            com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar = this.f21752p.a().get(i4);
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.f21752p.c().get(i4);
            int i5 = a.f21764b[mask.a().ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            if (mask.d()) {
                                l(canvas, matrix, aVar, aVar2);
                            } else {
                                j(canvas, matrix, aVar, aVar2);
                            }
                        }
                    } else if (mask.d()) {
                        m(canvas, matrix, aVar, aVar2);
                    } else {
                        k(canvas, matrix, aVar, aVar2);
                    }
                } else {
                    if (i4 == 0) {
                        this.f21739c.setColor(C0823k0.f13589t);
                        this.f21739c.setAlpha(255);
                        canvas.drawRect(this.f21744h, this.f21739c);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                }
            } else if (q()) {
                this.f21739c.setAlpha(255);
                canvas.drawRect(this.f21744h, this.f21739c);
            }
        }
        com.airbnb.lottie.e.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.e.b("Layer#restoreLayer");
    }

    private void p(Canvas canvas, Matrix matrix, com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.i, Path> aVar) {
        this.f21737a.set(aVar.h());
        this.f21737a.transform(matrix);
        canvas.drawPath(this.f21737a, this.f21741e);
    }

    private boolean q() {
        if (this.f21752p.a().isEmpty()) {
            return false;
        }
        for (int i4 = 0; i4 < this.f21752p.b().size(); i4++) {
            if (this.f21752p.b().get(i4).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        if (this.f21756t != null) {
            return;
        }
        if (this.f21755s == null) {
            this.f21756t = Collections.emptyList();
            return;
        }
        this.f21756t = new ArrayList();
        for (b bVar = this.f21755s; bVar != null; bVar = bVar.f21755s) {
            this.f21756t.add(bVar);
        }
    }

    private void s(Canvas canvas) {
        com.airbnb.lottie.e.a("Layer#clearLayer");
        RectF rectF = this.f21744h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f21743g);
        com.airbnb.lottie.e.b("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public static b u(c cVar, Layer layer, j jVar, com.airbnb.lottie.g gVar) {
        switch (a.f21763a[layer.f().ordinal()]) {
            case 1:
                return new f(jVar, layer, cVar);
            case 2:
                return new c(jVar, layer, gVar.p(layer.m()), gVar);
            case 3:
                return new g(jVar, layer);
            case 4:
                return new d(jVar, layer);
            case 5:
                return new e(jVar, layer);
            case 6:
                return new h(jVar, layer);
            default:
                com.airbnb.lottie.utils.f.e("Unknown layer type " + layer.f());
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        if (this.f21754r != null) {
            return true;
        }
        return false;
    }

    public void G(com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f21757u.remove(aVar);
    }

    void H(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(@P b bVar) {
        this.f21754r = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(boolean z3) {
        if (z3 && this.f21761y == null) {
            this.f21761y = new com.airbnb.lottie.animation.a();
        }
        this.f21760x = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@P b bVar) {
        this.f21755s = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f21758v.j(f4);
        if (this.f21752p != null) {
            for (int i4 = 0; i4 < this.f21752p.a().size(); i4++) {
                this.f21752p.a().get(i4).m(f4);
            }
        }
        com.airbnb.lottie.animation.keyframe.d dVar = this.f21753q;
        if (dVar != null) {
            dVar.m(f4);
        }
        b bVar = this.f21754r;
        if (bVar != null) {
            bVar.L(f4);
        }
        for (int i5 = 0; i5 < this.f21757u.size(); i5++) {
            this.f21757u.get(i5).m(f4);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        D();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<com.airbnb.lottie.animation.content.c> list, List<com.airbnb.lottie.animation.content.c> list2) {
    }

    @Override // com.airbnb.lottie.model.e
    public void c(com.airbnb.lottie.model.d dVar, int i4, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2) {
        b bVar = this.f21754r;
        if (bVar != null) {
            com.airbnb.lottie.model.d a4 = dVar2.a(bVar.getName());
            if (dVar.c(this.f21754r.getName(), i4)) {
                list.add(a4.j(this.f21754r));
            }
            if (dVar.i(getName(), i4)) {
                this.f21754r.H(dVar, dVar.e(this.f21754r.getName(), i4) + i4, list, a4);
            }
        }
        if (!dVar.h(getName(), i4)) {
            return;
        }
        if (!"__container".equals(getName())) {
            dVar2 = dVar2.a(getName());
            if (dVar.c(getName(), i4)) {
                list.add(dVar2.j(this));
            }
        }
        if (dVar.i(getName(), i4)) {
            H(dVar, i4 + dVar.e(getName(), i4), list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.e
    @InterfaceC0566i
    public void d(RectF rectF, Matrix matrix, boolean z3) {
        this.f21744h.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f21749m.set(matrix);
        if (z3) {
            List<b> list = this.f21756t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f21749m.preConcat(this.f21756t.get(size).f21758v.f());
                }
            } else {
                b bVar = this.f21755s;
                if (bVar != null) {
                    this.f21749m.preConcat(bVar.f21758v.f());
                }
            }
        }
        this.f21749m.preConcat(this.f21758v.f());
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(Canvas canvas, Matrix matrix, int i4) {
        int intValue;
        Paint paint;
        com.airbnb.lottie.e.a(this.f21748l);
        if (this.f21759w && !this.f21751o.x()) {
            r();
            com.airbnb.lottie.e.a("Layer#parentMatrix");
            this.f21738b.reset();
            this.f21738b.set(matrix);
            for (int size = this.f21756t.size() - 1; size >= 0; size--) {
                this.f21738b.preConcat(this.f21756t.get(size).f21758v.f());
            }
            com.airbnb.lottie.e.b("Layer#parentMatrix");
            if (this.f21758v.h() == null) {
                intValue = 100;
            } else {
                intValue = this.f21758v.h().h().intValue();
            }
            int i5 = (int) ((((i4 / 255.0f) * intValue) / 100.0f) * 255.0f);
            if (!A() && !z()) {
                this.f21738b.preConcat(this.f21758v.f());
                com.airbnb.lottie.e.a("Layer#drawLayer");
                t(canvas, this.f21738b, i5);
                com.airbnb.lottie.e.b("Layer#drawLayer");
                F(com.airbnb.lottie.e.b(this.f21748l));
                return;
            }
            com.airbnb.lottie.e.a("Layer#computeBounds");
            d(this.f21744h, this.f21738b, false);
            C(this.f21744h, matrix);
            this.f21738b.preConcat(this.f21758v.f());
            B(this.f21744h, this.f21738b);
            if (!this.f21744h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
                this.f21744h.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.airbnb.lottie.e.b("Layer#computeBounds");
            if (this.f21744h.width() >= 1.0f && this.f21744h.height() >= 1.0f) {
                com.airbnb.lottie.e.a("Layer#saveLayer");
                this.f21739c.setAlpha(255);
                com.airbnb.lottie.utils.j.n(canvas, this.f21744h, this.f21739c);
                com.airbnb.lottie.e.b("Layer#saveLayer");
                s(canvas);
                com.airbnb.lottie.e.a("Layer#drawLayer");
                t(canvas, this.f21738b, i5);
                com.airbnb.lottie.e.b("Layer#drawLayer");
                if (z()) {
                    o(canvas, this.f21738b);
                }
                if (A()) {
                    com.airbnb.lottie.e.a("Layer#drawMatte");
                    com.airbnb.lottie.e.a("Layer#saveLayer");
                    com.airbnb.lottie.utils.j.o(canvas, this.f21744h, this.f21742f, 19);
                    com.airbnb.lottie.e.b("Layer#saveLayer");
                    s(canvas);
                    this.f21754r.f(canvas, matrix, i5);
                    com.airbnb.lottie.e.a("Layer#restoreLayer");
                    canvas.restore();
                    com.airbnb.lottie.e.b("Layer#restoreLayer");
                    com.airbnb.lottie.e.b("Layer#drawMatte");
                }
                com.airbnb.lottie.e.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.e.b("Layer#restoreLayer");
            }
            if (this.f21760x && (paint = this.f21761y) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f21761y.setColor(-251901);
                this.f21761y.setStrokeWidth(4.0f);
                canvas.drawRect(this.f21744h, this.f21761y);
                this.f21761y.setStyle(Paint.Style.FILL);
                this.f21761y.setColor(1357638635);
                canvas.drawRect(this.f21744h, this.f21761y);
            }
            F(com.airbnb.lottie.e.b(this.f21748l));
            return;
        }
        com.airbnb.lottie.e.b(this.f21748l);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f21751o.i();
    }

    @Override // com.airbnb.lottie.model.e
    @InterfaceC0566i
    public <T> void h(T t3, @P com.airbnb.lottie.value.j<T> jVar) {
        this.f21758v.c(t3, jVar);
    }

    public void i(@P com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f21757u.add(aVar);
    }

    abstract void t(Canvas canvas, Matrix matrix, int i4);

    @P
    public com.airbnb.lottie.model.content.a v() {
        return this.f21751o.a();
    }

    public BlurMaskFilter w(float f4) {
        if (this.f21762z == f4) {
            return this.f21736A;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f4 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f21736A = blurMaskFilter;
        this.f21762z = f4;
        return blurMaskFilter;
    }

    @P
    public C1018j x() {
        return this.f21751o.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Layer y() {
        return this.f21751o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        com.airbnb.lottie.animation.keyframe.h hVar = this.f21752p;
        if (hVar != null && !hVar.a().isEmpty()) {
            return true;
        }
        return false;
    }
}
