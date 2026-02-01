package com.xiaoming.party.auracast.dialog;

import androidx.appcompat.app.ActivityC0587e;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends FragmentStateAdapter {

    /* renamed from: o, reason: collision with root package name */
    @l3.d
    private final List<d> f49061o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@l3.d ActivityC0587e activity, @l3.d List<d> item) {
        super(activity);
        F.p(activity, "activity");
        F.p(item, "item");
        this.f49061o = item;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @l3.d
    public Fragment Q(int i4) {
        return AuracastPagerFragment.Companion.a(this.f49061o.get(i4).f(), this.f49061o.get(i4).g(), this.f49061o.get(i4).h());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f49061o.size();
    }
}
