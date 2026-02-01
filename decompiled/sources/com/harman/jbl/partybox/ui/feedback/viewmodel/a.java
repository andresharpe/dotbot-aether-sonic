package com.harman.jbl.partybox.ui.feedback.viewmodel;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.os.C0741d;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.blankj.utilcode.util.x0;
import com.harman.jbl.partybox.c;
import com.harman.jbl.partybox.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.C2122h0;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class a extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @d
    private ArrayList<String> f43687H = new ArrayList<>();

    /* renamed from: I, reason: collision with root package name */
    private final int f43688I = 1;

    /* renamed from: J, reason: collision with root package name */
    private final long f43689J = 400;

    /* renamed from: K, reason: collision with root package name */
    @d
    private ArrayList<String> f43690K = new ArrayList<>();

    /* renamed from: L, reason: collision with root package name */
    @d
    private P<Boolean> f43691L = new P<>();

    /* renamed from: M, reason: collision with root package name */
    @d
    private String f43692M = "";

    /* renamed from: N, reason: collision with root package name */
    @d
    private final Handler f43693N = new HandlerC0378a(Looper.getMainLooper());

    /* renamed from: com.harman.jbl.partybox.ui.feedback.viewmodel.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class HandlerC0378a extends Handler {
        HandlerC0378a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@d Message msg) {
            F.p(msg, "msg");
            if (msg.what == a.this.f43688I) {
                int i4 = msg.arg1;
                a aVar = a.this;
                Object obj = aVar.f43690K.get(i4);
                F.o(obj, "get(...)");
                aVar.w((String) obj);
                if (i4 == a.this.f43690K.size() - 1) {
                    a.this.x().o(Boolean.TRUE);
                    return;
                }
                Message message = new Message();
                message.what = a.this.f43688I;
                message.arg1 = i4 + 1;
                sendMessageDelayed(message, a.this.A());
            }
        }
    }

    public final long A() {
        return this.f43689J;
    }

    public final void B(@d String productName, @d ArrayList<String> feedbackList) {
        F.p(productName, "productName");
        F.p(feedbackList, "feedbackList");
        this.f43690K.clear();
        this.f43690K.addAll(feedbackList);
        this.f43692M = productName;
        Message message = new Message();
        message.what = this.f43688I;
        message.arg1 = 0;
        this.f43693N.sendMessage(message);
    }

    public final void C(@d P<Boolean> p4) {
        F.p(p4, "<set-?>");
        this.f43691L = p4;
    }

    public final void D(@d String str) {
        F.p(str, "<set-?>");
        this.f43692M = str;
    }

    public final void w(@d String feedback) {
        F.p(feedback, "feedback");
        T1.a.a("BLE_LOG FEEDBACK STRING:" + feedback);
        if (!this.f43687H.contains(feedback)) {
            feedback = L1.a.f1489J0;
        }
        K1.a.a(L1.a.f1514P1, C0741d.b(C2122h0.a("di_action_type", L1.a.f1609k2), C2122h0.a(L1.a.f1522R1, feedback), C2122h0.a(L1.a.u3, Integer.valueOf(c.f38305O))));
    }

    @d
    public final P<Boolean> x() {
        return this.f43691L;
    }

    @d
    public final List<Z1.a> y() {
        boolean z3;
        this.f43687H = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        this.f43687H.add(x0.d(j.m.f7));
        this.f43687H.add(x0.d(j.m.g7));
        this.f43687H.add(x0.d(j.m.j7));
        this.f43687H.add(x0.d(j.m.o7));
        this.f43687H.add(x0.d(j.m.n7));
        this.f43687H.add(x0.d(j.m.h7));
        this.f43687H.add(x0.d(j.m.e7));
        this.f43687H.add(x0.d(j.m.k7));
        this.f43687H.add(x0.d(j.m.I9));
        int size = this.f43687H.size();
        for (int i4 = 0; i4 < size; i4++) {
            Z1.a aVar = new Z1.a();
            aVar.f3831a = this.f43687H.get(i4);
            if (i4 < 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.f3832b = z3;
            aVar.f3833c = false;
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @d
    public final String z() {
        return this.f43692M;
    }
}
