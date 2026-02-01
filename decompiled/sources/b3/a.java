package b3;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.K0;
import kotlin.Y;
import kotlin.collections.C2108v;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.F;
import kotlin.r;
import kotlin.sequences.m;
import kotlin.sequences.s;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {
    @d
    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> m<T> a(@d Optional<? extends T> optional) {
        m<T> g4;
        m<T> q4;
        F.p(optional, "<this>");
        if (optional.isPresent()) {
            q4 = s.q(optional.get());
            return q4;
        }
        g4 = s.g();
        return g4;
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> T b(@d Optional<? extends T> optional, T t3) {
        F.p(optional, "<this>");
        if (optional.isPresent()) {
            return optional.get();
        }
        return t3;
    }

    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> T c(@d Optional<? extends T> optional, @d X2.a<? extends T> defaultValue) {
        F.p(optional, "<this>");
        F.p(defaultValue, "defaultValue");
        if (optional.isPresent()) {
            return optional.get();
        }
        return defaultValue.n();
    }

    @e
    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> T d(@d Optional<T> optional) {
        F.p(optional, "<this>");
        return optional.orElse(null);
    }

    @d
    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T, C extends Collection<? super T>> C e(@d Optional<T> optional, @d C destination) {
        F.p(optional, "<this>");
        F.p(destination, "destination");
        if (optional.isPresent()) {
            T t3 = optional.get();
            F.o(t3, "get(...)");
            destination.add(t3);
        }
        return destination;
    }

    @d
    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> List<T> f(@d Optional<? extends T> optional) {
        List<T> H3;
        List<T> k4;
        F.p(optional, "<this>");
        if (optional.isPresent()) {
            k4 = C2108v.k(optional.get());
            return k4;
        }
        H3 = CollectionsKt__CollectionsKt.H();
        return H3;
    }

    @d
    @K0(markerClass = {r.class})
    @Y(version = "1.8")
    public static final <T> Set<T> g(@d Optional<? extends T> optional) {
        Set<T> k4;
        Set<T> f4;
        F.p(optional, "<this>");
        if (optional.isPresent()) {
            f4 = i0.f(optional.get());
            return f4;
        }
        k4 = j0.k();
        return k4;
    }
}
