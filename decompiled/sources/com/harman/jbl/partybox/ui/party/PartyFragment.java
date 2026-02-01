package com.harman.jbl.partybox.ui.party;

import androidx.fragment.app.Fragment;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.o;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import l3.d;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/PartyFragment;", "Landroidx/fragment/app/Fragment;", "Lkotlin/H0;", "onResume", "()V", "Lcom/harman/jbl/partybox/ui/main/o;", "N0", "Lkotlin/A;", "k0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyFragment.kt\ncom/harman/jbl/partybox/ui/party/PartyFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,20:1\n66#2,4:21\n*S KotlinDebug\n*F\n+ 1 PartyFragment.kt\ncom/harman/jbl/partybox/ui/party/PartyFragment\n*L\n12#1:21,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyFragment extends Fragment {

    /* renamed from: N0, reason: collision with root package name */
    @d
    private final A f44703N0;

    public PartyFragment() {
        super(j.i.f41383E0);
        this.f44703N0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final o k0() {
        return (o) this.f44703N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        k0().T2(true);
    }
}
