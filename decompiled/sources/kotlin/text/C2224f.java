package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.text.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2224f implements kotlin.sequences.m<kotlin.ranges.l> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final CharSequence f52801a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52802b;

    /* renamed from: c, reason: collision with root package name */
    private final int f52803c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final X2.p<CharSequence, Integer, Pair<Integer, Integer>> f52804d;

    /* renamed from: kotlin.text.f$a */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<kotlin.ranges.l>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f52805E = -1;

        /* renamed from: F, reason: collision with root package name */
        private int f52806F;

        /* renamed from: G, reason: collision with root package name */
        private int f52807G;

        /* renamed from: H, reason: collision with root package name */
        @l3.e
        private kotlin.ranges.l f52808H;

        /* renamed from: I, reason: collision with root package name */
        private int f52809I;

        a() {
            int I3;
            I3 = kotlin.ranges.u.I(C2224f.this.f52802b, 0, C2224f.this.f52801a.length());
            this.f52806F = I3;
            this.f52807G = I3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f52810J.f52803c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b() {
            /*
                r6 = this;
                int r0 = r6.f52807G
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f52805E = r1
                r0 = 0
                r6.f52808H = r0
                goto L9e
            Lc:
                kotlin.text.f r0 = kotlin.text.C2224f.this
                int r0 = kotlin.text.C2224f.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f52809I
                int r0 = r0 + r3
                r6.f52809I = r0
                kotlin.text.f r4 = kotlin.text.C2224f.this
                int r4 = kotlin.text.C2224f.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f52807G
                kotlin.text.f r4 = kotlin.text.C2224f.this
                java.lang.CharSequence r4 = kotlin.text.C2224f.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f52806F
                kotlin.text.f r4 = kotlin.text.C2224f.this
                java.lang.CharSequence r4 = kotlin.text.C2224f.d(r4)
                int r4 = kotlin.text.q.g3(r4)
                r0.<init>(r1, r4)
                r6.f52808H = r0
                r6.f52807G = r2
                goto L9c
            L47:
                kotlin.text.f r0 = kotlin.text.C2224f.this
                X2.p r0 = kotlin.text.C2224f.c(r0)
                kotlin.text.f r4 = kotlin.text.C2224f.this
                java.lang.CharSequence r4 = kotlin.text.C2224f.d(r4)
                int r5 = r6.f52807G
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.c0(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L77
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f52806F
                kotlin.text.f r4 = kotlin.text.C2224f.this
                java.lang.CharSequence r4 = kotlin.text.C2224f.d(r4)
                int r4 = kotlin.text.q.g3(r4)
                r0.<init>(r1, r4)
                r6.f52808H = r0
                r6.f52807G = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f52806F
                kotlin.ranges.l r4 = kotlin.ranges.s.W1(r4, r2)
                r6.f52808H = r4
                int r2 = r2 + r0
                r6.f52806F = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f52807G = r2
            L9c:
                r6.f52805E = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C2224f.a.b():void");
        }

        public final int c() {
            return this.f52809I;
        }

        public final int d() {
            return this.f52806F;
        }

        @l3.e
        public final kotlin.ranges.l e() {
            return this.f52808H;
        }

        public final int h() {
            return this.f52807G;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52805E == -1) {
                b();
            }
            if (this.f52805E == 1) {
                return true;
            }
            return false;
        }

        public final int i() {
            return this.f52805E;
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public kotlin.ranges.l next() {
            if (this.f52805E == -1) {
                b();
            }
            if (this.f52805E != 0) {
                kotlin.ranges.l lVar = this.f52808H;
                kotlin.jvm.internal.F.n(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f52808H = null;
                this.f52805E = -1;
                return lVar;
            }
            throw new NoSuchElementException();
        }

        public final void k(int i4) {
            this.f52809I = i4;
        }

        public final void l(int i4) {
            this.f52806F = i4;
        }

        public final void m(@l3.e kotlin.ranges.l lVar) {
            this.f52808H = lVar;
        }

        public final void n(int i4) {
            this.f52807G = i4;
        }

        public final void o(int i4) {
            this.f52805E = i4;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2224f(@l3.d CharSequence input, int i4, int i5, @l3.d X2.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.F.p(input, "input");
        kotlin.jvm.internal.F.p(getNextMatch, "getNextMatch");
        this.f52801a = input;
        this.f52802b = i4;
        this.f52803c = i5;
        this.f52804d = getNextMatch;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<kotlin.ranges.l> iterator() {
        return new a();
    }
}
