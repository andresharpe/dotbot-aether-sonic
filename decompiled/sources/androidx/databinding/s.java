package androidx.databinding;

import androidx.annotation.N;
import androidx.core.util.t;
import androidx.databinding.i;
import androidx.databinding.w;

/* loaded from: classes.dex */
public class s extends i<w.a, w, b> {

    /* renamed from: L, reason: collision with root package name */
    private static final int f14113L = 0;

    /* renamed from: M, reason: collision with root package name */
    private static final int f14114M = 1;

    /* renamed from: N, reason: collision with root package name */
    private static final int f14115N = 2;

    /* renamed from: O, reason: collision with root package name */
    private static final int f14116O = 3;

    /* renamed from: P, reason: collision with root package name */
    private static final int f14117P = 4;

    /* renamed from: K, reason: collision with root package name */
    private static final t.c<b> f14112K = new t.c<>(10);

    /* renamed from: Q, reason: collision with root package name */
    private static final i.a<w.a, w, b> f14118Q = new a();

    /* loaded from: classes.dex */
    class a extends i.a<w.a, w, b> {
        a() {
        }

        @Override // androidx.databinding.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w.a aVar, w wVar, int i4, b bVar) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            aVar.a(wVar);
                            return;
                        } else {
                            aVar.i(wVar, bVar.f14119a, bVar.f14120b);
                            return;
                        }
                    }
                    aVar.h(wVar, bVar.f14119a, bVar.f14121c, bVar.f14120b);
                    return;
                }
                aVar.g(wVar, bVar.f14119a, bVar.f14120b);
                return;
            }
            aVar.f(wVar, bVar.f14119a, bVar.f14120b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f14119a;

        /* renamed from: b, reason: collision with root package name */
        public int f14120b;

        /* renamed from: c, reason: collision with root package name */
        public int f14121c;

        b() {
        }
    }

    public s() {
        super(f14118Q);
    }

    private static b r(int i4, int i5, int i6) {
        b b4 = f14112K.b();
        if (b4 == null) {
            b4 = new b();
        }
        b4.f14119a = i4;
        b4.f14121c = i5;
        b4.f14120b = i6;
        return b4;
    }

    @Override // androidx.databinding.i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public synchronized void i(@N w wVar, int i4, b bVar) {
        super.i(wVar, i4, bVar);
        if (bVar != null) {
            f14112K.a(bVar);
        }
    }

    public void t(@N w wVar) {
        i(wVar, 0, null);
    }

    public void u(@N w wVar, int i4, int i5) {
        i(wVar, 1, r(i4, 0, i5));
    }

    public void w(@N w wVar, int i4, int i5) {
        i(wVar, 2, r(i4, 0, i5));
    }

    public void x(@N w wVar, int i4, int i5, int i6) {
        i(wVar, 3, r(i4, i5, i6));
    }

    public void y(@N w wVar, int i4, int i5) {
        i(wVar, 4, r(i4, 0, i5));
    }
}
