package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.InterfaceC0567j;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.V;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.target.m;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.r;
import com.bumptech.glide.util.l;
import com.bumptech.glide.util.n;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i<TranscodeType> extends com.bumptech.glide.request.a<i<TranscodeType>> implements Cloneable, g<i<TranscodeType>> {

    /* renamed from: N0, reason: collision with root package name */
    protected static final com.bumptech.glide.request.h f25735N0 = new com.bumptech.glide.request.h().s(com.bumptech.glide.load.engine.j.f26111c).C0(Priority.LOW).K0(true);

    /* renamed from: A0, reason: collision with root package name */
    private final j f25736A0;

    /* renamed from: B0, reason: collision with root package name */
    private final Class<TranscodeType> f25737B0;

    /* renamed from: C0, reason: collision with root package name */
    private final b f25738C0;

    /* renamed from: D0, reason: collision with root package name */
    private final d f25739D0;

    /* renamed from: E0, reason: collision with root package name */
    @N
    private k<?, ? super TranscodeType> f25740E0;

    /* renamed from: F0, reason: collision with root package name */
    @P
    private Object f25741F0;

    /* renamed from: G0, reason: collision with root package name */
    @P
    private List<com.bumptech.glide.request.g<TranscodeType>> f25742G0;

    /* renamed from: H0, reason: collision with root package name */
    @P
    private i<TranscodeType> f25743H0;

    /* renamed from: I0, reason: collision with root package name */
    @P
    private i<TranscodeType> f25744I0;

    /* renamed from: J0, reason: collision with root package name */
    @P
    private Float f25745J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f25746K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f25747L0;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f25748M0;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f25749z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25750a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25751b;

        static {
            int[] iArr = new int[Priority.values().length];
            f25751b = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25751b[Priority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25751b[Priority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25751b[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f25750a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25750a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25750a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25750a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25750a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25750a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25750a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25750a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"CheckResult"})
    public i(@N b bVar, j jVar, Class<TranscodeType> cls, Context context) {
        this.f25746K0 = true;
        this.f25738C0 = bVar;
        this.f25736A0 = jVar;
        this.f25737B0 = cls;
        this.f25749z0 = context;
        this.f25740E0 = jVar.H(cls);
        this.f25739D0 = bVar.k();
        j1(jVar.F());
        a(jVar.G());
    }

    @N
    private i<TranscodeType> A1(@P Object obj) {
        if (b0()) {
            return clone().A1(obj);
        }
        this.f25741F0 = obj;
        this.f25747L0 = true;
        return G0();
    }

    private com.bumptech.glide.request.e B1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i4, int i5, Executor executor) {
        Context context = this.f25749z0;
        d dVar = this.f25739D0;
        return com.bumptech.glide.request.j.y(context, dVar, obj, this.f25741F0, this.f25737B0, aVar, i4, i5, priority, pVar, gVar, this.f25742G0, requestCoordinator, dVar.f(), kVar.d(), executor);
    }

    private com.bumptech.glide.request.e Y0(p<TranscodeType> pVar, @P com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        return Z0(new Object(), pVar, gVar, null, this.f25740E0, aVar.T(), aVar.Q(), aVar.P(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.e Z0(Object obj, p<TranscodeType> pVar, @P com.bumptech.glide.request.g<TranscodeType> gVar, @P RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i4, int i5, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator requestCoordinator3;
        if (this.f25744I0 != null) {
            requestCoordinator3 = new com.bumptech.glide.request.b(obj, requestCoordinator);
            requestCoordinator2 = requestCoordinator3;
        } else {
            requestCoordinator2 = null;
            requestCoordinator3 = requestCoordinator;
        }
        com.bumptech.glide.request.e a12 = a1(obj, pVar, gVar, requestCoordinator3, kVar, priority, i4, i5, aVar, executor);
        if (requestCoordinator2 == null) {
            return a12;
        }
        int Q3 = this.f25744I0.Q();
        int P3 = this.f25744I0.P();
        if (n.w(i4, i5) && !this.f25744I0.n0()) {
            Q3 = aVar.Q();
            P3 = aVar.P();
        }
        i<TranscodeType> iVar = this.f25744I0;
        com.bumptech.glide.request.b bVar = requestCoordinator2;
        bVar.q(a12, iVar.Z0(obj, pVar, gVar, bVar, iVar.f25740E0, iVar.T(), Q3, P3, this.f25744I0, executor));
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bumptech.glide.request.a] */
    private com.bumptech.glide.request.e a1(Object obj, p<TranscodeType> pVar, com.bumptech.glide.request.g<TranscodeType> gVar, @P RequestCoordinator requestCoordinator, k<?, ? super TranscodeType> kVar, Priority priority, int i4, int i5, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        k<?, ? super TranscodeType> kVar2;
        Priority i12;
        i<TranscodeType> iVar = this.f25743H0;
        if (iVar != null) {
            if (!this.f25748M0) {
                k<?, ? super TranscodeType> kVar3 = iVar.f25740E0;
                if (iVar.f25746K0) {
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar3;
                }
                if (iVar.f0()) {
                    i12 = this.f25743H0.T();
                } else {
                    i12 = i1(priority);
                }
                Priority priority2 = i12;
                int Q3 = this.f25743H0.Q();
                int P3 = this.f25743H0.P();
                if (n.w(i4, i5) && !this.f25743H0.n0()) {
                    Q3 = aVar.Q();
                    P3 = aVar.P();
                }
                com.bumptech.glide.request.k kVar4 = new com.bumptech.glide.request.k(obj, requestCoordinator);
                com.bumptech.glide.request.e B12 = B1(obj, pVar, gVar, aVar, kVar4, kVar, priority, i4, i5, executor);
                this.f25748M0 = true;
                i<TranscodeType> iVar2 = this.f25743H0;
                com.bumptech.glide.request.e Z02 = iVar2.Z0(obj, pVar, gVar, kVar4, kVar2, priority2, Q3, P3, iVar2, executor);
                this.f25748M0 = false;
                kVar4.p(B12, Z02);
                return kVar4;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (this.f25745J0 != null) {
            com.bumptech.glide.request.k kVar5 = new com.bumptech.glide.request.k(obj, requestCoordinator);
            kVar5.p(B1(obj, pVar, gVar, aVar, kVar5, kVar, priority, i4, i5, executor), B1(obj, pVar, gVar, aVar.p().J0(this.f25745J0.floatValue()), kVar5, kVar, i1(priority), i4, i5, executor));
            return kVar5;
        }
        return B1(obj, pVar, gVar, aVar, requestCoordinator, kVar, priority, i4, i5, executor);
    }

    private i<TranscodeType> c1() {
        return clone().f1(null).H1(null);
    }

    @N
    private Priority i1(@N Priority priority) {
        int i4 = a.f25751b[priority.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    throw new IllegalArgumentException("unknown priority: " + T());
                }
                return Priority.IMMEDIATE;
            }
            return Priority.HIGH;
        }
        return Priority.NORMAL;
    }

    @SuppressLint({"CheckResult"})
    private void j1(List<com.bumptech.glide.request.g<Object>> list) {
        Iterator<com.bumptech.glide.request.g<Object>> it = list.iterator();
        while (it.hasNext()) {
            W0((com.bumptech.glide.request.g) it.next());
        }
    }

    private <Y extends p<TranscodeType>> Y m1(@N Y y3, @P com.bumptech.glide.request.g<TranscodeType> gVar, com.bumptech.glide.request.a<?> aVar, Executor executor) {
        l.d(y3);
        if (this.f25747L0) {
            com.bumptech.glide.request.e Y02 = Y0(y3, gVar, aVar, executor);
            com.bumptech.glide.request.e q4 = y3.q();
            if (Y02.e(q4) && !p1(aVar, q4)) {
                if (!((com.bumptech.glide.request.e) l.d(q4)).isRunning()) {
                    q4.i();
                }
                return y3;
            }
            this.f25736A0.C(y3);
            y3.l(Y02);
            this.f25736A0.b0(y3, Y02);
            return y3;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean p1(com.bumptech.glide.request.a<?> aVar, com.bumptech.glide.request.e eVar) {
        if (!aVar.e0() && eVar.k()) {
            return true;
        }
        return false;
    }

    @N
    public p<TranscodeType> C1() {
        return D1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @N
    public p<TranscodeType> D1(int i4, int i5) {
        return l1(m.g(this.f25736A0, i4, i5));
    }

    @N
    public com.bumptech.glide.request.d<TranscodeType> E1() {
        return F1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @N
    public com.bumptech.glide.request.d<TranscodeType> F1(int i4, int i5) {
        com.bumptech.glide.request.f fVar = new com.bumptech.glide.request.f(i4, i5);
        return (com.bumptech.glide.request.d) n1(fVar, fVar, com.bumptech.glide.util.f.a());
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> G1(float f4) {
        if (b0()) {
            return clone().G1(f4);
        }
        if (f4 >= 0.0f && f4 <= 1.0f) {
            this.f25745J0 = Float.valueOf(f4);
            return G0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> H1(@P i<TranscodeType> iVar) {
        if (b0()) {
            return clone().H1(iVar);
        }
        this.f25743H0 = iVar;
        return G0();
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> I1(@P List<i<TranscodeType>> list) {
        i<TranscodeType> iVar = null;
        if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                i<TranscodeType> iVar2 = list.get(size);
                if (iVar2 != null) {
                    if (iVar == null) {
                        iVar = iVar2;
                    } else {
                        iVar = iVar2.H1(iVar);
                    }
                }
            }
            return H1(iVar);
        }
        return H1(null);
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> J1(@P i<TranscodeType>... iVarArr) {
        if (iVarArr != null && iVarArr.length != 0) {
            return I1(Arrays.asList(iVarArr));
        }
        return H1(null);
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> K1(@N k<?, ? super TranscodeType> kVar) {
        if (b0()) {
            return clone().K1(kVar);
        }
        this.f25740E0 = (k) l.d(kVar);
        this.f25746K0 = false;
        return G0();
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> W0(@P com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (b0()) {
            return clone().W0(gVar);
        }
        if (gVar != null) {
            if (this.f25742G0 == null) {
                this.f25742G0 = new ArrayList();
            }
            this.f25742G0.add(gVar);
        }
        return G0();
    }

    @Override // com.bumptech.glide.request.a
    @N
    @InterfaceC0567j
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> a(@N com.bumptech.glide.request.a<?> aVar) {
        l.d(aVar);
        return (i) super.a(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @InterfaceC0567j
    /* renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i<TranscodeType> p() {
        i<TranscodeType> iVar = (i) super.p();
        iVar.f25740E0 = (k<?, ? super TranscodeType>) iVar.f25740E0.clone();
        if (iVar.f25742G0 != null) {
            iVar.f25742G0 = new ArrayList(iVar.f25742G0);
        }
        i<TranscodeType> iVar2 = iVar.f25743H0;
        if (iVar2 != null) {
            iVar.f25743H0 = iVar2.clone();
        }
        i<TranscodeType> iVar3 = iVar.f25744I0;
        if (iVar3 != null) {
            iVar.f25744I0 = iVar3.clone();
        }
        return iVar;
    }

    @InterfaceC0567j
    @Deprecated
    public com.bumptech.glide.request.d<File> d1(int i4, int i5) {
        return h1().F1(i4, i5);
    }

    @InterfaceC0567j
    @Deprecated
    public <Y extends p<File>> Y e1(@N Y y3) {
        return (Y) h1().l1(y3);
    }

    @N
    public i<TranscodeType> f1(@P i<TranscodeType> iVar) {
        if (b0()) {
            return clone().f1(iVar);
        }
        this.f25744I0 = iVar;
        return G0();
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> g1(Object obj) {
        if (obj == null) {
            return f1(null);
        }
        return f1(c1().n(obj));
    }

    @N
    @InterfaceC0567j
    protected i<File> h1() {
        return new i(File.class, this).a(f25735N0);
    }

    @Deprecated
    public com.bumptech.glide.request.d<TranscodeType> k1(int i4, int i5) {
        return F1(i4, i5);
    }

    @N
    public <Y extends p<TranscodeType>> Y l1(@N Y y3) {
        return (Y) n1(y3, null, com.bumptech.glide.util.f.b());
    }

    @N
    <Y extends p<TranscodeType>> Y n1(@N Y y3, @P com.bumptech.glide.request.g<TranscodeType> gVar, Executor executor) {
        return (Y) m1(y3, gVar, this, executor);
    }

    @N
    public r<ImageView, TranscodeType> o1(@N ImageView imageView) {
        i<TranscodeType> iVar;
        n.b();
        l.d(imageView);
        if (!m0() && k0() && imageView.getScaleType() != null) {
            switch (a.f25750a[imageView.getScaleType().ordinal()]) {
                case 1:
                    iVar = p().q0();
                    break;
                case 2:
                    iVar = p().r0();
                    break;
                case 3:
                case 4:
                case 5:
                    iVar = p().t0();
                    break;
                case 6:
                    iVar = p().r0();
                    break;
            }
            return (r) m1(this.f25739D0.a(imageView, this.f25737B0), null, iVar, com.bumptech.glide.util.f.b());
        }
        iVar = this;
        return (r) m1(this.f25739D0.a(imageView, this.f25737B0), null, iVar, com.bumptech.glide.util.f.b());
    }

    @N
    @InterfaceC0567j
    public i<TranscodeType> q1(@P com.bumptech.glide.request.g<TranscodeType> gVar) {
        if (b0()) {
            return clone().q1(gVar);
        }
        this.f25742G0 = null;
        return W0(gVar);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> k(@P Bitmap bitmap) {
        return A1(bitmap).a(com.bumptech.glide.request.h.b1(com.bumptech.glide.load.engine.j.f26110b));
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> j(@P Drawable drawable) {
        return A1(drawable).a(com.bumptech.glide.request.h.b1(com.bumptech.glide.load.engine.j.f26110b));
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> g(@P Uri uri) {
        return A1(uri);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> i(@P File file) {
        return A1(file);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> o(@P @V @InterfaceC0578v Integer num) {
        return A1(num).a(com.bumptech.glide.request.h.s1(com.bumptech.glide.signature.a.c(this.f25749z0)));
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> n(@P Object obj) {
        return A1(obj);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> t(@P String str) {
        return A1(str);
    }

    @Override // com.bumptech.glide.g
    @InterfaceC0567j
    @Deprecated
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> f(@P URL url) {
        return A1(url);
    }

    @Override // com.bumptech.glide.g
    @N
    @InterfaceC0567j
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public i<TranscodeType> h(@P byte[] bArr) {
        i<TranscodeType> A12 = A1(bArr);
        if (!A12.c0()) {
            A12 = A12.a(com.bumptech.glide.request.h.b1(com.bumptech.glide.load.engine.j.f26110b));
        }
        if (!A12.j0()) {
            return A12.a(com.bumptech.glide.request.h.u1(true));
        }
        return A12;
    }

    @SuppressLint({"CheckResult"})
    protected i(Class<TranscodeType> cls, i<?> iVar) {
        this(iVar.f25738C0, iVar.f25736A0, cls, iVar.f25749z0);
        this.f25741F0 = iVar.f25741F0;
        this.f25747L0 = iVar.f25747L0;
        a(iVar);
    }
}
