package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC2086a;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Matcher f52848a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final CharSequence f52849b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final l f52850c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private List<String> f52851d;

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2088c<String> {
        a() {
        }

        @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
        public int b() {
            return o.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return c((String) obj);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String get(int i4) {
            String group = o.this.f().group(i4);
            if (group == null) {
                return "";
            }
            return group;
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return j((String) obj);
        }

        public /* bridge */ int j(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int k(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractC2088c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return k((String) obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AbstractC2086a<k> implements m {

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements X2.l<Integer, k> {
            a() {
                super(1);
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ k C(Integer num) {
                return c(num.intValue());
            }

            @l3.e
            public final k c(int i4) {
                return b.this.get(i4);
            }
        }

        b() {
        }

        @Override // kotlin.text.m
        @l3.e
        public k a(@l3.d String name) {
            kotlin.jvm.internal.F.p(name, "name");
            return kotlin.internal.m.f52098a.c(o.this.f(), name);
        }

        @Override // kotlin.collections.AbstractC2086a
        public int b() {
            return o.this.f().groupCount() + 1;
        }

        public /* bridge */ boolean c(k kVar) {
            return super.contains(kVar);
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null && !(obj instanceof k)) {
                return false;
            }
            return c((k) obj);
        }

        @Override // kotlin.text.l
        @l3.e
        public k get(int i4) {
            kotlin.ranges.l j4;
            j4 = RegexKt.j(o.this.f(), i4);
            if (j4.c().intValue() >= 0) {
                String group = o.this.f().group(i4);
                kotlin.jvm.internal.F.o(group, "group(...)");
                return new k(group, j4);
            }
            return null;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
        @l3.d
        public Iterator<k> iterator() {
            kotlin.ranges.l I3;
            kotlin.sequences.m A12;
            kotlin.sequences.m k12;
            I3 = CollectionsKt__CollectionsKt.I(this);
            A12 = kotlin.collections.D.A1(I3);
            k12 = SequencesKt___SequencesKt.k1(A12, new a());
            return k12.iterator();
        }
    }

    public o(@l3.d Matcher matcher, @l3.d CharSequence input) {
        kotlin.jvm.internal.F.p(matcher, "matcher");
        kotlin.jvm.internal.F.p(input, "input");
        this.f52848a = matcher;
        this.f52849b = input;
        this.f52850c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.f52848a;
    }

    @Override // kotlin.text.n
    @l3.d
    public n.b a() {
        return n.a.a(this);
    }

    @Override // kotlin.text.n
    @l3.d
    public List<String> b() {
        if (this.f52851d == null) {
            this.f52851d = new a();
        }
        List<String> list = this.f52851d;
        kotlin.jvm.internal.F.m(list);
        return list;
    }

    @Override // kotlin.text.n
    @l3.d
    public l c() {
        return this.f52850c;
    }

    @Override // kotlin.text.n
    @l3.d
    public kotlin.ranges.l d() {
        kotlin.ranges.l i4;
        i4 = RegexKt.i(f());
        return i4;
    }

    @Override // kotlin.text.n
    @l3.d
    public String getValue() {
        String group = f().group();
        kotlin.jvm.internal.F.o(group, "group(...)");
        return group;
    }

    @Override // kotlin.text.n
    @l3.e
    public n next() {
        int i4;
        n f4;
        int end = f().end();
        if (f().end() == f().start()) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i5 = end + i4;
        if (i5 <= this.f52849b.length()) {
            Matcher matcher = this.f52848a.pattern().matcher(this.f52849b);
            kotlin.jvm.internal.F.o(matcher, "matcher(...)");
            f4 = RegexKt.f(matcher, i5, this.f52849b);
            return f4;
        }
        return null;
    }
}
