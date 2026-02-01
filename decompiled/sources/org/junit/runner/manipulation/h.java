package org.junit.runner.manipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class h extends f implements Comparator<Description> {

    /* renamed from: c, reason: collision with root package name */
    public static final h f55755c = new h(new a());

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<Description> f55756b;

    /* loaded from: classes2.dex */
    static class a implements Comparator<Description> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Description description, Description description2) {
            return 0;
        }
    }

    public h(Comparator<Description> comparator) {
        this.f55756b = comparator;
    }

    @Override // org.junit.runner.manipulation.f
    public void b(Object obj) {
        if (obj instanceof g) {
            ((g) obj).f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.junit.runner.manipulation.f
    public final List<Description> f(Collection<Description> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, this);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.junit.runner.manipulation.f
    public boolean h() {
        return false;
    }

    @Override // java.util.Comparator
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(Description description, Description description2) {
        return this.f55756b.compare(description, description2);
    }
}
