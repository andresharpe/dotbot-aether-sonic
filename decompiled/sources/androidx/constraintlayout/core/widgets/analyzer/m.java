package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8095h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f8096i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f8097j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static int f8098k;

    /* renamed from: c, reason: collision with root package name */
    p f8101c;

    /* renamed from: d, reason: collision with root package name */
    p f8102d;

    /* renamed from: f, reason: collision with root package name */
    int f8104f;

    /* renamed from: g, reason: collision with root package name */
    int f8105g;

    /* renamed from: a, reason: collision with root package name */
    public int f8099a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8100b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<p> f8103e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(p pVar, int i4) {
        this.f8101c = null;
        this.f8102d = null;
        int i5 = f8098k;
        this.f8104f = i5;
        f8098k = i5 + 1;
        this.f8101c = pVar;
        this.f8102d = pVar;
        this.f8105g = i4;
    }

    private boolean c(p pVar, int i4) {
        f fVar;
        p pVar2;
        f fVar2;
        p pVar3;
        if (!pVar.f8126b.f7981g[i4]) {
            return false;
        }
        for (d dVar : pVar.f8132h.f8081k) {
            if ((dVar instanceof f) && (pVar3 = (fVar2 = (f) dVar).f8074d) != pVar && fVar2 == pVar3.f8132h) {
                if (pVar instanceof c) {
                    Iterator<p> it = ((c) pVar).f8058k.iterator();
                    while (it.hasNext()) {
                        c(it.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f8126b.f7981g[i4] = false;
                }
                c(fVar2.f8074d, i4);
            }
        }
        for (d dVar2 : pVar.f8133i.f8081k) {
            if ((dVar2 instanceof f) && (pVar2 = (fVar = (f) dVar2).f8074d) != pVar && fVar == pVar2.f8132h) {
                if (pVar instanceof c) {
                    Iterator<p> it2 = ((c) pVar).f8058k.iterator();
                    while (it2.hasNext()) {
                        c(it2.next(), i4);
                    }
                } else if (!(pVar instanceof k)) {
                    pVar.f8126b.f7981g[i4] = false;
                }
                c(fVar.f8074d, i4);
            }
        }
        return false;
    }

    private long e(f fVar, long j4) {
        p pVar = fVar.f8074d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f8081k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f8081k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8074d != pVar) {
                    j5 = Math.min(j5, e(fVar2, fVar2.f8076f + j4));
                }
            }
        }
        if (fVar == pVar.f8133i) {
            long j6 = j4 - pVar.j();
            return Math.min(Math.min(j5, e(pVar.f8132h, j6)), j6 - pVar.f8132h.f8076f);
        }
        return j5;
    }

    private long f(f fVar, long j4) {
        p pVar = fVar.f8074d;
        if (pVar instanceof k) {
            return j4;
        }
        int size = fVar.f8081k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = fVar.f8081k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f8074d != pVar) {
                    j5 = Math.max(j5, f(fVar2, fVar2.f8076f + j4));
                }
            }
        }
        if (fVar == pVar.f8132h) {
            long j6 = j4 + pVar.j();
            return Math.max(Math.max(j5, f(pVar.f8133i, j6)), j6 - pVar.f8133i.f8076f);
        }
        return j5;
    }

    public void a(p pVar) {
        this.f8103e.add(pVar);
        this.f8102d = pVar;
    }

    public long b(androidx.constraintlayout.core.widgets.d dVar, int i4) {
        p pVar;
        p pVar2;
        long j4;
        int i5;
        p pVar3 = this.f8101c;
        long j5 = 0;
        if (pVar3 instanceof c) {
            if (((c) pVar3).f8130f != i4) {
                return 0L;
            }
        } else if (i4 == 0) {
            if (!(pVar3 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar3 instanceof n)) {
            return 0L;
        }
        if (i4 == 0) {
            pVar = dVar.f7977e;
        } else {
            pVar = dVar.f7979f;
        }
        f fVar = pVar.f8132h;
        if (i4 == 0) {
            pVar2 = dVar.f7977e;
        } else {
            pVar2 = dVar.f7979f;
        }
        f fVar2 = pVar2.f8133i;
        boolean contains = pVar3.f8132h.f8082l.contains(fVar);
        boolean contains2 = this.f8101c.f8133i.f8082l.contains(fVar2);
        long j6 = this.f8101c.j();
        if (contains && contains2) {
            long f4 = f(this.f8101c.f8132h, 0L);
            long e4 = e(this.f8101c.f8133i, 0L);
            long j7 = f4 - j6;
            p pVar4 = this.f8101c;
            int i6 = pVar4.f8133i.f8076f;
            if (j7 >= (-i6)) {
                j7 += i6;
            }
            int i7 = pVar4.f8132h.f8076f;
            long j8 = ((-e4) - j6) - i7;
            if (j8 >= i7) {
                j8 -= i7;
            }
            float u3 = pVar4.f8126b.u(i4);
            if (u3 > 0.0f) {
                j5 = (((float) j8) / u3) + (((float) j7) / (1.0f - u3));
            }
            float f5 = (float) j5;
            long j9 = (f5 * u3) + 0.5f + j6 + (f5 * (1.0f - u3)) + 0.5f;
            j4 = r12.f8132h.f8076f + j9;
            i5 = this.f8101c.f8133i.f8076f;
        } else {
            if (contains) {
                return Math.max(f(this.f8101c.f8132h, r12.f8076f), this.f8101c.f8132h.f8076f + j6);
            }
            if (contains2) {
                return Math.max(-e(this.f8101c.f8133i, r12.f8076f), (-this.f8101c.f8133i.f8076f) + j6);
            }
            j4 = r12.f8132h.f8076f + this.f8101c.j();
            i5 = this.f8101c.f8133i.f8076f;
        }
        return j4 - i5;
    }

    public void d(boolean z3, boolean z4) {
        if (z3) {
            p pVar = this.f8101c;
            if (pVar instanceof l) {
                c(pVar, 0);
            }
        }
        if (z4) {
            p pVar2 = this.f8101c;
            if (pVar2 instanceof n) {
                c(pVar2, 1);
            }
        }
    }
}
