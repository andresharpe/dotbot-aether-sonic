package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Y;
import kotlin.collections.AbstractC2088c;
import kotlin.collections.C2101p;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
@Y(version = "1.8")
/* loaded from: classes2.dex */
public final class d<T extends Enum<T>> extends AbstractC2088c<T> implements a<T>, Serializable {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final T[] f52085G;

    public d(@l3.d T[] entries) {
        F.p(entries, "entries");
        this.f52085G = entries;
    }

    private final Object l() {
        return new EnumEntriesSerializationProxy(this.f52085G);
    }

    @Override // kotlin.collections.AbstractC2088c, kotlin.collections.AbstractC2086a
    public int b() {
        return this.f52085G.length;
    }

    public boolean c(@l3.d T element) {
        Object Pe;
        F.p(element, "element");
        Pe = C2101p.Pe(this.f52085G, element.ordinal());
        if (((Enum) Pe) == element) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC2086a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return c((Enum) obj);
    }

    @Override // kotlin.collections.AbstractC2088c, java.util.List
    @l3.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T get(int i4) {
        AbstractC2088c.f51901E.b(i4, this.f52085G.length);
        return this.f52085G[i4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC2088c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return j((Enum) obj);
    }

    public int j(@l3.d T element) {
        Object Pe;
        F.p(element, "element");
        int ordinal = element.ordinal();
        Pe = C2101p.Pe(this.f52085G, ordinal);
        if (((Enum) Pe) != element) {
            return -1;
        }
        return ordinal;
    }

    public int k(@l3.d T element) {
        F.p(element, "element");
        return indexOf(element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC2088c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return k((Enum) obj);
    }
}
