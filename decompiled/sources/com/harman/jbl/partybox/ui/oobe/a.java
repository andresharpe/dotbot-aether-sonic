package com.harman.jbl.partybox.ui.oobe;

import androidx.appcompat.app.ActivityC0587e;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {

    /* renamed from: o, reason: collision with root package name */
    private final int f44388o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@l3.d ActivityC0587e activity, int i4) {
        super(activity);
        F.p(activity, "activity");
        this.f44388o = i4;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @l3.d
    public Fragment Q(int i4) {
        return OnBoardingPagerFragment.Companion.a(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f44388o;
    }
}
