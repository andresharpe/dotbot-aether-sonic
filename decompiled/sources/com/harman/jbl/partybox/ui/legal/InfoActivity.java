package com.harman.jbl.partybox.ui.legal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0587e;
import androidx.navigation.C0925b;
import androidx.navigation.C0943u;
import androidx.navigation.J;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.C2197u;

@E(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/harman/jbl/partybox/ui/legal/InfoActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "<init>", "()V", "h0", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InfoActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    public static final a f43902h0 = new a(null);

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private static final String f43903i0 = "LegalActivity";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return InfoActivity.f43903i0;
        }

        private a() {
        }
    }

    public InfoActivity() {
        super(j.i.f41478c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("page");
        C0943u a4 = C0925b.a(this, j.h.O6);
        J b4 = a4.M().b(j.k.f41584b);
        if (TextUtils.equals("LANGUAGE", stringExtra)) {
            b4.f0(j.h.d8);
        } else if (TextUtils.equals("LANGUAGE", stringExtra)) {
            b4.f0(j.h.U9);
        } else if (TextUtils.equals("HELP", stringExtra)) {
            b4.f0(j.h.lg);
        } else if (TextUtils.equals("FEEDBACK", stringExtra)) {
            b4.f0(j.h.L4);
        } else if (TextUtils.equals("ADD_PRODUCT", stringExtra)) {
            b4.f0(j.h.lg);
        }
        a4.O0(b4, null);
    }
}
