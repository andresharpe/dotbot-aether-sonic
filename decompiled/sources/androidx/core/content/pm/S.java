package androidx.core.content.pm;

import androidx.annotation.InterfaceC0561d;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class S<T> {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static class a extends S<Void> {
        @Override // androidx.core.content.pm.S
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Void a(List<Q> list) {
            return null;
        }

        @Override // androidx.core.content.pm.S
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void c() {
            return null;
        }

        @Override // androidx.core.content.pm.S
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void d(List<String> list) {
            return null;
        }
    }

    @InterfaceC0561d
    public abstract T a(List<Q> list);

    @androidx.annotation.j0
    public List<Q> b() throws Exception {
        return new ArrayList();
    }

    @InterfaceC0561d
    public abstract T c();

    @InterfaceC0561d
    public abstract T d(List<String> list);
}
