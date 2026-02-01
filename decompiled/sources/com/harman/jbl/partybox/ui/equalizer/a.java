package com.harman.jbl.partybox.ui.equalizer;

import androidx.lifecycle.j0;
import com.harman.log.f;
import com.harman.sdk.command.SetAdvancedEQCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import com.harman.sdk.message.AdvancedEQSettings;
import com.harman.sdk.message.AdvancedPresetEQPayload;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.DefaultPresetEQPayload;
import com.harman.sdk.message.EQCategory;
import com.harman.sdk.message.SimpleEQSettings;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.ranges.u;
import kotlin.text.A;
import z2.m;

/* loaded from: classes2.dex */
public final class a extends j0 {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final C0376a f43616I = new C0376a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final String f43617J = "EQFragmentViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final z2.d f43618H = new c();

    /* renamed from: com.harman.jbl.partybox.ui.equalizer.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0376a {
        public /* synthetic */ C0376a(C2197u c2197u) {
            this();
        }

        private C0376a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43619a;

        static {
            int[] iArr = new int[MessageID.values().length];
            try {
                iArr[MessageID.EQ_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageID.RET_ADVANCED_EQ_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43619a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements z2.d {
        c() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            T1.a.a("Message " + msg);
            a.this.x(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            T1.a.a("Message " + msg);
            a.this.x(device, code, msg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        int i4;
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            MessageID b4 = baseMessage.b();
            if (b4 == null) {
                i4 = -1;
            } else {
                i4 = b.f43619a[b4.ordinal()];
            }
            if (i4 == 1 || i4 == 2) {
                T1.a.a("EQFragmentViewModel, Received EQ_STATUS, msg = " + baseMessage + " device = " + hmDevice.J());
            }
        }
    }

    public final void A(@l3.d HmDevice hmDevice, @l3.d AdvancedEQSettings advancedEQSettings) {
        F.p(hmDevice, "hmDevice");
        F.p(advancedEQSettings, "advancedEQSettings");
        f.a(f43617J, "setCustomEQMode called");
        AdvancedEQSettings advancedEQSettings2 = new AdvancedEQSettings();
        if (advancedEQSettings.c() != null && advancedEQSettings.b() != null) {
            advancedEQSettings2.e(EQCategory.CUSTOM_C2);
        } else {
            advancedEQSettings2.e(EQCategory.CUSTOM);
        }
        advancedEQSettings2.g(advancedEQSettings.c());
        advancedEQSettings2.f(advancedEQSettings.b());
        f.a(f43617J, "Advanced Set EQ command sent");
        m l4 = com.harman.sdk.b.f47608a.l(hmDevice);
        if (l4 != null) {
            l4.q0(hmDevice, new SetAdvancedEQCommand(advancedEQSettings2.a().g(), advancedEQSettings2), null);
        }
    }

    public final void B(@l3.d HmDevice hmDevice, @l3.d com.harman.jbl.partybox.model.a eqPresetCategory) {
        ArrayList<AdvancedPresetEQPayload.Parameter> arrayList;
        boolean T22;
        F.p(hmDevice, "hmDevice");
        F.p(eqPresetCategory, "eqPresetCategory");
        f.a(f43617J, "setPresetEQMode called");
        String f4 = eqPresetCategory.f();
        String f5 = eqPresetCategory.f();
        if (f5 != null) {
            T22 = A.T2(f5, "SIGNATURE", false, 2, null);
            if (T22) {
                f4 = "SIGNATURE";
            }
        }
        if (f4 == null) {
            f4 = "";
        }
        EQCategory w3 = w(f4);
        AdvancedEQSettings advancedEQSettings = new AdvancedEQSettings();
        advancedEQSettings.e(w3);
        advancedEQSettings.g(new DefaultPresetEQPayload());
        AdvancedPresetEQPayload c4 = advancedEQSettings.c();
        if (c4 != null) {
            com.harman.jbl.partybox.model.d a4 = eqPresetCategory.a();
            if (a4 != null) {
                arrayList = a4.h();
            } else {
                arrayList = null;
            }
            F.m(arrayList);
            c4.e(arrayList);
        }
        f.a(f43617J, "Advanced Set EQ command sent");
        m l4 = com.harman.sdk.b.f47608a.l(hmDevice);
        if (l4 != null) {
            l4.q0(hmDevice, new SetAdvancedEQCommand(advancedEQSettings.a().g(), advancedEQSettings), null);
        }
    }

    @l3.d
    public final int[] v(@l3.d HmDevice hmDevice) {
        int i4;
        int B3;
        byte b4;
        AdvancedEQSettings advancedEQSettings;
        AdvancedCustomEQPayload b5;
        ArrayList<Byte> b6;
        Byte b7;
        AdvancedEQSettings advancedEQSettings2;
        AdvancedCustomEQPayload b8;
        ArrayList<Byte> b9;
        F.p(hmDevice, "hmDevice");
        LinkedList<AdvancedEQSettings> b10 = hmDevice.b();
        if (b10 != null && (advancedEQSettings2 = b10.get(0)) != null && (b8 = advancedEQSettings2.b()) != null && (b9 = b8.b()) != null) {
            i4 = b9.size();
        } else {
            i4 = 0;
        }
        int[] iArr = new int[i4];
        B3 = u.B(i4, 7);
        for (int i5 = 0; i5 < B3; i5++) {
            LinkedList<AdvancedEQSettings> b11 = hmDevice.b();
            if (b11 != null && (advancedEQSettings = b11.get(0)) != null && (b5 = advancedEQSettings.b()) != null && (b6 = b5.b()) != null && (b7 = b6.get(i5)) != null) {
                b4 = b7.byteValue();
            } else {
                b4 = 0;
            }
            iArr[i5] = b4;
        }
        String arrays = Arrays.toString(iArr);
        F.o(arrays, "toString(...)");
        f.a(f43617J, "getCustomValues : " + arrays);
        return iArr;
    }

    @l3.d
    public final EQCategory w(@l3.d String categoryId) {
        F.p(categoryId, "categoryId");
        return EQCategory.valueOf(categoryId);
    }

    public final void y(@l3.d HmDevice device, byte b4, byte b5, byte b6, byte b7, byte b8) {
        F.p(device, "device");
        SimpleEQSettings simpleEQSettings = new SimpleEQSettings();
        simpleEQSettings.e(b4);
        simpleEQSettings.h(b5);
        simpleEQSettings.b().add(new SimpleEQSettings.Parameter((byte) 1, b6));
        simpleEQSettings.b().add(new SimpleEQSettings.Parameter((byte) 2, b7));
        simpleEQSettings.b().add(new SimpleEQSettings.Parameter((byte) 3, b8));
        LinkedList<SimpleEQSettings> linkedList = new LinkedList<>();
        linkedList.add(simpleEQSettings);
        device.K0(linkedList);
        m l4 = com.harman.sdk.b.f47608a.l(device);
        if (l4 != null) {
            l4.s(device, simpleEQSettings, null);
        }
    }

    public final void z(@l3.d HmDevice hmDevice, @l3.d com.harman.jbl.partybox.model.a eqPresetCategory) {
        AdvancedEQSettings advancedEQSettings;
        AdvancedEQSettings advancedEQSettings2;
        F.p(hmDevice, "hmDevice");
        F.p(eqPresetCategory, "eqPresetCategory");
        if (eqPresetCategory.a() != null) {
            LinkedList<AdvancedEQSettings> b4 = hmDevice.b();
            ArrayList<AdvancedPresetEQPayload.Parameter> arrayList = null;
            if (b4 != null && (advancedEQSettings2 = b4.get(0)) != null) {
                if (advancedEQSettings2.c() == null) {
                    DefaultPresetEQPayload defaultPresetEQPayload = new DefaultPresetEQPayload();
                    defaultPresetEQPayload.d(EQCategory.CUSTOM_C2);
                    com.harman.jbl.partybox.model.d a4 = eqPresetCategory.a();
                    if (a4 != null) {
                        arrayList = a4.h();
                    }
                    F.m(arrayList);
                    defaultPresetEQPayload.e(arrayList);
                    advancedEQSettings2.g(defaultPresetEQPayload);
                }
            } else {
                f.b(f43617J, "Could not find the Device CUSTOM_C2 values, so set it zero!");
                advancedEQSettings2 = new AdvancedEQSettings();
                EQCategory eQCategory = EQCategory.CUSTOM_C2;
                advancedEQSettings2.e(eQCategory);
                AdvancedCustomEQPayload advancedCustomEQPayload = new AdvancedCustomEQPayload();
                advancedCustomEQPayload.f(AdvancedCustomEQPayload.f48133O);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedCustomEQPayload.b().add((byte) 0);
                advancedEQSettings2.f(advancedCustomEQPayload);
                DefaultPresetEQPayload defaultPresetEQPayload2 = new DefaultPresetEQPayload();
                defaultPresetEQPayload2.d(eQCategory);
                com.harman.jbl.partybox.model.d a5 = eqPresetCategory.a();
                if (a5 != null) {
                    arrayList = a5.h();
                }
                F.m(arrayList);
                defaultPresetEQPayload2.e(arrayList);
                advancedEQSettings2.g(defaultPresetEQPayload2);
            }
            LinkedList<AdvancedEQSettings> b5 = hmDevice.b();
            if (b5 == null || b5.isEmpty()) {
                hmDevice.W(new LinkedList<>());
                LinkedList<AdvancedEQSettings> b6 = hmDevice.b();
                if (b6 != null) {
                    b6.add(0, advancedEQSettings2);
                }
            }
            A(hmDevice, advancedEQSettings2);
            return;
        }
        LinkedList<AdvancedEQSettings> b7 = hmDevice.b();
        if (b7 == null || (advancedEQSettings = b7.get(0)) == null) {
            f.b(f43617J, "Could not find the Device Custom values, so set it zero!");
            advancedEQSettings = new AdvancedEQSettings();
            advancedEQSettings.e(EQCategory.CUSTOM);
            AdvancedCustomEQPayload advancedCustomEQPayload2 = new AdvancedCustomEQPayload();
            advancedCustomEQPayload2.f((byte) 6);
            advancedCustomEQPayload2.b().add((byte) 0);
            advancedCustomEQPayload2.b().add((byte) 0);
            advancedCustomEQPayload2.b().add((byte) 0);
            advancedCustomEQPayload2.b().add((byte) 0);
            advancedCustomEQPayload2.b().add((byte) 0);
            advancedEQSettings.f(advancedCustomEQPayload2);
        }
        LinkedList<AdvancedEQSettings> b8 = hmDevice.b();
        if (b8 == null || b8.isEmpty()) {
            hmDevice.W(new LinkedList<>());
            LinkedList<AdvancedEQSettings> b9 = hmDevice.b();
            if (b9 != null) {
                b9.add(0, advancedEQSettings);
            }
        }
        A(hmDevice, advancedEQSettings);
    }
}
