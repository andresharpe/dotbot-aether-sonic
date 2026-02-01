package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.textclassifier.TextLinks;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0675j;
import androidx.core.util.InterfaceC0764e;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.core.content.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0675j {

    /* renamed from: p, reason: collision with root package name */
    private static final String f12219p = "IntentSanitizer";

    /* renamed from: a, reason: collision with root package name */
    private int f12220a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.core.util.A<String> f12221b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.util.A<Uri> f12222c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.core.util.A<String> f12223d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.core.util.A<String> f12224e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.core.util.A<String> f12225f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.core.util.A<ComponentName> f12226g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12227h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, androidx.core.util.A<Object>> f12228i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12229j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.core.util.A<Uri> f12230k;

    /* renamed from: l, reason: collision with root package name */
    private androidx.core.util.A<ClipData> f12231l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12232m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12233n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12234o;

    /* JADX INFO: Access modifiers changed from: private */
    @W(15)
    /* renamed from: androidx.core.content.j$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static Intent a(Intent intent) {
            return intent.getSelector();
        }

        @InterfaceC0577u
        static void b(Intent intent, Intent intent2) {
            intent.setSelector(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(16)
    /* renamed from: androidx.core.content.j$c */
    /* loaded from: classes.dex */
    public static class c {

        /* JADX INFO: Access modifiers changed from: private */
        @W(ConstraintLayout.b.a.f9573F)
        /* renamed from: androidx.core.content.j$c$a */
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @InterfaceC0577u
            static void a(int i4, ClipData.Item item, InterfaceC0764e<String> interfaceC0764e) {
                TextLinks textLinks;
                if (item.getHtmlText() == null && item.getIntent() == null) {
                    textLinks = item.getTextLinks();
                    if (textLinks == null) {
                        return;
                    }
                }
                interfaceC0764e.accept("ClipData item at position " + i4 + " contains htmlText, textLinks or intent: " + item);
            }
        }

        private c() {
        }

        private static void a(int i4, ClipData.Item item, InterfaceC0764e<String> interfaceC0764e) {
            if (item.getHtmlText() != null || item.getIntent() != null) {
                interfaceC0764e.accept("ClipData item at position " + i4 + " contains htmlText, textLinks or intent: " + item);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
        @androidx.annotation.InterfaceC0577u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void b(@androidx.annotation.N android.content.Intent r7, android.content.Intent r8, androidx.core.util.A<android.content.ClipData> r9, boolean r10, androidx.core.util.A<android.net.Uri> r11, androidx.core.util.InterfaceC0764e<java.lang.String> r12) {
            /*
                android.content.ClipData r7 = r7.getClipData()
                if (r7 != 0) goto L7
                return
            L7:
                if (r9 == 0) goto L14
                boolean r9 = r9.test(r7)
                if (r9 == 0) goto L14
                r8.setClipData(r7)
                goto Lde
            L14:
                r9 = 0
                r0 = 0
                r1 = r9
            L17:
                int r2 = r7.getItemCount()
                if (r0 >= r2) goto Ld9
                android.content.ClipData$Item r2 = r7.getItemAt(r0)
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 31
                if (r3 < r4) goto L2b
                androidx.core.content.C0675j.c.a.a(r0, r2, r12)
                goto L2e
            L2b:
                a(r0, r2, r12)
            L2e:
                if (r10 == 0) goto L35
                java.lang.CharSequence r3 = r2.getText()
                goto L5c
            L35:
                java.lang.CharSequence r3 = r2.getText()
                if (r3 == 0) goto L5b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Item text cannot contain value. Item position: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ". Text: "
                r3.append(r4)
                java.lang.CharSequence r4 = r2.getText()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.accept(r3)
            L5b:
                r3 = r9
            L5c:
                java.lang.String r4 = ". URI: "
                java.lang.String r5 = "Item URI is not allowed. Item position: "
                if (r11 != 0) goto L85
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
                goto Lb2
            L85:
                android.net.Uri r6 = r2.getUri()
                if (r6 == 0) goto Lb4
                android.net.Uri r6 = r2.getUri()
                boolean r6 = r11.test(r6)
                if (r6 == 0) goto L96
                goto Lb4
            L96:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r0)
                r6.append(r4)
                android.net.Uri r2 = r2.getUri()
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r12.accept(r2)
            Lb2:
                r2 = r9
                goto Lb8
            Lb4:
                android.net.Uri r2 = r2.getUri()
            Lb8:
                if (r3 != 0) goto Lbc
                if (r2 == 0) goto Ld5
            Lbc:
                if (r1 != 0) goto Lcd
                android.content.ClipData r1 = new android.content.ClipData
                android.content.ClipDescription r4 = r7.getDescription()
                android.content.ClipData$Item r5 = new android.content.ClipData$Item
                r5.<init>(r3, r9, r2)
                r1.<init>(r4, r5)
                goto Ld5
            Lcd:
                android.content.ClipData$Item r4 = new android.content.ClipData$Item
                r4.<init>(r3, r9, r2)
                r1.addItem(r4)
            Ld5:
                int r0 = r0 + 1
                goto L17
            Ld9:
                if (r1 == 0) goto Lde
                r8.setClipData(r1)
            Lde:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C0675j.c.b(android.content.Intent, android.content.Intent, androidx.core.util.A, boolean, androidx.core.util.A, androidx.core.util.e):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.content.j$d */
    /* loaded from: classes.dex */
    public static class d {
        private d() {
        }

        @InterfaceC0577u
        static String a(Intent intent) {
            return intent.getIdentifier();
        }

        @InterfaceC0577u
        static Intent b(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* renamed from: androidx.core.content.j$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: q, reason: collision with root package name */
        private static final int f12235q = 2112614400;

        /* renamed from: r, reason: collision with root package name */
        private static final int f12236r = 2015363072;

        /* renamed from: a, reason: collision with root package name */
        private int f12237a;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12244h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f12245i;

        /* renamed from: n, reason: collision with root package name */
        private boolean f12250n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f12251o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f12252p;

        /* renamed from: b, reason: collision with root package name */
        private androidx.core.util.A<String> f12238b = new androidx.core.util.A() { // from class: androidx.core.content.v
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean g02;
                g02 = C0675j.e.g0((String) obj);
                return g02;
            }
        };

        /* renamed from: c, reason: collision with root package name */
        private androidx.core.util.A<Uri> f12239c = new androidx.core.util.A() { // from class: androidx.core.content.w
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean h02;
                h02 = C0675j.e.h0((Uri) obj);
                return h02;
            }
        };

        /* renamed from: d, reason: collision with root package name */
        private androidx.core.util.A<String> f12240d = new androidx.core.util.A() { // from class: androidx.core.content.x
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean i02;
                i02 = C0675j.e.i0((String) obj);
                return i02;
            }
        };

        /* renamed from: e, reason: collision with root package name */
        private androidx.core.util.A<String> f12241e = new androidx.core.util.A() { // from class: androidx.core.content.y
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean j02;
                j02 = C0675j.e.j0((String) obj);
                return j02;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private androidx.core.util.A<String> f12242f = new androidx.core.util.A() { // from class: androidx.core.content.z
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean k02;
                k02 = C0675j.e.k0((String) obj);
                return k02;
            }
        };

        /* renamed from: g, reason: collision with root package name */
        private androidx.core.util.A<ComponentName> f12243g = new androidx.core.util.A() { // from class: androidx.core.content.A
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean l02;
                l02 = C0675j.e.l0((ComponentName) obj);
                return l02;
            }
        };

        /* renamed from: j, reason: collision with root package name */
        private Map<String, androidx.core.util.A<Object>> f12246j = new HashMap();

        /* renamed from: k, reason: collision with root package name */
        private boolean f12247k = false;

        /* renamed from: l, reason: collision with root package name */
        private androidx.core.util.A<Uri> f12248l = new androidx.core.util.A() { // from class: androidx.core.content.B
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean m02;
                m02 = C0675j.e.m0((Uri) obj);
                return m02;
            }
        };

        /* renamed from: m, reason: collision with root package name */
        private androidx.core.util.A<ClipData> f12249m = new androidx.core.util.A() { // from class: androidx.core.content.C
            @Override // androidx.core.util.A
            public final boolean test(Object obj) {
                boolean n02;
                n02 = C0675j.e.n0((ClipData) obj);
                return n02;
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean X(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Y(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean Z(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean b0(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean c0(Class cls, androidx.core.util.A a4, Object obj) {
            if (cls.isInstance(obj) && a4.test(cls.cast(obj))) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean d0(Object obj) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean e0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean f0(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean g0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean h0(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean i0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean j0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean k0(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean l0(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean m0(Uri uri) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean n0(ClipData clipData) {
            return false;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e A(@androidx.annotation.N final ComponentName componentName) {
            androidx.core.util.u.l(componentName);
            Objects.requireNonNull(componentName);
            return B(new androidx.core.util.A() { // from class: androidx.core.content.q
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e B(@androidx.annotation.N androidx.core.util.A<ComponentName> a4) {
            androidx.core.util.u.l(a4);
            this.f12245i = true;
            this.f12243g = this.f12243g.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e C(@androidx.annotation.N final String str) {
            androidx.core.util.u.l(str);
            return B(new androidx.core.util.A() { // from class: androidx.core.content.n
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean Z3;
                    Z3 = C0675j.e.Z(str, (ComponentName) obj);
                    return Z3;
                }
            });
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e D(@androidx.annotation.N androidx.core.util.A<Uri> a4) {
            androidx.core.util.u.l(a4);
            this.f12239c = this.f12239c.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e E(@androidx.annotation.N final String str) {
            androidx.core.util.u.l(str);
            D(new androidx.core.util.A() { // from class: androidx.core.content.o
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean a02;
                    a02 = C0675j.e.a0(str, (Uri) obj);
                    return a02;
                }
            });
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e F(@androidx.annotation.N String str, @androidx.annotation.N androidx.core.util.A<Object> a4) {
            androidx.core.util.u.l(str);
            androidx.core.util.u.l(a4);
            androidx.core.util.A<Object> a5 = this.f12246j.get(str);
            if (a5 == null) {
                a5 = new androidx.core.util.A() { // from class: androidx.core.content.t
                    @Override // androidx.core.util.A
                    public final boolean test(Object obj) {
                        boolean d02;
                        d02 = C0675j.e.d0(obj);
                        return d02;
                    }
                };
            }
            this.f12246j.put(str, a5.h(a4));
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e G(@androidx.annotation.N String str, @androidx.annotation.N Class<?> cls) {
            return H(str, cls, new androidx.core.util.A() { // from class: androidx.core.content.D
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean b02;
                    b02 = C0675j.e.b0(obj);
                    return b02;
                }
            });
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public <T> e H(@androidx.annotation.N String str, @androidx.annotation.N final Class<T> cls, @androidx.annotation.N final androidx.core.util.A<T> a4) {
            androidx.core.util.u.l(str);
            androidx.core.util.u.l(cls);
            androidx.core.util.u.l(a4);
            return F(str, new androidx.core.util.A() { // from class: androidx.core.content.p
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean c02;
                    c02 = C0675j.e.c0(cls, a4, obj);
                    return c02;
                }
            });
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e I(@androidx.annotation.N androidx.core.util.A<Uri> a4) {
            H("output", Uri.class, a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e J(@androidx.annotation.N final String str) {
            H("output", Uri.class, new androidx.core.util.A() { // from class: androidx.core.content.l
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean e02;
                    e02 = C0675j.e.e0(str, (Uri) obj);
                    return e02;
                }
            });
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e K(@androidx.annotation.N androidx.core.util.A<Uri> a4) {
            H("android.intent.extra.STREAM", Uri.class, a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e L(@androidx.annotation.N final String str) {
            androidx.core.util.u.l(str);
            H("android.intent.extra.STREAM", Uri.class, new androidx.core.util.A() { // from class: androidx.core.content.u
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean f02;
                    f02 = C0675j.e.f0(str, (Uri) obj);
                    return f02;
                }
            });
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e M(int i4) {
            this.f12237a = i4 | this.f12237a;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e N() {
            this.f12237a |= f12235q;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e O() {
            this.f12250n = true;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e P(@androidx.annotation.N androidx.core.util.A<String> a4) {
            androidx.core.util.u.l(a4);
            this.f12242f = this.f12242f.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e Q(@androidx.annotation.N String str) {
            androidx.core.util.u.l(str);
            Objects.requireNonNull(str);
            return P(new C0678m(str));
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e R() {
            this.f12237a |= f12236r;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e S() {
            this.f12251o = true;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e T() {
            this.f12252p = true;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e U(@androidx.annotation.N androidx.core.util.A<String> a4) {
            androidx.core.util.u.l(a4);
            this.f12240d = this.f12240d.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e V(@androidx.annotation.N String str) {
            androidx.core.util.u.l(str);
            Objects.requireNonNull(str);
            return U(new C0678m(str));
        }

        @androidx.annotation.N
        @SuppressLint({"SyntheticAccessor"})
        public C0675j W() {
            boolean z3 = this.f12244h;
            if ((z3 && this.f12245i) || (!z3 && !this.f12245i)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            C0675j c0675j = new C0675j();
            c0675j.f12220a = this.f12237a;
            c0675j.f12221b = this.f12238b;
            c0675j.f12222c = this.f12239c;
            c0675j.f12223d = this.f12240d;
            c0675j.f12224e = this.f12241e;
            c0675j.f12225f = this.f12242f;
            c0675j.f12227h = this.f12244h;
            c0675j.f12226g = this.f12243g;
            c0675j.f12228i = this.f12246j;
            c0675j.f12229j = this.f12247k;
            c0675j.f12230k = this.f12248l;
            c0675j.f12231l = this.f12249m;
            c0675j.f12232m = this.f12250n;
            c0675j.f12233n = this.f12251o;
            c0675j.f12234o = this.f12252p;
            return c0675j;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e r(@androidx.annotation.N androidx.core.util.A<String> a4) {
            androidx.core.util.u.l(a4);
            this.f12238b = this.f12238b.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e s(@androidx.annotation.N String str) {
            androidx.core.util.u.l(str);
            Objects.requireNonNull(str);
            r(new C0678m(str));
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e t() {
            this.f12244h = true;
            this.f12243g = new androidx.core.util.A() { // from class: androidx.core.content.r
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean X3;
                    X3 = C0675j.e.X((ComponentName) obj);
                    return X3;
                }
            };
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e u(@androidx.annotation.N androidx.core.util.A<String> a4) {
            androidx.core.util.u.l(a4);
            this.f12241e = this.f12241e.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e v(@androidx.annotation.N String str) {
            androidx.core.util.u.l(str);
            Objects.requireNonNull(str);
            return u(new C0678m(str));
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e w(@androidx.annotation.N androidx.core.util.A<ClipData> a4) {
            androidx.core.util.u.l(a4);
            this.f12249m = this.f12249m.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e x() {
            this.f12247k = true;
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e y(@androidx.annotation.N androidx.core.util.A<Uri> a4) {
            androidx.core.util.u.l(a4);
            this.f12248l = this.f12248l.h(a4);
            return this;
        }

        @androidx.annotation.N
        @SuppressLint({"BuilderSetStyle"})
        public e z(@androidx.annotation.N final String str) {
            androidx.core.util.u.l(str);
            return y(new androidx.core.util.A() { // from class: androidx.core.content.s
                @Override // androidx.core.util.A
                public final boolean test(Object obj) {
                    boolean Y3;
                    Y3 = C0675j.e.Y(str, (Uri) obj);
                    return Y3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(String str) {
        throw new SecurityException(str);
    }

    private void t(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @androidx.annotation.N
    public Intent u(@androidx.annotation.N Intent intent, @androidx.annotation.N InterfaceC0764e<String> interfaceC0764e) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f12227h && component == null) || this.f12226g.test(component)) {
            intent2.setComponent(component);
        } else {
            interfaceC0764e.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str != null && !this.f12225f.test(str)) {
            interfaceC0764e.accept("Package is not allowed: " + str);
        } else {
            intent2.setPackage(str);
        }
        int flags = this.f12220a | intent.getFlags();
        int i4 = this.f12220a;
        if (flags == i4) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i4);
            interfaceC0764e.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f12220a)));
        }
        String action = intent.getAction();
        if (action != null && !this.f12221b.test(action)) {
            interfaceC0764e.accept("Action is not allowed: " + action);
        } else {
            intent2.setAction(action);
        }
        Uri data = intent.getData();
        if (data != null && !this.f12222c.test(data)) {
            interfaceC0764e.accept("Data is not allowed: " + data);
        } else {
            intent2.setData(data);
        }
        String type = intent.getType();
        if (type != null && !this.f12223d.test(type)) {
            interfaceC0764e.accept("Type is not allowed: " + type);
        } else {
            intent2.setDataAndType(intent2.getData(), type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f12224e.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    interfaceC0764e.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f12220a & 1) == 0) {
                    interfaceC0764e.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (str3.equals("output") && ((~this.f12220a) & 3) != 0) {
                    interfaceC0764e.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                } else {
                    Object obj = extras.get(str3);
                    androidx.core.util.A<Object> a4 = this.f12228i.get(str3);
                    if (a4 != null && a4.test(obj)) {
                        t(intent2, str3, obj);
                    } else {
                        interfaceC0764e.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    }
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        c.b(intent, intent2, this.f12231l, this.f12229j, this.f12230k, interfaceC0764e);
        if (i5 >= 29) {
            if (this.f12232m) {
                d.b(intent2, d.a(intent));
            } else if (d.a(intent) != null) {
                interfaceC0764e.accept("Identifier is not allowed: " + d.a(intent));
            }
        }
        if (this.f12233n) {
            b.b(intent2, b.a(intent));
        } else if (b.a(intent) != null) {
            interfaceC0764e.accept("Selector is not allowed: " + b.a(intent));
        }
        if (this.f12234o) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            interfaceC0764e.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @androidx.annotation.N
    public Intent v(@androidx.annotation.N Intent intent) {
        return u(intent, new InterfaceC0764e() { // from class: androidx.core.content.i
            @Override // androidx.core.util.InterfaceC0764e
            public final void accept(Object obj) {
                C0675j.r((String) obj);
            }
        });
    }

    @androidx.annotation.N
    public Intent w(@androidx.annotation.N Intent intent) {
        return u(intent, new InterfaceC0764e() { // from class: androidx.core.content.h
            @Override // androidx.core.util.InterfaceC0764e
            public final void accept(Object obj) {
                C0675j.s((String) obj);
            }
        });
    }

    private C0675j() {
    }
}
