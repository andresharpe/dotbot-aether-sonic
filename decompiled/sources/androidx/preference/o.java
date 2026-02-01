package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0771a;
import androidx.core.view.accessibility.M;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.RecyclerView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class o extends A {

    /* renamed from: f, reason: collision with root package name */
    final RecyclerView f16962f;

    /* renamed from: g, reason: collision with root package name */
    final C0771a f16963g;

    /* renamed from: h, reason: collision with root package name */
    final C0771a f16964h;

    /* loaded from: classes.dex */
    class a extends C0771a {
        a() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            Preference R3;
            o.this.f16963g.g(view, m4);
            int p02 = o.this.f16962f.p0(view);
            RecyclerView.Adapter adapter = o.this.f16962f.getAdapter();
            if (!(adapter instanceof j) || (R3 = ((j) adapter).R(p02)) == null) {
                return;
            }
            R3.i0(m4);
        }

        @Override // androidx.core.view.C0771a
        public boolean j(View view, int i4, Bundle bundle) {
            return o.this.f16963g.j(view, i4, bundle);
        }
    }

    public o(@N RecyclerView recyclerView) {
        super(recyclerView);
        this.f16963g = super.n();
        this.f16964h = new a();
        this.f16962f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.A
    @N
    public C0771a n() {
        return this.f16964h;
    }
}
