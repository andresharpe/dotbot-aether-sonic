package androidx.window.embedding;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final Intent f20809e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final Set<a> f20810f;

    public /* synthetic */ w(Set set, Intent intent, int i4, int i5, float f4, int i6, int i7, C2197u c2197u) {
        this(set, intent, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? 0.5f : f4, (i7 & 32) != 0 ? 3 : i6);
    }

    @Override // androidx.window.embedding.x
    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w) || !super.equals(obj) || !super.equals(obj)) {
            return false;
        }
        w wVar = (w) obj;
        if (F.g(this.f20810f, wVar.f20810f) && F.g(this.f20809e, wVar.f20809e)) {
            return true;
        }
        return false;
    }

    @l3.d
    public final Set<a> f() {
        return this.f20810f;
    }

    @l3.d
    public final Intent g() {
        return this.f20809e;
    }

    @l3.d
    public final w h(@l3.d a filter) {
        Set a6;
        F.p(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f20810f);
        linkedHashSet.add(filter);
        a6 = D.a6(linkedHashSet);
        return new w(a6, this.f20809e, d(), c(), e(), b());
    }

    @Override // androidx.window.embedding.x
    public int hashCode() {
        return (((super.hashCode() * 31) + this.f20810f.hashCode()) * 31) + this.f20809e.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(@l3.d Set<a> filters, @l3.d Intent placeholderIntent, int i4, int i5, float f4, int i6) {
        super(i4, i5, f4, i6);
        Set<a> a6;
        F.p(filters, "filters");
        F.p(placeholderIntent, "placeholderIntent");
        this.f20809e = placeholderIntent;
        a6 = D.a6(filters);
        this.f20810f = a6;
    }
}
