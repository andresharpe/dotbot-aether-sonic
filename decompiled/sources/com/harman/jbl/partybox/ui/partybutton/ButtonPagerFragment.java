package com.harman.jbl.partybox.ui.partybutton;

import X2.l;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.databinding.V;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.partybutton.PartyButtonFragment;
import java.util.List;
import kotlin.A;
import kotlin.E;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@InterfaceC2205l(message = "no more used")
@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/harman/jbl/partybox/ui/partybutton/ButtonPagerFragment;", "Landroidx/fragment/app/Fragment;", "", "type", "", "l0", "(I)Ljava/lang/String;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/harman/jbl/partybox/databinding/V;", "N0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "k0", "()Lcom/harman/jbl/partybox/databinding/V;", "binding", "Lcom/harman/jbl/partybox/ui/partybutton/h;", "O0", "Lkotlin/A;", "m0", "()Lcom/harman/jbl/partybox/ui/partybutton/h;", "viewModel", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;", "P0", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$b;", "Q0", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$b;", "pagerData", "<init>", "(Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;)V", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nButtonPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonPagerFragment.kt\ncom/harman/jbl/partybox/ui/partybutton/ButtonPagerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n56#2,10:57\n1#3:67\n*S KotlinDebug\n*F\n+ 1 ButtonPagerFragment.kt\ncom/harman/jbl/partybox/ui/partybutton/ButtonPagerFragment\n*L\n23#1:57,10\n*E\n"})
/* loaded from: classes2.dex */
public final class ButtonPagerFragment extends Fragment {

    /* renamed from: R0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45390R0 = {N.u(new PropertyReference1Impl(ButtonPagerFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentButtonPagerBinding;", 0))};

    /* renamed from: N0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45391N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final A f45392O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private PartyButtonFragment.PageType f45393P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private PartyButtonFragment.b f45394Q0;

    /* loaded from: classes2.dex */
    /* synthetic */ class a extends FunctionReferenceImpl implements l<View, V> {

        /* renamed from: N, reason: collision with root package name */
        public static final a f45399N = new a();

        a() {
            super(1, V.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentButtonPagerBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final V C(@l3.d View p02) {
            F.p(p02, "p0");
            return V.a(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonPagerFragment(@l3.d PartyButtonFragment.PageType type) {
        super(j.i.f41414M);
        F.p(type, "type");
        this.f45391N0 = com.harman.jbl.partybox.ui.delegate.b.a(this, a.f45399N);
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.partybutton.ButtonPagerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f45392O0 = FragmentViewModelLazyKt.c(this, N.d(h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.partybutton.ButtonPagerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.partybutton.ButtonPagerFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        PartyButtonFragment.PageType pageType = PartyButtonFragment.PageType.PAGE_VOICE;
        this.f45393P0 = type;
        this.f45394Q0 = new PartyButtonFragment.b(l0(type.ordinal()), m0().b0(type.ordinal()));
    }

    private final V k0() {
        return (V) this.f45391N0.a(this, f45390R0[0]);
    }

    private final String l0(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                Context context = getContext();
                if (context == null) {
                    return null;
                }
                return context.getString(j.m.W6);
            }
            Context context2 = getContext();
            if (context2 == null) {
                return null;
            }
            return context2.getString(j.m.Za);
        }
        Context context3 = getContext();
        if (context3 == null) {
            return null;
        }
        return context3.getString(j.m.f41835w2);
    }

    private final h m0() {
        return (h) this.f45392O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        List<com.harman.jbl.partybox.model.c> e4;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = k0().f39146G;
        PartyButtonFragment.b bVar = this.f45394Q0;
        if (bVar != null) {
            str = bVar.f();
        } else {
            str = null;
        }
        textView.setText(str);
        RecyclerView recyclerView = k0().f39145F;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        f fVar = new f();
        PartyButtonFragment.b bVar2 = this.f45394Q0;
        if (bVar2 != null && (e4 = bVar2.e()) != null) {
            fVar.U(e4);
        }
        recyclerView.setAdapter(fVar);
    }
}
