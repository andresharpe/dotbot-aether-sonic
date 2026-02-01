package com.harman.jbl.partylight.lib.partystage;

import android.view.View;
import androidx.lifecycle.F;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.widget.BottomSheetDialog;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.g;
import com.harman.jbl.partylight.lib.partystage.command.StageStatus;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

@E(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStageDismissFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/l;", "Lkotlin/H0;", "q0", "()V", "createBinding", "()Lm2/l;", "initView", "<init>", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyStageDismissFragment extends BackDispatcherFragment<m2.l> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.a<H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.partystage.PartyStageDismissFragment$onDismiss$1$1", f = "PartyStageDismissFragment.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.harman.jbl.partylight.lib.partystage.PartyStageDismissFragment$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0423a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f47393I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ PartyStageDismissFragment f47394J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0423a(PartyStageDismissFragment partyStageDismissFragment, kotlin.coroutines.c<? super C0423a> cVar) {
                super(2, cVar);
                this.f47394J = partyStageDismissFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f47393I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.cd_biz_comm.wireless_tech.c cVar = com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G;
                    PartyLightDevice j4 = com.harman.jbl.partylight.lib.core.b.f46256F.j();
                    com.harman.jbl.partylight.lib.partystage.command.f fVar = new com.harman.jbl.partylight.lib.partystage.command.f(StageStatus.STAGE_QUIT_GROUP, null, 2, null);
                    this.f47393I = 1;
                    if (cVar.y(j4, fVar, this) == l4) {
                        return l4;
                    }
                }
                androidx.navigation.fragment.f.a(this.f47394J).t0();
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((C0423a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new C0423a(this.f47394J, cVar);
            }
        }

        a() {
            super(0);
        }

        public final void c() {
            C2323l.f(F.a(PartyStageDismissFragment.this), null, null, new C0423a(PartyStageDismissFragment.this, null), 3, null);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(PartyStageDismissFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(PartyStageDismissFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        this$0.q0();
    }

    private final void q0() {
        String string = getString(g.l.f47141t0);
        kotlin.jvm.internal.F.o(string, "getString(...)");
        String string2 = getString(g.l.f47136r);
        kotlin.jvm.internal.F.o(string2, "getString(...)");
        String string3 = getString(g.l.f47122k);
        kotlin.jvm.internal.F.o(string3, "getString(...)");
        new BottomSheetDialog(string, string2, string3, new a(), null, 16, null).show(getParentFragmentManager(), (String) null);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        l0().f55151F.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageDismissFragment.o0(PartyStageDismissFragment.this, view);
            }
        });
        l0().f55155J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageDismissFragment.p0(PartyStageDismissFragment.this, view);
            }
        });
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.l createBinding() {
        m2.l c4 = m2.l.c(getLayoutInflater());
        kotlin.jvm.internal.F.o(c4, "inflate(...)");
        return c4;
    }
}
