package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import java.util.Locale;

/* renamed from: androidx.core.text.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753a {

    /* renamed from: d, reason: collision with root package name */
    static final E f12874d;

    /* renamed from: e, reason: collision with root package name */
    private static final char f12875e = 8234;

    /* renamed from: f, reason: collision with root package name */
    private static final char f12876f = 8235;

    /* renamed from: g, reason: collision with root package name */
    private static final char f12877g = 8236;

    /* renamed from: h, reason: collision with root package name */
    private static final char f12878h = 8206;

    /* renamed from: i, reason: collision with root package name */
    private static final char f12879i = 8207;

    /* renamed from: j, reason: collision with root package name */
    private static final String f12880j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f12881k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f12882l = "";

    /* renamed from: m, reason: collision with root package name */
    private static final int f12883m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final int f12884n = 2;

    /* renamed from: o, reason: collision with root package name */
    static final C0753a f12885o;

    /* renamed from: p, reason: collision with root package name */
    static final C0753a f12886p;

    /* renamed from: q, reason: collision with root package name */
    private static final int f12887q = -1;

    /* renamed from: r, reason: collision with root package name */
    private static final int f12888r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f12889s = 1;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12890a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12891b;

    /* renamed from: c, reason: collision with root package name */
    private final E f12892c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final int f12896f = 1792;

        /* renamed from: g, reason: collision with root package name */
        private static final byte[] f12897g = new byte[f12896f];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f12898a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12899b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12900c;

        /* renamed from: d, reason: collision with root package name */
        private int f12901d;

        /* renamed from: e, reason: collision with root package name */
        private char f12902e;

        static {
            for (int i4 = 0; i4 < f12896f; i4++) {
                f12897g[i4] = Character.getDirectionality(i4);
            }
        }

        b(CharSequence charSequence, boolean z3) {
            this.f12898a = charSequence;
            this.f12899b = z3;
            this.f12900c = charSequence.length();
        }

        private static byte c(char c4) {
            if (c4 < f12896f) {
                return f12897g[c4];
            }
            return Character.getDirectionality(c4);
        }

        private byte f() {
            char charAt;
            int i4 = this.f12901d;
            do {
                int i5 = this.f12901d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f12898a;
                int i6 = i5 - 1;
                this.f12901d = i6;
                charAt = charSequence.charAt(i6);
                this.f12902e = charAt;
                if (charAt == '&') {
                    return AdvancedCustomEQPayload.f48133O;
                }
            } while (charAt != ';');
            this.f12901d = i4;
            this.f12902e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i4 = this.f12901d;
                if (i4 < this.f12900c) {
                    CharSequence charSequence = this.f12898a;
                    this.f12901d = i4 + 1;
                    charAt = charSequence.charAt(i4);
                    this.f12902e = charAt;
                } else {
                    return AdvancedCustomEQPayload.f48133O;
                }
            } while (charAt != ';');
            return AdvancedCustomEQPayload.f48133O;
        }

        private byte h() {
            char charAt;
            int i4 = this.f12901d;
            while (true) {
                int i5 = this.f12901d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f12898a;
                int i6 = i5 - 1;
                this.f12901d = i6;
                char charAt2 = charSequence.charAt(i6);
                this.f12902e = charAt2;
                if (charAt2 == '<') {
                    return AdvancedCustomEQPayload.f48133O;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f12901d;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f12898a;
                            int i8 = i7 - 1;
                            this.f12901d = i8;
                            charAt = charSequence2.charAt(i8);
                            this.f12902e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f12901d = i4;
            this.f12902e = kotlin.text.F.f52750f;
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i4 = this.f12901d;
            while (true) {
                int i5 = this.f12901d;
                if (i5 < this.f12900c) {
                    CharSequence charSequence = this.f12898a;
                    this.f12901d = i5 + 1;
                    char charAt2 = charSequence.charAt(i5);
                    this.f12902e = charAt2;
                    if (charAt2 == '>') {
                        return AdvancedCustomEQPayload.f48133O;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i6 = this.f12901d;
                            if (i6 < this.f12900c) {
                                CharSequence charSequence2 = this.f12898a;
                                this.f12901d = i6 + 1;
                                charAt = charSequence2.charAt(i6);
                                this.f12902e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f12901d = i4;
                    this.f12902e = kotlin.text.F.f52749e;
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.f12898a.charAt(this.f12901d - 1);
            this.f12902e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f12898a, this.f12901d);
                this.f12901d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f12901d--;
            byte c4 = c(this.f12902e);
            if (this.f12899b) {
                char c5 = this.f12902e;
                if (c5 == '>') {
                    return h();
                }
                if (c5 == ';') {
                    return f();
                }
                return c4;
            }
            return c4;
        }

        byte b() {
            char charAt = this.f12898a.charAt(this.f12901d);
            this.f12902e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f12898a, this.f12901d);
                this.f12901d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f12901d++;
            byte c4 = c(this.f12902e);
            if (this.f12899b) {
                char c5 = this.f12902e;
                if (c5 == '<') {
                    return i();
                }
                if (c5 == '&') {
                    return g();
                }
                return c4;
            }
            return c4;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        int d() {
            this.f12901d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f12901d < this.f12900c && i4 == 0) {
                byte b4 = b();
                if (b4 != 0) {
                    if (b4 != 1 && b4 != 2) {
                        if (b4 != 9) {
                            switch (b4) {
                                case 14:
                                case 15:
                                    i6++;
                                    i5 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i6++;
                                    i5 = 1;
                                    continue;
                                case 18:
                                    i6--;
                                    i5 = 0;
                                    continue;
                            }
                        }
                    } else if (i6 == 0) {
                        return 1;
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f12901d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        i6--;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        i6--;
                    case 18:
                        i6++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        int e() {
            this.f12901d = this.f12900c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f12901d > 0) {
                    byte a4 = a();
                    if (a4 != 0) {
                        if (a4 != 1 && a4 != 2) {
                            if (a4 != 9) {
                                switch (a4) {
                                    case 14:
                                    case 15:
                                        if (i5 == i4) {
                                            return -1;
                                        }
                                        i4--;
                                        break;
                                    case 16:
                                    case 17:
                                        if (i5 == i4) {
                                            return 1;
                                        }
                                        i4--;
                                        break;
                                    case 18:
                                        i4++;
                                        break;
                                    default:
                                        if (i5 != 0) {
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            if (i4 == 0) {
                                return 1;
                            }
                            if (i5 == 0) {
                                break;
                            }
                        }
                    } else {
                        if (i4 == 0) {
                            return -1;
                        }
                        if (i5 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        E e4 = F.f12858c;
        f12874d = e4;
        f12880j = Character.toString(f12878h);
        f12881k = Character.toString(f12879i);
        f12885o = new C0753a(false, 2, e4);
        f12886p = new C0753a(true, 2, e4);
    }

    C0753a(boolean z3, int i4, E e4) {
        this.f12890a = z3;
        this.f12891b = i4;
        this.f12892c = e4;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static C0753a c() {
        return new C0100a().a();
    }

    public static C0753a d(Locale locale) {
        return new C0100a(locale).a();
    }

    public static C0753a e(boolean z3) {
        return new C0100a(z3).a();
    }

    static boolean j(Locale locale) {
        if (G.b(locale) == 1) {
            return true;
        }
        return false;
    }

    private String k(CharSequence charSequence, E e4) {
        boolean b4 = e4.b(charSequence, 0, charSequence.length());
        if (!this.f12890a && (b4 || b(charSequence) == 1)) {
            return f12880j;
        }
        if (this.f12890a) {
            if (!b4 || b(charSequence) == -1) {
                return f12881k;
            }
            return "";
        }
        return "";
    }

    private String l(CharSequence charSequence, E e4) {
        boolean b4 = e4.b(charSequence, 0, charSequence.length());
        if (!this.f12890a && (b4 || a(charSequence) == 1)) {
            return f12880j;
        }
        if (this.f12890a) {
            if (!b4 || a(charSequence) == -1) {
                return f12881k;
            }
            return "";
        }
        return "";
    }

    public boolean f() {
        if ((this.f12891b & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean g(CharSequence charSequence) {
        return this.f12892c.b(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f12890a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f12892c, true);
    }

    public CharSequence n(CharSequence charSequence, E e4) {
        return o(charSequence, e4, true);
    }

    public CharSequence o(CharSequence charSequence, E e4, boolean z3) {
        E e5;
        char c4;
        E e6;
        if (charSequence == null) {
            return null;
        }
        boolean b4 = e4.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z3) {
            if (b4) {
                e6 = F.f12857b;
            } else {
                e6 = F.f12856a;
            }
            spannableStringBuilder.append((CharSequence) l(charSequence, e6));
        }
        if (b4 != this.f12890a) {
            if (b4) {
                c4 = f12876f;
            } else {
                c4 = f12875e;
            }
            spannableStringBuilder.append(c4);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f12877g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z3) {
            if (b4) {
                e5 = F.f12857b;
            } else {
                e5 = F.f12856a;
            }
            spannableStringBuilder.append((CharSequence) k(charSequence, e5));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z3) {
        return o(charSequence, this.f12892c, z3);
    }

    public String q(String str) {
        return s(str, this.f12892c, true);
    }

    public String r(String str, E e4) {
        return s(str, e4, true);
    }

    public String s(String str, E e4, boolean z3) {
        if (str == null) {
            return null;
        }
        return o(str, e4, z3).toString();
    }

    public String t(String str, boolean z3) {
        return s(str, this.f12892c, z3);
    }

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0100a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12893a;

        /* renamed from: b, reason: collision with root package name */
        private int f12894b;

        /* renamed from: c, reason: collision with root package name */
        private E f12895c;

        public C0100a() {
            c(C0753a.j(Locale.getDefault()));
        }

        private static C0753a b(boolean z3) {
            if (z3) {
                return C0753a.f12886p;
            }
            return C0753a.f12885o;
        }

        private void c(boolean z3) {
            this.f12893a = z3;
            this.f12895c = C0753a.f12874d;
            this.f12894b = 2;
        }

        public C0753a a() {
            if (this.f12894b == 2 && this.f12895c == C0753a.f12874d) {
                return b(this.f12893a);
            }
            return new C0753a(this.f12893a, this.f12894b, this.f12895c);
        }

        public C0100a d(E e4) {
            this.f12895c = e4;
            return this;
        }

        public C0100a e(boolean z3) {
            if (z3) {
                this.f12894b |= 2;
            } else {
                this.f12894b &= -3;
            }
            return this;
        }

        public C0100a(boolean z3) {
            c(z3);
        }

        public C0100a(Locale locale) {
            c(C0753a.j(locale));
        }
    }
}
