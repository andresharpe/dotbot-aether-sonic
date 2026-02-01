package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;

/* loaded from: classes.dex */
public final class r {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@l3.d Pair<F, S> pair) {
        kotlin.jvm.internal.F.p(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@l3.d q<F, S> qVar) {
        kotlin.jvm.internal.F.p(qVar, "<this>");
        return qVar.f13025a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@l3.d Pair<F, S> pair) {
        kotlin.jvm.internal.F.p(pair, "<this>");
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@l3.d q<F, S> qVar) {
        kotlin.jvm.internal.F.p(qVar, "<this>");
        return qVar.f13026b;
    }

    @l3.d
    public static final <F, S> Pair<F, S> e(@l3.d kotlin.Pair<? extends F, ? extends S> pair) {
        kotlin.jvm.internal.F.p(pair, "<this>");
        return new Pair<>(pair.e(), pair.f());
    }

    @l3.d
    public static final <F, S> q<F, S> f(@l3.d kotlin.Pair<? extends F, ? extends S> pair) {
        kotlin.jvm.internal.F.p(pair, "<this>");
        return new q<>(pair.e(), pair.f());
    }

    @l3.d
    public static final <F, S> kotlin.Pair<F, S> g(@l3.d Pair<F, S> pair) {
        kotlin.jvm.internal.F.p(pair, "<this>");
        return new kotlin.Pair<>(pair.first, pair.second);
    }

    @l3.d
    public static final <F, S> kotlin.Pair<F, S> h(@l3.d q<F, S> qVar) {
        kotlin.jvm.internal.F.p(qVar, "<this>");
        return new kotlin.Pair<>(qVar.f13025a, qVar.f13026b);
    }
}
