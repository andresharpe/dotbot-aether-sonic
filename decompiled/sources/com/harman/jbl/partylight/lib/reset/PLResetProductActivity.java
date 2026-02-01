package com.harman.jbl.partylight.lib.reset;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0587e;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import l3.d;
import l3.e;
import m2.C2362b;

@E(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/harman/jbl/partylight/lib/reset/PLResetProductActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Lm2/b;", "h0", "Lkotlin/A;", "F0", "()Lm2/b;", "binding", "<init>", "()V", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class PLResetProductActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @d
    private final A f47535h0;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.a<C2362b> {
        a() {
            super(0);
        }

        @Override // X2.a
        @d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2362b n() {
            return C2362b.c(PLResetProductActivity.this.getLayoutInflater());
        }
    }

    public PLResetProductActivity() {
        A a4;
        a4 = C.a(new a());
        this.f47535h0 = a4;
    }

    private final C2362b F0() {
        return (C2362b) this.f47535h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(PLResetProductActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        setContentView(F0().d());
        F0().f55080F.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.reset.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PLResetProductActivity.G0(PLResetProductActivity.this, view);
            }
        });
        F0().f55087M.setText(getString(g.l.f47121j0, "10"));
    }
}
