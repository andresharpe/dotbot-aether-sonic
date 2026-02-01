package com.harman.jbl.partybox.ui.party.stereo.state.create;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.InterfaceC0561d;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.EnumIdentifyDevice;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.A;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;

@U({"SMAP\nSelectChannelState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectChannelState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/SelectChannelState\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,89:1\n314#2,11:90\n*S KotlinDebug\n*F\n+ 1 SelectChannelState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/SelectChannelState\n*L\n61#1:90,11\n*E\n"})
/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final d f45289a = new d();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f45290b = "Stereo";

    @U({"SMAP\nSelectChannelState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectChannelState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/SelectChannelState$lightIdentifyDevice$2$devListener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,89:1\n94#2,4:90\n*S KotlinDebug\n*F\n+ 1 SelectChannelState.kt\ncom/harman/jbl/partybox/ui/party/stereo/state/create/SelectChannelState$lightIdentifyDevice$2$devListener$1\n*L\n75#1:90,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f45291a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f45291a = interfaceC2333q;
        }

        @InterfaceC0561d
        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            boolean z3;
            if (MessageID.IDENTIFY_DEVICE == baseMessage.b()) {
                com.harman.log.f.d(d.f45290b, "lightIdentifyDevice.onStatusChanged() >>> light result[" + statusCode.e() + "]");
                com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                if (StatusCode.STATUS_SUCCESS == statusCode) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean valueOf = Boolean.valueOf(z3);
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(valueOf));
                    return;
                }
                return;
            }
            com.harman.log.f.a(d.f45290b, "lightIdentifyDevice.onStatusChanged() >>> no care msg.id[" + baseMessage.b() + "]");
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45291a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f45291a, device, code, msg);
        }
    }

    private d() {
        super(null);
    }

    public final void a(@l3.d HmCustomFontTextView tv, @l3.d StereoCreateFragment fragment) {
        int p32;
        F.p(tv, "tv");
        F.p(fragment, "fragment");
        String string = tv.getContext().getResources().getString(j.m.db);
        F.o(string, "getString(...)");
        String string2 = tv.getContext().getResources().getString(j.m.f41662K0);
        F.o(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        p32 = A.p3(string, string2, 0, false, 6, null);
        int length = string2.length() + p32;
        if (p32 >= 0 && p32 < length) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(tv.getContext().getResources().getColor(j.d.f40725W0)), p32, length, 33);
        }
        tv.setText(spannableStringBuilder);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @l3.e
    public final Object b(@l3.d HmDevice hmDevice, @l3.e EnumIdentifyDevice enumIdentifyDevice, @l3.e EnumIdentifyDevice enumIdentifyDevice2, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        String str;
        Object l4;
        z2.g m4 = com.harman.sdk.b.f47608a.m(hmDevice);
        if (m4 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e4, 1);
            rVar.T();
            a aVar = new a(rVar);
            String t3 = com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice);
            String str2 = null;
            if (enumIdentifyDevice != null) {
                str = enumIdentifyDevice.e();
            } else {
                str = null;
            }
            if (enumIdentifyDevice2 != null) {
                str2 = enumIdentifyDevice2.e();
            }
            com.harman.log.f.d(f45290b, "lightIdentifyDevice() >>> emit. device:" + t3 + "\nmainIdentify[" + str + "] coIdentify[" + str2 + "]");
            m4.y0(hmDevice, enumIdentifyDevice, enumIdentifyDevice2, aVar);
            Object z3 = rVar.z();
            l4 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.b(f45290b, "lightIdentifyDevice() >>> cant get stereo controller");
        return kotlin.coroutines.jvm.internal.a.a(false);
    }
}
