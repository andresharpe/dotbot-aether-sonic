package com.harman.jbl.partybox.ui.help;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0587e;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.effectlab.EffectLabActivity;
import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/harman/jbl/partybox/ui/help/RedirectionActivity;", "Landroidx/appcompat/app/e;", "Lkotlin/H0;", "J0", "()V", "N0", "M0", "G0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "h0", "Ljava/lang/String;", "I0", "()Ljava/lang/String;", "P0", "(Ljava/lang/String;)V", "deviceName", "", "i0", "I", "H0", "()I", "O0", "(I)V", "appLaunchSequenceNumber", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRedirectionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedirectionActivity.kt\ncom/harman/jbl/partybox/ui/help/RedirectionActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,133:1\n37#2,2:134\n*S KotlinDebug\n*F\n+ 1 RedirectionActivity.kt\ncom/harman/jbl/partybox/ui/help/RedirectionActivity\n*L\n112#1:134,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RedirectionActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private String f43773h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f43774i0;

    public RedirectionActivity() {
        super(j.i.f41494g);
        this.f43773h0 = "";
        this.f43774i0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G0() {
        /*
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = ""
            java.lang.String r3 = "KEY_APP_LAUNCH_SEQ_NUM_TIMESTAMP"
            java.lang.String r4 = com.harman.jbl.partybox.persistence.a.q(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "checkAndUpdateSequenceNumber Sequence number from Preference is  "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r10 = "LaunchJblOneAppFragment"
            com.harman.log.f.a(r10, r2)
            r2 = 1
            java.lang.String r11 = ":"
            r12 = 0
            if (r4 == 0) goto L55
            int r5 = r4.length()
            if (r5 <= 0) goto L55
            java.lang.String[] r5 = new java.lang.String[]{r11}
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r4 = kotlin.text.q.R4(r4, r5, r6, r7, r8, r9)
            java.lang.String[] r5 = new java.lang.String[r12]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L55
            r5 = r4[r12]
            int r5 = java.lang.Integer.parseInt(r5)
            r13.f43774i0 = r5
            r4 = r4[r2]
            long r4 = java.lang.Long.parseLong(r4)
            goto L56
        L55:
            r4 = r0
        L56:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L95
            int r4 = r13.f43774i0
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L67
            r13.f43774i0 = r12
        L67:
            int r4 = r13.f43774i0
            int r4 = r4 + r2
            r13.f43774i0 = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r11)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkAndUpdateSequenceNumber : Its been more than 24 hrs, so increment the app launch sequence number to "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.harman.log.f.a(r10, r1)
            com.harman.jbl.partybox.persistence.a.I(r3, r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.RedirectionActivity.G0():void");
    }

    private final void J0() {
        String stringExtra = getIntent().getStringExtra("deviceName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f43773h0 = stringExtra;
        ((TextView) findViewById(j.h.f41322p3)).setText(getString(j.m.f41675N1, getString(j.m.f41727a1), this.f43773h0));
        TextView textView = (TextView) findViewById(j.h.Bb);
        textView.setText(getString(j.m.f41671M1) + " " + getString(j.m.f41727a1));
        ((ImageView) findViewById(j.h.f41265e1)).setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedirectionActivity.K0(RedirectionActivity.this, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RedirectionActivity.L0(RedirectionActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(RedirectionActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(RedirectionActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.M0();
        this$0.N0();
    }

    private final void M0() {
        G0();
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", "launch_jbl_one");
        bundle.putString(L1.a.f1655u, this.f43773h0);
        bundle.putInt(L1.a.u3, this.f43774i0);
        K1.a.a(L1.a.f1514P1, bundle);
    }

    private final void N0() {
        try {
            try {
                startActivity(getPackageManager().getLaunchIntentForPackage("com.jbl.oneapp"));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.harman.jbl.partybox.constants.a.f38362i)));
            }
        } catch (Exception unused2) {
            if (getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.jbl.oneapp"));
                intent.setPackage("com.android.vending");
                startActivity(intent);
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.harman.jbl.partybox.constants.a.f38362i)));
            }
        }
    }

    public final int H0() {
        return this.f43774i0;
    }

    @l3.d
    public final String I0() {
        return this.f43773h0;
    }

    public final void O0(int i4) {
        this.f43774i0 = i4;
    }

    public final void P0(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f43773h0 = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        Log.d(EffectLabActivity.f43418n0.a(), "page:onCreate" + RedirectionActivity.class.getSimpleName());
        J0();
    }
}
