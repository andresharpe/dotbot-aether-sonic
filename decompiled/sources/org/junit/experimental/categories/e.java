package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.experimental.categories.a;
import org.junit.runner.FilterFactory;

/* loaded from: classes2.dex */
public final class e extends c {

    /* loaded from: classes2.dex */
    private static class a extends a.C0517a {
        public a(List<Class<?>> list) {
            this(new HashSet(list));
        }

        @Override // org.junit.experimental.categories.a.C0517a, org.junit.runner.manipulation.b
        public String b() {
            return "excludes " + super.b();
        }

        public a(Set<Class<?>> set) {
            super(true, (Set<Class<?>>) null, true, set);
        }
    }

    @Override // org.junit.experimental.categories.c, org.junit.runner.FilterFactory
    public /* bridge */ /* synthetic */ org.junit.runner.manipulation.b a(org.junit.runner.d dVar) throws FilterFactory.FilterNotCreatedException {
        return super.a(dVar);
    }

    @Override // org.junit.experimental.categories.c
    protected org.junit.runner.manipulation.b b(List<Class<?>> list) {
        return new a(list);
    }
}
