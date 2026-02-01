package com.harman.jbl.partybox.ui.effectlab;

import android.content.Context;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.effectlab.PartyPad;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f43456a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43457b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43458c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43459d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43460e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43461f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43462g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43463h;

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    public static final String f43464i = "1";

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    public static final String f43465j = "2";

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    public static final String f43466k = "3";

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    public static final String f43467l = "4";

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    public static final String f43468m = "100";

    /* renamed from: n, reason: collision with root package name */
    @l3.d
    public static final String f43469n = "type_create";

    /* renamed from: o, reason: collision with root package name */
    @l3.d
    public static final String f43470o = "key_customize_set";

    /* renamed from: p, reason: collision with root package name */
    @l3.d
    public static final String f43471p = "key_cur_set";

    /* renamed from: q, reason: collision with root package name */
    @l3.d
    public static final String f43472q = "0";

    /* renamed from: r, reason: collision with root package name */
    @l3.d
    public static final String f43473r = "1";

    /* renamed from: s, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43474s;

    /* renamed from: t, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43475t;

    /* renamed from: u, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43476u;

    /* renamed from: v, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43477v;

    /* renamed from: w, reason: collision with root package name */
    @l3.d
    private static final List<Integer> f43478w;

    /* renamed from: x, reason: collision with root package name */
    @l3.d
    private static List<Integer> f43479x;

    /* renamed from: com.harman.jbl.partybox.ui.effectlab.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0375a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final C0375a f43480a = new C0375a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f43481b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f43482c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f43483d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f43484e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f43485f = 5;

        /* renamed from: g, reason: collision with root package name */
        @l3.d
        public static final String f43486g = "Repeater";

        /* renamed from: h, reason: collision with root package name */
        @l3.d
        public static final String f43487h = "Filter";

        /* renamed from: i, reason: collision with root package name */
        @l3.d
        public static final String f43488i = "Gater";

        /* renamed from: j, reason: collision with root package name */
        @l3.d
        public static final String f43489j = "Echo";

        /* renamed from: k, reason: collision with root package name */
        @l3.d
        public static final String f43490k = "WipeOut";

        private C0375a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final b f43491a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f43492b = 101;

        /* renamed from: c, reason: collision with root package name */
        public static final int f43493c = 102;

        /* renamed from: d, reason: collision with root package name */
        public static final int f43494d = 103;

        /* renamed from: e, reason: collision with root package name */
        public static final int f43495e = 104;

        /* renamed from: f, reason: collision with root package name */
        public static final int f43496f = 105;

        /* renamed from: g, reason: collision with root package name */
        public static final int f43497g = 106;

        /* renamed from: h, reason: collision with root package name */
        public static final int f43498h = 107;

        /* renamed from: i, reason: collision with root package name */
        public static final int f43499i = 108;

        /* renamed from: j, reason: collision with root package name */
        @l3.d
        public static final String f43500j = "Horn";

        /* renamed from: k, reason: collision with root package name */
        @l3.d
        public static final String f43501k = "Game";

        /* renamed from: l, reason: collision with root package name */
        @l3.d
        public static final String f43502l = "Like";

        /* renamed from: m, reason: collision with root package name */
        @l3.d
        public static final String f43503m = "Boo";

        /* renamed from: n, reason: collision with root package name */
        @l3.d
        public static final String f43504n = "Scratch 1";

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        public static final String f43505o = "Scratch 2";

        /* renamed from: p, reason: collision with root package name */
        @l3.d
        public static final String f43506p = "Scratch 3";

        /* renamed from: q, reason: collision with root package name */
        @l3.d
        public static final String f43507q = "Clap";

        private b() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final c f43508a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final int f43509b = 201;

        /* renamed from: c, reason: collision with root package name */
        public static final int f43510c = 202;

        /* renamed from: d, reason: collision with root package name */
        public static final int f43511d = 203;

        /* renamed from: e, reason: collision with root package name */
        public static final int f43512e = 204;

        /* renamed from: f, reason: collision with root package name */
        public static final int f43513f = 205;

        /* renamed from: g, reason: collision with root package name */
        public static final int f43514g = 206;

        /* renamed from: h, reason: collision with root package name */
        @l3.d
        public static final String f43515h = "Hands";

        /* renamed from: i, reason: collision with root package name */
        @l3.d
        public static final String f43516i = "1,2,3";

        /* renamed from: j, reason: collision with root package name */
        @l3.d
        public static final String f43517j = "Hey";

        /* renamed from: k, reason: collision with root package name */
        @l3.d
        public static final String f43518k = "Party";

        /* renamed from: l, reason: collision with root package name */
        @l3.d
        public static final String f43519l = "Jump";

        private c() {
        }
    }

    static {
        List<Integer> S3;
        List<Integer> S4;
        List<Integer> S5;
        List<Integer> S6;
        List<Integer> S7;
        List<Integer> S8;
        List<Integer> S9;
        List<Integer> S10;
        List<Integer> S11;
        List<Integer> S12;
        List<Integer> S13;
        List<Integer> S14;
        List<Integer> S15;
        S3 = CollectionsKt__CollectionsKt.S(1, 2, 3, 4, 5);
        f43457b = S3;
        Integer valueOf = Integer.valueOf(c.f43511d);
        Integer valueOf2 = Integer.valueOf(c.f43512e);
        Integer valueOf3 = Integer.valueOf(c.f43509b);
        S4 = CollectionsKt__CollectionsKt.S(valueOf, valueOf2, valueOf3, Integer.valueOf(c.f43513f), Integer.valueOf(c.f43510c));
        f43458c = S4;
        Integer valueOf4 = Integer.valueOf(b.f43494d);
        Integer valueOf5 = Integer.valueOf(b.f43497g);
        S5 = CollectionsKt__CollectionsKt.S(101, 102, valueOf4, 104, 105, valueOf5, Integer.valueOf(b.f43498h), 108);
        f43459d = S5;
        S6 = CollectionsKt__CollectionsKt.S(101, 1, 2);
        f43460e = S6;
        S7 = CollectionsKt__CollectionsKt.S(105, valueOf2, 4);
        f43461f = S7;
        S8 = CollectionsKt__CollectionsKt.S(valueOf5, valueOf, 2);
        f43462g = S8;
        S9 = CollectionsKt__CollectionsKt.S(101, valueOf3, 5);
        f43463h = S9;
        S10 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.m.Z8), Integer.valueOf(j.m.p7), Integer.valueOf(j.m.C7), Integer.valueOf(j.m.a7), Integer.valueOf(j.m.fa));
        f43474s = S10;
        S11 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.m.N7), Integer.valueOf(j.m.A8), Integer.valueOf(j.m.J7), Integer.valueOf(j.m.S7), Integer.valueOf(j.m.d6));
        f43475t = S11;
        S12 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.m.P7), Integer.valueOf(j.m.B7), Integer.valueOf(j.m.d8), Integer.valueOf(j.m.w6), Integer.valueOf(j.m.g9), Integer.valueOf(j.m.h9), Integer.valueOf(j.m.i9), Integer.valueOf(j.m.A6));
        f43476u = S12;
        S13 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.f.H5), Integer.valueOf(j.f.F5), Integer.valueOf(j.f.G5), Integer.valueOf(j.f.E5), Integer.valueOf(j.f.I5));
        f43477v = S13;
        S14 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.f.N5), Integer.valueOf(j.f.S5), Integer.valueOf(j.f.L5), Integer.valueOf(j.f.P5), Integer.valueOf(j.f.J5));
        f43478w = S14;
        S15 = CollectionsKt__CollectionsKt.S(Integer.valueOf(j.f.Y5), Integer.valueOf(j.f.X5), Integer.valueOf(j.f.Z5), Integer.valueOf(j.f.V5), Integer.valueOf(j.f.b6), Integer.valueOf(j.f.c6), Integer.valueOf(j.f.d6), Integer.valueOf(j.f.W5), Integer.valueOf(j.f.a6), Integer.valueOf(j.f.U5));
        f43479x = S15;
    }

    private a() {
    }

    @l3.d
    public final Map<Integer, Integer> a() {
        Object W22;
        Object W23;
        Object W24;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = f43457b.size();
        for (int i4 = 0; i4 < size; i4++) {
            W24 = D.W2(f43477v, i4);
            Integer num = (Integer) W24;
            if (num != null) {
            }
        }
        int size2 = f43459d.size();
        for (int i5 = 0; i5 < size2; i5++) {
            W23 = D.W2(f43479x, i5);
            Integer num2 = (Integer) W23;
            if (num2 != null) {
            }
        }
        int size3 = f43458c.size();
        for (int i6 = 0; i6 < size3; i6++) {
            W22 = D.W2(f43478w, i6);
            Integer num3 = (Integer) W22;
            if (num3 != null) {
            }
        }
        return linkedHashMap;
    }

    @l3.d
    public final Map<Integer, Integer> b() {
        Object W22;
        Object W23;
        Object W24;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = f43457b.size();
        for (int i4 = 0; i4 < size; i4++) {
            W24 = D.W2(f43474s, i4);
            Integer num = (Integer) W24;
            if (num != null) {
            }
        }
        int size2 = f43459d.size();
        for (int i5 = 0; i5 < size2; i5++) {
            W23 = D.W2(f43476u, i5);
            Integer num2 = (Integer) W23;
            if (num2 != null) {
            }
        }
        int size3 = f43458c.size();
        for (int i6 = 0; i6 < size3; i6++) {
            W22 = D.W2(f43475t, i6);
            Integer num3 = (Integer) W22;
            if (num3 != null) {
            }
        }
        return linkedHashMap;
    }

    @l3.d
    public final List<Integer> c() {
        return f43477v;
    }

    @l3.d
    public final List<Integer> d() {
        return f43457b;
    }

    @l3.d
    public final List<Integer> e() {
        return f43478w;
    }

    @l3.d
    public final List<Integer> f() {
        return f43458c;
    }

    @l3.d
    public final List<Integer> g() {
        return f43479x;
    }

    @l3.d
    public final List<Integer> h() {
        return f43459d;
    }

    @l3.d
    public final List<Integer> i() {
        return f43460e;
    }

    @l3.d
    public final List<Integer> j() {
        return f43461f;
    }

    @l3.d
    public final List<Integer> k() {
        return f43462g;
    }

    @l3.d
    public final List<Integer> l() {
        return f43463h;
    }

    @l3.d
    public final PartyPad m(@l3.d String type, @l3.d Context context) {
        F.p(type, "type");
        F.p(context, "context");
        PartyPad partyPad = new PartyPad();
        PartyPad.PartyPadItem partyPadItem = new PartyPad.PartyPadItem();
        PartyPad.PartyPadItem partyPadItem2 = new PartyPad.PartyPadItem();
        PartyPad.PartyPadItem partyPadItem3 = new PartyPad.PartyPadItem();
        int hashCode = type.hashCode();
        if (hashCode != 48625) {
            if (hashCode != 418666913) {
                switch (hashCode) {
                    case 49:
                        if (type.equals("1")) {
                            partyPadItem.g(context.getString(j.m.f41831v2));
                            List<Integer> list = f43460e;
                            partyPadItem.j(list.get(0).intValue());
                            partyPadItem2.g(context.getString(j.m.f41827u2));
                            partyPadItem2.j(list.get(1).intValue());
                            partyPadItem3.g(context.getString(j.m.f41827u2));
                            partyPadItem3.j(list.get(2).intValue());
                            partyPad.s(context.getString(j.m.f41844z));
                            partyPad.r(context.getString(j.m.f41840y));
                            partyPadItem.h(a().get(list.get(0)));
                            partyPadItem2.h(a().get(list.get(1)));
                            partyPadItem3.h(a().get(list.get(2)));
                            break;
                        }
                        break;
                    case 50:
                        if (type.equals("2")) {
                            partyPadItem.g(context.getString(j.m.f41831v2));
                            List<Integer> list2 = f43461f;
                            partyPadItem.j(list2.get(0).intValue());
                            partyPadItem2.g(context.getString(j.m.f41835w2));
                            partyPadItem2.j(list2.get(1).intValue());
                            partyPadItem3.g(context.getString(j.m.f41827u2));
                            partyPadItem3.j(list2.get(2).intValue());
                            partyPad.s(context.getString(j.m.f41815s));
                            partyPad.r(context.getString(j.m.f41621A));
                            partyPadItem.h(a().get(list2.get(0)));
                            partyPadItem2.h(a().get(list2.get(1)));
                            partyPadItem3.h(a().get(list2.get(2)));
                            break;
                        }
                        break;
                    case 51:
                        if (type.equals("3")) {
                            partyPadItem.g(context.getString(j.m.f41831v2));
                            List<Integer> list3 = f43462g;
                            partyPadItem.j(list3.get(0).intValue());
                            partyPadItem2.g(context.getString(j.m.f41835w2));
                            partyPadItem2.j(list3.get(1).intValue());
                            partyPadItem3.g(context.getString(j.m.f41827u2));
                            partyPadItem3.j(list3.get(2).intValue());
                            partyPad.s(context.getString(j.m.f41824u));
                            partyPad.r(context.getString(j.m.f41621A));
                            partyPadItem.h(a().get(list3.get(0)));
                            partyPadItem2.h(a().get(list3.get(1)));
                            partyPadItem3.h(a().get(list3.get(2)));
                            break;
                        }
                        break;
                    case 52:
                        if (type.equals(f43467l)) {
                            partyPadItem.g(context.getString(j.m.f41831v2));
                            List<Integer> list4 = f43463h;
                            partyPadItem.j(list4.get(0).intValue());
                            partyPadItem2.g(context.getString(j.m.f41835w2));
                            partyPadItem2.j(list4.get(1).intValue());
                            partyPadItem3.g(context.getString(j.m.f41827u2));
                            partyPadItem3.j(list4.get(2).intValue());
                            partyPad.s(context.getString(j.m.f41707V1));
                            partyPad.r(context.getString(j.m.f41621A));
                            partyPadItem.h(a().get(list4.get(0)));
                            partyPadItem2.h(a().get(list4.get(1)));
                            partyPadItem3.h(a().get(list4.get(2)));
                            break;
                        }
                        break;
                }
            } else {
                type.equals(f43469n);
            }
        } else if (type.equals(f43468m)) {
            partyPadItem.g(context.getString(j.m.f41753f2));
            partyPadItem2.g(context.getString(j.m.f41758g2));
            partyPadItem3.g(context.getString(j.m.f41763h2));
            partyPad.s(context.getString(j.m.f41643F1));
            partyPad.r(null);
        }
        partyPad.t(type);
        partyPad.n(partyPadItem);
        partyPad.l(partyPadItem2);
        partyPad.p(partyPadItem3);
        return partyPad;
    }

    public final void n(@l3.d List<Integer> list) {
        F.p(list, "<set-?>");
        f43479x = list;
    }
}
