package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final E f12856a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final E f12857b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final E f12858c;

    /* renamed from: d, reason: collision with root package name */
    public static final E f12859d;

    /* renamed from: e, reason: collision with root package name */
    public static final E f12860e;

    /* renamed from: f, reason: collision with root package name */
    public static final E f12861f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12862g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12863h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12864i = 2;

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f12865b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f12866a;

        private a(boolean z3) {
            this.f12866a = z3;
        }

        @Override // androidx.core.text.F.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z3 = false;
            while (i4 < i6) {
                int a4 = F.a(Character.getDirectionality(charSequence.charAt(i4)));
                if (a4 != 0) {
                    if (a4 == 1) {
                        if (!this.f12866a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i4++;
                        z3 = z3;
                    }
                } else if (this.f12866a) {
                    return 0;
                }
                z3 = true;
                i4++;
                z3 = z3;
            }
            if (z3) {
                return this.f12866a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f12867a = new b();

        private b() {
        }

        @Override // androidx.core.text.F.c
        public int a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int i7 = 2;
            while (i4 < i6 && i7 == 2) {
                i7 = F.b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i4, int i5);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements E {

        /* renamed from: a, reason: collision with root package name */
        private final c f12868a;

        d(c cVar) {
            this.f12868a = cVar;
        }

        private boolean d(CharSequence charSequence, int i4, int i5) {
            int a4 = this.f12868a.a(charSequence, i4, i5);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                return c();
            }
            return false;
        }

        @Override // androidx.core.text.E
        public boolean a(char[] cArr, int i4, int i5) {
            return b(CharBuffer.wrap(cArr), i4, i5);
        }

        @Override // androidx.core.text.E
        public boolean b(CharSequence charSequence, int i4, int i5) {
            if (charSequence != null && i4 >= 0 && i5 >= 0 && charSequence.length() - i5 >= i4) {
                if (this.f12868a == null) {
                    return c();
                }
                return d(charSequence, i4, i5);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean c();
    }

    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12869b;

        e(c cVar, boolean z3) {
            super(cVar);
            this.f12869b = z3;
        }

        @Override // androidx.core.text.F.d
        protected boolean c() {
            return this.f12869b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f12870b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.F.d
        protected boolean c() {
            if (G.b(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f12867a;
        f12858c = new e(bVar, false);
        f12859d = new e(bVar, true);
        f12860e = new e(a.f12865b, false);
        f12861f = f.f12870b;
    }

    private F() {
    }

    static int a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
