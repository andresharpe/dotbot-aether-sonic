package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    p f8074d;

    /* renamed from: f, reason: collision with root package name */
    int f8076f;

    /* renamed from: g, reason: collision with root package name */
    public int f8077g;

    /* renamed from: a, reason: collision with root package name */
    public d f8071a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8072b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8073c = false;

    /* renamed from: e, reason: collision with root package name */
    a f8075e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    int f8078h = 1;

    /* renamed from: i, reason: collision with root package name */
    g f8079i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8080j = false;

    /* renamed from: k, reason: collision with root package name */
    List<d> f8081k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<f> f8082l = new ArrayList();

    /* loaded from: classes.dex */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f8074d = pVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        Iterator<f> it = this.f8082l.iterator();
        while (it.hasNext()) {
            if (!it.next().f8080j) {
                return;
            }
        }
        this.f8073c = true;
        d dVar2 = this.f8071a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f8072b) {
            this.f8074d.a(this);
            return;
        }
        f fVar = null;
        int i4 = 0;
        for (f fVar2 : this.f8082l) {
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f8080j) {
            g gVar = this.f8079i;
            if (gVar != null) {
                if (gVar.f8080j) {
                    this.f8076f = this.f8078h * gVar.f8077g;
                } else {
                    return;
                }
            }
            e(fVar.f8077g + this.f8076f);
        }
        d dVar3 = this.f8071a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f8081k.add(dVar);
        if (this.f8080j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f8082l.clear();
        this.f8081k.clear();
        this.f8080j = false;
        this.f8077g = 0;
        this.f8073c = false;
        this.f8072b = false;
    }

    public String d() {
        String str;
        String y3 = this.f8074d.f8126b.y();
        a aVar = this.f8075e;
        if (aVar != a.LEFT && aVar != a.RIGHT) {
            str = y3 + "_VERTICAL";
        } else {
            str = y3 + "_HORIZONTAL";
        }
        return str + ":" + this.f8075e.name();
    }

    public void e(int i4) {
        if (this.f8080j) {
            return;
        }
        this.f8080j = true;
        this.f8077g = i4;
        for (d dVar : this.f8081k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        Object obj;
        String y3 = this.f8074d.f8126b.y();
        a aVar = this.f8075e;
        if (this.f8080j) {
            obj = Integer.valueOf(this.f8077g);
        } else {
            obj = "unresolved";
        }
        return y3 + ":" + aVar + "(" + obj + ") <t=" + this.f8082l.size() + ":d=" + this.f8081k.size() + ">";
    }
}
