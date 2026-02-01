package com.harman.jbl.partybox;

import B2.c;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.DeviceProtocol;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class c extends j0 implements com.harman.sdk.c {

    /* renamed from: N, reason: collision with root package name */
    private static final String f38304N = "BaseViewModel";

    /* renamed from: O, reason: collision with root package name */
    public static int f38305O = 1;

    /* renamed from: I, reason: collision with root package name */
    protected WeakReference<ActivityC0889g> f38307I;

    /* renamed from: J, reason: collision with root package name */
    protected WeakReference<Fragment> f38308J;

    /* renamed from: K, reason: collision with root package name */
    protected HmDevice f38309K;

    /* renamed from: M, reason: collision with root package name */
    @P
    protected HmDevice f38311M;

    /* renamed from: H, reason: collision with root package name */
    protected androidx.lifecycle.P<Object> f38306H = new androidx.lifecycle.P<>();

    /* renamed from: L, reason: collision with root package name */
    protected boolean f38310L = false;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        final long f38312E = 500;

        /* renamed from: F, reason: collision with root package name */
        long f38313F = 0;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ WindowManager f38314G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ TextView f38315H;

        a(WindowManager windowManager, TextView textView) {
            this.f38314G = windowManager;
            this.f38315H = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f38313F < 500) {
                this.f38314G.removeViewImmediate(this.f38315H);
            }
            this.f38313F = currentTimeMillis;
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnLongClickListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ActivityC0889g f38317E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ TextView f38318F;

        b(ActivityC0889g activityC0889g, TextView textView) {
            this.f38317E = activityC0889g;
            this.f38318F = textView;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ((ClipboardManager) this.f38317E.getSystemService("clipboard")).setText(this.f38318F.getText().toString());
            Toast.makeText(this.f38317E.getApplicationContext(), "已经复制到剪贴板！", 0).show();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v() {
        /*
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "KEY_APP_LAUNCH_SEQ_NUM_TIMESTAMP"
            java.lang.String r1 = com.harman.jbl.partybox.persistence.a.q(r2, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkAndUpdateSequenceNumber Sequence number from Preference is  "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "BaseViewModel"
            com.harman.log.f.a(r4, r3)
            boolean r3 = r1.isEmpty()
            r5 = 1
            r6 = 0
            java.lang.String r7 = ":"
            if (r3 != 0) goto L4b
            java.lang.String[] r1 = r1.split(r7)
            int r3 = r1.length
            r8 = 2
            if (r3 != r8) goto L4b
            r3 = r1[r6]
            int r3 = java.lang.Integer.parseInt(r3)
            com.harman.jbl.partybox.c.f38305O = r3
            r1 = r1[r5]
            long r8 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            goto L4c
        L4b:
            r1 = r0
        L4c:
            long r8 = r0.longValue()
            long r10 = r1.longValue()
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r10 + r12
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 < 0) goto L93
            int r1 = com.harman.jbl.partybox.c.f38305O
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L65
            com.harman.jbl.partybox.c.f38305O = r6
        L65:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = com.harman.jbl.partybox.c.f38305O
            int r3 = r3 + r5
            com.harman.jbl.partybox.c.f38305O = r3
            r1.append(r3)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "checkAndUpdateSequenceNumber : Its been more than 24 hrs, so increment the app launch sequence number to "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.harman.log.f.a(r4, r1)
            com.harman.jbl.partybox.persistence.a.I(r2, r0)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.c.v():void");
    }

    private void w(@P HmDevice hmDevice) {
        this.f38309K = hmDevice;
    }

    public HmDevice A(String str) {
        for (HmDevice hmDevice : B()) {
            if (str.equalsIgnoreCase(hmDevice.g()) || str.equalsIgnoreCase(hmDevice.n())) {
                this.f38309K = hmDevice;
                break;
            }
        }
        return this.f38309K;
    }

    public List<HmDevice> B() {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null) {
            return new ArrayList();
        }
        Collection<HmDevice> i4 = k4.i();
        ArrayList arrayList = new ArrayList();
        for (HmDevice hmDevice : i4) {
            if (hmDevice.O()) {
                arrayList.add(hmDevice);
            }
        }
        return arrayList;
    }

    public HmDevice C(String str) {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null && !TextUtils.isEmpty(str)) {
            for (HmDevice hmDevice : k4.i()) {
                if (str.equalsIgnoreCase(hmDevice.n()) || str.equalsIgnoreCase(hmDevice.g())) {
                    return hmDevice;
                }
            }
        }
        return null;
    }

    protected androidx.lifecycle.P<Object> D() {
        return this.f38306H;
    }

    protected void E(@N Fragment fragment, @P HmDevice hmDevice) {
        this.f38308J = new WeakReference<>(fragment);
        w(hmDevice);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(@N ActivityC0889g activityC0889g) {
        this.f38307I = new WeakReference<>(activityC0889g);
    }

    public boolean G() {
        if (I() && J() && K()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean H() {
        return com.harman.sdk.b.f47608a.s();
    }

    public boolean I() {
        return com.harman.sdk.b.f47608a.p();
    }

    public boolean J() {
        return com.harman.sdk.b.f47608a.q();
    }

    public boolean K() {
        return com.harman.sdk.b.f47608a.s();
    }

    public boolean L() {
        return this.f38310L;
    }

    public void M(String str, Bundle bundle) {
        if (str.equals(L1.a.f1514P1)) {
            bundle.putInt(L1.a.u3, f38305O);
        }
        K1.a.a(str, bundle);
    }

    public void N() {
    }

    public void O() {
        com.harman.sdk.b.f47608a.w(this);
    }

    public void P() {
        com.harman.sdk.b.f47608a.u(this);
        v();
    }

    public void Q(c.b bVar) {
        com.harman.sdk.b bVar2 = com.harman.sdk.b.f47608a;
        bVar2.k().a(false);
        LinkedList linkedList = new LinkedList();
        linkedList.add(DeviceProtocol.PROTOCOL_BLE);
        linkedList.add(DeviceProtocol.PROTOCOL_SPP);
        bVar2.k().j(linkedList, bVar);
    }

    public void R(Context context) {
    }

    public void S(ActivityC0889g activityC0889g, String str) {
        com.harman.log.f.a(f38304N, "showUploadAnalyticsInfo");
        WindowManager windowManager = activityC0889g.getWindowManager();
        TextView textView = new TextView(activityC0889g.getApplicationContext());
        textView.setBackgroundColor(Color.rgb(0, 0, 0));
        textView.getBackground().setAlpha(180);
        textView.setTextColor(Color.rgb(245, 245, 245));
        textView.setPadding(20, 20, 20, 20);
        textView.setTextIsSelectable(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setLongClickable(true);
        textView.setEnabled(true);
        textView.setOnClickListener(new a(windowManager, textView));
        textView.setOnLongClickListener(new b(activityC0889g, textView));
        textView.setText("send analytics data -->" + str);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = 32;
        layoutParams.type = 2;
        layoutParams.gravity = 17;
        try {
            windowManager.addView(textView, layoutParams);
        } catch (Exception e4) {
            com.harman.log.f.c(f38304N, "", e4);
        }
    }

    public <T> void T(androidx.lifecycle.P<T> p4, T t3) {
        h.a(p4, t3);
    }

    public <T> void U(androidx.lifecycle.P<T> p4, T t3) {
        h.c(p4, t3);
    }

    @Override // com.harman.sdk.c
    public void onA2DPConnected(String str, boolean z3) {
    }

    @Override // com.harman.sdk.c
    public void onBtEnabled(boolean z3) {
    }

    @Override // com.harman.sdk.c
    public void onLocationEnabled(boolean z3) {
    }

    @Override // com.harman.sdk.c
    public void onNetworkEnabled(boolean z3) {
    }

    public void u(c.b bVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(DeviceProtocol.PROTOCOL_BLE);
        linkedList.add(DeviceProtocol.PROTOCOL_SPP);
        com.harman.sdk.b.f47608a.k().g(linkedList, bVar, null);
    }

    public Collection<HmDevice> x() {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null) {
            return new ArrayList();
        }
        Collection<HmDevice> i4 = k4.i();
        ArrayList arrayList = new ArrayList();
        for (HmDevice hmDevice : i4) {
            if (hmDevice.R() && hmDevice.F() == DeviceProtocol.PROTOCOL_BLE) {
                arrayList.add(hmDevice);
            }
        }
        return arrayList;
    }

    public Collection<HmDevice> y() {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null) {
            return new ArrayList();
        }
        Collection<HmDevice> i4 = k4.i();
        ArrayList arrayList = new ArrayList();
        for (HmDevice hmDevice : i4) {
            if (hmDevice.R() && hmDevice.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                arrayList.add(hmDevice);
            }
        }
        return arrayList;
    }

    public Collection<HmDevice> z() {
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 == null) {
            return new ArrayList();
        }
        Collection<HmDevice> i4 = k4.i();
        ArrayList arrayList = new ArrayList();
        for (HmDevice hmDevice : i4) {
            if (hmDevice.F() == DeviceProtocol.PROTOCOL_GATT_BR_EDR) {
                arrayList.add(hmDevice);
            }
        }
        return arrayList;
    }
}
