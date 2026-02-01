package org.junit.runner.manipulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f55751a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar) {
        this.f55751a = fVar;
    }

    public void a(Object obj) throws InvalidOrderingException {
        if (obj instanceof d) {
            ((d) obj).c(this);
        }
    }

    public List<Description> b(Collection<Description> collection) throws InvalidOrderingException {
        List<Description> f4 = this.f55751a.f(Collections.unmodifiableCollection(collection));
        if (!this.f55751a.h()) {
            return f4;
        }
        HashSet hashSet = new HashSet(collection);
        if (hashSet.containsAll(f4)) {
            HashSet hashSet2 = new HashSet(f4);
            if (hashSet2.size() == f4.size()) {
                if (hashSet2.containsAll(hashSet)) {
                    return f4;
                }
                throw new InvalidOrderingException("Ordering removed items");
            }
            throw new InvalidOrderingException("Ordering duplicated items");
        }
        throw new InvalidOrderingException("Ordering added items");
    }
}
