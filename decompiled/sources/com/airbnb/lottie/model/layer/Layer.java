package com.airbnb.lottie.model.layer;

import androidx.annotation.P;
import com.airbnb.lottie.model.animatable.j;
import com.airbnb.lottie.model.animatable.k;
import com.airbnb.lottie.model.animatable.l;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.C1018j;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class Layer {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.content.c> f21707a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.g f21708b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21709c;

    /* renamed from: d, reason: collision with root package name */
    private final long f21710d;

    /* renamed from: e, reason: collision with root package name */
    private final LayerType f21711e;

    /* renamed from: f, reason: collision with root package name */
    private final long f21712f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private final String f21713g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Mask> f21714h;

    /* renamed from: i, reason: collision with root package name */
    private final l f21715i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21716j;

    /* renamed from: k, reason: collision with root package name */
    private final int f21717k;

    /* renamed from: l, reason: collision with root package name */
    private final int f21718l;

    /* renamed from: m, reason: collision with root package name */
    private final float f21719m;

    /* renamed from: n, reason: collision with root package name */
    private final float f21720n;

    /* renamed from: o, reason: collision with root package name */
    private final int f21721o;

    /* renamed from: p, reason: collision with root package name */
    private final int f21722p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private final j f21723q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private final k f21724r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.animatable.b f21725s;

    /* renamed from: t, reason: collision with root package name */
    private final List<com.airbnb.lottie.value.a<Float>> f21726t;

    /* renamed from: u, reason: collision with root package name */
    private final MatteType f21727u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f21728v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private final com.airbnb.lottie.model.content.a f21729w;

    /* renamed from: x, reason: collision with root package name */
    @P
    private final C1018j f21730x;

    /* loaded from: classes.dex */
    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<com.airbnb.lottie.model.content.c> list, com.airbnb.lottie.g gVar, String str, long j4, LayerType layerType, long j5, @P String str2, List<Mask> list2, l lVar, int i4, int i5, int i6, float f4, float f5, int i7, int i8, @P j jVar, @P k kVar, List<com.airbnb.lottie.value.a<Float>> list3, MatteType matteType, @P com.airbnb.lottie.model.animatable.b bVar, boolean z3, @P com.airbnb.lottie.model.content.a aVar, @P C1018j c1018j) {
        this.f21707a = list;
        this.f21708b = gVar;
        this.f21709c = str;
        this.f21710d = j4;
        this.f21711e = layerType;
        this.f21712f = j5;
        this.f21713g = str2;
        this.f21714h = list2;
        this.f21715i = lVar;
        this.f21716j = i4;
        this.f21717k = i5;
        this.f21718l = i6;
        this.f21719m = f4;
        this.f21720n = f5;
        this.f21721o = i7;
        this.f21722p = i8;
        this.f21723q = jVar;
        this.f21724r = kVar;
        this.f21726t = list3;
        this.f21727u = matteType;
        this.f21725s = bVar;
        this.f21728v = z3;
        this.f21729w = aVar;
        this.f21730x = c1018j;
    }

    @P
    public com.airbnb.lottie.model.content.a a() {
        return this.f21729w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.airbnb.lottie.g b() {
        return this.f21708b;
    }

    @P
    public C1018j c() {
        return this.f21730x;
    }

    public long d() {
        return this.f21710d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.value.a<Float>> e() {
        return this.f21726t;
    }

    public LayerType f() {
        return this.f21711e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Mask> g() {
        return this.f21714h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatteType h() {
        return this.f21727u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f21709c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f21712f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f21722p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f21721o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public String m() {
        return this.f21713g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.model.content.c> n() {
        return this.f21707a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f21718l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f21717k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f21716j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.f21720n / this.f21708b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public j s() {
        return this.f21723q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public k t() {
        return this.f21724r;
    }

    public String toString() {
        return y("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public com.airbnb.lottie.model.animatable.b u() {
        return this.f21725s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v() {
        return this.f21719m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l w() {
        return this.f21715i;
    }

    public boolean x() {
        return this.f21728v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        Layer x3 = this.f21708b.x(j());
        if (x3 != null) {
            sb.append("\t\tParents: ");
            sb.append(x3.i());
            Layer x4 = this.f21708b.x(x3.j());
            while (x4 != null) {
                sb.append("->");
                sb.append(x4.i());
                x4 = this.f21708b.x(x4.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f21707a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.c cVar : this.f21707a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
