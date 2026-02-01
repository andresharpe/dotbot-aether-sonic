package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.D0;
import kotlin.text.F;

/* loaded from: classes.dex */
public class FlexBuffers {

    /* renamed from: A, reason: collision with root package name */
    public static final int f14316A = 26;

    /* renamed from: B, reason: collision with root package name */
    public static final int f14317B = 36;

    /* renamed from: C, reason: collision with root package name */
    private static final p f14318C = new C0882a(new byte[]{0}, 1);

    /* renamed from: D, reason: collision with root package name */
    static final /* synthetic */ boolean f14319D = false;

    /* renamed from: a, reason: collision with root package name */
    public static final int f14320a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f14321b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f14322c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f14323d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f14324e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f14325f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f14326g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f14327h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f14328i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f14329j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f14330k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f14331l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f14332m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f14333n = 13;

    /* renamed from: o, reason: collision with root package name */
    public static final int f14334o = 14;

    /* renamed from: p, reason: collision with root package name */
    public static final int f14335p = 15;

    /* renamed from: q, reason: collision with root package name */
    public static final int f14336q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f14337r = 17;

    /* renamed from: s, reason: collision with root package name */
    public static final int f14338s = 18;

    /* renamed from: t, reason: collision with root package name */
    public static final int f14339t = 19;

    /* renamed from: u, reason: collision with root package name */
    public static final int f14340u = 20;

    /* renamed from: v, reason: collision with root package name */
    public static final int f14341v = 21;

    /* renamed from: w, reason: collision with root package name */
    public static final int f14342w = 22;

    /* renamed from: x, reason: collision with root package name */
    public static final int f14343x = 23;

    /* renamed from: y, reason: collision with root package name */
    public static final int f14344y = 24;

    /* renamed from: z, reason: collision with root package name */
    public static final int f14345z = 25;

    /* loaded from: classes.dex */
    public static class FlexBufferException extends RuntimeException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class a extends g {

        /* renamed from: e, reason: collision with root package name */
        static final a f14346e = new a(FlexBuffers.f14318C, 1, 1);

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ boolean f14347f = false;

        a(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static a d() {
            return f14346e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append(F.f52746b);
            sb.append(this.f14351a.j(this.f14352b, b()));
            sb.append(F.f52746b);
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public ByteBuffer c() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f14351a.b());
            wrap.position(this.f14352b);
            wrap.limit(this.f14352b + b());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte e(int i4) {
            return this.f14351a.get(this.f14352b + i4);
        }

        public byte[] f() {
            int b4 = b();
            byte[] bArr = new byte[b4];
            for (int i4 = 0; i4 < b4; i4++) {
                bArr[i4] = this.f14351a.get(this.f14352b + i4);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            return this.f14351a.j(this.f14352b, b());
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        private static final b f14348d = new b(FlexBuffers.f14318C, 0, 0);

        b(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static b d() {
            return f14348d;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        int c(byte[] bArr) {
            byte b4;
            byte b5;
            int i4 = this.f14352b;
            int i5 = 0;
            do {
                b4 = this.f14351a.get(i4);
                b5 = bArr[i5];
                if (b4 == 0) {
                    return b4 - b5;
                }
                i4++;
                i5++;
                if (i5 == bArr.length) {
                    return b4 - b5;
                }
            } while (b4 == b5);
            return b4 - b5;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.f14352b != this.f14352b || bVar.f14353c != this.f14353c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f14352b ^ this.f14353c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public String toString() {
            int i4 = this.f14352b;
            while (this.f14351a.get(i4) != 0) {
                i4++;
            }
            int i5 = this.f14352b;
            return this.f14351a.j(i5, i4 - i5);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final h f14349a;

        c(h hVar) {
            this.f14349a = hVar;
        }

        public b a(int i4) {
            if (i4 >= b()) {
                return b.f14348d;
            }
            h hVar = this.f14349a;
            int i5 = hVar.f14352b + (i4 * hVar.f14353c);
            h hVar2 = this.f14349a;
            p pVar = hVar2.f14351a;
            return new b(pVar, FlexBuffers.i(pVar, i5, hVar2.f14353c), 1);
        }

        public int b() {
            return this.f14349a.b();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i4 = 0; i4 < this.f14349a.b(); i4++) {
                this.f14349a.d(i4).z(sb);
                if (i4 != this.f14349a.b() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends j {

        /* renamed from: f, reason: collision with root package name */
        private static final d f14350f = new d(FlexBuffers.f14318C, 1, 1);

        d(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        private int f(c cVar, byte[] bArr) {
            int b4 = cVar.b() - 1;
            int i4 = 0;
            while (i4 <= b4) {
                int i5 = (i4 + b4) >>> 1;
                int c4 = cVar.a(i5).c(bArr);
                if (c4 < 0) {
                    i4 = i5 + 1;
                } else if (c4 > 0) {
                    b4 = i5 - 1;
                } else {
                    return i5;
                }
            }
            return -(i4 + 1);
        }

        public static d g() {
            return f14350f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j, androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append("{ ");
            c j4 = j();
            int b4 = b();
            j k4 = k();
            for (int i4 = 0; i4 < b4; i4++) {
                sb.append(F.f52746b);
                sb.append(j4.a(i4).toString());
                sb.append("\" : ");
                sb.append(k4.d(i4).toString());
                if (i4 != b4 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public f h(String str) {
            return i(str.getBytes(StandardCharsets.UTF_8));
        }

        public f i(byte[] bArr) {
            c j4 = j();
            int b4 = j4.b();
            int f4 = f(j4, bArr);
            if (f4 < 0 || f4 >= b4) {
                return f.f14354f;
            }
            return d(f4);
        }

        public c j() {
            int i4 = this.f14352b - (this.f14353c * 3);
            p pVar = this.f14351a;
            int i5 = FlexBuffers.i(pVar, i4, this.f14353c);
            p pVar2 = this.f14351a;
            int i6 = this.f14353c;
            return new c(new h(pVar, i5, FlexBuffers.n(pVar2, i4 + i6, i6), 4));
        }

        public j k() {
            return new j(this.f14351a, this.f14352b, this.f14353c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        p f14351a;

        /* renamed from: b, reason: collision with root package name */
        int f14352b;

        /* renamed from: c, reason: collision with root package name */
        int f14353c;

        e(p pVar, int i4, int i5) {
            this.f14351a = pVar;
            this.f14352b = i4;
            this.f14353c = i5;
        }

        public abstract StringBuilder a(StringBuilder sb);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: f, reason: collision with root package name */
        private static final f f14354f = new f(FlexBuffers.f14318C, 0, 1, 0);

        /* renamed from: a, reason: collision with root package name */
        private p f14355a;

        /* renamed from: b, reason: collision with root package name */
        private int f14356b;

        /* renamed from: c, reason: collision with root package name */
        private int f14357c;

        /* renamed from: d, reason: collision with root package name */
        private int f14358d;

        /* renamed from: e, reason: collision with root package name */
        private int f14359e;

        f(p pVar, int i4, int i5, int i6) {
            this(pVar, i4, i5, 1 << (i6 & 3), i6 >> 2);
        }

        public a b() {
            if (!m() && !v()) {
                return a.d();
            }
            p pVar = this.f14355a;
            return new a(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
        }

        public boolean c() {
            if (n()) {
                if (this.f14355a.get(this.f14356b) == 0) {
                    return false;
                }
                return true;
            }
            if (j() == 0) {
                return false;
            }
            return true;
        }

        public double d() {
            int i4 = this.f14359e;
            if (i4 == 3) {
                return FlexBuffers.m(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                if (i4 != 8) {
                                    if (i4 != 10) {
                                        if (i4 != 26) {
                                            return com.google.firebase.remoteconfig.l.f37524n;
                                        }
                                    } else {
                                        return k().b();
                                    }
                                } else {
                                    p pVar = this.f14355a;
                                    return FlexBuffers.m(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
                                }
                            } else {
                                p pVar2 = this.f14355a;
                                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f14356b, this.f14357c), this.f14358d);
                            }
                        } else {
                            p pVar3 = this.f14355a;
                            return FlexBuffers.n(pVar3, FlexBuffers.i(pVar3, this.f14356b, this.f14357c), this.f14358d);
                        }
                    } else {
                        return Double.parseDouble(i());
                    }
                }
                return FlexBuffers.p(this.f14355a, this.f14356b, this.f14357c);
            }
            return FlexBuffers.n(this.f14355a, this.f14356b, this.f14357c);
        }

        public int e() {
            int i4 = this.f14359e;
            if (i4 == 1) {
                return FlexBuffers.n(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 6) {
                            if (i4 != 7) {
                                if (i4 != 8) {
                                    if (i4 != 10) {
                                        if (i4 == 26) {
                                            return FlexBuffers.n(this.f14355a, this.f14356b, this.f14357c);
                                        }
                                        return 0;
                                    }
                                    return k().b();
                                }
                                p pVar = this.f14355a;
                                return (int) FlexBuffers.m(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
                            }
                            p pVar2 = this.f14355a;
                            return (int) FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f14356b, this.f14357c), this.f14357c);
                        }
                        p pVar3 = this.f14355a;
                        return FlexBuffers.n(pVar3, FlexBuffers.i(pVar3, this.f14356b, this.f14357c), this.f14358d);
                    }
                    return Integer.parseInt(i());
                }
                return (int) FlexBuffers.m(this.f14355a, this.f14356b, this.f14357c);
            }
            return (int) FlexBuffers.p(this.f14355a, this.f14356b, this.f14357c);
        }

        public b f() {
            if (r()) {
                p pVar = this.f14355a;
                return new b(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
            }
            return b.d();
        }

        public long g() {
            int i4 = this.f14359e;
            if (i4 == 1) {
                return FlexBuffers.o(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 == 2) {
                return FlexBuffers.p(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 != 3) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 7) {
                            if (i4 != 8) {
                                if (i4 != 10) {
                                    if (i4 != 26) {
                                        return 0L;
                                    }
                                    return FlexBuffers.n(this.f14355a, this.f14356b, this.f14357c);
                                }
                                return k().b();
                            }
                            p pVar = this.f14355a;
                            return (long) FlexBuffers.m(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
                        }
                        p pVar2 = this.f14355a;
                        return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f14356b, this.f14357c), this.f14357c);
                    }
                    p pVar3 = this.f14355a;
                    return FlexBuffers.o(pVar3, FlexBuffers.i(pVar3, this.f14356b, this.f14357c), this.f14358d);
                }
                try {
                    return Long.parseLong(i());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) FlexBuffers.m(this.f14355a, this.f14356b, this.f14357c);
        }

        public d h() {
            if (s()) {
                p pVar = this.f14355a;
                return new d(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
            }
            return d.g();
        }

        public String i() {
            if (v()) {
                int i4 = FlexBuffers.i(this.f14355a, this.f14356b, this.f14357c);
                p pVar = this.f14355a;
                int i5 = this.f14358d;
                return this.f14355a.j(i4, (int) FlexBuffers.p(pVar, i4 - i5, i5));
            }
            if (r()) {
                int i6 = FlexBuffers.i(this.f14355a, this.f14356b, this.f14358d);
                int i7 = i6;
                while (this.f14355a.get(i7) != 0) {
                    i7++;
                }
                return this.f14355a.j(i6, i7 - i6);
            }
            return "";
        }

        public long j() {
            int i4 = this.f14359e;
            if (i4 == 2) {
                return FlexBuffers.p(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 == 1) {
                return FlexBuffers.o(this.f14355a, this.f14356b, this.f14357c);
            }
            if (i4 != 3) {
                if (i4 != 10) {
                    if (i4 != 26) {
                        if (i4 != 5) {
                            if (i4 != 6) {
                                if (i4 != 7) {
                                    if (i4 != 8) {
                                        return 0L;
                                    }
                                    p pVar = this.f14355a;
                                    return (long) FlexBuffers.m(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14357c);
                                }
                                p pVar2 = this.f14355a;
                                return FlexBuffers.p(pVar2, FlexBuffers.i(pVar2, this.f14356b, this.f14357c), this.f14358d);
                            }
                            p pVar3 = this.f14355a;
                            return FlexBuffers.o(pVar3, FlexBuffers.i(pVar3, this.f14356b, this.f14357c), this.f14358d);
                        }
                        return Long.parseLong(i());
                    }
                    return FlexBuffers.n(this.f14355a, this.f14356b, this.f14357c);
                }
                return k().b();
            }
            return (long) FlexBuffers.m(this.f14355a, this.f14356b, this.f14357c);
        }

        public j k() {
            if (y()) {
                p pVar = this.f14355a;
                return new j(pVar, FlexBuffers.i(pVar, this.f14356b, this.f14357c), this.f14358d);
            }
            int i4 = this.f14359e;
            if (i4 == 15) {
                p pVar2 = this.f14355a;
                return new h(pVar2, FlexBuffers.i(pVar2, this.f14356b, this.f14357c), this.f14358d, 4);
            }
            if (FlexBuffers.k(i4)) {
                p pVar3 = this.f14355a;
                return new h(pVar3, FlexBuffers.i(pVar3, this.f14356b, this.f14357c), this.f14358d, FlexBuffers.r(this.f14359e));
            }
            return j.c();
        }

        public int l() {
            return this.f14359e;
        }

        public boolean m() {
            if (this.f14359e == 25) {
                return true;
            }
            return false;
        }

        public boolean n() {
            if (this.f14359e == 26) {
                return true;
            }
            return false;
        }

        public boolean o() {
            int i4 = this.f14359e;
            if (i4 != 3 && i4 != 8) {
                return false;
            }
            return true;
        }

        public boolean p() {
            int i4 = this.f14359e;
            if (i4 == 1 || i4 == 6) {
                return true;
            }
            return false;
        }

        public boolean q() {
            if (!p() && !x()) {
                return false;
            }
            return true;
        }

        public boolean r() {
            if (this.f14359e == 4) {
                return true;
            }
            return false;
        }

        public boolean s() {
            if (this.f14359e == 9) {
                return true;
            }
            return false;
        }

        public boolean t() {
            if (this.f14359e == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return z(new StringBuilder(128)).toString();
        }

        public boolean u() {
            if (!q() && !o()) {
                return false;
            }
            return true;
        }

        public boolean v() {
            if (this.f14359e == 5) {
                return true;
            }
            return false;
        }

        public boolean w() {
            return FlexBuffers.k(this.f14359e);
        }

        public boolean x() {
            int i4 = this.f14359e;
            if (i4 != 2 && i4 != 7) {
                return false;
            }
            return true;
        }

        public boolean y() {
            int i4 = this.f14359e;
            if (i4 != 10 && i4 != 9) {
                return false;
            }
            return true;
        }

        StringBuilder z(StringBuilder sb) {
            int i4 = this.f14359e;
            if (i4 != 36) {
                switch (i4) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(g());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(j());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(d());
                        return sb;
                    case 4:
                        b f4 = f();
                        sb.append(F.f52746b);
                        StringBuilder a4 = f4.a(sb);
                        a4.append(F.f52746b);
                        return a4;
                    case 5:
                        sb.append(F.f52746b);
                        sb.append(i());
                        sb.append(F.f52746b);
                        return sb;
                    case 9:
                        return h().a(sb);
                    case 10:
                        return k().a(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f14359e);
                    case 25:
                        return b().a(sb);
                    case 26:
                        sb.append(c());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(k());
            return sb;
        }

        f(p pVar, int i4, int i5, int i6, int i7) {
            this.f14355a = pVar;
            this.f14356b = i4;
            this.f14357c = i5;
            this.f14358d = i6;
            this.f14359e = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g extends e {

        /* renamed from: d, reason: collision with root package name */
        protected final int f14360d;

        g(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
            this.f14360d = FlexBuffers.n(this.f14351a, i4 - i5, i5);
        }

        public int b() {
            return this.f14360d;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends j {

        /* renamed from: g, reason: collision with root package name */
        private static final h f14361g = new h(FlexBuffers.f14318C, 1, 1, 1);

        /* renamed from: f, reason: collision with root package name */
        private final int f14362f;

        h(p pVar, int i4, int i5, int i6) {
            super(pVar, i4, i5);
            this.f14362f = i6;
        }

        public static h f() {
            return f14361g;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j
        public f d(int i4) {
            if (i4 >= b()) {
                return f.f14354f;
            }
            return new f(this.f14351a, this.f14352b + (i4 * this.f14353c), this.f14353c, 1, this.f14362f);
        }

        public int g() {
            return this.f14362f;
        }

        public boolean h() {
            if (this == f14361g) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int a(byte b4) {
            return b4 & 255;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static long b(int i4) {
            return i4 & 4294967295L;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static int c(short s4) {
            return s4 & D0.f51794H;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends g {

        /* renamed from: e, reason: collision with root package name */
        private static final j f14363e = new j(FlexBuffers.f14318C, 1, 1);

        j(p pVar, int i4, int i5) {
            super(pVar, i4, i5);
        }

        public static j c() {
            return f14363e;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb) {
            sb.append("[ ");
            int b4 = b();
            for (int i4 = 0; i4 < b4; i4++) {
                d(i4).z(sb);
                if (i4 != b4 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.g
        public /* bridge */ /* synthetic */ int b() {
            return super.b();
        }

        public f d(int i4) {
            long b4 = b();
            long j4 = i4;
            if (j4 >= b4) {
                return f.f14354f;
            }
            return new f(this.f14351a, this.f14352b + (i4 * this.f14353c), this.f14353c, i.a(this.f14351a.get((int) (this.f14352b + (b4 * this.f14353c) + j4))));
        }

        public boolean e() {
            if (this == f14363e) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static f g(p pVar) {
        int a4 = pVar.a();
        byte b4 = pVar.get(a4 - 1);
        int i4 = a4 - 2;
        return new f(pVar, i4 - b4, b4, i.a(pVar.get(i4)));
    }

    @Deprecated
    public static f h(ByteBuffer byteBuffer) {
        p dVar;
        if (byteBuffer.hasArray()) {
            dVar = new C0882a(byteBuffer.array(), byteBuffer.limit());
        } else {
            dVar = new androidx.emoji2.text.flatbuffer.d(byteBuffer);
        }
        return g(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(p pVar, int i4, int i5) {
        return (int) (i4 - p(pVar, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(int i4) {
        return i4 <= 3 || i4 == 26;
    }

    static boolean k(int i4) {
        return (i4 >= 11 && i4 <= 15) || i4 == 36;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(int i4) {
        return (i4 >= 1 && i4 <= 4) || i4 == 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double m(p pVar, int i4, int i5) {
        if (i5 != 4) {
            if (i5 != 8) {
                return -1.0d;
            }
            return pVar.getDouble(i4);
        }
        return pVar.getFloat(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(p pVar, int i4, int i5) {
        return (int) o(pVar, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long o(p pVar, int i4, int i5) {
        int i6;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 4) {
                    if (i5 != 8) {
                        return -1L;
                    }
                    return pVar.getLong(i4);
                }
                i6 = pVar.getInt(i4);
            } else {
                i6 = pVar.getShort(i4);
            }
        } else {
            i6 = pVar.get(i4);
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long p(p pVar, int i4, int i5) {
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 4) {
                    if (i5 != 8) {
                        return -1L;
                    }
                    return pVar.getLong(i4);
                }
                return i.b(pVar.getInt(i4));
            }
            return i.c(pVar.getShort(i4));
        }
        return i.a(pVar.get(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i4, int i5) {
        if (i5 == 0) {
            return i4 + 10;
        }
        if (i5 == 2) {
            return i4 + 15;
        }
        if (i5 == 3) {
            return i4 + 18;
        }
        if (i5 != 4) {
            return 0;
        }
        return i4 + 21;
    }

    static int r(int i4) {
        return i4 - 10;
    }
}
