package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.W;
import kotlin.ranges.g;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class B {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class a<T> implements kotlin.ranges.g<T> {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Range<T> f12981E;

        a(Range<T> range) {
            this.f12981E = range;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // kotlin.ranges.g
        public boolean b(@l3.d Comparable comparable) {
            return g.a.a(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable c() {
            return this.f12981E.getLower();
        }

        @Override // kotlin.ranges.g
        public boolean isEmpty() {
            return g.a.b(this);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.ranges.g
        public Comparable k() {
            return this.f12981E.getUpper();
        }
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> Range<T> a(@l3.d Range<T> range, @l3.d Range<T> other) {
        kotlin.jvm.internal.F.p(range, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Range<T> intersect = range.intersect(other);
        kotlin.jvm.internal.F.o(intersect, "intersect(other)");
        return intersect;
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> Range<T> b(@l3.d Range<T> range, @l3.d Range<T> other) {
        kotlin.jvm.internal.F.p(range, "<this>");
        kotlin.jvm.internal.F.p(other, "other");
        Range<T> extend = range.extend(other);
        kotlin.jvm.internal.F.o(extend, "extend(other)");
        return extend;
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> Range<T> c(@l3.d Range<T> range, @l3.d T value) {
        kotlin.jvm.internal.F.p(range, "<this>");
        kotlin.jvm.internal.F.p(value, "value");
        Range<T> extend = range.extend((Range<T>) value);
        kotlin.jvm.internal.F.o(extend, "extend(value)");
        return extend;
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> Range<T> d(@l3.d T t3, @l3.d T that) {
        kotlin.jvm.internal.F.p(t3, "<this>");
        kotlin.jvm.internal.F.p(that, "that");
        return new Range<>(t3, that);
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> kotlin.ranges.g<T> e(@l3.d Range<T> range) {
        kotlin.jvm.internal.F.p(range, "<this>");
        return new a(range);
    }

    @l3.d
    @W(21)
    public static final <T extends Comparable<? super T>> Range<T> f(@l3.d kotlin.ranges.g<T> gVar) {
        kotlin.jvm.internal.F.p(gVar, "<this>");
        return new Range<>(gVar.c(), gVar.k());
    }
}
