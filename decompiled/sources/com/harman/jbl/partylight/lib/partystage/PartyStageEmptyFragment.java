package com.harman.jbl.partylight.lib.partystage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/harman/jbl/partylight/lib/partystage/PartyStageEmptyFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/s;", "createBinding", "()Lm2/s;", "Lkotlin/H0;", "initView", "()V", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PartyStageEmptyFragment extends BackDispatcherFragment<m2.s> {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String keyEmptyDesc = "keyEmptyDesc";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(PartyStageEmptyFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(PartyStageEmptyFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        String str;
        l0().f55229J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageEmptyFragment.o0(PartyStageEmptyFragment.this, view);
            }
        });
        l0().f55225F.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.partystage.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyStageEmptyFragment.p0(PartyStageEmptyFragment.this, view);
            }
        });
        TextView textView = l0().f55228I;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(keyEmptyDesc)) == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.s createBinding() {
        m2.s c4 = m2.s.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
